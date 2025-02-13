package datos;

import entidad.Pedido;
import entidad.PedidoProducto;
import entidad.Producto;
import entidad.Reserva;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class PedidoDAO implements HotelDAO<Pedido>{

    private Connection cn = null;
    private CallableStatement cs = null;
    private ResultSet rs = null;
    private static PedidoDAO INSTANCE;
    
    public static synchronized PedidoDAO getInstance() {
        if (INSTANCE == null)
            INSTANCE = new PedidoDAO();
        return INSTANCE;
    }
    
    private PedidoDAO() {}
    
    @Override
    public int agregar(Pedido p) {
        cn = Conexion.getInstance().getConnection();
        int num = 0;
        try {
            cs = cn.prepareCall("call spPedidoAgregar(?,?,?,?)");
            cs.setString(1, p.getIdPedido());
            cs.setDouble(2, p.getTotalPrecio());
            cs.setString(3, p.getReserva().getIdReserva());
            cs.setInt(4, Types.INTEGER);
            cs.executeUpdate();
            num = cs.getInt(4);
            if (num == 0) {
                ListaPedidoProducto list = p.getLista();
                for (int i = 0; i < list.size(); i++) {
                    PedidoProducto x = list.getElemento(i);
                    cs = cn.prepareCall("call spPedidoProductoAgregar(?,?,?)");
                    cs.setString(1, p.getIdPedido());
                    cs.setString(2, x.getProducto().getIdProducto());
                    cs.setInt(3, x.getCantidad());
                    cs.executeUpdate();
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return num;
    }

    @Override
    public Pedido buscar(String idPedido) {
        cn = Conexion.getInstance().getConnection();
        Pedido pedido = null;
        try {
            cs = cn.prepareCall("call spPedidoBuscar(?)");
            cs.setString(1, idPedido);
            rs = cs.executeQuery();
            if (rs.next()) {
                double total = rs.getDouble("totalPrecio");
                String idReserva = rs.getString("idReserva");
                Reserva reserva = ReservaDAO.getInstance().buscar(idReserva);
                pedido = new Pedido(idPedido, total, reserva);
                cs = cn.prepareCall("call spPedidoProductoBuscar(?)");
                cs.setString(1, idPedido);
                rs = cs.executeQuery();
                while (rs.next()) {
                    String idProducto = rs.getString("idProducto");
                    int cantidad = rs.getInt("cantidad");
                    Producto p = ProductoDAO.getInstance().buscar(idProducto);
                    pedido.agregar(p, cantidad);
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
                if (rs != null) rs.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return pedido;
    }

    @Override
    public void actualizar(Pedido p) {
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spPedidoActualizar(?,?,?)");
            cs.setString(1, p.getIdPedido());
            cs.setDouble(2, p.getTotalPrecio());
            cs.setString(3, p.getReserva().getIdReserva());
            cs.executeUpdate();
            cs = cn.prepareCall("call spPedidoProductoEliminar(?)");
            cs.setString(1, p.getIdPedido());
            cs.executeUpdate();
            ListaPedidoProducto list = p.getLista();
            for (int i = 0; i < list.size(); i++) {
                PedidoProducto x = list.getElemento(i);
                cs = cn.prepareCall("call spPedidoProductoAgregar(?,?,?)");
                cs.setString(1, p.getIdPedido());
                cs.setString(2, x.getProducto().getIdProducto());
                cs.setInt(3, x.getCantidad());
                cs.executeUpdate();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    @Override
    public void eliminar(String idProducto) {
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spPedidoProductoEliminar(?)");
            cs.setString(1, idProducto);
            cs.executeUpdate();
            cs = cn.prepareCall("call spPedidoEliminar(?)");
            cs.setString(1, idProducto);
            cs.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    @Override
    public void mostrar(DefaultTableModel modelo) {
        cn = Conexion.getInstance().getConnection();
        Object[] tit = {"ID PEDIDO", "TOTAL PRECIO","ID RESERVA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spPedidoMostrar()");
            rs = cs.executeQuery();
            while (rs.next()) {
                String idProducto = rs.getString("idPedido");
                double total = rs.getDouble("totalPrecio");
                String idReserva = rs.getString("idReserva");
                Object[] fila = {idProducto,total,idReserva};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
                if (rs != null) rs.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    @Override
    public void eventMostrar(String idProduct, DefaultTableModel modelo) {
        cn = Conexion.getInstance().getConnection();
        Object[] tit = {"ID PEDIDO", "TOTAL PRECIO","ID RESERVA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spEventPedido(?)");
            cs.setString(1, idProduct);
            rs = cs.executeQuery();
            while (rs.next()) {
                String idProducto = rs.getString("idProducto");
                double total = rs.getDouble("totalPrecio");
                String idReserva = rs.getString("idReserva");
                Object[] fila = {idProducto,total,idReserva};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
                if (rs != null) rs.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

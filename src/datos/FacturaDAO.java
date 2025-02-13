package datos;

import entidad.Factura;
import entidad.Pedido;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class FacturaDAO implements HotelDAO<Factura>{

    private Connection cn = null;
    private CallableStatement cs = null;
    private ResultSet rs = null;
    private static FacturaDAO INSTANCE;
    
    public static synchronized FacturaDAO getInstance() {
        if (INSTANCE == null)
            INSTANCE = new FacturaDAO();
        return INSTANCE;
    }
    
    private FacturaDAO() {}
    
    @Override
    public int agregar(Factura f) {
        cn = Conexion.getInstance().getConnection();
        int num = 0;
        try {
            cs = cn.prepareCall("call spFacturaAgregar(?,?,?,?,?,?)");
            cs.setString(1, f.getCodigo());
            cs.setString(2, f.getNombre());
            cs.setString(3, f.getUbicacion());
            cs.setDouble(4, f.getImporteTotal());
            cs.setString(5, f.getPedido().getIdPedido());
            cs.registerOutParameter(6, Types.INTEGER);
            cs.executeUpdate();
            num = cs.getInt(6);
        } catch (SQLException e) {
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
            } catch (SQLException e) {
            }
        }
        return num;
    }

    @Override
    public Factura buscar(String codigo) {
        cn = Conexion.getInstance().getConnection();
        Factura factura = null;
        try {
            cs = cn.prepareCall("call spFacturaBuscar(?)");
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            if (rs.next()) {
                String nom = rs.getString("nombre");
                String ubica = rs.getString("ubicacion");
                double importe = rs.getDouble("importeTotal");
                String idPedido = rs.getString("idPedido");
                Pedido p = PedidoDAO.getInstance().buscar(idPedido);
                factura = new Factura(codigo, nom, ubica, importe, p);
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
        return factura;
    }

    @Override
    public void actualizar(Factura f) {
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spFacturaActualizar(?,?,?)");
            cs.setString(1, f.getCodigo());
            cs.setDouble(2, f.getImporteTotal());
            cs.setString(3, f.getPedido().getIdPedido());
            cs.executeUpdate();
        } catch (SQLException e) {
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
            } catch (SQLException e) {
            }
        }
    }

    @Override
    public void eliminar(String codigo) {
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spFacturaEliminar(?)");
            cs.setString(1, codigo);
            cs.executeUpdate();
        } catch (SQLException e) {
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
            } catch (SQLException e) {
            }
        }
    }

    @Override
    public void mostrar(DefaultTableModel modelo) {
        cn = Conexion.getInstance().getConnection();
        Object[] tit = {"CODIGO","NOMBRE","UBICACION","IMPORTE TOTAL","ID PEDIDO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spFacturaMostrar()");
            rs = cs.executeQuery();
            while (rs.next()) {
                String cod = rs.getString("codigo");
                String nom = rs.getString("nombre");
                String ubica = rs.getString("ubicacion");
                double importe = rs.getDouble("importeTotal");
                String idPedido = rs.getString("idPedido");
                Object[] fila = {cod,nom,ubica,importe,idPedido};
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
    public void eventMostrar(String codigo, DefaultTableModel modelo) {
        cn = Conexion.getInstance().getConnection();
        Object[] tit = {"CODIGO","NOMBRE","UBICACION","IMPORTE TOTAL","ID PEDIDO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spEventFactura(?)");
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                String cod = rs.getString("codigo");
                String nom = rs.getString("nombre");
                String ubica = rs.getString("ubicacion");
                double importe = rs.getDouble("importeTotal");
                String idPedido = rs.getString("idPedido");
                Object[] fila = {cod,nom,ubica,importe,idPedido};
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

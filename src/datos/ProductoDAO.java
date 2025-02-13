package datos;

import entidad.Producto;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ProductoDAO implements HotelDAO<Producto>{

    private Connection cn = null;
    private CallableStatement cs = null;
    private ResultSet rs = null;
    private static ProductoDAO INSTANCE;
    
    public static synchronized ProductoDAO getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ProductoDAO();
        return INSTANCE;
    }
    
    private ProductoDAO() {}
    
    @Override
    public int agregar(Producto p) {
        cn = Conexion.getInstance().getConnection();
        int num = 0;
        try {
            cs = cn.prepareCall("call spProductoAgregar(?,?,?,?,?)");
            cs.setString(1, p.getIdProducto());
            cs.setString(2, p.getNombre());
            cs.setString(3, p.getCategoria());
            cs.setDouble(4, p.getPrecio());
            cs.registerOutParameter(5, Types.INTEGER);
            cs.executeUpdate();
            num = cs.getInt(5);
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
    public Producto buscar(String idProducto) {
        cn = Conexion.getInstance().getConnection();
        Producto producto = null;
        try {
            cs = cn.prepareCall("call spProductoBuscar(?)");
            cs.setString(1, idProducto);
            rs = cs.executeQuery();
            if (rs.next()) {
                String nom = rs.getString("nombre");
                String cate = rs.getString("categoria");
                double precio = rs.getDouble("precio");
                producto = new Producto(idProducto, nom, cate, precio);
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
        return producto;
    }

    @Override
    public void actualizar(Producto p) {
        cn = Conexion.getInstance().getConnection();
        cs = null;
        try {
            cs = cn.prepareCall("call spProductoActualizar(?,?,?,?)");
            cs.setString(1, p.getIdProducto());
            cs.setString(2, p.getNombre());
            cs.setString(3, p.getCategoria());
            cs.setDouble(4, p.getPrecio());             
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
    public void eliminar(String idProducto) {
        cn = Conexion.getInstance().getConnection();
        cs = null;
        try {
            cs = cn.prepareCall("call spProductoEliminar(?)");
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
        Object[] tit = {"ID","NOMBRE","CATEGORIA","PRECIO U."};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spProductoMostrar()");
            rs = cs.executeQuery();
            while (rs.next()) {
                String idPro = rs.getString("idProducto");
                String nom = rs.getString("nombre");
                String cate = rs.getString("categoria");
                double precio = rs.getDouble("precio");
                Object[] fila ={idPro,nom,cate,precio};
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
    public void eventMostrar(String idProducto, DefaultTableModel modelo) {
        cn = Conexion.getInstance().getConnection();
        Object[] tit = {"ID","NOMBRE","CATEGORIA","PRECIO U."};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spEventProducto(?)");
            cs.setString(1, idProducto);
            rs = cs.executeQuery();
            while (rs.next()) {
                String idPro = rs.getString("idProducto");
                String nom = rs.getString("nombre");
                String cate = rs.getString("categoria");
                double precio = rs.getDouble("precio");
                Object[] fila ={idPro,nom,cate,precio};
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

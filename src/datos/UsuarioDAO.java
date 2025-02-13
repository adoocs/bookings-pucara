package datos;

import entidad.Usuario;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {

    private Connection cn = null;
    private CallableStatement cs = null;
    private ResultSet rs = null;
    private static UsuarioDAO INSTANCE;
    
    public static synchronized UsuarioDAO getInstance() {
        if (INSTANCE == null)
            INSTANCE = new UsuarioDAO();
        return INSTANCE;
    }
    
    private UsuarioDAO() {}
    
    public int agregar(Usuario u) {
        cn = Conexion.getInstance().getConnection();
        int num = 0;
        try {
            cs = cn.prepareCall("call spUsuarioAgregar(?,?,?,?,?,?,?,?)");
            cs.setString(1, u.getIdUsuario());
            cs.setString(2, u.getNombre());
            cs.setString(3, u.getApellidos());
            cs.setString(4, u.getCorreo());
            cs.setString(5, u.getContrasena());
            cs.setString(6, u.getTipo());
            cs.setString(7, u.getUltimaCnn());
            cs.registerOutParameter(8, Types.INTEGER);
            cs.executeUpdate();
            num = cs.getInt(8);
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

    public Usuario buscar(String idUsuario, String contra) {
        cn = Conexion.getInstance().getConnection();
        Usuario user = null;
        try {
            cs = cn.prepareCall("call spUsuarioBuscar(?,?)");
            cs.setString(1, idUsuario);
            cs.setString(2, contra);
            rs = cs.executeQuery();
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String correo = rs.getString("correo");
                String tipo = rs.getString("tipo");
                String ultima = rs.getString("ultimacn");
                user = new Usuario(idUsuario, nombre, apellidos, correo, contra, tipo,ultima);
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
        return user;
    }

    public void actualizar(Usuario user) {
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spUsuarioActualizar(?,?,?,?,?,?,?)");
            cs.setString(1, user.getIdUsuario());
            cs.setString(2, user.getNombre());
            cs.setString(3, user.getApellidos());
            cs.setString(4, user.getCorreo());
            cs.setString(5, user.getContrasena());
            cs.setString(6, user.getTipo());
            cs.setString(7, user.getUltimaCnn());
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

    public void eliminar(String id) {

    }

    public void mostrar(DefaultTableModel modelo) {

    }

    public void eventMostrar(String args, DefaultTableModel model) {

    }

    public boolean isEmpty() {
        boolean vacio = true;
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spUsuarioMostrar()");
            rs = cs.executeQuery();
            if (rs.next()) {
                vacio = false;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
                if (rs != null) rs.close();
            } catch (SQLException e) {
            }
        }
        return vacio;
    }
}

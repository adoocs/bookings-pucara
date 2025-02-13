package datos;

import entidad.Cliente;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ClienteDAO implements HotelDAO<Cliente>{

    private Connection cn = null;
    private CallableStatement cs = null;
    private ResultSet rs = null;
    private static ClienteDAO INSTANCE;
    
    public static synchronized ClienteDAO getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ClienteDAO();
        return INSTANCE;
    }
    
    private ClienteDAO() {}
    
    @Override
    public int agregar(Cliente c) {
        cn = Conexion.getInstance().getConnection();
        int exist = 0;
        try {
            cs = cn.prepareCall("call spClienteAgregar(?,?,?,?,?,?,?)");
            cs.setString(1, c.getDni());
            cs.setString(2, c.getNombre());
            cs.setString(3, c.getApellidos());
            cs.setInt(4, c.getEdad());
            cs.setString(5, c.getTelefono());
            cs.setString(6, c.getCorreo());
            cs.registerOutParameter(7, Types.INTEGER);
            cs.executeUpdate();
            exist = cs.getInt(7);
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
        return exist;
    }

    @Override
    public Cliente buscar(String dni) {
        cn = Conexion.getInstance().getConnection();
        Cliente cliente = null;
        try {
            cs = cn.prepareCall("call spClienteBuscar(?)");
            cs.setString(1, dni);
            rs = cs.executeQuery();
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                int edad = rs.getInt("edad");
                String fono = rs.getString("telefono");
                String correo = rs.getString("correo");
                cliente = new Cliente(dni, nombre, apellidos, edad, fono, correo);
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
        return cliente;
    }

    @Override
    public void actualizar(Cliente c) {
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spClienteActualizar(?,?,?,?,?,?)");
            cs.setString(1, c.getDni());
            cs.setString(2, c.getNombre());
            cs.setString(3, c.getApellidos());
            cs.setInt(4, c.getEdad());
            cs.setString(5, c.getTelefono());
            cs.setString(6, c.getCorreo());
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
    public void eliminar(String dni) {
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spClienteEliminar(?)");
            cs.setString(1, dni);
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
        Object[] tit = {"DNI","NOMBRE","APELLIDOS","EDAD","TELEFONO","CORREO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spClienteMostrar()");
            rs = cs.executeQuery();
            while (rs.next()) {
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                int edad = rs.getInt("edad");
                String fono = rs.getString("telefono");
                String correo = rs.getString("correo");
                Object[] fila = {dni,nombre,apellidos,edad,fono,correo};
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
    public void eventMostrar(String dni, DefaultTableModel modelo) {
        cn = Conexion.getInstance().getConnection();
        Object[] tit = {"DNI","NOMBRE","APELLIDOS","EDAD","TELEFONO","CORREO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spEventCliente(?)");
            cs.setString(1, dni);
            rs = cs.executeQuery();
            while (rs.next()) {
                String Dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                int edad = rs.getInt("edad");
                String fono = rs.getString("telefono");
                String correo = rs.getString("correo");
                Object[] fila = {Dni,nombre,apellidos,edad,fono,correo};
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

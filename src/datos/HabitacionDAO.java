package datos;

import entidad.Habitacion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class HabitacionDAO implements HotelDAO<Habitacion>{

    private Connection cn = null;
    private CallableStatement cs = null;
    private ResultSet rs = null;
    private static HabitacionDAO INSTANCE;
    
    public static synchronized HabitacionDAO getInstance() {
        if (INSTANCE == null)
            INSTANCE = new HabitacionDAO();
        return INSTANCE;
    }
    
    private HabitacionDAO() {}
    
    @Override
    public int agregar(Habitacion h) {
        cn = Conexion.getInstance().getConnection();
        int num = 0;
        try {
            cs = cn.prepareCall("call spHabitacionAgregar(?,?,?,?,?,?,?)");
            cs.setString(1, h.getCodigo());
            cs.setString(2, h.getCategoria());
            cs.setInt(3, h.getPiso());
            cs.setString(4, h.getDescripcion());
            cs.setDouble(5, h.getPrecio());
            cs.setString(6, h.getEstado());
            cs.registerOutParameter(7, Types.INTEGER);
            cs.executeUpdate();
            num = cs.getInt(7);
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
    public Habitacion buscar(String codigo) {
        cn = Conexion.getInstance().getConnection();
        Habitacion habitacion = null;
        try {
            cs = cn.prepareCall("call spHabitacionBuscar(?)");
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            if (rs.next()) {
                String cate = rs.getString("categoria");
                int piso = rs.getInt("piso");
                String descrip = rs.getString("descripcion");
                double precio = rs.getDouble("precio");
                String estado = rs.getString("estado");
                habitacion = new Habitacion(codigo, cate, piso, descrip, precio, estado);
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
        return habitacion;
    }

    @Override
    public void actualizar(Habitacion h) {
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spHabitacionActualizar(?,?,?,?,?,?)");
            cs.setString(1, h.getCodigo());
            cs.setString(2, h.getCategoria());
            cs.setInt(3, h.getPiso());
            cs.setString(4, h.getDescripcion());
            cs.setDouble(5, h.getPrecio());
            cs.setString(6, h.getEstado());            
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
    public void eliminar(String codigo) {
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spHabitacionEliminar(?)");
            cs.setString(1, codigo);
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
        Object[] tit = {"CODIGO","CATEGORIA","PISO","DESCRIPCIÓN","PRECIO","ESTADO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spHabitacionMostrar()");
            rs = cs.executeQuery();
            while (rs.next()) {
                String cod = rs.getString("codigo");
                String cat = rs.getString("categoria");
                int piso = rs.getInt("piso");
                String desc = rs.getString("descripcion");
                double precio = rs.getDouble("precio");
                String estado = rs.getString("estado");
                Object[] fila = {cod,cat,piso,desc,precio,estado};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
                if (rs != null) rs.close();
            } catch (SQLException e) {
            }
        }
    }

    @Override
    public void eventMostrar(String codigo, DefaultTableModel modelo) {
        cn = Conexion.getInstance().getConnection();
        Object[] tit = {"CODIGO","CATEGORIA","PISO","DESCRIPCIÓN","PRECIO","ESTADO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spEventHabitacion(?)");
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                String cod = rs.getString("codigo");
                String cat = rs.getString("categoria");
                int piso = rs.getInt("piso");
                String desc = rs.getString("descripcion");
                double precio = rs.getDouble("precio");
                String estado = rs.getString("estado");
                Object[] fila = {cod,cat,piso,desc,precio,estado};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
        } finally {
            try {
                if (cn != null) cn.close();
                if (cs != null) cs.close();
                if (rs != null) rs.close();
            } catch (SQLException e) {
            }
        }
    }

    
}

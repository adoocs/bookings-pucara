package datos;

import entidad.Cliente;
import entidad.Habitacion;
import entidad.Reserva;
import entidad.ReservaHabitacion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ReservaDAO implements HotelDAO<Reserva>{

    private Connection cn = null;
    private CallableStatement cs = null;
    private ResultSet rs = null;
    private static ReservaDAO INSTANCE;
    
    public static synchronized ReservaDAO getInstance() {
        if (INSTANCE == null) 
            INSTANCE = new ReservaDAO();
        return INSTANCE;
    }
    
    private ReservaDAO(){} 
    
    @Override
    public int agregar(Reserva re) {
        cn = Conexion.getInstance().getConnection();
        int num = 0;
        try {
            cs = cn.prepareCall("call spReservaAgregar(?,?,?,?,?,?)");
            cs.setString(1, re.getIdReserva());
            cs.setDate(2, re.getFechaIngreso());
            cs.setDate(3, re.getFechaSalida());
            cs.setDouble(4, re.getMontoTotal());
            cs.setString(5, re.getCliente().getDni());
            cs.registerOutParameter(6, Types.INTEGER);
            cs.executeUpdate();
            num = cs.getInt(6);
            if (num == 0) {
                ListaReservaHabitacion list = re.getLista();
                for (int i = 0; i < list.size(); i++) {
                    ReservaHabitacion x = list.getElemento(i);
                    cs = cn.prepareCall("call spReservaHabitacionAgregar(?,?)");
                    cs.setString(1, re.getIdReserva());
                    cs.setString(2, x.getHabitacion().getCodigo());
                    cs.executeUpdate();
                }
            }
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
    public Reserva buscar(String idReserva) {
        cn = Conexion.getInstance().getConnection();
        Reserva reserva = null;
        try {
            cs = cn.prepareCall("call spReservaBuscar(?)");
            cs.setString(1, idReserva);
            rs = cs.executeQuery();
            if (rs.next()) {
                Date fechaIngreso = rs.getDate("fechaIngreso");
                Date fechaSalida = rs.getDate("fechaSalida");
                double montoTotal = rs.getDouble("montoTotal");
                String dni = rs.getString("dni");
                Cliente c = ClienteDAO.getInstance().buscar(dni);
                reserva = new Reserva(idReserva, fechaIngreso, fechaSalida, montoTotal, c);
                cs = cn.prepareCall("call spReservaHabitacionBuscar(?)");
                cs.setString(1, idReserva);
                rs = cs.executeQuery();
                while (rs.next()) {
                    String codigo = rs.getString("codigo");
                    Habitacion habi = HabitacionDAO.getInstance().buscar(codigo);
                    reserva.agregar(habi);
                }
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
        return reserva;
    }

    @Override
    public void actualizar(Reserva re) {
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spReservaActualizar(?,?,?,?,?)");
            cs.setString(1, re.getIdReserva());
            cs.setDate(2, re.getFechaIngreso());
            cs.setDate(3, re.getFechaSalida());
            cs.setDouble(4, re.getMontoTotal());
            cs.setString(5, re.getCliente().getDni());
            cs.executeUpdate();
            cs = cn.prepareCall("call spReservaHabitacionEliminar(?)");
            cs.setString(1, re.getIdReserva());
            cs.executeUpdate();
            ListaReservaHabitacion list = re.getLista();
            for (int i = 0; i < list.size(); i++) {
                ReservaHabitacion x = list.getElemento(i);
                cs = cn.prepareCall("call spReservaHabitacionAgregar(?,?)");
                cs.setString(1, re.getIdReserva());
                cs.setString(2, x.getHabitacion().getCodigo());
                cs.executeUpdate();
            }
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
    public void eliminar(String idReserva) {
        cn = Conexion.getInstance().getConnection();
        try {
            cs = cn.prepareCall("call spReservaHabitacionEliminar(?)");
            cs.setString(1, idReserva);
            cs.executeUpdate();
            cs = cn.prepareCall("call spReservaEliminar(?)");
            cs.setString(1, idReserva);
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
        Object[] tit = {"ID","FECHA INGRESO","FECHA SALIDA","TOTAL","DNI"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spReservaMostrar()");
            rs = cs.executeQuery();
            while (rs.next()) {
                String idReserva = rs.getString("idReserva");
                String fechaIngreso = rs.getString("fechaIngreso");
                String fechaSalida = rs.getString("fechaSalida");
                double montoTotal = rs.getDouble("montoTotal");
                String dni = rs.getString("dni");
                Object[] fila = {idReserva,fechaIngreso,fechaSalida,montoTotal,dni};
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
    public void eventMostrar(String idReserv, DefaultTableModel modelo) {
        cn = Conexion.getInstance().getConnection();
        Object[] tit = {"ID","FECHA INGRESO","FECHA SALIDA","TOTAL","DNI"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(tit);
        try {
            cs = cn.prepareCall("call spEventReserva(?)");
            cs.setString(1, idReserv);
            rs = cs.executeQuery();
            while (rs.next()) {
                String idReserva = rs.getString("idReserva");
                String fechaIngreso = rs.getString("fechaIngreso");
                String fechaSalida = rs.getString("fechaSalida");
                double montoTotal = rs.getDouble("montoTotal");
                String dni = rs.getString("dni");
                Object[] fila = {idReserva,fechaIngreso,fechaSalida,montoTotal,dni};
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

package entidad;

import datos.ListaReservaHabitacion;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;

public class Reserva {
    
    private String idReserva;
    private Date fechaIngreso;
    private Date fechaSalida;
    private double montoTotal;
    private Cliente cliente;
    private ListaReservaHabitacion lista;

    public Reserva(String idReserva, Date fechaIngreso, Date fechaSalida, double montoTotal, Cliente cliente) {
        this.idReserva = idReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        lista = new ListaReservaHabitacion();
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ListaReservaHabitacion getLista() {
        return lista;
    }

    public void setLista(ListaReservaHabitacion lista) {
        this.lista = lista;
    }    
    
    public void agregar(Habitacion h) {
        lista.agregar(new ReservaHabitacion(h));
    }
    
    public void mostrar(DefaultTableModel modelo) {
        lista.mostrar(modelo);
    }
}

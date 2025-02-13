package entidad;

import datos.ListaPedidoProducto;
import javax.swing.table.DefaultTableModel;

public class Pedido {
    
    private String idPedido;
    private double totalPrecio;
    private Reserva reserva;
    private ListaPedidoProducto lista;

    public Pedido(String idPedido, double totalPrecio, Reserva reserva) {
        this.idPedido = idPedido;
        this.totalPrecio = totalPrecio;
        this.reserva = reserva;
        lista = new ListaPedidoProducto();
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public double getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public ListaPedidoProducto getLista() {
        return lista;
    }

    public void setLista(ListaPedidoProducto lista) {
        this.lista = lista;
    }

    public void agregar(Producto p, int cantidad) {
        PedidoProducto x = new PedidoProducto(p, cantidad);
        lista.agregar(x);
    }
    
    public void mostrar(DefaultTableModel model) {
        lista.mostrar(model);
    }
    
    public double totalPrecio() {
        return lista.totalPrecio();
    }
}

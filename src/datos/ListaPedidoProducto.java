package datos;

import entidad.PedidoProducto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ListaPedidoProducto {

    private ArrayList<PedidoProducto> lista;

    public ListaPedidoProducto() {
        lista = new ArrayList<>();
    }
    
    public void agregar(PedidoProducto e) {
        lista.add(e);
    }

    public int buscar(PedidoProducto e) {
        return lista.indexOf(e);
    }
    
    public PedidoProducto getElemento(int i) {
        return lista.get(i);
    }

    public void eliminar(int i) {
        lista.remove(i);
    } 
    
    public void eliminar() {
        lista.removeAll(lista);
    }
    
    public void mostrar(DefaultTableModel modelo) {
        Object[] tit = {"ID","NOMBRE","CATEGORIA","PRECIO","CANTIDAD"};
        Object[][] data = new Object[size()][tit.length];
        for (int i = 0; i < size(); i++) {
            PedidoProducto x = getElemento(i);
            data[i][0] = x.getProducto().getIdProducto();
            data[i][1] = x.getProducto().getNombre();
            data[i][2] = x.getProducto().getCategoria();
            data[i][3] = x.getProducto().getPrecio();
            data[i][4] = x.getCantidad();
        }
        modelo.setDataVector(data, tit);
    }

    public int size() {
        return lista.size();
    }
    
    public double totalPrecio() {
        double suma = 0;
        for (PedidoProducto pedido : lista) {
            suma += pedido.getCantidad()*pedido.getProducto().getPrecio();
        }
        return suma;
    }
}

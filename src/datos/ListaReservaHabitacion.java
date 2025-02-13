package datos;

import entidad.ReservaHabitacion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ListaReservaHabitacion {
    
    private ArrayList<ReservaHabitacion> lista;
    
    public ListaReservaHabitacion() {
        lista = new ArrayList<>();
    }
    
    public void agregar(ReservaHabitacion reHabi) {
        lista.add(reHabi);
    }
    
    public int buscar(ReservaHabitacion reHabi) {
        return lista.indexOf(reHabi);
    }
    
    public ReservaHabitacion getElemento(int i) {
        return lista.get(i);
    }

    public void eliminar(int i) {
        lista.remove(i);
    } 
    
    public void eliminar() {
        lista.removeAll(lista);
    }
    
    public void mostrar(DefaultTableModel modelo) {
        Object[] tit = {"CODIGO","CATEGORIA","PISO","DESCRIPCIÓN","PRECIO","ESTADO"};
        Object[][] data = new Object[size()][tit.length];
        for (int i = 0; i < size(); i++) {
            ReservaHabitacion x = getElemento(i);
            data[i][0] = x.getHabitacion().getCodigo();
            data[i][1] = x.getHabitacion().getCategoria();
            data[i][2] = x.getHabitacion().getPiso();
            data[i][3] = x.getHabitacion().getDescripcion();
            data[i][4] = x.getHabitacion().getPrecio();
            data[i][5] = x.getHabitacion().getEstado();
        }
        modelo.setDataVector(data, tit);
    }
    
    public int size() {
        return lista.size();
    }
    
    public double totalPrecio() {
        double suma = 0;
        for (ReservaHabitacion r : lista) {
            suma += r.getHabitacion().getPrecio();
        }
        return suma;
    }
}

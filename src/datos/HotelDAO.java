package datos;

import javax.swing.table.DefaultTableModel;

public interface HotelDAO<E> {
    
    int agregar(E e);
    
    E buscar(String id);
    
    void actualizar(E e);
    
    void eliminar(String id);
    
    void mostrar(DefaultTableModel modelo);
    
    void eventMostrar(String args, DefaultTableModel model);
}

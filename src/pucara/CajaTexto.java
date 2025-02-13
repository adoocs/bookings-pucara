package pucara;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class CajaTexto extends JTextField {

    private String texto = "";
    public CajaTexto() {
        setBorder(null);
        setForeground(Color.GRAY);
    }

    /**
     * Método para iniciar los componentes y evento
     * @param texto Recibe el texto que se usará para cambiar 
     * @param name Recibe el nombre de la fuente
     * @param tam Recibe el tamaño de la letra del texto
     */
    public void start(String texto, String name, int tam) {
        this.texto = texto;
        setFont(new java.awt.Font(name, 0, tam));
        setText(texto);
        evento();
    }
    
    private void evento() {
        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (getText().trim().equals(texto)) {
                    setText("");
                    setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (getText().trim().isEmpty()) {
                    setText(texto);
                    setForeground(Color.GRAY);
                }
            }
        });
    }
    
    public void limpiar() {
        setText(texto);
        setForeground(Color.GRAY);
    }
    
    public boolean validar() {
        return (getText().trim().isEmpty() || getText().trim().equals(texto));
    }
}

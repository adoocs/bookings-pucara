package pucara;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class Boton extends JButton {
    
    private final Color bgEntrar = new Color(199, 0, 57);
    private final Color bgSalir = new Color(144, 12, 63);

    public Boton() {
        cargar();
    }
    
    private void cargar() {
        setContentAreaFilled(false);
        setBackground(bgSalir);
        setForeground(Color.WHITE);
        setFont(new java.awt.Font("Roboto",0,16));
        setBorderPainted(false);
        setFocusPainted(false);
        setOpaque(true);
        evento();
    }
    
    private void evento() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(bgSalir);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(bgEntrar);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(bgEntrar);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(bgSalir);
            }
        });
    }
}

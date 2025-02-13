package pucara;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class HeadFrm extends javax.swing.JPanel {
    
    private int xMouse, yMouse;
    private JFrame frame;    
    
    public HeadFrm(JFrame frame) {
        this.frame = frame;
        setOpaque(false);
        evento();
    }
    
    private void evento() {
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                xMouse = evt.getX();
                yMouse = evt.getY();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                frame.setLocation(x - xMouse, y - yMouse);
            }
        });
    }
}

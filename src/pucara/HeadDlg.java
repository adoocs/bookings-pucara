package pucara;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JDialog;

public class HeadDlg extends javax.swing.JPanel {
    
    private int xMouse, yMouse;
    private JDialog dialog = null;
    
    public HeadDlg(JDialog dialog) {
        this.dialog = dialog;
        setOpaque(false);
        xMouse = yMouse = 0;
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
                dialog.setLocation(x - xMouse, y - yMouse);
            }
        });
    }
}

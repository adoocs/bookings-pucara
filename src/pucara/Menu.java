package pucara;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import static javax.swing.SwingConstants.LEADING;
import static javax.swing.SwingConstants.LEFT;
import static javax.swing.SwingConstants.RIGHT;
import static javax.swing.SwingConstants.TRAILING;

public class Menu extends javax.swing.JPanel {

    private javax.swing.JPanel[] paneles = new JPanel[7];
    
    public Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        BtnMenu[] botones = new BtnMenu[7];
        botones[0] = new BtnMenu("INICIO");
        botones[1] = new BtnMenu("CLIENTE");
        botones[2] = new BtnMenu("HABITACIÓN");
        botones[3] = new BtnMenu("RESERVA");
        botones[4] = new BtnMenu("PRODUCTO");
        botones[5] = new BtnMenu("PEDIDO");
        botones[6] = new BtnMenu("FACTURA");
        
        setOpaque(false);
        setLayout(new java.awt.GridLayout(7, 1, 5, 5));

        for (BtnMenu btn : botones) {
            add(btn);
        }
    }
    
    class BtnMenu extends javax.swing.JButton {

        private Color colorNormal = new Color(255, 87, 51);
        private Color colorPressed = new Color(200, 56, 26);
        private Color textNormal = new Color(0,0,0);
        private Color textPressed = new Color(255,255,255);
        
        public BtnMenu(String text) {
            super(text);
            setBorder(null);
            setContentAreaFilled(false);
            setOpaque(true);
            setFont(new Font("Monospaced",Font.BOLD,16));
            setBackground(colorNormal);
            setForeground(textNormal);
            iniciar();
        }
        
        private void iniciar() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    setBackground(colorPressed);
                    setForeground(textPressed);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    setBackground(colorPressed);
                    setForeground(textPressed);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    setBackground(colorNormal);
                    setForeground(textNormal);
                }
            });
        }

        public Color getColorNormal() {
            return colorNormal;
        }

        public void setColorNormal(Color colorNormal) {
            this.colorNormal = colorNormal;
        }

        public Color getColorPressed() {
            return colorPressed;
        }

        public void setColorPressed(Color colorPressed) {
            this.colorPressed = colorPressed;
        }

        public Color getTextNormal() {
            return textNormal;
        }

        public void setTextNormal(Color textNormal) {
            this.textNormal = textNormal;
        }

        public Color getTextPressed() {
            return textPressed;
        }

        public void setTextPressed(Color textPressed) {
            this.textPressed = textPressed;
        }
        
        public void cambiar(boolean boo) {
            if (boo) {
                setHorizontalTextPosition(LEADING);
                setHorizontalAlignment(RIGHT);
            } else {
                setHorizontalTextPosition(TRAILING);
                setHorizontalAlignment(LEFT);
            }
        }
    }
}

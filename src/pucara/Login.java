package pucara;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import javax.swing.JPanel;

public class Login extends JPanel {
    
    public Login() {
        setOpaque(false);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = ((getWidth()/6)+(getWidth()/12));
        //int x = getWidth()/3;
        int y = getWidth() - 2 * x;
        Point2D centro = new Point2D.Float(getWidth()/2, getHeight()/2);
        float radio = getHeight()/2;
        Point2D foco = new Point2D.Float(getWidth()/2, getHeight()/2);
        float[] distribucion = {0.0f,1.0f};
        Color colors[] = {new Color(20, 20, 160),new Color(16, 16, 90)};
        RadialGradientPaint rgp = new RadialGradientPaint(centro, radio, foco, distribucion, colors, MultipleGradientPaint.CycleMethod.NO_CYCLE);
        g2D.setPaint(rgp);
        g2D.fillRoundRect(0, y/2, getWidth(), getHeight()-y/2, 20, 20);
        GradientPaint g2 = new GradientPaint(0, 50, new Color(18,18,125), 30, 0, new Color(113,46,178),true);
        g2D.setPaint(g2);
        g2D.fillOval(x, 0, y, y);
    }
}

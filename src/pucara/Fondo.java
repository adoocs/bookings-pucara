package pucara;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;

public class Fondo extends javax.swing.JPanel {
    
    public Fondo() {
        setOpaque(false);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Point2D centro = new Point2D.Float(getWidth()/2, getHeight()/2);
        float radio = getHeight()/2;
        Point2D foco = new Point2D.Float(getWidth()/2, getHeight()/2);
        float[] distribucion = {0.0f,1.0f};
        Color colors[] = {new Color(20, 20, 160),new Color(16, 16, 90)};
        RadialGradientPaint rgp = new RadialGradientPaint(centro, radio, foco, distribucion, colors, MultipleGradientPaint.CycleMethod.NO_CYCLE);
        g2D.setPaint(rgp);
        g2D.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
    }
}

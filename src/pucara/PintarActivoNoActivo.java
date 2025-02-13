/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucara;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ACER
 */
public class PintarActivoNoActivo extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean btln1, int i, int i1) {
        
        JLabel labelResul=(JLabel)super.getTableCellRendererComponent(jtable, o, btln1, btln1, i, i1);
        if(o instanceof String){
            String Dato=(String)o;
            if(Dato.equals("Disponible")){
                labelResul.setBackground(Color.GREEN);
                labelResul.setForeground(Color.WHITE);
            } else{
                if(Dato.equals("Ocupada")){
                labelResul.setBackground(Color.GRAY);
                labelResul.setForeground(Color.WHITE);
            } 
            }
        }
        return labelResul;
    }
}

package vista;

import datos.ClienteDAO;
import entidad.Cliente;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class DlgClienteConsultar extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    private static DlgClienteConsultar INSTANCE;
    public Cliente cliente;
    
    public static synchronized DlgClienteConsultar getInstance() {
        if (INSTANCE == null)
            INSTANCE = new DlgClienteConsultar();
        return INSTANCE;
    }
    
    private DlgClienteConsultar() {
        super(FrmPrincipal.getInstance(), true);
        initComponents();
        setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
        ClienteDAO.getInstance().mostrar(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSeleccionar = new pucara.Boton();
        btnTodos = new pucara.Boton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtIdCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        chkAuto = new javax.swing.JCheckBox();
        LabelAtras = new javax.swing.JLabel();
        fondo1 = new pucara.Fondo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(144, 12, 63));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Seleccionar.gif"))); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        btnTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Todos_1.gif"))); // NOI18N
        btnTodos.setText("Todos");
        jPanel1.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 68));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 500, 290));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtIdCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 153), null, new java.awt.Color(0, 0, 153)), "ID CLIENTE"));
        txtIdCliente.setSelectionColor(new java.awt.Color(204, 0, 204));
        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 190, 40));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarCeleste.gif"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 40, 40));

        chkAuto.setBackground(new java.awt.Color(255, 255, 255));
        chkAuto.setSelected(true);
        chkAuto.setText("Auto");
        jPanel2.add(chkAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 70, 30));

        LabelAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ATRAS.gif"))); // NOI18N
        LabelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelAtrasMouseClicked(evt);
            }
        });
        jPanel2.add(LabelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 810, 70));
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 434));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = txtIdCliente.getText().trim();
        ClienteDAO.getInstance().eventMostrar(id,modelo);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyTyped
        if (chkAuto.isSelected()) {
            String id = txtIdCliente.getText().trim();
            ClienteDAO.getInstance().eventMostrar(id,modelo);
        }
    }//GEN-LAST:event_txtIdClienteKeyTyped

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        int x = jTable1.getSelectedRow();
        if (x != -1) {
            String id = modelo.getValueAt(x, 0).toString();
            cliente = ClienteDAO.getInstance().buscar(id);
            dispose();
        } else
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla");
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        ClienteDAO.getInstance().mostrar(modelo);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void LabelAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelAtrasMouseClicked
        dispose();
    }//GEN-LAST:event_LabelAtrasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAtras;
    private javax.swing.JButton btnBuscar;
    private pucara.Boton btnSeleccionar;
    private pucara.Boton btnTodos;
    private javax.swing.JCheckBox chkAuto;
    private pucara.Fondo fondo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIdCliente;
    // End of variables declaration//GEN-END:variables
}

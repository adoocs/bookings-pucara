package vista;

import datos.ReservaDAO;
import entidad.Reserva;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DlgReservaConsultar extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    private static DlgReservaConsultar INSTANCE;
    public Reserva reserva;
    
    public static synchronized DlgReservaConsultar getInstance() {
        if (INSTANCE == null)
            INSTANCE = new DlgReservaConsultar();
        return INSTANCE;
    }
    
    private DlgReservaConsultar() {
        super(FrmPrincipal.getInstance(), true);
        initComponents();
        setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
        ReservaDAO.getInstance().mostrar(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtIdReserva = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        chkAuto = new javax.swing.JCheckBox();
        LabelAtras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnSeleccionar = new pucara.Boton();
        btnTodos = new pucara.Boton();
        fondo1 = new pucara.Fondo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdReserva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdReserva.setForeground(new java.awt.Color(255, 255, 255));
        txtIdReserva.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 153), null, new java.awt.Color(0, 0, 153)), "ID RESERVA"));
        txtIdReserva.setSelectionColor(new java.awt.Color(204, 0, 204));
        txtIdReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdReservaKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 200, 40));

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
        jPanel2.add(chkAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 70, 30));

        LabelAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ATRAS.gif"))); // NOI18N
        LabelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelAtrasMouseClicked(evt);
            }
        });
        jPanel2.add(LabelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 50));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(144, 12, 63));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Seleccionar.gif"))); // NOI18N
        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        btnTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Todos_1.gif"))); // NOI18N
        btnTodos.setText("TODOS");
        btnTodos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, -1));

        javax.swing.GroupLayout fondo1Layout = new javax.swing.GroupLayout(fondo1);
        fondo1.setLayout(fondo1Layout);
        fondo1Layout.setHorizontalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        fondo1Layout.setVerticalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdReservaKeyTyped
        if (chkAuto.isSelected()) {
            String id = txtIdReserva.getText().trim();
            ReservaDAO.getInstance().eventMostrar(id,modelo);
        }
    }//GEN-LAST:event_txtIdReservaKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = txtIdReserva.getText().trim();
        ReservaDAO.getInstance().eventMostrar(id,modelo);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        int x = jTable1.getSelectedRow();
        if (x != -1) {
            String id = modelo.getValueAt(x, 0).toString();
            reserva = ReservaDAO.getInstance().buscar(id);
            dispose();
        } else
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla");
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        ReservaDAO.getInstance().mostrar(modelo);
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
    private javax.swing.JTextField txtIdReserva;
    // End of variables declaration//GEN-END:variables
}

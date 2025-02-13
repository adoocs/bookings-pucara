/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import datos.HabitacionDAO;
import entidad.Habitacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aldo Cruz
 */
public class PanelHabitacion extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public PanelHabitacion() {
        initComponents();habilitar(true);
        HabitacionDAO.getInstance().mostrar(modelo);
        
    }

    private boolean validar() {
        if (txtCodigo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese CÓDIGO");
            return false;
        }
        if (cbxCategoria.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "Seleccione CATEGORIA");
            return false;
        }
        if (cbxPiso.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "Seleccione PISO");
            return false;
        }
        if (txaDescripcion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese DESCRIPCION");
            return false;
        }
        if (txtPrecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese PRECIO");
            return false;
        }
        if (cbxEstado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione ESTADO");
            return false;
        }
        return true;
    }

    private void limpiar() {
        txtCodigo.setText("");
        cbxCategoria.setSelectedIndex(0);
        cbxPiso.setSelectedIndex(0);
        txaDescripcion.setText("");
        txtPrecio.setText("");
        cbxEstado.setSelectedIndex(0);        
        txtCodigo.requestFocus();
        habilitar(true);
    }

    private void habilitar(boolean boo) {
        btnGuardar.setEnabled(boo);
        btnBuscar.setEnabled(boo);
        btnActualizar.setEnabled(!boo);
        btnEliminar.setEnabled(!boo);
        txtCodigo.setEditable(boo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondo1 = new pucara.Fondo();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        cbxPiso = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnTodos = new javax.swing.JButton();
        chkAuto = new javax.swing.JCheckBox();
        btnActualizar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Britannic Bold", 0, 70)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Habitación");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, -20, 380, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llave.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, -30, 130, 160));

        fondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1200, 100));

        jPanel1.setBackground(new java.awt.Color(18, 18, 125));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 153, 255)), "CÓDIGO:"));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 220, 40));

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Sencilla", "Doble", "Matrimonial", "Familiar" }));
        cbxCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 153, 255)), "CATEGORÍA:"));
        jPanel1.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 220, 50));

        txaDescripcion.setColumns(15);
        txaDescripcion.setRows(5);
        txaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "DESCRIPCIÓN:"));
        jScrollPane2.setViewportView(txaDescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 220, 80));

        cbxPiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Piso 1", "Piso 2", "Piso 3" }));
        cbxPiso.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 153, 255)), "NÚMERO PISO:"));
        jPanel1.add(cbxPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 220, 60));

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "PRECIO:"));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 110, -1));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Disponible", "Ocupada" }));
        cbxEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("ESTADO:"));
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 220, -1));

        btnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.gif"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 50, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, -10, 290, 770));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "BUSCAR POR CÓDIGO:"));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 165, -1));

        btnTodos.setBackground(new java.awt.Color(102, 153, 255));
        btnTodos.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("TODOS");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, -1));

        chkAuto.setBackground(new java.awt.Color(204, 204, 255));
        chkAuto.setText("Auto..");
        jPanel2.add(chkAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 180, 110));

        btnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizaa.gif"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 50, -1));

        btnRestaurar.setBackground(new java.awt.Color(204, 204, 255));
        btnRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnRestaurar.setBorder(null);
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 50, 40));

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ELIMINAR.gif"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 50, -1));

        btnBuscar.setBackground(new java.awt.Color(204, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarCeleste.gif"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 50, 50));

        jTable1.setModel(modelo);
        jTable1.setGridColor(new java.awt.Color(204, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 760, 350));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llave.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, -30, 130, 170));

        btnSalir.setBackground(new java.awt.Color(255, 255, 204));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir.gif"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 50, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validar()) {
            String cod = txtCodigo.getText();
            String cate = cbxCategoria.getSelectedItem().toString();
            int piso = cbxPiso.getSelectedIndex();
            String desc = txaDescripcion.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            String estado = cbxEstado.getSelectedItem().toString();
            Habitacion x = new Habitacion(cod, cate, piso, desc, precio, estado);
            HabitacionDAO.getInstance().agregar(x);
            HabitacionDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (validar()) {
            String cod = txtCodigo.getText();
            String cate = cbxCategoria.getSelectedItem().toString();
            int piso = cbxPiso.getSelectedIndex();
            String desc = txaDescripcion.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            String estado = cbxEstado.getSelectedItem().toString();
            Habitacion x = new Habitacion(cod, cate, piso, desc, precio, estado);
            HabitacionDAO.getInstance().actualizar(x);
            HabitacionDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (chkAuto.isSelected()) {
            String cod = txtBuscar.getText();
            HabitacionDAO.getInstance().eventMostrar(cod, modelo);
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String cod = txtCodigo.getText();
        HabitacionDAO.getInstance().eliminar(cod);
        HabitacionDAO.getInstance().mostrar(modelo);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cod = txtBuscar.getText();
        if (cod.isEmpty())
        JOptionPane.showMessageDialog(null, "Por favor ingresar un código");
        else {
            Habitacion x = HabitacionDAO.getInstance().buscar(cod);
            if (x != null) {
                txtCodigo.setText(x.getCodigo());
                switch (x.getCategoria()) {
                    case "Sencilla" -> cbxCategoria.setSelectedIndex(1);
                    case "Dobles" -> cbxCategoria.setSelectedIndex(2);
                    case "Matrimonial" -> cbxCategoria.setSelectedIndex(3);
                    case "Tipo Suit" -> cbxCategoria.setSelectedIndex(4);
                }
                switch (x.getPiso()) {
                    case 1 -> cbxPiso.setSelectedIndex(1);
                    case 2 -> cbxPiso.setSelectedIndex(2);
                    case 3 -> cbxPiso.setSelectedIndex(3);
                }
                txaDescripcion.setText(x.getDescripcion());
                txtPrecio.setText(String.valueOf(x.getPrecio()));
                switch (x.getEstado()) {
                    case "Disponible" -> cbxEstado.setSelectedIndex(1);
                    case "Ocupada" -> cbxEstado.setSelectedIndex(2);
                }
                habilitar(false);
            } else {
                JOptionPane.showMessageDialog(null, "El código no existe");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        HabitacionDAO.getInstance().mostrar(modelo);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        if (i != 0) {
            String cod = modelo.getValueAt(i, 0).toString();
            Habitacion x = HabitacionDAO.getInstance().buscar(cod);
            txtCodigo.setText(x.getCodigo());
            switch (x.getCategoria()) {
                case "Sencilla" -> cbxCategoria.setSelectedIndex(1);
                case "Dobles" -> cbxCategoria.setSelectedIndex(2);
                case "Matrimonial" -> cbxCategoria.setSelectedIndex(3);
                case "Tipo Suit" -> cbxCategoria.setSelectedIndex(4);
            }
            switch (x.getPiso()) {
                case 1 -> cbxPiso.setSelectedIndex(1);
                case 2 -> cbxPiso.setSelectedIndex(2);
                case 3 -> cbxPiso.setSelectedIndex(3);
            }
            txaDescripcion.setText(x.getDescripcion());
            txtPrecio.setText(String.valueOf(x.getPrecio()));
            switch (x.getEstado()) {
                case "Disponible" -> cbxEstado.setSelectedIndex(1);
                case "Ocupada" -> cbxEstado.setSelectedIndex(2);
            }
            habilitar(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodos;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxPiso;
    private javax.swing.JCheckBox chkAuto;
    private pucara.Fondo fondo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txaDescripcion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

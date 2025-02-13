package paneles;

import datos.ClienteDAO;
import entidad.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pucara.Otros;

public class PanelCliente extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public PanelCliente() {
        initComponents();habilitar(true);
        ClienteDAO.getInstance().mostrar(modelo);
    }

    private boolean validar() {
        if (txtDNI.getText().trim().isEmpty() || txtDNI.getText().trim().length() != 8) {
            JOptionPane.showMessageDialog(null, "Ingrese un DNI válido");
            return false;
        }
        if (txtNombres.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese NOMBRES");
            return false;
        }
        if (txtApellidos.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese DNI");
            return false;
        }
        if (txtEdad.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese EDAD");
            return false;
        }
        if (txtTelefono.getText().trim().isEmpty() || txtTelefono.getText().trim().length() != 9) {
            JOptionPane.showMessageDialog(null, "Ingrese un TELEFONO válido");
            return false;
        }
        if (!Otros.validarCorreo(txtCorreo.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese CORREO válido");
            return false;
        }
        return true;
    }

    private void limpiar() {
        txtDNI.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtDNI.setText("");
        habilitar(true);
    }

    private void habilitar(boolean boo) {
        btnGuardar.setEnabled(boo);
        btnBuscar.setEnabled(boo);
        btnActualizar.setEnabled(!boo);
        btnEliminar.setEnabled(!boo);
        txtDNI.setEditable(boo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        chkAuto = new javax.swing.JCheckBox();
        btnTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo1 = new pucara.Fondo();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1160, 750));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "BUSCAR POR DNI:"));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        chkAuto.setBackground(new java.awt.Color(204, 204, 255));
        chkAuto.setText("Auto..");
        jPanel2.add(chkAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, 20));

        btnTodos.setBackground(new java.awt.Color(51, 102, 255));
        btnTodos.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("TODOS");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 20));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, 110));

        jTable1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jTable1.setModel(modelo);
        jTable1.setGridColor(new java.awt.Color(204, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 770, 390));

        btnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizar.setFont(new java.awt.Font("Arial Narrow", 0, 8)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizaa.gif"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setPreferredSize(new java.awt.Dimension(63, 39));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 50, 40));

        btnRestaurar.setBackground(new java.awt.Color(204, 204, 255));
        btnRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnRestaurar.setBorder(null);
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 50, 40));

        btnBuscar.setBackground(new java.awt.Color(204, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarCeleste.gif"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 40, 50));

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ELIMINAR.gif"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 50, 40));

        btnSalir.setBackground(new java.awt.Color(255, 255, 204));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir.gif"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 50, 40));

        jLabel8.setFont(new java.awt.Font("Britannic Bold", 0, 70)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cliente");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, -20, 320, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llave.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, -30, 130, 160));

        fondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1200, 100));

        jPanel1.setBackground(new java.awt.Color(18, 18, 125));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DNI.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 60, 60));

        txtDNI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(0, 0, 153));
        txtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(51, 0, 153)), "DNI (Documento Nacional de Identidad):"));
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 290, 50));

        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "NOMBRES COMPLETOS:"));
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 290, -1));

        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "APELLIDOS COMPLETOS:"));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 290, -1));

        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "CORREO (.com):"));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 280, -1));

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "TELÉFONO:"));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 210, -1));

        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "EDAD:"));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 90, -1));

        btnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.gif"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setOpaque(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 70, 100));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, -10, 310, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validar()) {
            String DNI = txtDNI.getText();
            String nombre = txtNombres.getText();
            String ape = txtApellidos.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String telefono = txtTelefono.getText();
            String correo = txtCorreo.getText();
            Cliente c = new Cliente(DNI, nombre, ape, edad, telefono, correo);
            ClienteDAO.getInstance().agregar(c);
            ClienteDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (validar()) {
            String DNI = txtDNI.getText();
            String nombre = txtNombres.getText();
            String ape = txtApellidos.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String telefono = txtTelefono.getText();
            String correo = txtCorreo.getText();
            Cliente c = new Cliente(DNI, nombre, ape, edad, telefono, correo);
            ClienteDAO.getInstance().actualizar(c);
            ClienteDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9')
        evt.consume();
        if(txtDNI.getText().trim().length()>7)
        evt.consume();
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (chkAuto.isSelected()) {
            String DNI = txtBuscar.getText();
            ClienteDAO.getInstance().eventMostrar(DNI, modelo);
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String DNI = txtDNI.getText();
        ClienteDAO.getInstance().eliminar(DNI);
        ClienteDAO.getInstance().mostrar(modelo);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String DNI = txtBuscar.getText();
        if (DNI.isEmpty())
        JOptionPane.showMessageDialog(null, "Por favor ingresar el DNI");
        else {
            Cliente cli = ClienteDAO.getInstance().buscar(DNI);
            if (cli != null) {
                txtDNI.setText(cli.getDni());
                txtNombres.setText(cli.getNombre());
                txtApellidos.setText(cli.getApellidos());
                txtEdad.setText(cli.getEdad() + "");
                txtTelefono.setText(cli.getTelefono());
                txtCorreo.setText(cli.getCorreo());
                habilitar(false);
            } else {
                JOptionPane.showMessageDialog(null, "El DNI no existe");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        ClienteDAO.getInstance().mostrar(modelo);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        if (i != -1) {
            String dni = modelo.getValueAt(i, 0).toString();
            Cliente cli = ClienteDAO.getInstance().buscar(dni);
            txtDNI.setText(cli.getDni());
            txtNombres.setText(cli.getNombre());
            txtApellidos.setText(cli.getApellidos());
            txtEdad.setText(cli.getEdad() + "");
            txtTelefono.setText(cli.getTelefono());
            txtCorreo.setText(cli.getCorreo());
            habilitar(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

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
    private javax.swing.JCheckBox chkAuto;
    private pucara.Fondo fondo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

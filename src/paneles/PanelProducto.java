package paneles;

import datos.ProductoDAO;
import entidad.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aldo Cruz
 */
public class PanelProducto extends javax.swing.JPanel {

    private final DefaultTableModel modelo = new DefaultTableModel();
    
    public PanelProducto() {
        initComponents();habilitar(true);
        ProductoDAO.getInstance().mostrar(modelo);
    }

    private boolean validar() {
        if (txtIdProducto.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese ID PRODUCTO");
            return false;
        }
        if (txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese NOMBRE");
            return false;
        }
        if (txtCategoria.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese CATEGORIA");
            return false;
        }
        if (txtPrecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese PRECIO");
            return false;
        }
        return true;
    }

    private void limpiar() {
        txtIdProducto.setText("");
        txtNombre.setText("");
        txtCategoria.setText("");
        txtPrecio.setText("");
        txtIdProducto.setText("");
        habilitar(true);
    }

    private void habilitar(boolean boo) {
        btnGuardar.setEnabled(boo);
        btnBuscar.setEnabled(boo);
        btnActualizar.setEnabled(!boo);
        btnEliminar.setEnabled(!boo);
        txtIdProducto.setEditable(boo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo1 = new pucara.Fondo();
        jPanel1 = new javax.swing.JPanel();
        txtIdProducto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnTodos = new javax.swing.JButton();
        chkBuscar = new javax.swing.JCheckBox();
        btnActualizar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Britannic Bold", 0, 70)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Producto");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, -20, 320, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llave.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, -30, 130, 160));

        fondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1200, 100));

        jPanel1.setBackground(new java.awt.Color(18, 18, 125));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ID PRODUCTO:"));
        jPanel1.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 230, 50));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "NOMBRE:"));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 230, 40));

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "PRECIO:"));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 110, 40));

        txtCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "CATEGORÍA:"));
        jPanel1.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 230, 40));

        btnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.gif"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 60, -1));

        jLabel5.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("S/.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 70, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedido.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 130, 120));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, -1, 300, 750));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "BUSCAR POR DNI:"));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, -1));

        btnTodos.setBackground(new java.awt.Color(51, 102, 255));
        btnTodos.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("TODOS");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));

        chkBuscar.setBackground(new java.awt.Color(204, 204, 255));
        chkBuscar.setText("Auto..");
        jPanel2.add(chkBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 80, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 210, 130));

        btnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizaa.gif"))); // NOI18N
        btnActualizar.setBorder(null);
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
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 50, 40));

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ELIMINAR.gif"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 50, 40));

        jTable1.setModel(modelo);
        jTable1.setGridColor(new java.awt.Color(204, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 770, 360));

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
            String id = txtIdProducto.getText();
            String nombre = txtNombre.getText();
            String cate = txtCategoria.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            Producto p = new Producto(id, nombre, cate, precio);
            ProductoDAO.getInstance().agregar(p);
            ProductoDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (validar()) {
            String id = txtIdProducto.getText();
            String nombre = txtNombre.getText();
            String cate = txtCategoria.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            Producto p = new Producto(id, nombre, cate, precio);
            ProductoDAO.getInstance().actualizar(p);
            ProductoDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (chkBuscar.isSelected()) {
            String id = txtBuscar.getText().trim();
            ProductoDAO.getInstance().eventMostrar(id, modelo);
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String id = txtIdProducto.getText();
        ProductoDAO.getInstance().eliminar(id);
        ProductoDAO.getInstance().mostrar(modelo);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = txtBuscar.getText().trim();
        if (id.isEmpty())
        JOptionPane.showMessageDialog(null, "Por favor ingresar ID");
        else {
            Producto p = ProductoDAO.getInstance().buscar(id);
            if (p != null) {
                txtIdProducto.setText(p.getIdProducto());
                txtNombre.setText(p.getNombre());
                txtCategoria.setText(p.getCategoria());
                txtPrecio.setText(p.getPrecio()+ "");
                habilitar(false);
            } else {
                JOptionPane.showMessageDialog(null, "El ID no existe");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        ProductoDAO.getInstance().mostrar(modelo);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (txtBuscar.getText().trim().length()>4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodos;
    private javax.swing.JCheckBox chkBuscar;
    private pucara.Fondo fondo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

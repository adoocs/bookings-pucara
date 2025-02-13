package paneles;

import datos.Conexion;
import datos.FacturaDAO;
import entidad.Factura;
import entidad.Pedido;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperReport;
import vista.DlgPedidoConsultar;

/**
 *
 * @author Aldo Cruz
 */
public class PanelFactura extends javax.swing.JPanel {

    private final DefaultTableModel modelo = new DefaultTableModel();
    private Pedido pedido;
    private final String nombre = "Hotel Pucará";
    private final String ubicacion = "Avenida Pucara Manzana E Lote 11, Trujillo";
    
    public PanelFactura() {
        initComponents();habilitar(true);
        FacturaDAO.getInstance().mostrar(modelo);
    }

    private boolean validar() {
        if (txtCodigo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese CODIGO");
            return false;
        }
        if (txtImporte.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese NOMBRES");
            return false;
        }
        if (pedido == null) {
            JOptionPane.showMessageDialog(null, "Seleccione un Pedido");
            return false;
        }
        if (txtImporte.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese EDAD");
            return false;
        }
        return true;
    }

    private void limpiar() {
        txtCodigo.setText("");
        txtImporte.setText("");
        txtIdPedido.setText("");
        txtPrecioTotal.setText("");
        txtIdReserva.setText("");
        pedido = null;
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

        jPanel3 = new javax.swing.JPanel();
        txtPrecioTotal = new javax.swing.JTextField();
        txtIdPedido = new javax.swing.JTextField();
        btnPedido = new javax.swing.JButton();
        txtIdReserva = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        boton1 = new pucara.Boton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnTodos = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fondo1 = new pucara.Fondo();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(18, 18, 125));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecioTotal.setEditable(false);
        txtPrecioTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioTotal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtPrecioTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "PRECIO TOTAL:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        jPanel3.add(txtPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 170, 40));

        txtIdPedido.setEditable(false);
        txtIdPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ID PEDIDO:"));
        jPanel3.add(txtIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 210, 40));

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccion.png"))); // NOI18N
        btnPedido.setBorder(null);
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });
        jPanel3.add(btnPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 50, 40));

        txtIdReserva.setEditable(false);
        txtIdReserva.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ID RESERVA:"));
        jPanel3.add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 210, 40));

        jLabel6.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("S/.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 30, 70));

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 70)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Factura");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 250, 80));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 220, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llave.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 140, 160));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("-CÓDIGO");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 100, -1));

        btnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.gif"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 60, 80));

        jLabel5.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("S/.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 70, 60));

        txtImporte.setEditable(false);
        txtImporte.setBackground(new java.awt.Color(0, 0, 204));
        txtImporte.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtImporte.setForeground(new java.awt.Color(255, 255, 255));
        txtImporte.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "IMPORTE TOTAL:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 180, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 280, 750));

        boton1.setText("Reportar Factura");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 290, 50));

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ELIMINAR.gif"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        btnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizaa.gif"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 50, 40));

        btnRestaurar.setBackground(new java.awt.Color(204, 204, 255));
        btnRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnRestaurar.setBorder(null);
        btnRestaurar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 50, 40));

        jTable1.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jTable1.setModel(modelo);
        jTable1.setGridColor(new java.awt.Color(204, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 780, 440));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, 50));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "BUSCAR POR CODIGO:"));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 40));

        jCheckBox1.setBackground(new java.awt.Color(204, 204, 255));
        jCheckBox1.setText("Auto..");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 70, -1));

        btnTodos.setBackground(new java.awt.Color(51, 51, 255));
        btnTodos.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("TODOS");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 230, 110));

        btnBuscar.setBackground(new java.awt.Color(204, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarCeleste.gif"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 40, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hotelR.png"))); // NOI18N
        jLabel4.setText("HOTEL PUCARÁ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 170, 50));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ubicac.png"))); // NOI18N
        jLabel8.setText("Avenida Pucará Manzana E Lote 11,Trujillo 13001, Perú");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout fondo1Layout = new javax.swing.GroupLayout(fondo1);
        fondo1.setLayout(fondo1Layout);
        fondo1Layout.setHorizontalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondo1Layout.setVerticalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, -1, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validar()) {
            String cod = txtCodigo.getText();
            double importe = Double.parseDouble(txtImporte.getText());
            Factura f = new Factura(cod, nombre, ubicacion, importe, pedido);
            FacturaDAO.getInstance().agregar(f);
            FacturaDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (validar()) {
            String cod = txtCodigo.getText();
            double importe = Double.parseDouble(txtImporte.getText());
            Factura f = new Factura(cod, nombre, ubicacion, importe, pedido);
            FacturaDAO.getInstance().actualizar(f);
            FacturaDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        DlgPedidoConsultar p = DlgPedidoConsultar.getInstance();
        p.setVisible(true);
        pedido = p.pedido;
        if (pedido != null) {
            txtIdPedido.setText(pedido.getIdPedido());
            txtPrecioTotal.setText(String.valueOf(pedido.getTotalPrecio()));
            txtIdReserva.setText(pedido.getReserva().getIdReserva());
            txtImporte.setText(String.valueOf(pedido.getTotalPrecio()));
        }
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        String DNI = txtBuscar.getText();
        FacturaDAO.getInstance().eventMostrar(DNI, modelo);
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String DNI = txtCodigo.getText();
        FacturaDAO.getInstance().eliminar(DNI);
        FacturaDAO.getInstance().mostrar(modelo);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cod = txtBuscar.getText();
        if (cod.isEmpty())
        JOptionPane.showMessageDialog(null, "Por favor ingresar el DNI");
        else {
            Factura f = FacturaDAO.getInstance().buscar(cod);
            if (f != null) {
                txtCodigo.setText(f.getCodigo());
                txtImporte.setText(String.valueOf(f.getImporteTotal()));
                pedido = f.getPedido();
                txtIdPedido.setText(pedido.getIdPedido());
                txtPrecioTotal.setText(String.valueOf(pedido.getTotalPrecio()));
                txtIdReserva.setText(pedido.getReserva().getIdReserva());
                habilitar(false);
            } else {
                JOptionPane.showMessageDialog(null, "El DNI no existe");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        FacturaDAO.getInstance().mostrar(modelo);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        java.sql.Connection cn = Conexion.getInstance().getConnection();
        JasperReport report = null;
        String root = "src\\reportes";
        //AL FINAL NUNCA CARGÓ :'C
    }//GEN-LAST:event_boton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pucara.Boton boton1;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodos;
    private pucara.Fondo fondo1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextField txtIdReserva;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtPrecioTotal;
    // End of variables declaration//GEN-END:variables
}

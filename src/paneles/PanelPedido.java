/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import datos.ListaPedidoProducto;
import datos.PedidoDAO;
import datos.ProductoDAO;
import entidad.Pedido;
import entidad.PedidoProducto;
import entidad.Producto;
import entidad.Reserva;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.DlgProductoConsultar;
import vista.DlgReservaConsultar;

/**
 *
 * @author Aldo Cruz
 */
public class PanelPedido extends javax.swing.JPanel {

    private final DefaultTableModel modelo = new DefaultTableModel();
    private final DefaultTableModel modProducto = new DefaultTableModel();
    private Reserva reserva;
    private ListaPedidoProducto lista = new ListaPedidoProducto();
    
    public PanelPedido() {
        initComponents();habilitar(true);
        PedidoDAO.getInstance().mostrar(modelo);
    }

    private boolean validar() {
        if (txtIdPedido.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese ID PEDIDO");
            return false;
        }
        if (txtPrecioTotal.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un Producto");
            return false;
        }
        if (reserva == null) {
            JOptionPane.showMessageDialog(null, "Seleccione una Reserva");
            return false;
        }
        if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione por lo menos un PRODUCTO");
            return false;
        }
        return true;
    }

    private void limpiar() {
        txtIdPedido.setText("");
        txtPrecioTotal.setText("");
        txtIdReserva.setText("");
        txtMontoReserva.setText("");
        txtDniCliente.setText("");
        txtBuscar.setText("");
        reserva = null;
        lista.eliminar();
        lista.mostrar(modProducto);
        limpiarPro();
        habilitar(true);
    }

    private void habilitar(boolean boo) {
        btnGuardar.setEnabled(boo);
        btnBuscar.setEnabled(boo);
        btnActualizar.setEnabled(!boo);
        btnEliminar.setEnabled(!boo);
        txtIdPedido.setEditable(boo);
    }

    private void limpiarPro() {
        txtIdProducto.setText("");
        txtNombre.setText("");
        txtPrecioProducto.setText("");
        txtCantidad.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdPedido = new javax.swing.JTextField();
        txtPrecioTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fondo1 = new pucara.Fondo();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        chBuscar = new javax.swing.JCheckBox();
        btnTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnSelProducto = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtIdProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtIdReserva = new javax.swing.JTextField();
        txtMontoReserva = new javax.swing.JTextField();
        txtDniCliente = new javax.swing.JTextField();
        btnSelReserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Britannic Bold", 0, 70)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Pedido");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, -20, 320, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llave.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, -30, 130, 160));

        txtIdPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ID PEDIDO:"));
        add(txtIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 210, -1));

        txtPrecioTotal.setEditable(false);
        txtPrecioTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "PRECIO TOTAL:"));
        add(txtPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 175, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedido.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("-PEDIDO");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 100, -1));

        jLabel6.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("S/.");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 40, 70));

        fondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 1220, 140));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "BUSCAR POR ID PEDIDO:"));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 40));

        chBuscar.setBackground(new java.awt.Color(204, 204, 255));
        chBuscar.setText("Auto..");
        jPanel2.add(chBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, -1));

        btnTodos.setBackground(new java.awt.Color(51, 102, 255));
        btnTodos.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("TODOS");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 220, 110));

        jTable1.setModel(modelo);
        jTable1.setGridColor(new java.awt.Color(204, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 670, 370));

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
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 50, -1));

        jPanel5.setBackground(new java.awt.Color(18, 18, 125));
        jPanel5.setForeground(new java.awt.Color(18, 18, 125));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "PRODUCTOS ADQUIRIDOS:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setEditable(false);
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "NOMBRE:"));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        txtPrecioProducto.setEditable(false);
        txtPrecioProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "PRECIO:"));
        jPanel3.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, -1));

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "CANTIDAD:"));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel3.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 150, -1));

        btnSelProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccion.png"))); // NOI18N
        btnSelProducto.setBorder(null);
        btnSelProducto.setOpaque(false);
        btnSelProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnSelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 40, 40));

        btnAgregarProducto.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregarProducto.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAgregarProducto.setText("AGREGAR");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 110, 30));

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ELIMINAR_1.gif"))); // NOI18N
        btnEliminarProducto.setBorder(null);
        btnEliminarProducto.setOpaque(false);
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 40, 50));

        jTable2.setModel(modProducto);
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 340, 160));

        txtIdProducto.setEditable(false);
        txtIdProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ID PRODUCTO:"));
        jPanel3.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 40));

        jLabel9.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("S/.");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 40, 70));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 360, 370));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "RESERVAS REALIZADAS:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdReserva.setEditable(false);
        txtIdReserva.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ID RESERVA:"));
        jPanel1.add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 40));

        txtMontoReserva.setEditable(false);
        txtMontoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "MONTO:"));
        jPanel1.add(txtMontoReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 180, -1));

        txtDniCliente.setEditable(false);
        txtDniCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "DNI CLIENTE:"));
        jPanel1.add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 180, -1));

        btnSelReserva.setBackground(new java.awt.Color(255, 255, 255));
        btnSelReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccion.png"))); // NOI18N
        btnSelReserva.setBorder(null);
        btnSelReserva.setOpaque(false);
        btnSelReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelReservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login_png.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("S/.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 40, 70));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 360, 210));

        btnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.gif"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setOpaque(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel5.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 50, 60));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, -10, 410, 760));

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

    private void btnSelReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelReservaActionPerformed
        DlgReservaConsultar r = DlgReservaConsultar.getInstance();
        r.setVisible(true);
        reserva = r.reserva;
        if (reserva != null) {
            txtIdReserva.setText(reserva.getIdReserva());
            txtMontoReserva.setText(String.valueOf(reserva.getMontoTotal()));
            txtDniCliente.setText(reserva.getCliente().getDni());
        }
    }//GEN-LAST:event_btnSelReservaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validar()) {
            String id = txtIdPedido.getText();
            double pTotal = Double.parseDouble(txtPrecioTotal.getText());
            Pedido p = new Pedido(id, pTotal, reserva);
            p.setLista(lista);
            PedidoDAO.getInstance().agregar(p);
            PedidoDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (validar()) {
            String id = txtIdPedido.getText();
            double pTotal = Double.parseDouble(txtPrecioTotal.getText());
            Pedido p = new Pedido(id, pTotal, reserva);
            p.setLista(lista);
            PedidoDAO.getInstance().actualizar(p);
            PedidoDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9')
        evt.consume();
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnSelProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelProductoActionPerformed
        DlgProductoConsultar p = DlgProductoConsultar.getInstance();
        p.setVisible(true);
        Producto x = p.producto;
        if (x != null) {
            txtIdProducto.setText(x.getIdProducto());
            txtNombre.setText(x.getNombre());
            txtPrecioProducto.setText(String.valueOf(x.getPrecio()));
        }
    }//GEN-LAST:event_btnSelProductoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        if (validarProducto()) {
            String idpro = txtIdProducto.getText();
            Producto p = ProductoDAO.getInstance().buscar(idpro);
            int can = Integer.parseInt(txtCantidad.getText());
            lista.agregar(new PedidoProducto(p, can));
            lista.mostrar(modProducto);
            total();
            limpiarPro();
        }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        int c = jTable2.getSelectedRow();
        if (c != -1) {
            lista.eliminar(c);
            lista.mostrar(modProducto);
            total();
        } else
        JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla");
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (chBuscar.isSelected()) {
            String DNI = txtBuscar.getText();
            PedidoDAO.getInstance().eventMostrar(DNI, modelo);
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String id = txtIdReserva.getText();
        PedidoDAO.getInstance().eliminar(id);
        PedidoDAO.getInstance().mostrar(modelo);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = txtIdPedido.getText();
        if (id.isEmpty())
        JOptionPane.showMessageDialog(null, "Por favor ingresar ID PRODUCTO");
        else {
            Pedido p = PedidoDAO.getInstance().buscar(id);
            if (p != null) {
                txtIdPedido.setText(p.getIdPedido());
                txtPrecioTotal.setText(String.valueOf(p.getTotalPrecio()));
                reserva = p.getReserva();
                txtIdReserva.setText(reserva.getIdReserva());
                txtMontoReserva.setText(String.valueOf(reserva.getMontoTotal()));
                txtDniCliente.setText(reserva.getCliente().getDni());
                lista = p.getLista();
                lista.mostrar(modelo);
                habilitar(false);
            } else {
                JOptionPane.showMessageDialog(null, "El ID PRODUCTO no existe");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        PedidoDAO.getInstance().mostrar(modelo);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int c = jTable1.getSelectedRow();
        if (c != -1) {
            String id = modelo.getValueAt(c, 0).toString();
            Pedido p = PedidoDAO.getInstance().buscar(id);
            if (p != null) {
                txtIdPedido.setText(p.getIdPedido());
                txtPrecioTotal.setText(String.valueOf(p.getTotalPrecio()));
                reserva = p.getReserva();
                txtIdReserva.setText(reserva.getIdReserva());
                txtMontoReserva.setText(String.valueOf(reserva.getMontoTotal()));
                txtDniCliente.setText(reserva.getCliente().getDni());
                lista = p.getLista();
                lista.mostrar(modProducto);
                habilitar(false);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private boolean validarProducto() {
        if (txtIdProducto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione Productos");
            return false;
        }
        if (txtCantidad.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Cantidad");
            return false;
        }
        return true;
    }

    private void total() {
        if (reserva == null)
            txtPrecioTotal.setText(String.valueOf(lista.totalPrecio()));
        else
            txtPrecioTotal.setText(String.valueOf(reserva.getMontoTotal()+lista.totalPrecio()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSelProducto;
    private javax.swing.JButton btnSelReserva;
    private javax.swing.JButton btnTodos;
    private javax.swing.JCheckBox chBuscar;
    private pucara.Fondo fondo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdReserva;
    private javax.swing.JTextField txtMontoReserva;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtPrecioTotal;
    // End of variables declaration//GEN-END:variables
}

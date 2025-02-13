package paneles;

import com.toedter.calendar.JDateChooser;
import datos.HabitacionDAO;
import datos.ListaReservaHabitacion;
import datos.ReservaDAO;
import entidad.Cliente;
import entidad.Habitacion;
import entidad.Reserva;
import entidad.ReservaHabitacion;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.DlgClienteConsultar;
import vista.DlgHabitacionConsultar;

/**
 *
 * @author Aldo Cruz
 */
public class PanelReserva extends javax.swing.JPanel {

    private final DefaultTableModel modelo = new DefaultTableModel();
    private final DefaultTableModel modHabitacion = new DefaultTableModel();
    private Cliente cliente;
    private ListaReservaHabitacion lista = new ListaReservaHabitacion();
    
    public PanelReserva() {
        initComponents();ReservaDAO.getInstance().mostrar(modelo);
        habilitar(true);
    }
    
    private boolean validar() {
        if (txtIdReserva.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese ID RESERVA");
            return false;
        }
        if (txtPrecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese PRECIO");
            return false;
        }
        if (datIngreso.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese FECHA INGRESO");
            return false;
        }
        if (datSalida.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese FECHA SALIDA");
            return false;
        }
        if (txtPrecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese TELEFONO");
            return false;
        }
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Seleccione un CLIENTE");
            return false;
        }
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Seleccione un CLIENTE");
            return false;
        }
        if (lista.size()==0) {
            JOptionPane.showMessageDialog(null, "Seleccione por lo menos una HABITACIÓN");
            return false;
        }
        return true;
    }

    private void limpiar() {
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDniCliente.setText("");
        txtIdReserva.setText("");
        datIngreso.setDate(null);
        datSalida.setDate(null);
        txtPrecio.setText("");
        txtNombres.setText("");
        txtDniCliente.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
        limpiarHabi();
        cliente = null;
        lista.eliminar();
        lista.mostrar(modHabitacion);
        habilitar(true);
    }

    private void habilitar(boolean boo) {
        btnGuardar.setEnabled(boo);
        btnBuscar.setEnabled(boo);
        btnActualizar.setEnabled(!boo);
        btnEliminar.setEnabled(!boo);
    }

    private void limpiarHabi() {
        txtCodigoHabi.setText("");
        txtCategoriaHabi.setText("");
        txtPrecioHabi.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtIdReserva = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        datIngreso = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        datSalida = new com.toedter.calendar.JDateChooser();
        fondo1 = new pucara.Fondo();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnTodos = new javax.swing.JButton();
        chBuscar = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtCodigoHabi = new javax.swing.JTextField();
        txtCategoriaHabi = new javax.swing.JTextField();
        txtPrecioHabi = new javax.swing.JTextField();
        btnSelHabi = new javax.swing.JButton();
        btnAgregarHabi = new javax.swing.JButton();
        btnEliminarHabi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDniCliente = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnSelCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LLAV.gif"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        txtIdReserva.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ID RESERVA:"));
        add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 210, 40));

        jLabel9.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("S/.");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 40, 40));

        txtPrecio.setEditable(false);
        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "PRECIO TOTAL:"));
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 180, 40));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 3, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("-FECHA SALIDA");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 90, 80, 30));
        add(datIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 240, 20));

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 3, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("-FECHA INGRESO");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 50, 100, 10));
        add(datSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 240, 20));

        fondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1200, 130));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "BUSCAR POR ID RESERVA:"));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        btnTodos.setBackground(new java.awt.Color(102, 153, 255));
        btnTodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("TODOS");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 20));

        chBuscar.setBackground(new java.awt.Color(204, 204, 255));
        chBuscar.setText("Auto..");
        jPanel2.add(chBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 200, 110));

        jTable1.setModel(modelo);
        jTable1.setGridColor(new java.awt.Color(204, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 670, 380));

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
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ELIMINAR.gif"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 50, -1));

        jPanel5.setBackground(new java.awt.Color(18, 18, 125));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "HABITACIÓN:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoHabi.setEditable(false);
        txtCodigoHabi.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "CÓDIGO HABITACIÓN:"));
        jPanel3.add(txtCodigoHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 40));

        txtCategoriaHabi.setEditable(false);
        txtCategoriaHabi.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "CATEGORÍA H."));
        txtCategoriaHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaHabiActionPerformed(evt);
            }
        });
        jPanel3.add(txtCategoriaHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, -1));

        txtPrecioHabi.setEditable(false);
        txtPrecioHabi.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "PRECIO H."));
        jPanel3.add(txtPrecioHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, -1));

        btnSelHabi.setBackground(new java.awt.Color(255, 255, 255));
        btnSelHabi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccion.png"))); // NOI18N
        btnSelHabi.setBorder(null);
        btnSelHabi.setOpaque(false);
        btnSelHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelHabiActionPerformed(evt);
            }
        });
        jPanel3.add(btnSelHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 40, 40));

        btnAgregarHabi.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregarHabi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAgregarHabi.setText("AGREGAR");
        btnAgregarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHabiActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 110, 30));

        btnEliminarHabi.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarHabi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ELIMINAR_1.gif"))); // NOI18N
        btnEliminarHabi.setBorder(null);
        btnEliminarHabi.setOpaque(false);
        btnEliminarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHabiActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 50, 50));

        jTable2.setModel(modHabitacion);
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 340, 150));

        jLabel11.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("S/.");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 40, 70));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 362, 370));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombres.setEditable(false);
        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "NOMBRES:"));
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 210, -1));

        txtApellidos.setEditable(false);
        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "APELLIDOS:"));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, -1));

        txtDniCliente.setEditable(false);
        txtDniCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "DNI CLIENTE:"));
        jPanel1.add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 40));

        txtEdad.setEditable(false);
        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "EDAD:"));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 70, -1));

        btnSelCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnSelCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccion.png"))); // NOI18N
        btnSelCliente.setBorder(null);
        btnSelCliente.setOpaque(false);
        btnSelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login_png.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 130));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 362, 230));

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

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 410, 760));

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

    private void btnSelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelClienteActionPerformed
        DlgClienteConsultar c = DlgClienteConsultar.getInstance();
        c.setVisible(true);
        cliente = c.cliente;
        if (cliente != null) {
            txtDniCliente.setText(cliente.getDni());
            txtNombres.setText(cliente.getNombre());
            txtApellidos.setText(cliente.getApellidos());
            txtEdad.setText(cliente.getEdad() + "");
        }
    }//GEN-LAST:event_btnSelClienteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validar()) {
            String idR = txtIdReserva.getText();
            java.sql.Date ingreso = fecha(datIngreso);
            java.sql.Date salida = fecha(datSalida);
            double precio = Double.parseDouble(txtPrecio.getText());
            Reserva r = new Reserva(idR, ingreso, salida, precio, cliente);
            r.setLista(lista);
            ReservaDAO.getInstance().agregar(r);
            ReservaDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (validar()) {
            String idR = txtIdReserva.getText();
            java.sql.Date ingreso = fecha(datIngreso);
            java.sql.Date salida = fecha(datSalida);
            double precio = Double.parseDouble(txtPrecio.getText());
            Reserva r = new Reserva(idR, ingreso, salida, precio, cliente);
            r.setLista(lista);
            ReservaDAO.getInstance().actualizar(r);
            ReservaDAO.getInstance().mostrar(modelo);
            limpiar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (chBuscar.isSelected()) {
            String id = txtBuscar.getText();
            ReservaDAO.getInstance().eventMostrar(id, modelo);
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String DNI = txtNombres.getText();
        ReservaDAO.getInstance().eliminar(DNI);
        ReservaDAO.getInstance().mostrar(modelo);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = txtBuscar.getText();
        if (id.isEmpty())
        JOptionPane.showMessageDialog(null, "Por favor ingresar ID RESERVA");
        else {
            Reserva r = ReservaDAO.getInstance().buscar(id);
            if (r != null) {
                txtIdReserva.setText(r.getIdReserva());
                datIngreso.setDate(r.getFechaIngreso());
                datSalida.setDate(r.getFechaSalida());
                txtPrecio.setText(String.valueOf(r.getMontoTotal()));
                cliente = r.getCliente();
                txtDniCliente.setText(cliente.getDni());
                txtNombres.setText(cliente.getNombre());
                txtApellidos.setText(cliente.getApellidos());
                txtEdad.setText(cliente.getEdad() + "");
                lista = r.getLista();
                lista.mostrar(modHabitacion);
                habilitar(false);
            } else {
                JOptionPane.showMessageDialog(null, "El  ID RESERVA no existe");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        ReservaDAO.getInstance().mostrar(modelo);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        if (i != -1) {
            String id = modelo.getValueAt(i, 0).toString();
            Reserva r = ReservaDAO.getInstance().buscar(id);
            txtIdReserva.setText(r.getIdReserva());
            datIngreso.setDate(r.getFechaIngreso());
            datSalida.setDate(r.getFechaSalida());
            txtPrecio.setText(String.valueOf(r.getMontoTotal()));
            cliente = r.getCliente();
            txtDniCliente.setText(cliente.getDni());
            txtNombres.setText(cliente.getNombre());
            txtApellidos.setText(cliente.getApellidos());
            txtEdad.setText(cliente.getEdad() + "");
            lista = r.getLista();
            lista.mostrar(modHabitacion);
            habilitar(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSelHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelHabiActionPerformed
        DlgHabitacionConsultar c = DlgHabitacionConsultar.getInstance();
        c.setVisible(true);
        Habitacion x = c.habitacion;
        if (x != null) {
            txtCodigoHabi.setText(x.getCodigo());
            txtCategoriaHabi.setText(x.getCategoria());
            txtPrecioHabi.setText(String.valueOf(x.getPrecio()));
        }
    }//GEN-LAST:event_btnSelHabiActionPerformed

    private void btnAgregarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHabiActionPerformed
        if (!txtCodigoHabi.getText().trim().isEmpty()) {
            String id = txtCodigoHabi.getText();
            Habitacion x = HabitacionDAO.getInstance().buscar(id);
            lista.agregar(new ReservaHabitacion(x));
            lista.mostrar(modHabitacion);
            txtPrecio.setText(String.valueOf(lista.totalPrecio()));
            limpiarHabi();
        }
    }//GEN-LAST:event_btnAgregarHabiActionPerformed

    private void btnEliminarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHabiActionPerformed
        int i = jTable2.getSelectedRow();
        if (i != -1) {
            lista.eliminar(i);
            lista.mostrar(modHabitacion);
        }
    }//GEN-LAST:event_btnEliminarHabiActionPerformed

    private void txtCategoriaHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaHabiActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private java.sql.Date fecha(JDateChooser date) {
        Date fecha = date.getDate();
        long  f = fecha.getTime();
        return new java.sql.Date(f);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarHabi;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarHabi;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSelCliente;
    private javax.swing.JButton btnSelHabi;
    private javax.swing.JButton btnTodos;
    private javax.swing.JCheckBox chBuscar;
    private com.toedter.calendar.JDateChooser datIngreso;
    private com.toedter.calendar.JDateChooser datSalida;
    private pucara.Fondo fondo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCategoriaHabi;
    private javax.swing.JTextField txtCodigoHabi;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdReserva;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioHabi;
    // End of variables declaration//GEN-END:variables
}

package vista;

import datos.UsuarioDAO;
import entidad.Usuario;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import pucara.Otros;

/**
 *
 * @author Aldo Cruz
 */
public class DlgUsuario extends javax.swing.JDialog {

    private static DlgUsuario INSTANCE;
    
    public static synchronized DlgUsuario getInstance() {
        if (INSTANCE == null)
            INSTANCE = new DlgUsuario();
        return INSTANCE;
    }
    
    private DlgUsuario() {
        super(FrmLogin.getInstance(),true);
        initComponents();
        setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
        cargar();
    }

    private void cargar() {
        pswPass.setFont(new java.awt.Font("Roboto", 0, 16));
        pswPass.setForeground(Color.GRAY);
        pswPass.setText("Contraseña");
        pswPass.setEchoChar((char)0);
        pswConfirmar.setFont(new java.awt.Font("Roboto", 0, 16));
        pswConfirmar.setForeground(Color.GRAY);
        pswConfirmar.setText("Confirmar Contraseña");
        pswConfirmar.setEchoChar((char)0);
        txtUsuario.start("Usuario", "Roboto", 16);
        txtNombre.start("Nombre", "Roboto", 16);
        txtApellidos.start("Apellidos", "Roboto", 16);
        txtCorreo.start("Correo", "Roboto", 16);
        txtUsuario.requestFocus();
    }
    
    private boolean validar() {
        if (txtUsuario.getText().trim().isEmpty() || txtUsuario.getText().trim().equals("Usuario")) {
            JOptionPane.showMessageDialog(null, "Ingrese un Usuario");
            return false;
        }
        if (txtNombre.getText().trim().isEmpty() || txtUsuario.getText().trim().equals("Nombre")) {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre");
            return false;
        }
        if (txtApellidos.getText().trim().isEmpty() || txtUsuario.getText().trim().equals("Apellidos")) {
            JOptionPane.showMessageDialog(null, "Ingrese Apellidos");
            return false;
        }
        if (!Otros.validarCorreo(txtCorreo.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese un correo válido");
            return false;
        }
        if (pswPass.getText().trim().isEmpty() || pswPass.getText().equals("Contraseña")) {
            JOptionPane.showMessageDialog(null, "Ingrese su contraseña");
            return false;
        }
        if (pswConfirmar.getText().trim().isEmpty() || pswConfirmar.getText().equals("Confirmar Contraseña")) {
            JOptionPane.showMessageDialog(null, "Ingrese su contraseña nuevamente");
            return false;
        }
        if (!pswConfirmar.getText().equals(pswPass.getText())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas deben coincidir");
            return false;
        }
        return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pswConfirmar = new javax.swing.JPasswordField();
        pswPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        header = new pucara.HeadDlg(this);
        txtUsuario = new pucara.CajaTexto();
        txtNombre = new pucara.CajaTexto();
        txtApellidos = new pucara.CajaTexto();
        txtCorreo = new pucara.CajaTexto();
        btnRegistrar = new pucara.Boton();
        btnCerrar = new pucara.Boton();
        fondo1 = new pucara.Fondo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pswConfirmar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pswConfirmar.setBorder(null);
        pswConfirmar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswConfirmarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pswConfirmarFocusLost(evt);
            }
        });
        jPanel1.add(pswConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 250, 30));

        pswPass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pswPass.setBorder(null);
        pswPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pswPassFocusLost(evt);
            }
        });
        jPanel1.add(pswPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 250, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 350, 30));

        header.setOpaque(false);
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 30));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 250, 30));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 250, 30));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 250, 30));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 250, 30));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 120, 35));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 120, 35));

        javax.swing.GroupLayout fondo1Layout = new javax.swing.GroupLayout(fondo1);
        fondo1.setLayout(fondo1Layout);
        fondo1Layout.setHorizontalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        fondo1Layout.setVerticalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pswConfirmarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswConfirmarFocusGained
        if (String.valueOf(pswConfirmar.getPassword()).equals("Confirmar Contraseña")) {
            pswConfirmar.setText("");
            pswConfirmar.setFont(new java.awt.Font("Roboto",0,16));
            pswConfirmar.setForeground(Color.BLACK);
            pswConfirmar.setEchoChar('*');
        }
    }//GEN-LAST:event_pswConfirmarFocusGained

    private void pswConfirmarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswConfirmarFocusLost
        if (String.valueOf(pswConfirmar.getPassword()).isEmpty()) {
            pswConfirmar.setText("Confirmar Contraseña");
            pswConfirmar.setEchoChar((char)0);
            pswConfirmar.setFont(new java.awt.Font("Roboto",0,16));
            pswConfirmar.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_pswConfirmarFocusLost

    private void pswPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswPassFocusGained
        if (String.valueOf(pswPass.getPassword()).equals("Contraseña")) {
            pswPass.setText("");
            pswPass.setFont(new java.awt.Font("Roboto",0,16));
            pswPass.setForeground(Color.BLACK);
            pswPass.setEchoChar('*');
        }
    }//GEN-LAST:event_pswPassFocusGained

    private void pswPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswPassFocusLost
        if (String.valueOf(pswPass.getPassword()).isEmpty()) {
            pswPass.setText("Contraseña");
            pswPass.setEchoChar((char)0);
            pswPass.setFont(new java.awt.Font("Roboto",0,16));
            pswPass.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_pswPassFocusLost

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validar()) {
            String idUsuario = txtUsuario.getText().trim();
            String nombre = txtNombre.getText().trim();
            String apellidos = txtApellidos.getText().trim();
            String correo = txtCorreo.getText().trim();
            String contra = pswConfirmar.getText().trim();
            java.util.Date date = new java.util.Date();
            DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String ultima = fechaHora.format(date);
            Usuario usuario;
            if (UsuarioDAO.getInstance().isEmpty())
                usuario = new Usuario(idUsuario, nombre, apellidos, correo, contra, "A", ultima);
            else
                usuario = new Usuario(idUsuario, nombre, apellidos, correo, contra, "U", ultima);
            UsuarioDAO.getInstance().agregar(usuario);
            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
            dispose();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlgUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgUsuario dialog = new DlgUsuario();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pucara.Boton btnCerrar;
    private pucara.Boton btnRegistrar;
    private pucara.Fondo fondo1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pswConfirmar;
    private javax.swing.JPasswordField pswPass;
    private pucara.CajaTexto txtApellidos;
    private pucara.CajaTexto txtCorreo;
    private pucara.CajaTexto txtNombre;
    private pucara.CajaTexto txtUsuario;
    // End of variables declaration//GEN-END:variables
}

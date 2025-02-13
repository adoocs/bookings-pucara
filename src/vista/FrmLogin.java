package vista;

import datos.UsuarioDAO;
import entidad.Usuario;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FrmLogin extends javax.swing.JFrame {

    public static Usuario usuario = null;
    private static FrmLogin INSTANCE;
    
    public static synchronized FrmLogin getInstance() {
        if (INSTANCE == null)
            INSTANCE = new FrmLogin();
        return INSTANCE;
    }
    
    private FrmLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        cargar();
        SetImageLabel(jLabel4, "src/img/loginHPuca.png");
    }

    private void cargar() {
        //estilo();
        pswPass.setFont(new java.awt.Font("Arial Narrow", 0, 18));
        pswPass.setForeground(Color.GRAY);
        pswPass.setText("Contraseña");
        pswPass.setEchoChar((char)0);
        txtUser.start("Nombre de Usuario","Arial Narrow", 18);
        txtUser.requestFocus();
        verificarUsuario();
    }
    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image=new ImageIcon(root);
        Icon icon=new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private boolean validar() {
        if (txtUser.getText().trim().isEmpty() || txtUser.getText().trim().equals("Nombre de Usuario")) {
            JOptionPane.showMessageDialog(null, "Ingrese su Usuario");
            return false;
        }
        if (pswPass.getText().trim().isEmpty() || pswPass.getText().equals("Contraseña")) {
            JOptionPane.showMessageDialog(null, "Ingrese su Contraseña");
            return false;
        }
        return true;
    }
    
    private void verificarUsuario() {
        Thread t = new Thread(() -> {
            if (UsuarioDAO.getInstance().isEmpty()) {
                int i = JOptionPane.showConfirmDialog(null, "¡El sistema no tiene usuarios!\n¿Desea ingresar un nuevo usuario?",
                        "¡Alerta Usuario!",JOptionPane.OK_OPTION);
                if (i == JOptionPane.OK_OPTION)
                DlgUsuario.getInstance().setVisible(true);
                else
                    System.exit(0);
            }
        });
        t.start();
    }
    
    private void estilo() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chkMostrar = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new pucara.CajaTexto();
        jPanel3 = new javax.swing.JPanel();
        pswPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new pucara.HeadFrm(this);
        btnAcceso = new pucara.Boton();
        btnSalir = new pucara.Boton();
        login1 = new pucara.Login();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(410, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 130, 170));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("I N I C I A R       S E S I Ó N");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 410, 40));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registrarse Aquí...");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        chkMostrar.setBackground(new java.awt.Color(158, 158, 255));
        chkMostrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        chkMostrar.setText("Mostrar Contraseña");
        chkMostrar.setBorder(null);
        chkMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojo_.png"))); // NOI18N
        chkMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkMostrarMouseClicked(evt);
            }
        });
        jPanel1.add(chkMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 150, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_32x32-32.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 280, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contraseña.gif"))); // NOI18N
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswPass, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(pswPass, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 280, 40));

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 50));

        btnAcceso.setText("Acceder");
        btnAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 120, 35));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 120, 35));

        javax.swing.GroupLayout login1Layout = new javax.swing.GroupLayout(login1);
        login1.setLayout(login1Layout);
        login1Layout.setHorizontalGroup(
            login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        login1Layout.setVerticalGroup(
            login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel1.add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 550));

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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        DlgUsuario.getInstance().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void chkMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkMostrarMouseClicked
        if (chkMostrar.isSelected() && pswPass.getText().equals("Contraseña"))
            pswPass.setEchoChar((char)0);
        if (chkMostrar.isSelected() && !pswPass.getText().equals("Contraseña"))
            pswPass.setEchoChar((char)0);
        if (!chkMostrar.isSelected() && pswPass.getText().equals("Contraseña"))
            pswPass.setEchoChar((char)0);
        if (!chkMostrar.isSelected() && !pswPass.getText().equals("Contraseña"))
            pswPass.setEchoChar('*');
        else
            pswPass.setEchoChar((char)0);
    }//GEN-LAST:event_chkMostrarMouseClicked

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

    private void btnAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesoActionPerformed
        if (validar()) {
            String idUsuario = txtUser.getText().trim();
            String contra = pswPass.getText().trim();
            usuario = UsuarioDAO.getInstance().buscar(idUsuario, contra);
            if (usuario != null) {
                dispose();
                FrmPrincipal.getInstance().setVisible(true);
            } else {
                System.out.println("Usuario no encontrado");
            }
        }
    }//GEN-LAST:event_btnAccesoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pucara.Boton btnAcceso;
    private pucara.Boton btnSalir;
    private javax.swing.JCheckBox chkMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private pucara.Login login1;
    private javax.swing.JPasswordField pswPass;
    private pucara.CajaTexto txtUser;
    // End of variables declaration//GEN-END:variables
}

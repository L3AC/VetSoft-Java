/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AVista;

import AControlador.ctUser;
import AControlador.sendSMS;
//import AControlador.sendSMS;
import AModelo.Conx;
import AModelo.Crypt;
import Mensajes.CodigoErrorDRC2;
import Mensajes.CodigoErrorDRC3;
import Mensajes.CódigoDSI10;
import Mensajes.CódigoErrorDRC4;
import Mensajes.CódigoErrorDSI4;
import Mensajes.CódigoErrorDSI5;
import Mensajes.CódigoErrorDSI6;
import Mensajes.GlassPanePopup;
import Validation.Valida;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class enviarSMS extends javax.swing.JFrame {

    Conx con = new Conx();
    Connection acceso;
    String tel;
    String codigo;
    Crypt cryp = new Crypt();

    public enviarSMS() {
        GlassPanePopup.install(this);
        initComponents();
        transparente();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(this);
        txtCod.setEnabled(false);
        btnVeri.setEnabled(false);
        txtNueva.setEnabled(false);
        txtNueva2.setEnabled(false);
        btnCambiar.setEnabled(false);
        lbMin.setVisible(false);

        /*Este apartado validamos los Jtexfield que no se escriban números o letras con un maximo de digitos*/
        txtUser.setDocument(new Valida(30, "[a-zA-Z0-9ZáéíóúÁÉÍÓÚñÑüÜ]*"));
        txtCod.setDocument(new Valida(20, "[a-zA-Z0-9]*"));
        txtNueva.setDocument(new Valida(30, "[a-zA-Z0-9ZáéíóúÁÉÍÓÚñÑüÜ]*"));
        txtNueva2.setDocument(new Valida(30, "[a-zA-Z0-9ZáéíóúÁÉÍÓÚñÑüÜ]*"));

        String iconPath = "src/Imagenes/logoC.png";
        ImageIcon icon = new ImageIcon(iconPath);
        setIconImage(icon.getImage());
        setTitle("VetSoft");
    }

    public void transparente() {
        BtnRegresar1.setOpaque(false);
        BtnRegresar1.setContentAreaFilled(false);
        BtnRegresar1.setBorderPainted(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound2 = new Design.PanelRound();
        BtnRegresar1 = new javax.swing.JButton();
        lbMayor = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        lbCod = new javax.swing.JLabel();
        btnVeri = new Design.ButtonGradient();
        lbMin = new javax.swing.JLabel();
        lbUs2 = new javax.swing.JLabel();
        lbCod1 = new javax.swing.JLabel();
        btnEnviar = new Design.ButtonGradient();
        btnCambiar = new Design.ButtonGradient();
        txtUser = new Design.TextFieldSV();
        txtCod = new Design.TextFieldSV();
        txtNueva = new Design.PasswordField();
        txtNueva2 = new Design.PasswordField();
        lbUs3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VetSoft2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(190, 233, 232));
        setResizable(false);

        panelRound2.setBackground(new java.awt.Color(190, 233, 232));
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegresar1.setBackground(new java.awt.Color(190, 233, 232));
        BtnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        BtnRegresar1.setBorder(null);
        BtnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresar1ActionPerformed(evt);
            }
        });
        panelRound2.add(BtnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 29, 28));

        lbMayor.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lbMayor.setForeground(new java.awt.Color(27, 73, 101));
        lbMayor.setText("Recuperación de contraseña por SMS");
        panelRound2.add(lbMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCod.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCod.setForeground(new java.awt.Color(0, 0, 0));
        lbCod.setText("Confirmar Contraseña");
        panelRound1.add(lbCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 180, 30));

        btnVeri.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVeri.setForeground(new java.awt.Color(0, 0, 0));
        btnVeri.setText("Verificar");
        btnVeri.setColor1(new java.awt.Color(190, 233, 232));
        btnVeri.setColor2(new java.awt.Color(190, 233, 232));
        btnVeri.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnVeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeriActionPerformed(evt);
            }
        });
        panelRound1.add(btnVeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 30));

        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 8");
        panelRound1.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 110, 30));

        lbUs2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbUs2.setForeground(new java.awt.Color(0, 0, 0));
        lbUs2.setText("Ingrese su Usuario");
        panelRound1.add(lbUs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        lbCod1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCod1.setForeground(new java.awt.Color(0, 0, 0));
        lbCod1.setText("Ingrese su código de verificación");
        panelRound1.add(lbCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));

        btnEnviar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEnviar.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviar.setText("Enviar SMS");
        btnEnviar.setColor1(new java.awt.Color(190, 233, 232));
        btnEnviar.setColor2(new java.awt.Color(190, 233, 232));
        btnEnviar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        panelRound1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 110, 30));

        btnCambiar.setForeground(new java.awt.Color(0, 0, 0));
        btnCambiar.setText("Cambiar Contraseña");
        btnCambiar.setColor1(new java.awt.Color(190, 233, 232));
        btnCambiar.setColor2(new java.awt.Color(190, 233, 232));
        btnCambiar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        panelRound1.add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 180, 30));

        txtUser.setBackground(new java.awt.Color(190, 233, 232));
        txtUser.setShadowColor(new java.awt.Color(0, 0, 51));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        panelRound1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, -1));

        txtCod.setBackground(new java.awt.Color(190, 233, 232));
        txtCod.setShadowColor(new java.awt.Color(0, 0, 51));
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        panelRound1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, -1));

        txtNueva.setBackground(new java.awt.Color(190, 233, 232));
        txtNueva.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaActionPerformed(evt);
            }
        });
        txtNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNuevaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevaKeyTyped(evt);
            }
        });
        panelRound1.add(txtNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 180, -1));

        txtNueva2.setBackground(new java.awt.Color(190, 233, 232));
        txtNueva2.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNueva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNueva2ActionPerformed(evt);
            }
        });
        txtNueva2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNueva2KeyTyped(evt);
            }
        });
        panelRound1.add(txtNueva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 180, -1));

        lbUs3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbUs3.setForeground(new java.awt.Color(0, 0, 0));
        lbUs3.setText("Ingrese su nueva Contraseña");
        panelRound1.add(lbUs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, 30));

        panelRound2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 734, 344));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N
        panelRound2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        VetSoft2.setText("VetSoft+");
        panelRound2.add(VetSoft2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresar1ActionPerformed
        // TODO add your handling code here:

        RecuperacionDeContraseña newFrame = new RecuperacionDeContraseña();

        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresar1ActionPerformed

    private void btnVeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeriActionPerformed
        // TODO add your handling code here:
        if (txtUser.getText().isEmpty() || txtCod.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            EncCod(txtUser.getText());
        }
    }//GEN-LAST:event_btnVeriActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        if (txtUser.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {

            try {
                Encontrar();
            } catch (SQLException ex) {
                Logger.getLogger(enviarSMS.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        // TODO add your handling code here:

        if (txtUser.getText().isEmpty() || txtCod.getText().isEmpty()
                || txtNueva.getText().isEmpty() || txtNueva2.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            if (txtNueva.getText().equals(txtNueva2.getText())) {
                try {
                    act();
                } catch (Exception ex) {
                    Logger.getLogger(enviarSMS.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                CódigoErrorDRC4 obj = new CódigoErrorDRC4();
                obj.eventOK(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        GlassPanePopup.closePopupLast();
                    }
                });
                GlassPanePopup.showPopup(obj);
            }

        }
    }//GEN-LAST:event_btnCambiarActionPerformed


    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed

    }//GEN-LAST:event_txtCodActionPerformed

    private void txtNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaActionPerformed

    }//GEN-LAST:event_txtNuevaActionPerformed

    private void txtNuevaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevaKeyReleased
        // TODO add your handling code here:
        if (txtNueva.getText().length() >= 8) {
            lbMin.setVisible(false);
            btnCambiar.setEnabled(true);

        } else {
            lbMin.setVisible(true);
            btnCambiar.setEnabled(false);
        }
    }//GEN-LAST:event_txtNuevaKeyReleased

    public void act() throws Exception {

        ctUser ct = new ctUser();
        ct.usuario = txtUser.getText();
        ct.contra = cryp.encrypt(txtNueva.getText(), "key");

        if (ct.updtContra()) {
            Login newFrame = new Login();
            newFrame.setVisible(true);
            this.dispose();

            CódigoErrorDSI4 obj = new CódigoErrorDSI4();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    public void Encontrar() throws SQLException {

        ctUser ct = new ctUser();
        ct.usuario = txtUser.getText();
        ResultSet st = ct.verifUs();
        try {
            st.next();
            int found = st.getRow();
            if (found == 1) {
                tel = st.getString("telefono");
                codigo = GenerC(8);
                InsertC(codigo);
                sms(tel, codigo);
                txtCod.setEnabled(true);
                btnVeri.setEnabled(true);
                txtUser.setEnabled(false);
                btnCambiar.setEnabled(false);
                btnEnviar.setEnabled(false);
            } else {
                CodigoErrorDRC2 obj = new CodigoErrorDRC2();
                obj.eventOK(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        GlassPanePopup.closePopupLast();
                    }
                });
                GlassPanePopup.showPopup(obj);
                txtCod.setEnabled(false);
                btnVeri.setEnabled(false);
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public String GenerC(int longi) {
        String num = "0123456789";
        String lmin = "abcdefghijklmnopqrstuvwxyz";
        String lmay = lmin.toUpperCase();

        String caract = lmay + num;
        Random cod = new Random();
        String result = "";
        for (int i = 0; i < longi; i++) {
            int posic = cod.nextInt(caract.length());
            char caracter = caract.charAt(posic);
            result += caracter;
        }
        return result;

    }

    public void InsertC(String code) {
        ctUser ct = new ctUser();
        ct.code = code;
        ct.usuario = txtUser.getText();
        if (ct.updtCode()) {

            CódigoDSI10 obj = new CódigoDSI10();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear");
        }
    }

    public void EncCod(String user) {
        try {
            ctUser ct = new ctUser();
            ct.usuario = user;
            ResultSet st = ct.verifUs();
            st.next();
            int found = st.getRow();
            if (found == 1) {
                String cod = st.getString("codigoVerif");
                if (cod.equals(txtCod.getText())) {
                    CódigoErrorDSI6 obj = new CódigoErrorDSI6();
                    obj.eventOK(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            GlassPanePopup.closePopupLast();
                        }
                    });
                    GlassPanePopup.showPopup(obj);
                    txtNueva.setEnabled(true);
                    txtNueva2.setEnabled(true);
                    btnCambiar.setEnabled(true);
                    txtUser.setEnabled(false);
                    btnEnviar.setEnabled(false);
                    btnVeri.setEnabled(false);
                    txtCod.setEnabled(false);
                } else {
                    CodigoErrorDRC3 obj = new CodigoErrorDRC3();
                    obj.eventOK(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            GlassPanePopup.closePopupLast();
                        }
                    });
                    GlassPanePopup.showPopup(obj);
                    txtNueva.setEnabled(false);
                    txtNueva2.setEnabled(false);
                    btnCambiar.setEnabled(false);
                }

            } else {
                CodigoErrorDRC2 obj = new CodigoErrorDRC2();
                obj.eventOK(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        GlassPanePopup.closePopupLast();
                    }
                });
                GlassPanePopup.showPopup(obj);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            //System.out.println(e.toString());
        }
    }

    public void sms(String tel, String clave) {
        sendSMS sm = new sendSMS();
        sm.send(tel, clave);
    }
    private void txtNuevaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevaKeyTyped

    private void txtNueva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNueva2ActionPerformed

    }//GEN-LAST:event_txtNueva2ActionPerformed

    private void txtNueva2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNueva2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNueva2KeyTyped

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
            java.util.logging.Logger.getLogger(enviarSMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enviarSMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enviarSMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enviarSMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enviarSMS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar1;
    private javax.swing.JLabel VetSoft2;
    private Design.ButtonGradient btnCambiar;
    private Design.ButtonGradient btnEnviar;
    private Design.ButtonGradient btnVeri;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbCod;
    private javax.swing.JLabel lbCod1;
    private javax.swing.JLabel lbMayor;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbUs2;
    private javax.swing.JLabel lbUs3;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    private Design.TextFieldSV txtCod;
    private Design.PasswordField txtNueva;
    private Design.PasswordField txtNueva2;
    private Design.TextFieldSV txtUser;
    // End of variables declaration//GEN-END:variables
}

package AVista;

import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class verifToken extends javax.swing.JFrame {

    public verifToken() {
        GlassPanePopup.install(this);
        initComponents();
        String iconPath = "src/Imagenes/logoC.png";
        ImageIcon icon = new ImageIcon(iconPath);
        setIconImage(icon.getImage());
        setTitle("VetSoft");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Design.PanelRound();
        panelRound2 = new Design.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnConfirmar = new Design.ButtonGradient();
        txtDui = new Design.TextFieldSV();
        txtToken = new Design.PasswordField();
        lbMin = new javax.swing.JLabel();
        lbMinimo2 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRound1.setBackground(new java.awt.Color(190, 233, 232));
        panelRound1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setForeground(new java.awt.Color(202, 233, 255));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Dui");
        panelRound2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 40, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Token");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        btnConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setColor1(new java.awt.Color(190, 233, 232));
        btnConfirmar.setColor2(new java.awt.Color(190, 233, 232));
        btnConfirmar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        panelRound2.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 120, 50));

        txtDui.setBackground(new java.awt.Color(190, 233, 232));
        txtDui.setShadowColor(new java.awt.Color(0, 0, 51));
        txtDui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuiActionPerformed(evt);
            }
        });
        txtDui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDuiKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDuiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuiKeyTyped(evt);
            }
        });
        panelRound2.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 240, 40));

        txtToken.setBackground(new java.awt.Color(190, 233, 232));
        txtToken.setShadowColor(new java.awt.Color(0, 0, 51));
        txtToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTokenActionPerformed(evt);
            }
        });
        txtToken.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTokenKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTokenKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTokenKeyTyped(evt);
            }
        });
        panelRound2.add(txtToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 240, -1));

        lbMin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("10 carácteres mínimos");
        panelRound2.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 150, -1));

        lbMinimo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMinimo2.setForeground(new java.awt.Color(0, 0, 0));
        lbMinimo2.setText("10 carácteres mínimos");
        panelRound2.add(lbMinimo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 150, -1));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 680, 320));

        Titulo.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Verificación");
        panelRound1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });
        panelRound1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if (txtDui.getText().isEmpty() || txtToken.getText().isEmpty() ) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            /*ctUser ctUs = new ctUser();
            ctUs.idTipoCuenta = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());

            ctUs.usuario = txtDui.getText();
            try {
                ctUs.contra = cryp.encrypt(txtToken.getText(), "key");

            } catch (Exception ex) {
                Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
            }
            ctUs.correo = txtCorreo.getText();
            ctUs.telefono = txtTeléfono.getText();
            ctUs.insertUs();
            Login newFrame = new Login();
            newFrame.setVisible(true);
            dispose();
            CódigoErrorDSI2 obj = new CódigoErrorDSI2();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);*/
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtDuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuiActionPerformed

    private void txtDuiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuiKeyPressed

    private void txtDuiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyReleased
        
        if (txtDui.getText().length() >= 10 && txtToken.getText().length() >= 10) {
            lbMinimo2.setVisible(false);
            btnConfirmar.setEnabled(true);
        } else {
            if (txtDui.getText().length() >= 10) {
                lbMinimo2.setVisible(false);
                btnConfirmar.setEnabled(false);
            } else {
                lbMinimo2.setVisible(true);
                btnConfirmar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtDuiKeyReleased

    private void txtDuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyTyped
        // TODO add your handling code here:
        //Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros, donde si solo escribe dos numeros le saldra un texfield
    }//GEN-LAST:event_txtDuiKeyTyped

    private void txtTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTokenActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTokenActionPerformed

    private void txtTokenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTokenKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTokenKeyPressed

    private void txtTokenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTokenKeyReleased
        // TODO add your handling code here:
        if (txtToken.getText().length() >= 10 && txtDui.getText().length() >= 10) {
            lbMin.setVisible(false);
            btnConfirmar.setEnabled(true);

        } else {
            if (txtToken.getText().length() >= 10) {
                lbMin.setVisible(false);
                btnConfirmar.setEnabled(false);
            } else {
                lbMin.setVisible(true);
                btnConfirmar.setEnabled(false);
            }

        }
    }//GEN-LAST:event_txtTokenKeyReleased

    private void txtTokenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTokenKeyTyped
        // TODO add your handling code here:
        //Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros, donde si solo escribe dos numeros le saldra un texfield
    }//GEN-LAST:event_txtTokenKeyTyped

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
        Login newFrame = new Login();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

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
            java.util.logging.Logger.getLogger(verifToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verifToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verifToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verifToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verifToken().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private Design.ButtonGradient btnConfirmar;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbMinimo2;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    private Design.TextFieldSV txtDui;
    private Design.PasswordField txtToken;
    // End of variables declaration//GEN-END:variables

}

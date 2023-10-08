package AVista;

import AControlador.ctPreRegistro;
import Mensajes.CódigoErrorDSI2;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class verifToken extends javax.swing.JFrame {

    public verifToken() {
        GlassPanePopup.install(this);
        initComponents();
        String iconPath = "src/Imagenes/logoC.png";
        ImageIcon icon = new ImageIcon(iconPath);
        setIconImage(icon.getImage());
        setTitle("VetSoft");
        setLocationRelativeTo(null);
        lbMin.setVisible(false);
        lbMin2.setVisible(false);
        txtDui.setDocument(new Valida(10, "[0-9-]*"));
        txtToken.setDocument(new Valida(10, "[a-zA-Z0-9]*"));
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
        lbMin = new javax.swing.JLabel();
        lbMin2 = new javax.swing.JLabel();
        txtToken = new Design.TextFieldSV();
        Titulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
        panelRound2.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 240, 40));

        lbMin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("10 carácteres mínimos");
        panelRound2.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 150, -1));

        lbMin2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMin2.setForeground(new java.awt.Color(0, 0, 0));
        lbMin2.setText("10 carácteres mínimos");
        panelRound2.add(lbMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 150, -1));

        txtToken.setBackground(new java.awt.Color(190, 233, 232));
        txtToken.setShadowColor(new java.awt.Color(0, 0, 51));
        txtToken.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTokenKeyReleased(evt);
            }
        });
        panelRound2.add(txtToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 240, 40));

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

        if (txtDui.getText().isEmpty() || txtToken.getText().isEmpty()) {
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
                ctPreRegistro ct = new ctPreRegistro();
                ct.dui = txtDui.getText();
                ct.token = txtToken.getText();
                ResultSet rs = ct.verifT();
                if (rs.next()) {

                    Registro newFrame = new Registro(rs.getInt("idNivelUs"),
                            rs.getInt("idDoc"));
                    newFrame.setVisible(true);
                    dispose();
                } else {
                    //MENSAJE DE QUE LAS CREDENCIALES SON INCORRECTAS
                }

            } catch (SQLException ex) {
                Logger.getLogger(verifToken.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            lbMin.setVisible(false);
            btnConfirmar.setEnabled(true);
        } else {
            if (txtDui.getText().length() >= 10) {
                lbMin.setVisible(false);
                btnConfirmar.setEnabled(false);
            } else {
                lbMin.setVisible(true);
                btnConfirmar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtDuiKeyReleased

    private void txtDuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyTyped
        // TODO add your handling code here:
        //Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros, donde si solo escribe dos numeros le saldra un texfield
    }//GEN-LAST:event_txtDuiKeyTyped

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
        Login newFrame = new Login();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void txtTokenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTokenKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTokenKeyReleased

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
    private javax.swing.JLabel lbMin2;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    private Design.TextFieldSV txtDui;
    private Design.TextFieldSV txtToken;
    // End of variables declaration//GEN-END:variables

}

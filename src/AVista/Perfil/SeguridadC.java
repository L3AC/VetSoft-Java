package AVista.Perfil;

import AControlador.ctUser;
import AModelo.Crypt;
import Design.Desg;
import Mensajes.CódigoErrorDSI4;
import Mensajes.GlassPanePopup;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SeguridadC extends javax.swing.JPanel {

    private int idTipoUs;
    private int idUs;
    private String contra;
    private String user;
    Desg dsg = new Desg();
    Crypt cryp = new Crypt();

    public SeguridadC(int idTipoUs, int idUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idUs = idUs;
        initComponents();
        mostrar(false);
        txvAdv.setVisible(false);
        dsg.setImageBtn(btnLook, "C:\\VetSoft-Java\\VetSoft-Java\\src\\Imagenes\\eye.png", 40, 40);
        dsg.setImageBtn(btnLook2, "C:\\VetSoft-Java\\VetSoft-Java\\src\\Imagenes\\eye.png", 40, 40);
        txtContraA.setEchoChar('●');
        txtNC1.setEchoChar('●');
        txtNC2.setEchoChar('●');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbNC1 = new javax.swing.JLabel();
        txvAdv = new javax.swing.JLabel();
        btnVerif = new Design.ButtonGradient();
        btnConfirm = new Design.ButtonGradient();
        jLabel5 = new javax.swing.JLabel();
        lbNC2 = new javax.swing.JLabel();
        btnLook2 = new javax.swing.JButton();
        btnLook = new javax.swing.JButton();
        txtNC1 = new Design.PasswordField();
        txtContraA = new Design.PasswordField();
        txtNC2 = new Design.PasswordField();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        jPanel1.setBackground(new java.awt.Color(190, 233, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese su contraseña actual");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 177, 260, -1));

        lbNC1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNC1.setForeground(new java.awt.Color(0, 0, 0));
        lbNC1.setText("Ingrese su nueva contraseña");
        jPanel1.add(lbNC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 260, -1));

        txvAdv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txvAdv.setForeground(new java.awt.Color(255, 51, 51));
        txvAdv.setText("Las contraseñas deben coincidir");
        jPanel1.add(txvAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, 220, -1));

        btnVerif.setForeground(new java.awt.Color(0, 0, 0));
        btnVerif.setText("Verificar");
        btnVerif.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnVerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerif, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 160, 40));

        btnConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("Cambiar");
        btnConfirm.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 670, 160, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(27, 73, 101));
        jLabel5.setText("CAMBIO DE CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 440, 50));

        lbNC2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNC2.setForeground(new java.awt.Color(0, 0, 0));
        lbNC2.setText("Digite su contraseña de nuevo");
        jPanel1.add(lbNC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 260, -1));

        btnLook2.setBackground(new java.awt.Color(190, 233, 232));
        btnLook2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eye.png"))); // NOI18N
        btnLook2.setBorder(null);
        btnLook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLook2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLook2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, 40, 40));

        btnLook.setBackground(new java.awt.Color(190, 233, 232));
        btnLook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eye.png"))); // NOI18N
        btnLook.setBorder(null);
        btnLook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLookActionPerformed(evt);
            }
        });
        jPanel1.add(btnLook, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 40, 40));

        txtNC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNC1.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNC1ActionPerformed(evt);
            }
        });
        txtNC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNC1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNC1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 350, 50));

        txtContraA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraA.setShadowColor(new java.awt.Color(0, 0, 51));
        txtContraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraAActionPerformed(evt);
            }
        });
        txtContraA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraAKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraAKeyTyped(evt);
            }
        });
        jPanel1.add(txtContraA, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 350, 50));

        txtNC2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNC2.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNC2ActionPerformed(evt);
            }
        });
        txtNC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNC2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNC2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 350, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifActionPerformed
        if (txtContraA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacíos");
        } else {
            try {
                loadInfo();
            } catch (SQLException ex) {
                Logger.getLogger(SeguridadC.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (txtContraA.getText().equals(contra)) {
                mostrar(true);
            } else {
                mostrar(false);
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }

        }

    }//GEN-LAST:event_btnVerifActionPerformed

    final void loadInfo() throws SQLException {
        try {
            ctUser ct = new ctUser();
            ct.idUs = idUs;
            ResultSet rs = ct.loadData();

            while (rs.next()) {
                user = rs.getString("usuario");
                contra = cryp.decrypt(rs.getString("contraseña"), "key");
                System.err.println(contra + "  orig");
                System.err.println(txtContraA.getText() + " contra ");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (txtNC1.getText().isEmpty() || txtNC2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacíos");
        } else {
            try {
                ctUser ct = new ctUser();
                ct.usuario = user;
                ct.contra = cryp.encrypt(txtNC2.getText(), "key");
                ct.updtContra();
                CódigoErrorDSI4 obj = new CódigoErrorDSI4();
                obj.eventOK(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        GlassPanePopup.closePopupLast();
                    }
                });
                GlassPanePopup.showPopup(obj);

            } catch (Exception ex) {
                Logger.getLogger(SeguridadC.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnLook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLook2ActionPerformed
        if (txtNC1.getEchoChar() == 0 && txtNC2.getEchoChar() == 0) {
            txtNC1.setEchoChar('●');
            txtNC2.setEchoChar('●');
        } else {
            txtNC1.setEchoChar('\0');
            txtNC2.setEchoChar('\0');
        }
    }//GEN-LAST:event_btnLook2ActionPerformed

    private void btnLookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLookActionPerformed
        if (txtContraA.getEchoChar() == 0) {
            txtContraA.setEchoChar('●');
        } else {
            txtContraA.setEchoChar('\0');
        }

    }//GEN-LAST:event_btnLookActionPerformed

    private void txtNC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNC1ActionPerformed

        //
    }//GEN-LAST:event_txtNC1ActionPerformed

    private void txtNC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNC1KeyReleased
        //vali.minL(txtPass, btnIngresar, 5);
    }//GEN-LAST:event_txtNC1KeyReleased

    private void txtNC1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNC1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNC1KeyTyped

    private void txtContraAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraAActionPerformed

    private void txtContraAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraAKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraAKeyReleased

    private void txtContraAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraAKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraAKeyTyped

    private void txtNC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNC2ActionPerformed

    private void txtNC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNC2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNC2KeyReleased

    private void txtNC2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNC2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNC2KeyTyped
    public void verifContra() {
        if (!txtNC1.getText().toString().equals(txtNC2.getText().toString())) {
            txvAdv.setVisible(true);
            btnConfirm.setEnabled(false);
        } else {
            txvAdv.setVisible(false);
            btnConfirm.setEnabled(true);
        }
    }

    public void mostrar(boolean tf) {
        List<Component> lista = new ArrayList<>();
        lista.add(lbNC1);
        lista.add(lbNC2);
        lista.add(txtNC1);
        lista.add(txtNC2);
        lista.add(btnConfirm);
        lista.add(btnLook2);
        dsg.visib(lista, tf);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JButton btnLook;
    private javax.swing.JButton btnLook2;
    private Design.ButtonGradient btnVerif;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbNC1;
    private javax.swing.JLabel lbNC2;
    private Design.PasswordField txtContraA;
    private Design.PasswordField txtNC1;
    private Design.PasswordField txtNC2;
    private javax.swing.JLabel txvAdv;
    // End of variables declaration//GEN-END:variables
}

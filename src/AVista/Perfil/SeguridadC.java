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
        dsg.setImageBtn(btnLook, "C:\\VetSoft-Java\\VetSoft-Java\\src\\Imagenes\\eye.png",40,40);
        dsg.setImageBtn(btnLook2, "C:\\VetSoft-Java\\VetSoft-Java\\src\\Imagenes\\eye.png",40,40);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtContra = new Design.TextFieldSV();
        jLabel2 = new javax.swing.JLabel();
        lbNC1 = new javax.swing.JLabel();
        txtNC1 = new Design.TextFieldSV();
        txvAdv = new javax.swing.JLabel();
        txtNC2 = new Design.TextFieldSV();
        btnVerif = new Design.ButtonGradient();
        btnConfirm = new Design.ButtonGradient();
        jLabel5 = new javax.swing.JLabel();
        lbNC2 = new javax.swing.JLabel();
        btnLook2 = new javax.swing.JButton();
        btnLook = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        jPanel1.setBackground(new java.awt.Color(190, 233, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContra.setShadowColor(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 350, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese su contraseña actual");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 177, 260, -1));

        lbNC1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNC1.setForeground(new java.awt.Color(0, 0, 0));
        lbNC1.setText("Ingrese su nueva contraseña");
        jPanel1.add(lbNC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 260, -1));

        txtNC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNC1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNC1.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNC1KeyReleased(evt);
            }
        });
        jPanel1.add(txtNC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 350, -1));

        txvAdv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txvAdv.setForeground(new java.awt.Color(255, 51, 51));
        txvAdv.setText("Las contraseñas deben coincidir");
        jPanel1.add(txvAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, 220, -1));

        txtNC2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNC2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNC2.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNC2KeyReleased(evt);
            }
        });
        jPanel1.add(txtNC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 350, -1));

        btnVerif.setForeground(new java.awt.Color(0, 0, 0));
        btnVerif.setText("Verificar");
        btnVerif.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnVerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerif, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 160, 40));

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
        jPanel1.add(btnLook, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 40, 40));

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
        if (txtContra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacíos");
        } else {
            try {
                loadInfo();
            } catch (SQLException ex) {
                Logger.getLogger(SeguridadC.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (txtContra.getText().equals(contra)) {
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
                System.err.println(txtContra.getText() + " contra ");
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

    private void txtNC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNC1KeyReleased
        verifContra();
    }//GEN-LAST:event_txtNC1KeyReleased

    private void txtNC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNC2KeyReleased
       verifContra();
    }//GEN-LAST:event_txtNC2KeyReleased

    private void btnLook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLook2ActionPerformed
        
    }//GEN-LAST:event_btnLook2ActionPerformed

    private void btnLookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLookActionPerformed
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
    private Design.TextFieldSV txtContra;
    private Design.TextFieldSV txtNC1;
    private Design.TextFieldSV txtNC2;
    private javax.swing.JLabel txvAdv;
    // End of variables declaration//GEN-END:variables
}

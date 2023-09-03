/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Usuarios;

import AControlador.ctEsp;
import AControlador.ctTipoUs;
import AControlador.ctUser;
import AModelo.Crypt;
import Design.Desg;
import Design.TextFieldSV;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import Tipografias.Fuentes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.validator.EmailValidator;

/**
 *
 * @author LEAC2
 */
public class insertUs extends javax.swing.JPanel {

    private int idTipoUs;
    private int tpUs;
    Crypt cryp = new Crypt();
    ctTipoUs ctTP = new ctTipoUs();
    Fuentes tipoFuente;
    Desg dsg = new Desg();
    Map<Integer, String> cbMap = new HashMap<>();

    public insertUs(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        initComponents();
        tipoFuente = new Fuentes();

        jLabel2.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 32));
        jLabel1.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 17));
        jLabel10.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 17));
        jLabel6.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 17));
        jLabel8.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 17));
        txtUsuario.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 15));
        txtTel.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 15));
        txtCorreo.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 15));
        txtContra.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 15));
        lbCargo.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 17));

        txtUsuario.setDocument(new Valida(30, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtCorreo.setDocument(new Valida(50, "[a-zA-Z0-9@._]*"));
        txtContra.setDocument(new Valida(100, "[a-zA-Z0-9]*"));
        txtTel.setDocument(new Valida(10, "[0-9]*"));
        loadCombo(cbCargo);
        lbDisp.setVisible(false);
        cbCargo.setSelectedIndex(0);
        lbMin.setVisible(false);
        lbMin1.setVisible(false);
        lbMin2.setVisible(false);
        lbFalso.setVisible(false);
        if (idTipoUs == 2) {
            lbCargo.setVisible(false);
            cbCargo.setVisible(false);

        }

    }

    private void loadCombo(JComboBox cb) throws SQLException {
        ResultSet rs = ctTP.selectTP();
        while (rs.next()) {
            int idTP = rs.getInt("idTipoUsuario");
            String nombre = rs.getString("nivel");
            cb.addItem(nombre);
            cbMap.put(idTP, nombre);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        panelRound1 = new Design.PanelRound();
        lbFalso = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbCargo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        lbDisp = new javax.swing.JLabel();
        txtUsuario = new Design.TextFieldSV();
        txtCorreo = new Design.TextFieldSV();
        txtTel = new Design.TextFieldSV();
        txtContra = new Design.PasswordField();
        jLabel10 = new javax.swing.JLabel();
        lbMin = new javax.swing.JLabel();
        lbMin2 = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        btnConfirm = new Design.ButtonGradient();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CREAR USUARIO");

        btnBack.setBackground(new java.awt.Color(190, 233, 232));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFalso.setForeground(new java.awt.Color(0, 0, 0));
        lbFalso.setText("Correo electronico falso");
        panelRound1.add(lbFalso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 140, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Correo electrónico");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 190, 30));

        lbCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(0, 0, 0));
        lbCargo.setText("Nivel de cargo");
        panelRound1.add(lbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 160, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Teléfono");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 130, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Contraseña");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 150, 30));

        cbCargo.setBackground(new java.awt.Color(202, 233, 255));
        cbCargo.setForeground(new java.awt.Color(51, 51, 51));
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        panelRound1.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 160, 40));

        lbDisp.setForeground(new java.awt.Color(0, 0, 0));
        lbDisp.setText("Usuario no disponible");
        panelRound1.add(lbDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 190, 30));

        txtUsuario.setBackground(new java.awt.Color(202, 233, 255));
        txtUsuario.setShadowColor(new java.awt.Color(0, 0, 51));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        panelRound1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 240, 50));

        txtCorreo.setBackground(new java.awt.Color(202, 233, 255));
        txtCorreo.setShadowColor(new java.awt.Color(0, 0, 51));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });
        panelRound1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 240, 50));

        txtTel.setBackground(new java.awt.Color(202, 233, 255));
        txtTel.setShadowColor(new java.awt.Color(0, 0, 51));
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        panelRound1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 290, 50));

        txtContra.setBackground(new java.awt.Color(202, 233, 255));
        txtContra.setShadowColor(new java.awt.Color(0, 0, 51));
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraKeyTyped(evt);
            }
        });
        panelRound1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 300, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Usuario");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 90, 30));

        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 4");
        panelRound1.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 110, 30));

        lbMin2.setForeground(new java.awt.Color(0, 0, 0));
        lbMin2.setText("Minimo de digitos 8");
        panelRound1.add(lbMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 110, 30));

        lbMin1.setForeground(new java.awt.Color(0, 0, 0));
        lbMin1.setText("Minimo de digitos 8");
        panelRound1.add(lbMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 110, 30));

        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel4.setText("VetSoft+");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(399, 399, 399)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(551, 551, 551))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(68, 68, 68)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
        /*tpUs = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString()); 
        System.out.println("ID seleccionado: " + tpUs);*/
    }//GEN-LAST:event_cbCargoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDusuarios subp = new CRUDusuarios(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(updtUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (txtUsuario.getText().isEmpty() || txtContra.getText().isEmpty() || txtTel.getText().isEmpty() || txtCorreo.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            List<TextFieldSV> lista = new ArrayList<>();
            lista.add(txtCorreo);
            lista.add(txtTel);

            ctUser ctUs = new ctUser();
            if (idTipoUs == 1) {
                ctUs.idTipoCuenta = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());
            }
            if (idTipoUs == 2) {
                ctUs.idTipoCuenta = 3;
            }
            ctUs.usuario = txtUsuario.getText();
            try {
                ctUs.contra = cryp.encrypt(txtContra.getText(), "key");

            } catch (Exception ex) {
                Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
            }
            ctUs.correo = txtCorreo.getText();
            ctUs.telefono = txtTel.getText();
            ctUs.insertUs();
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        // TODO add your handling code here:
        if (EmailValidator.getInstance().isValid(txtCorreo.getText())) {
            //if(verificar_Email(jTextField1.getText())){    

            lbFalso.setVisible(false);
            btnConfirm.setEnabled(true);

        } else {

            lbFalso.setVisible(true);
            btnConfirm.setEnabled(false);

        }
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtContraKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTelKeyTyped

    private void txtContraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyReleased
        // TODO add your handling code here:
        if (txtContra.getText().length() >= 8 && txtTel.getText().length() >= 8 && txtUsuario.getText().length() >= 4) {
            lbMin1.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtContra.getText().length() >= 8) {
                lbMin1.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin1.setVisible(true);
                btnConfirm.setEnabled(false);
            }
    }//GEN-LAST:event_txtContraKeyReleased
    }
    private void txtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyReleased
        // TODO add your handling code here:
        if (txtTel.getText().length() >= 8 && txtContra.getText().length() >= 8 && txtUsuario.getText().length() >= 4) {
            lbMin2.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtTel.getText().length() >= 8) {
                lbMin2.setVisible(false);
                btnConfirm.setEnabled(true);

            } else {
                lbMin2.setVisible(true);
                btnConfirm.setEnabled(false);
            }
    }//GEN-LAST:event_txtTelKeyReleased
    }
    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        // TODO add your handling code here:
        ctUser ctUs = new ctUser();
        ctUs.usuario = txtUsuario.getText().toString();
        try {
            if (ctUs.verifUs().next()) {
                lbDisp.setVisible(true);
                btnConfirm.setEnabled(false);

            } else {
                lbDisp.setVisible(false);
                btnConfirm.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (txtUsuario.getText().length() >= 4 && txtContra.getText().length() >= 8 && txtTel.getText().length() >= 8) {
            lbMin.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtUsuario.getText().length() >= 4) {
                lbMin.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin.setVisible(true);
                btnConfirm.setEnabled(false);
            }
    }//GEN-LAST:event_txtUsuarioKeyReleased
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbDisp;
    private javax.swing.JLabel lbFalso;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbMin1;
    private javax.swing.JLabel lbMin2;
    private Design.PanelRound panelRound1;
    private Design.PasswordField txtContra;
    private Design.TextFieldSV txtCorreo;
    private Design.TextFieldSV txtTel;
    private Design.TextFieldSV txtUsuario;
    // End of variables declaration//GEN-END:variables
}

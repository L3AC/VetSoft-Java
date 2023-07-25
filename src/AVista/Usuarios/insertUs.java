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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import Validation.Valida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEAC2
 */
public class insertUs extends javax.swing.JPanel {

    private int idTipoUs;
    private int tpUs;
    Crypt cryp = new Crypt();
    ctTipoUs ctTP = new ctTipoUs();
    Desg dsg = new Desg();
    Map<Integer, String> cbMap = new HashMap<>();

    public insertUs(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        initComponents();
        txtUsuario.setDocument(new Valida(30, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtCorreo.setDocument(new Valida(50, "[a-zA-Z0-9@._]*"));
        txtContra.setDocument(new Valida(100, "[a-zA-Z0-9]*"));
        txtTel.setDocument(new Valida(10, "[0-9]*"));
        loadCombo(cbCargo);
        lbDisp.setVisible(false);
        cbCargo.setSelectedIndex(0);
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
        jLabel9 = new javax.swing.JLabel();
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
        btnConfirm = new Design.ButtonGradient();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 73, 101));
        jLabel2.setText("CREAR USUARIO");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Usuario");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Correo electrónico");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 30));

        lbCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(0, 0, 0));
        lbCargo.setText("Nivel de cargo");
        panelRound1.add(lbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Teléfono");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 80, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Contraseña");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 100, 30));

        cbCargo.setBackground(new java.awt.Color(255, 255, 255));
        cbCargo.setForeground(new java.awt.Color(51, 51, 51));
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        panelRound1.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 160, 40));

        lbDisp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDisp.setForeground(new java.awt.Color(0, 0, 0));
        lbDisp.setText("Usuario no disponible");
        panelRound1.add(lbDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 190, 30));

        txtUsuario.setShadowColor(new java.awt.Color(0, 0, 51));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        panelRound1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 240, 50));

        txtCorreo.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 240, 50));

        txtTel.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 290, 50));

        txtContra.setText("passwordField1");
        txtContra.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 300, 50));

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
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
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
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(549, 549, 549))
                            .addGroup(PContLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
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
        List<TextFieldSV> lista = new ArrayList<>();
        lista.add(txtCorreo);
        lista.add(txtTel);
        if (txtContra.getText().isEmpty() || cbCargo.getSelectedIndex() == -1||txtCorreo.getText().isEmpty() ||txtTel.getText().isEmpty() ) {
            
        }
        else{
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbDisp;
    private Design.PanelRound panelRound1;
    private Design.PasswordField txtContra;
    private Design.TextFieldSV txtCorreo;
    private Design.TextFieldSV txtTel;
    private Design.TextFieldSV txtUsuario;
    // End of variables declaration//GEN-END:variables
}

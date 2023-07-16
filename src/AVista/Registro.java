/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AVista;

import AControlador.ctRegistro;
import AControlador.ctTipoUs;
import AModelo.Crypt;
import AVista.Usuarios.insertUs;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
/**
 *
 * @author Gerson
 */
public class Registro extends javax.swing.JFrame {
    
    private int idTipoUs;
    private int tpUs;
    Crypt cryp = new Crypt();
    ctTipoUs ctTP=new ctTipoUs();
    Desg dsg = new Desg();
    Map<Integer, String> cbMap= new HashMap<>();

    public Registro() throws SQLException{
    initComponents();
     loadCombo(cbCargo);
     setLocationRelativeTo(null);
    }


    
    
    private void loadCombo(JComboBox cb) throws SQLException{
        ResultSet rs=ctTP.selectTP();
        while (rs.next()) {
                int idTP=rs.getInt("idTipoUsuario");
                String nombre=rs.getString("nivel");
                cb.addItem(nombre);
                cbMap.put(idTP, nombre);      
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Design.PanelRound();
        panelRound2 = new Design.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbCargo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        btnRegistrar = new Design.ButtonGradient();
        lbDisp = new javax.swing.JLabel();
        txtTeléfono = new Design.TextFieldSV();
        txtUsuario = new Design.TextFieldSV();
        txtCorreo = new Design.TextFieldSV();
        passwordField1 = new Design.PasswordField();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(202, 233, 255));
        panelRound2.setForeground(new java.awt.Color(202, 233, 255));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Usuario");
        panelRound2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Correo electrónico");
        panelRound2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 150, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Contraseña");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        lbCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(0, 0, 0));
        lbCargo.setText("Nivel de Usuario");
        panelRound2.add(lbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Teléfono");
        panelRound2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 70, -1));

        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        panelRound2.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 110, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.setColor1(new java.awt.Color(255, 255, 255));
        btnRegistrar.setColor2(new java.awt.Color(204, 255, 255));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        panelRound2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 100, 30));

        lbDisp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDisp.setForeground(new java.awt.Color(0, 0, 0));
        lbDisp.setText("Usuario no disponible");
        panelRound2.add(lbDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 80, 140, -1));

        txtTeléfono.setShadowColor(new java.awt.Color(153, 0, 153));
        panelRound2.add(txtTeléfono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 180, -1));

        txtUsuario.setShadowColor(new java.awt.Color(153, 0, 153));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        panelRound2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 210, -1));

        txtCorreo.setShadowColor(new java.awt.Color(153, 0, 153));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        panelRound2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, -1));

        passwordField1.setShadowColor(new java.awt.Color(153, 0, 153));
        panelRound2.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 180, -1));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 680, 270));

        Titulo.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(27, 73, 101));
        Titulo.setText("Registro");
        panelRound1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        ctRegistro ctUs=new ctRegistro();
        if(idTipoUs==1){
            ctUs.idTipoCuenta=dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());
        }
        if(idTipoUs==2){
            ctUs.idTipoCuenta=3;
        }
        ctUs.usuario=txtUsuario.getText();
        try {
            /* ctUs.contra=cryp.encrypt(txtContraseña.getText(), "key");*/

        } catch (Exception ex) {
            Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
        }
        ctUs.correo=txtCorreo.getText();
        ctUs.telefono=txtTeléfono.getText();
        ctUs.insertUs();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
        tpUs = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());
        System.out.println("ID seleccionado: " + tpUs);
    }//GEN-LAST:event_cbCargoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
        
        ctRegistro ctUs=new ctRegistro();
        ctUs.usuario=txtUsuario.getText().toString();
        try {
            if(ctUs.verifUs().next()){
                lbDisp.setVisible(true);
                btnRegistrar.setEnabled(false);
            }
            else{
                lbDisp.setVisible(false);
                btnRegistrar.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Registro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private Design.ButtonGradient btnRegistrar;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbDisp;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    private Design.PasswordField passwordField1;
    private Design.TextFieldSV txtCorreo;
    private Design.TextFieldSV txtTeléfono;
    private Design.TextFieldSV txtUsuario;
    // End of variables declaration//GEN-END:variables
}

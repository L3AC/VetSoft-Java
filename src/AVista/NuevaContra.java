/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AVista;

import AModelo.Conx;
import AModelo.Crypt;
import Mensajes.CodigodeerrorDLI1;
import Mensajes.CódigoErrorDRC4;
import Mensajes.CódigoErrorDSI4;
import Mensajes.GlassPanePopup;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gerson
 */
public class NuevaContra extends javax.swing.JFrame {

    int idus;
    Conx con = new Conx();
    Connection acceso;
    String mail;
    String codigo;
    Crypt cryp = new Crypt();
   
    public NuevaContra(int idus) {
        this.idus = idus;
        initComponents();
        
    }

    public NuevaContra() {
        initComponents();
        txtNueva.setDocument(new Valida(30, "[a-zA-Z0-9]*"));
        txtNueva2.setDocument(new Valida(30, "[a-zA-Z0-9]*"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound2 = new Design.PanelRound();
        panelRound1 = new Design.PanelRound();
        lbUs1 = new javax.swing.JLabel();
        lbCod = new javax.swing.JLabel();
        buttonGradient1 = new Design.ButtonGradient();
        txtNueva = new Design.PasswordField();
        txtNueva2 = new Design.PasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUs1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbUs1.setForeground(new java.awt.Color(0, 0, 0));
        lbUs1.setText("Ingrese su nueva Contraseña");
        panelRound1.add(lbUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 30));

        lbCod.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCod.setForeground(new java.awt.Color(0, 0, 0));
        lbCod.setText("Confirmar Contraseña");
        panelRound1.add(lbCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 180, 30));

        buttonGradient1.setText("Cambiar Contraseña");
        buttonGradient1.setColor1(new java.awt.Color(255, 255, 255));
        buttonGradient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient1ActionPerformed(evt);
            }
        });
        panelRound1.add(buttonGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 210, 40));
        panelRound1.add(txtNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, -1));
        panelRound1.add(txtNueva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 250, -1));

        panelRound2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 580, 270));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(27, 73, 101));
        jLabel6.setText("Cambio de contraseña");
        panelRound2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 380, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void act() throws Exception{
    String cadena = "update tbUsuarios set contraseña=? "
                + "where idUsuario=?;";
    PreparedStatement ps;
    
    try {

            acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena);
            ps.setString(1,cryp.encrypt( txtNueva.getText(), "key"));
            ps.setInt(2, idus);
            ps.executeUpdate();
        CódigoErrorDSI4 obj = new CódigoErrorDSI4();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void buttonGradient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient1ActionPerformed
               if (txtNueva.getText().equals(txtNueva2.getText())) {
                try {
                    act();
                } catch (Exception ex) {
                    Logger.getLogger(PorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                   CódigoErrorDRC4 obj = new CódigoErrorDRC4();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
            }        // TODO add your handling code here:
            
    }//GEN-LAST:event_buttonGradient1ActionPerformed

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
            java.util.logging.Logger.getLogger(NuevaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.ButtonGradient buttonGradient1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbCod;
    private javax.swing.JLabel lbUs1;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    private Design.PasswordField txtNueva;
    private Design.PasswordField txtNueva2;
    // End of variables declaration//GEN-END:variables
}

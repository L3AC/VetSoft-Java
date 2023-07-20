/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AVista;


import AModelo.Conx;
import AModelo.Crypt;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Gerson
 */
public class PreguntasDeConfianza extends javax.swing.JFrame {

    Conx con = new Conx();
    Connection acceso;
    Crypt cryp = new Crypt();
    int idUs;
    


    public PreguntasDeConfianza() {
        initComponents();
        this.setLocationRelativeTo(this);
        txtPregunta1.setEnabled(false);
        txtPregunta2.setEnabled(false);
        txtPregunta3.setEnabled(false);
        btnEnviar.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound3 = new Design.PanelRound();
        btnRegresar6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panelRound4 = new Design.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnVerificar = new Design.ButtonGradient();
        btnEnviar = new Design.ButtonGradient();
        txtUser = new Design.TextFieldSV();
        txtPregunta1 = new Design.TextFieldSV();
        txtPregunta2 = new Design.TextFieldSV();
        txtPregunta3 = new Design.TextFieldSV();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        panelRound3.add(btnRegresar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(27, 73, 101));
        jLabel6.setText("Recuperacion de contraseña por preguntas de seguridad");
        panelRound3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        panelRound4.setBackground(new java.awt.Color(202, 233, 255));
        panelRound4.setRoundBottomLeft(50);
        panelRound4.setRoundBottomRight(50);
        panelRound4.setRoundTopLeft(50);
        panelRound4.setRoundTopRight(50);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ingrese su usuario");
        panelRound4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("1-¿Cúal es tu película favorita?");
        panelRound4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("2-¿Cúal es el nombre de tu mejor amigo de la infancia?");
        panelRound4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("3-¿Cúal es tu comida favorita?");
        panelRound4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, 30));

        btnVerificar.setText("Verificar");
        btnVerificar.setColor1(new java.awt.Color(255, 255, 255));
        btnVerificar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        panelRound4.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 100, -1));

        btnEnviar.setText("Enviar");
        btnEnviar.setColor1(new java.awt.Color(255, 255, 255));
        btnEnviar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        panelRound4.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 110, -1));

        txtUser.setShadowColor(new java.awt.Color(153, 0, 153));
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
        panelRound4.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 210, -1));

        txtPregunta1.setShadowColor(new java.awt.Color(153, 0, 153));
        txtPregunta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregunta1ActionPerformed(evt);
            }
        });
        txtPregunta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPregunta1KeyTyped(evt);
            }
        });
        panelRound4.add(txtPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 210, -1));

        txtPregunta2.setShadowColor(new java.awt.Color(153, 0, 153));
        txtPregunta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregunta2ActionPerformed(evt);
            }
        });
        txtPregunta2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPregunta2KeyTyped(evt);
            }
        });
        panelRound4.add(txtPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 210, -1));

        txtPregunta3.setShadowColor(new java.awt.Color(153, 0, 153));
        txtPregunta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregunta3ActionPerformed(evt);
            }
        });
        txtPregunta3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPregunta3KeyTyped(evt);
            }
        });
        panelRound4.add(txtPregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 200, -1));

        panelRound3.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 890, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void VerExist(){
    
        String Cadena = "select * from tbPreguntasUsuarios where idUsuario=?;";
        
        PreparedStatement ps;
        ResultSet st;
        
        try{
    acceso = con.Conectar();
    ps = acceso.prepareStatement(Cadena, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
    ps.setInt(1, idUs);
    st = ps.executeQuery();    
    int found = st.getRow();
    if (found >= 1){
    int pregun = st.getInt("idPreguntaUsuario");
   txtPregunta1.setEnabled(true);
    txtPregunta2.setEnabled(true);
    txtPregunta3.setEnabled(true);
    btnEnviar.setEnabled(true);
    JOptionPane.showMessageDialog(null, "Preguntas Encontradas");
    } else{
        JOptionPane.showMessageDialog(null, "Preguntas no Encontradas");
        System.out.println(found);
                txtPregunta1.setEnabled(false);
                txtPregunta2.setEnabled(false);
                txtPregunta3.setEnabled(false);
                btnEnviar.setEnabled(false);
    }
    
    } catch (SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
        }
    
    }
    
    public void Encod(){
    String cadena = "select * from tbUsuarios where Usuario=? COLLATE SQL_Latin1_General_CP1_CS_AS;";

    PreparedStatement ps;
    ResultSet st;
    
    try{
    acceso = con.Conectar();
    ps = acceso.prepareStatement(cadena, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    ps.setString(1, txtUser.getText());
    st = ps.executeQuery();
    st.last();
    int found = st.getRow();
    if (found == 1){
    String id = st.getString("Usuario");
    txtPregunta1.setEnabled(true);
    txtPregunta2.setEnabled(true);
    txtPregunta3.setEnabled(true);
    btnEnviar.setEnabled(true);
    JOptionPane.showMessageDialog(null, "Usuario Encontrado");
    } else{
     JOptionPane.showMessageDialog(null, "Usuario no Encontrado");
                txtPregunta1.setEnabled(false);
                txtPregunta2.setEnabled(false);
                txtPregunta3.setEnabled(false);
                btnEnviar.setEnabled(false);
    }
    
    } catch (SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
        }
    
    }
   
    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
             if (txtUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {
                 Encod();
                 VerExist();
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // TODO add your handling code here:
        if (txtUser.getText().length() >= 30) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPregunta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPregunta1KeyTyped
        // TODO add your handling code here:

        if (txtPregunta1.getText().length() >= 30) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPregunta1KeyTyped

    private void txtPregunta2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPregunta2KeyTyped
        // TODO add your handling code here:

        if (txtPregunta2.getText().length() >= 30) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPregunta2KeyTyped

    private void txtPregunta3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPregunta3KeyTyped
        // TODO add your handling code here:

        if (txtPregunta3.getText().length() >= 30) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPregunta3KeyTyped

    private void txtPregunta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta1ActionPerformed
        
    }//GEN-LAST:event_txtPregunta1ActionPerformed

    private void txtPregunta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta2ActionPerformed
        
    }//GEN-LAST:event_txtPregunta2ActionPerformed

    private void txtPregunta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta3ActionPerformed
       
    }//GEN-LAST:event_txtPregunta3ActionPerformed

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
            java.util.logging.Logger.getLogger(PreguntasDeConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreguntasDeConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreguntasDeConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreguntasDeConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreguntasDeConfianza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.ButtonGradient btnEnviar;
    private javax.swing.JButton btnRegresar6;
    private Design.ButtonGradient btnVerificar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Design.PanelRound panelRound3;
    private Design.PanelRound panelRound4;
    private Design.TextFieldSV txtPregunta1;
    private Design.TextFieldSV txtPregunta2;
    private Design.TextFieldSV txtPregunta3;
    private Design.TextFieldSV txtUser;
    // End of variables declaration//GEN-END:variables
}

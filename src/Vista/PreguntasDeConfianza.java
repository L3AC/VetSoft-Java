/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ctRecuperacion;
import static java.lang.Integer.parseInt;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import java.sql.Connection; // Para establecer la conexión con la base de datos
import java.sql.DriverManager; // Para manejar el controlador de la base de datos
import java.sql.PreparedStatement; // Para ejecutar consultas preparadas
import java.sql.ResultSet; // Para obtener los resultados de las consultas
import java.sql.SQLException; // Para manejar las excepciones de SQL
import java.util.Properties; // Para configurar las propiedades del correo electrónico
import java.util.Random; // Para generar el código de verificación
import Modelo.Conx;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*; // Para enviar el correo electrónico
import javax.mail.internet.*; // Para trabajar con objetos relacionados con el correo electrónico
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Gerson
 */
public class PreguntasDeConfianza extends javax.swing.JFrame {

    Conx con = new Conx();
    Connection acceso;
    int idUser;
    String contra;
    String Preguntas2;
    String pasw;
    
    /**
     * Creates new form PreguntasDeConfianza
     */
    String cambiopruebalol;
    public PreguntasDeConfianza() {
        initComponents();
        initComponents();
        transparente();
        Conx con = new Conx();
        Connection acceso;
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

        panelRound3 = new Vista.PanelRound();
        btnRegresar6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panelRound4 = new Vista.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        txtUser = new Vista.Textfield();
        jLabel8 = new javax.swing.JLabel();
        txtPregunta1 = new Vista.Textfield();
        jLabel9 = new javax.swing.JLabel();
        txtPregunta2 = new Vista.Textfield();
        jLabel10 = new javax.swing.JLabel();
        txtPregunta3 = new Vista.Textfield();
        btnVerificar = new Vista.ButtonGradient();
        btnEnviar = new Vista.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        panelRound3.add(btnRegresar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(27, 73, 101));
        jLabel6.setText("Recuperacion de contraseña por preguntas de seguridad");
        panelRound3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        panelRound4.setBackground(new java.awt.Color(190, 233, 232));
        panelRound4.setRoundBottomLeft(50);
        panelRound4.setRoundBottomRight(50);
        panelRound4.setRoundTopLeft(50);
        panelRound4.setRoundTopRight(50);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ingrese Su Usuario");
        panelRound4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        panelRound4.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 150, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("1-¿Cúal es tu película favorita?");
        panelRound4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        panelRound4.add(txtPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("2-¿Cúal es el nombre de tu mejor amigo de la infancia?");
        panelRound4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));
        panelRound4.add(txtPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 200, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("3-¿Cúal es tu comida favorita?");
        panelRound4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, 30));

        txtPregunta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregunta3ActionPerformed(evt);
            }
        });
        panelRound4.add(txtPregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 210, -1));

        btnVerificar.setText("Verificar");
        btnVerificar.setColor1(new java.awt.Color(255, 255, 255));
        btnVerificar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        panelRound4.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, -1));

        btnEnviar.setText("Enviar");
        btnEnviar.setColor1(new java.awt.Color(255, 255, 255));
        btnEnviar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        panelRound4.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 110, -1));

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
/**public void EncCod(String user) {
        String cadena = "select * from tbUsuarios where usuario=? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        
        PreparedStatement ps;
        ResultSet st;
        
        try{
            acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, txtUser.getText());
            st = ps.executeQuery();
            st.last();
            int found = st.getRow();
            if (found == 1) {
                JOptionPane.showMessageDialog(null, "Usuario Encontrado");
            User = st.getInt("idUsuario");
            txtUser.setEnabled(true);
            btnVerificar.setEnabled(true);
            txtPregunta1.setEnabled(true);
            txtPregunta2.setEnabled(true);
            txtPregunta3.setEnabled(true);
                EncExist(User);
            } else{
                JOptionPane.showMessageDialog(null, "Usuario no Encontrado");
                txtUser.setEnabled(false);
                btnVerificar.setEnabled(false);
                
            }
        } catch (SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
        }   
    }
    
    public void EncExist(int user){
    
        String cadena = "EXEC existPreg ?;";
        
        PreparedStatement ps;
        ResultSet st;
        
        try{
        acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ps.setInt(1, User);
            st = ps.executeQuery();
            st.last();
            int found = st.getRow();
            if (found == 1){
                JOptionPane.showMessageDialog(null, "Se encontraron respuestas");
               User = st.getInt("idUsuario");
               txtPregunta1.setEnabled(true);
               txtPregunta2.setEnabled(true);
               txtPregunta3.setEnabled(true);
               btnVerificar.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron respuestas");
               txtPregunta1.setEnabled(false);
               txtPregunta2.setEnabled(false);
               txtPregunta3.setEnabled(false);
               btnVerificar.setEnabled(false);
                
            }
        }catch (SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
        }   
    }
    
    public void VerifUS(){
    String cadena = "EXEC selectUsB ?;";
        
        PreparedStatement ps;
        ResultSet st;
        
        try{
        acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, txtUser.toString());
            st = ps.executeQuery();
            st.last();
            int found = st.getRow();
            if(found == 1){
            User = st.getInt("idUsuario");
            pasw = st.getString("contraseña");
            System.out.println(pasw);
            }else {
            
            }
        }catch (SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
        }
    
}
    
    
    
    public boolean VerificarExistencia(JTextField resp, int idpreg){
    
    String cadena = "EXEC selectPregUs ?,?,?;";
        
        PreparedStatement ps;
        ResultSet st;
        
        try{
        acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ps.setInt(1, User);
            ps.setInt(2,idpreg);
            ps.setString(3, resp.toString());
            st = ps.executeQuery();
            st.last();
            int found = st.getRow();
            
            if(found == 1){
                return true; 
            }else{
                JOptionPane.showMessageDialog(null, "Respuestas Incorrectas");
            
            }
        }  catch (SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
        
        
        
    }
        return false;
}**/
    
    public void transparente(){
    
        btnRegresar6.setOpaque(false);
        btnRegresar6.setContentAreaFilled(false);
        btnRegresar6.setBorderPainted(false);
        
    }
    private void txtPregunta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta3ActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        ctRecuperacion recup = new ctRecuperacion();
        ResultSet st;

        recup.Usuario = txtUser.getText();
        st=recup.EncCod();
        try {
            if(st==null){
            }
            else{
            idUser=st.getInt("idUsuario");
            contra=st.getString("contraseña");
            }   
            //idUser = recup.EncCod();
        } catch (SQLException ex) {
            Logger.getLogger(PreguntasDeConfianza.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

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
    private Vista.ButtonGradient btnEnviar;
    private javax.swing.JButton btnRegresar6;
    private Vista.ButtonGradient btnVerificar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Vista.PanelRound panelRound3;
    private Vista.PanelRound panelRound4;
    private Vista.Textfield txtPregunta1;
    private Vista.Textfield txtPregunta2;
    private Vista.Textfield txtPregunta3;
    private Vista.Textfield txtUser;
    // End of variables declaration//GEN-END:variables
}

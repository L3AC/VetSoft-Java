/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package AVista;
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
import AModelo.Conx;
import AModelo.Crypt;
import Mensajes.CodigoErrorDRC2;
import Mensajes.CodigoErrorDRC3;
import Mensajes.CódigoErrorDRC4;
import Mensajes.GlassPanePopup;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*; // Para enviar el correo electrónico
import javax.mail.internet.*; // Para trabajar con objetos relacionados con el correo electrónico
import javax.swing.JOptionPane;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gerson
 */
public class PorUsuario extends javax.swing.JFrame {

    
    Conx con = new Conx();
    Connection acceso;
    String mail;
    String codigo;
    Crypt cryp = new Crypt();
    
    /**
     * Creates new form PorUsuario
     */
    public PorUsuario() {
        initComponents();
        transparente();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(this);
        txtCod.setEnabled(false);
        btnVeri.setEnabled(false);
        txtNueva.setEnabled(false);
        txtNueva2.setEnabled(false);
        btnCambiar.setEnabled(false);
        
        txtUser.setDocument(new Valida(30, "[a-zA-Z]*"));
        txtCod.setDocument(new Valida(10, "[0-9]*"));
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

        BtnRegresar1 = new javax.swing.JButton();
        lbMayor = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        lbCod = new javax.swing.JLabel();
        btnVeri = new Design.ButtonGradient();
        lbUs1 = new javax.swing.JLabel();
        lbUs2 = new javax.swing.JLabel();
        lbCod1 = new javax.swing.JLabel();
        btnEnviar = new Design.ButtonGradient();
        btnCambiar = new Design.ButtonGradient();
        txtUser = new Design.TextFieldSV();
        txtCod = new Design.TextFieldSV();
        txtNueva = new Design.PasswordField();
        txtNueva2 = new Design.PasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BtnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        BtnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresar1ActionPerformed(evt);
            }
        });

        lbMayor.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lbMayor.setText("Recuperación de contraseña por usuario");

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCod.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCod.setForeground(new java.awt.Color(0, 0, 0));
        lbCod.setText("Confirmar Contraseña");
        panelRound1.add(lbCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, 30));

        btnVeri.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVeri.setText("Verificar");
        btnVeri.setColor1(new java.awt.Color(255, 255, 255));
        btnVeri.setColor2(new java.awt.Color(204, 255, 255));
        btnVeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeriActionPerformed(evt);
            }
        });
        panelRound1.add(btnVeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, 30));

        lbUs1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbUs1.setForeground(new java.awt.Color(0, 0, 0));
        lbUs1.setText("Ingrese su nueva Contraseña");
        panelRound1.add(lbUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, 30));

        lbUs2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbUs2.setForeground(new java.awt.Color(0, 0, 0));
        lbUs2.setText("Ingrese su Usuario");
        panelRound1.add(lbUs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        lbCod1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCod1.setForeground(new java.awt.Color(0, 0, 0));
        lbCod1.setText("Ingrese su código de verificación");
        panelRound1.add(lbCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        btnEnviar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEnviar.setText("Enviar Correo");
        btnEnviar.setColor1(new java.awt.Color(255, 255, 255));
        btnEnviar.setColor2(new java.awt.Color(204, 255, 255));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        panelRound1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, 30));

        btnCambiar.setText("Cambiar Contraseña");
        btnCambiar.setColor1(new java.awt.Color(255, 255, 255));
        btnCambiar.setColor2(new java.awt.Color(204, 255, 255));
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        panelRound1.add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 170, 30));

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
        panelRound1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, -1));

        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        panelRound1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, -1));

        txtNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaActionPerformed(evt);
            }
        });
        txtNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevaKeyTyped(evt);
            }
        });
        panelRound1.add(txtNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 180, -1));

        txtNueva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNueva2ActionPerformed(evt);
            }
        });
        txtNueva2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNueva2KeyTyped(evt);
            }
        });
        panelRound1.add(txtNueva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(lbMayor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMayor))
                .addGap(19, 19, 19)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresar1ActionPerformed
        // TODO add your handling code here:
        
         RecuperacionDeContraseña newFrame = new RecuperacionDeContraseña();
        
        newFrame.setVisible(true);
    }//GEN-LAST:event_BtnRegresar1ActionPerformed

    private void btnVeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeriActionPerformed
        // TODO add your handling code here:
        if (txtUser.getText().isEmpty() || txtCod.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {
            EncCod(txtUser.getText());
        }
        
    }//GEN-LAST:event_btnVeriActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
       if (txtUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {
            Encontrar();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        // TODO add your handling code here:
        
        if (txtUser.getText().isEmpty() || txtCod.getText().isEmpty()
                || txtNueva.getText().isEmpty() || txtNueva2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {
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
            }
        }
        Login newFrame = new Login();
        
        newFrame.setVisible(true);
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtNuevaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevaKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNuevaKeyTyped

    private void txtNueva2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNueva2KeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtNueva2KeyTyped

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaActionPerformed
        
    }//GEN-LAST:event_txtNuevaActionPerformed

    private void txtNueva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNueva2ActionPerformed
        
    }//GEN-LAST:event_txtNueva2ActionPerformed

    public void transparente(){
    
        BtnRegresar1.setOpaque(false);
        BtnRegresar1.setContentAreaFilled(false);
        BtnRegresar1.setBorderPainted(false);
        
    }
    
    public void act() throws Exception{
    String cadena = "update tbUsuarios set contraseña=? "
                + "where usuario=? COLLATE SQL_Latin1_General_CP1_CS_AS;";
    PreparedStatement ps;
    
    try {

            acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena);
            ps.setString(1,cryp.encrypt( txtNueva.getText(), "key"));
            ps.setString(2, txtUser.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Clave actualizada");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
   public void EncCod(String user) {
        String cadena = "select * from tbUsuarios where usuario=? COLLATE SQL_Latin1_General_CP1_CS_AS;";

        PreparedStatement ps;
        ResultSet st;

        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, user);
            st = ps.executeQuery();
            st.last();
            int found = st.getRow();
            if (found == 1) {
                String cod = st.getString("codigoVerif");
                if (cod.equals(txtCod.getText())) {
                    JOptionPane.showMessageDialog(null, "Codigo Correcto");
                    txtNueva.setEnabled(true);
                    txtNueva2.setEnabled(true);
                    btnCambiar.setEnabled(true);
                } else {
                    CodigoErrorDRC3 obj = new CodigoErrorDRC3();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
                    txtNueva.setEnabled(false);
                    txtNueva2.setEnabled(false);
                    btnCambiar.setEnabled(false);
                }

            } else {
                CodigoErrorDRC2 obj = new CodigoErrorDRC2();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            //System.out.println(e.toString());
        }
   }
   
   //ENVIAR MAIL
    public void Em(String txt, String clave) {
        try {
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.ssl.protocols", "TLSv1.2");

            Session ses = Session.getDefaultInstance(props);

            String cRem = "vetsoftsoporte@gmail.com";
            String pRem = "jtsteydqiifilcpi";
            String cRec = txt;
            String asunto = "Recuperacion de clave";
            String mensaje = "Codigo de verificacion: " + clave;

            MimeMessage msg = new MimeMessage(ses);
            msg.setFrom(new InternetAddress(cRem));

            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(cRec));
            msg.setSubject(asunto);
            msg.setText(mensaje);

            Transport t = ses.getTransport("smtp");

            t.connect(cRem, pRem);//correo y contraseña
            t.sendMessage(msg, msg.getRecipients(Message.RecipientType.TO));
            t.close();

            JOptionPane.showMessageDialog(null, "Mensaje enviado");
        } catch (AddressException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            System.out.println(e.toString());
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            System.out.println(e.toString());
        }
    }
    
    public void Encontrar(){
    
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
            mail = st.getString("correo");
            codigo = GenerC(8);
            InsertC(codigo);
            Em(mail, codigo);
            txtCod.setEnabled(true);
            btnVeri.setEnabled(true);
            } else{
                CodigoErrorDRC2 obj = new CodigoErrorDRC2();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
                txtCod.setEnabled(false);
                btnVeri.setEnabled(false);
                
            }
        } catch (SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
        }   
    }
    
    public void InsertC(String code){
     String cadena = "update tbUsuarios set codigoVerif=? "
                + "where usuario=? COLLATE SQL_Latin1_General_CP1_CS_AS;";
     
     PreparedStatement ps;
     try{
     acceso = con.Conectar();
     ps = acceso.prepareStatement(cadena);
     ps.setString(1, code);
     ps.setString(2, txtUser.getText());
     ps.executeUpdate();
     JOptionPane.showMessageDialog(null, "Codigo creado");
     }catch (SQLException e){
     JOptionPane.showMessageDialog(null, e.toString());
     }
    }
    
    public String GenerC(int longi){
    String num = "0123456789";
        String lmin = "abcdefghijklmnopqrstuvwxyz";
        String lmay = lmin.toUpperCase();
        
        String caract = lmay + num;
        Random cod = new Random();
        String result = "";
        for (int i = 0; i < longi; i++) {
            int posic = cod.nextInt(caract.length());
            char caracter = caract.charAt(posic);
            result += caracter;
        }
        return result;
        
    }
    
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
            java.util.logging.Logger.getLogger(PorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PorUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar1;
    private Design.ButtonGradient btnCambiar;
    private Design.ButtonGradient btnEnviar;
    private Design.ButtonGradient btnVeri;
    private javax.swing.JLabel lbCod;
    private javax.swing.JLabel lbCod1;
    private javax.swing.JLabel lbMayor;
    private javax.swing.JLabel lbUs1;
    private javax.swing.JLabel lbUs2;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtCod;
    private Design.PasswordField txtNueva;
    private Design.PasswordField txtNueva2;
    private Design.TextFieldSV txtUser;
    // End of variables declaration//GEN-END:variables
}


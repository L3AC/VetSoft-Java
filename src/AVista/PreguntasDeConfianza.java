/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AVista;

import AControlador.ctAnimales;
import AModelo.Conx;
import AModelo.Crypt;
import AVista.Animales.CRUDAnimales;
import Mensajes.CodigoErrorDRC2;
import Mensajes.CódigoErrorDRC1;
import Mensajes.CódigoErrorDRC4;
import Mensajes.CódigoErrorDSI5;
import Mensajes.CódigoErrorDSI7;
import Mensajes.CódigoErrorDSI8;
import Mensajes.CódigoErrorDSI9;
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
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author Gerson
 */
public class PreguntasDeConfianza extends javax.swing.JFrame {

    Conx con = new Conx();
    Connection acceso;
    Crypt cryp = new Crypt();
    int idUs;
    String Contra;

    public PreguntasDeConfianza() {
        GlassPanePopup.install(this);
        initComponents();
        this.setLocationRelativeTo(this);
        txtPregunta1.setEnabled(false);
        txtPregunta2.setEnabled(false);
        txtPregunta3.setEnabled(false);
        btnEnviar.setEnabled(false);
        
        /*Este apartado validamos los Jtexfield que no se escriban números o letras con un maximo de digitos*/
        txtUser.setDocument(new Valida(30, "[a-zA-Z0-9]*"));
        txtPregunta1.setDocument(new Valida(30, "[a-zA-Z0-9 ]*"));
        txtPregunta2.setDocument(new Valida(30, "[a-zA-Z0-9 ]*"));
        txtPregunta3.setDocument(new Valida(30, "[a-zA-Z0-9 ]*"));
        
        
        setLocationRelativeTo(null);
        String iconPath = "src/Imagenes/logoC.png";
        ImageIcon icon = new ImageIcon(iconPath);
        setIconImage(icon.getImage());
        setTitle("VetSoft");

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VetSoft2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(27, 73, 101));
        jLabel6.setText("Preguntas de seguridad");
        panelRound3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

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

        txtUser.setShadowColor(new java.awt.Color(0, 0, 51));
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

        txtPregunta1.setShadowColor(new java.awt.Color(0, 0, 51));
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

        txtPregunta2.setShadowColor(new java.awt.Color(0, 0, 51));
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

        txtPregunta3.setShadowColor(new java.awt.Color(0, 0, 51));
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

        panelRound3.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 890, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelRound3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N
        panelRound3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        VetSoft2.setText("VetSoft+");
        panelRound3.add(VetSoft2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Esta función nos ayuda a encontrar el id de las preguntas contestadas anteriormente el usuario para la recup de contraseña por medio de preguntas de seguridad
    public boolean VeriResp(String resp, int idPreg) throws SQLException {

        String cadenita = "select pu.respuesta,pu.idUsuario,pu.idPregunta from tbPreguntasUsuarios pu,tbPreguntas p,"
                + " tbUsuarios u where pu.idUsuario=u.idUsuario and pu.idPregunta=p.idPregunta and pu.idUsuario=? and pu.idPregunta=? and respuesta=? ;";

        PreparedStatement ps;
        ResultSet st;

        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(cadenita, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ps.setString(3, resp.toString());
            ps.setInt(2, idPreg);
            ps.setInt(1, idUs);

            System.out.print(idUs);
            System.out.print(resp);
            st = ps.executeQuery();
            st.last();
            int found = st.getRow();
            if (found == 1) {
                return true;

            } else {
                CódigoErrorDRC1 obj = new CódigoErrorDRC1();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);

                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    //Nos ayuda a encontrar la existencia del id del usuario, si el usuario contesto o no contesto las preguntas de seguridad
    public void VerExist() {

        String Cadena = "select * from tbPreguntasUsuarios where idUsuario=?;";

        PreparedStatement ps;
        ResultSet st;

        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(Cadena, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ps.setInt(1, idUs);
            st = ps.executeQuery();
            st.last();
            int found = st.getRow();
            if (found >= 1) {
                int pregun = st.getInt("idPreguntaUsuario");
                txtPregunta1.setEnabled(true);
                txtPregunta2.setEnabled(true);
                txtPregunta3.setEnabled(true);
                btnEnviar.setEnabled(true);
                btnVerificar.setEnabled(false);
                txtUser.setEnabled(false);
                
                CódigoErrorDSI7 obj = new CódigoErrorDSI7();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
            } else {
                CódigoErrorDSI8 obj = new CódigoErrorDSI8();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
                txtPregunta1.setEnabled(false);
                txtPregunta2.setEnabled(false);
                txtPregunta3.setEnabled(false);
                btnEnviar.setEnabled(false);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

    
    //Nos ayuda a encontrar al usuario y la contraseña del usuario para poder mostrarsela por medio de un mensaje en pantalla que si desea cambiarla o dejarla igual
    public void Encod() throws Exception {
        String cadena = "select * from tbUsuarios where Usuario=? COLLATE SQL_Latin1_General_CP1_CS_AS;";

        PreparedStatement ps;
        ResultSet st;

        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, txtUser.getText());
            st = ps.executeQuery();
            st.last();
            int found = st.getRow();
            if (found == 1) {
                idUs = st.getInt("idUsuario");
                Contra = cryp.decrypt(st.getString("contraseña"), "key");
                System.err.println(Contra);

                txtPregunta1.setEnabled(true);
                txtPregunta2.setEnabled(true);
                txtPregunta3.setEnabled(true);
                btnEnviar.setEnabled(true);
                CódigoErrorDSI9 obj = new CódigoErrorDSI9();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
            } else {
                CodigoErrorDRC2 obj = new CodigoErrorDRC2();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
                txtPregunta1.setEnabled(false);
                txtPregunta2.setEnabled(false);
                txtPregunta3.setEnabled(false);
                btnEnviar.setEnabled(false);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (txtUser.getText().isEmpty()) {
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
                Encod();
                VerExist();
            } catch (Exception ex) {
                Logger.getLogger(PreguntasDeConfianza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    //Anteriormente dicho este es el mensaje que vera el usuario donde se le mostrara la contraseña y si quiere cambiarla se le enviara a otra pantalla donde podra cambiar su contraseña
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {
            // TODO add your handling code here:
            if (VeriResp(txtPregunta1.getText().toString(), 1)
                    && VeriResp(txtPregunta2.getText().toString(), 2)
                    && VeriResp(txtPregunta3.getText().toString(), 3)) {
                UIManager.put("OptionPane.messageDialogTitle", "Confirmación");
                int opcion = JOptionPane.showOptionDialog(
                        null,
                        "Su contraseña es " + Contra + " , ¿Desea cambiarla?",
                        "Recuperación",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        new Object[]{"Sí", "No"},
                        "No");

                if (opcion == JOptionPane.YES_OPTION) {
                    NuevaContra newFrame = new NuevaContra(idUs);
                    newFrame.setVisible(true);
                    dispose();
                } else if (opcion == JOptionPane.NO_OPTION) {

                }
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(PreguntasDeConfianza.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPregunta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPregunta1KeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_txtPregunta1KeyTyped

    private void txtPregunta2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPregunta2KeyTyped

    }//GEN-LAST:event_txtPregunta2KeyTyped

    private void txtPregunta3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPregunta3KeyTyped

    }//GEN-LAST:event_txtPregunta3KeyTyped

    private void txtPregunta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta1ActionPerformed

    }//GEN-LAST:event_txtPregunta1ActionPerformed

    private void txtPregunta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta2ActionPerformed

    }//GEN-LAST:event_txtPregunta2ActionPerformed

    private void txtPregunta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta3ActionPerformed

    }//GEN-LAST:event_txtPregunta3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
         RecuperacionDeContraseña newFrame = new RecuperacionDeContraseña();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked


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
    private javax.swing.JLabel VetSoft2;
    private Design.ButtonGradient btnEnviar;
    private Design.ButtonGradient btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AVista;

import AControlador.ctTipoUs;
import AControlador.ctUser;
import AModelo.Crypt;
import AVista.Usuarios.insertUs;
import Design.Desg;
import Mensajes.CodigoDeErrorDLI3;
import Mensajes.CódigoErrorDSI2;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import Validation.Valida;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.commons.validator.EmailValidator;

/**
 *
 * @author Gerson
 */
public class Registro extends javax.swing.JFrame {

    private int idTipoUs;
    private int tpUs;
    Crypt cryp = new Crypt();
    ctTipoUs ctTP = new ctTipoUs();
    Desg dsg = new Desg();
    Map<Integer, String> cbMap = new HashMap<>();

    public Registro() throws SQLException {
        GlassPanePopup.install(this);
        initComponents();
        lbDisp.setVisible(false);
        lbFalso.setVisible(false);
        loadCombo(cbCargo);

        GlassPanePopup.install(this);
        
         /*Este apartado de setFound nos ayuda a poner un tipo de fuente en especifico y el tamaño de la letra*/
        txtUsuario.setDocument(new Valida(30, "[a-zA-Z0-9]*"));
        txtTeléfono.setDocument(new Valida(8, "[0-9]*"));
        txtContra.setDocument(new Valida(30, "[a-zA-Z0-9]*"));
        setLocationRelativeTo(null);
        
        String iconPath = "src/Imagenes/logoC.png";
        ImageIcon icon = new ImageIcon(iconPath);
        setIconImage(icon.getImage());
        setTitle("VetSoft");
        lbMin.setVisible(false);
        lbMin1.setVisible(false);
        lbMinimo2.setVisible(false);
    }
    
//Esto nos ayudara a que el comboBox cargue los tipos de usuarios disponibles dentro del sistema de escritorio que se pueden registrar
    private void loadCombo(JComboBox cb) throws SQLException {
        ResultSet rs = ctTP.selectUser();
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

        panelRound1 = new Design.PanelRound();
        panelRound2 = new Design.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrar = new Design.ButtonGradient();
        lbFalso = new javax.swing.JLabel();
        txtTeléfono = new Design.TextFieldSV();
        txtUsuario = new Design.TextFieldSV();
        txtCorreo = new Design.TextFieldSV();
        txtContra = new Design.PasswordField();
        cbCargo = new Design.Combobox();
        lbDisp = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        lbMin = new javax.swing.JLabel();
        lbMinimo2 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panelRound1.setBackground(new java.awt.Color(190, 233, 232));
        panelRound1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setForeground(new java.awt.Color(202, 233, 255));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Usuario");
        panelRound2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Correo electrónico");
        panelRound2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 150, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Contraseña");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Teléfono");
        panelRound2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 70, -1));

        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setColor1(new java.awt.Color(190, 233, 232));
        btnRegistrar.setColor2(new java.awt.Color(190, 233, 232));
        btnRegistrar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        panelRound2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 120, 30));

        lbFalso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbFalso.setForeground(new java.awt.Color(0, 0, 0));
        lbFalso.setText("Correo electrónico falso");
        panelRound2.add(lbFalso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 150, -1));

        txtTeléfono.setBackground(new java.awt.Color(190, 233, 232));
        txtTeléfono.setShadowColor(new java.awt.Color(0, 0, 51));
        txtTeléfono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeléfonoActionPerformed(evt);
            }
        });
        txtTeléfono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTeléfonoKeyTyped(evt);
            }
        });
        panelRound2.add(txtTeléfono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 180, -1));

        txtUsuario.setBackground(new java.awt.Color(190, 233, 232));
        txtUsuario.setShadowColor(new java.awt.Color(0, 0, 51));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        panelRound2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, -1));

        txtCorreo.setBackground(new java.awt.Color(190, 233, 232));
        txtCorreo.setShadowColor(new java.awt.Color(0, 0, 51));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        panelRound2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, -1));

        txtContra.setBackground(new java.awt.Color(190, 233, 232));
        txtContra.setShadowColor(new java.awt.Color(0, 0, 51));
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraKeyTyped(evt);
            }
        });
        panelRound2.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 180, -1));

        cbCargo.setBackground(new java.awt.Color(190, 233, 232));
        cbCargo.setForeground(new java.awt.Color(0, 0, 0));
        cbCargo.setLabeText("Nivel de Usuario");
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        panelRound2.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 102, 160, 40));

        lbDisp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDisp.setForeground(new java.awt.Color(0, 0, 0));
        lbDisp.setText("Usuario no disponible");
        panelRound2.add(lbDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 140, -1));

        lbMin1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMin1.setForeground(new java.awt.Color(0, 0, 0));
        lbMin1.setText("Minimo de digitos 8");
        lbMin1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbMin1KeyTyped(evt);
            }
        });
        panelRound2.add(lbMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 140, -1));

        lbMin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 8");
        lbMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbMinKeyTyped(evt);
            }
        });
        panelRound2.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 140, -1));

        lbMinimo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMinimo2.setForeground(new java.awt.Color(0, 0, 0));
        lbMinimo2.setText("Minimo de digitos 4");
        panelRound2.add(lbMinimo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 150, -1));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 680, 270));

        Titulo.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(27, 73, 101));
        Titulo.setText("Registro");
        panelRound1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });
        panelRound1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jLabel3.setText("VetSoft+");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Cuando se le de al botón registrar se verificaran que todo lo anteriormente mencionado se este validado por ejemplo que los campos no esten vacios entreo otros mas
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:

        if (txtUsuario.getText().isEmpty() || txtContra.getText().isEmpty()|| txtTeléfono.getText().isEmpty() || txtCorreo.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
        } else {
            ctUser ctUs = new ctUser();
        ctUs.idTipoCuenta = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());

        ctUs.usuario = txtUsuario.getText();
        try {
            ctUs.contra = cryp.encrypt(txtContra.getText(), "key");

        } catch (Exception ex) {
            Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
        }
        ctUs.correo = txtCorreo.getText();
        ctUs.telefono = txtTeléfono.getText();
        ctUs.insertUs();
            Login newFrame = new Login();
        newFrame.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
        // TODO add your handling code here:
        tpUs = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());
        System.out.println("ID seleccionado: " + tpUs);
    }//GEN-LAST:event_cbCargoActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
         //Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros, donde si solo escribe dos numeros le saldra un texfield
         if(txtUsuario.getText().length()>= 3){
            lbMinimo2.setVisible(false);
        }else {
            lbMinimo2.setVisible(true);
        } 
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyTyped
        // TODO add your handling code here:
        //Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros, donde si solo escribe dos numeros le saldra un texfield
        if(txtContra.getText().length()>= 7){
            lbMin.setVisible(false);
            btnRegistrar.setEnabled(true);
        }else {
            lbMin.setVisible(true);
            btnRegistrar.setEnabled(false);
        } 
    }//GEN-LAST:event_txtContraKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoKeyTyped

    //Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros donde si solo escribe dos numeros le saldra un texfield
    private void txtTeléfonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeléfonoKeyTyped
        // TODO add your handling code here:
      if(txtTeléfono.getText().length()>= 7){
            lbMin1.setVisible(false);
            btnRegistrar.setEnabled(true);
        }else {
            lbMin1.setVisible(true);
            btnRegistrar.setEnabled(false);
        } 

    }//GEN-LAST:event_txtTeléfonoKeyTyped

    
    //Esto nos ayuda a verificar si el correo electronico es verdadero llamando a una libreria anteriormente puesta en el en apartado de librerias donde solamente se manda a llamar para validar
    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        // TODO add your handling code here:
        
        if (EmailValidator.getInstance().isValid(txtCorreo.getText())) {
            //if(verificar_Email(jTextField1.getText())){    

            lbFalso.setVisible(false);
            btnRegistrar.setEnabled(true);

        } else {

            lbFalso.setVisible(true);
            btnRegistrar.setEnabled(false);

        }
    }//GEN-LAST:event_txtCorreoKeyReleased

    
    //En este apartado validamos si el usuario ya existe en la base de datos y no se vuelva a repetir donde se le mostrar un texfield
    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        // TODO add your handling code here:

        if(txtUsuario.getText().length()>= 3){
            lbMinimo2.setVisible(false);
        btnRegistrar.setEnabled(true);
        
        ctUser ctUs = new ctUser();
        ctUs.usuario = txtUsuario.getText().toString();
        try {
            if (ctUs.verifUs().next()) {
                lbDisp.setVisible(true);
                btnRegistrar.setEnabled(false);
            } else {
                lbDisp.setVisible(false);
                btnRegistrar.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else {
            lbMinimo2.setVisible(true);
            btnRegistrar.setEnabled(false);
        } 
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtTeléfonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeléfonoActionPerformed

    }//GEN-LAST:event_txtTeléfonoActionPerformed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
        
   
    }//GEN-LAST:event_txtContraActionPerformed

    //Este apartado nos ayudara a volver a la pantalla anterior donde se podra ver por medio de una flecha
    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
         Login newFrame = new Login();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void lbMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbMinKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_lbMinKeyTyped

    private void lbMin1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbMin1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lbMin1KeyTyped

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
    private javax.swing.JLabel btnVolver;
    private Design.Combobox cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbDisp;
    private javax.swing.JLabel lbFalso;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbMin1;
    private javax.swing.JLabel lbMinimo2;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    private Design.PasswordField txtContra;
    private Design.TextFieldSV txtCorreo;
    private Design.TextFieldSV txtTeléfono;
    private Design.TextFieldSV txtUsuario;
    // End of variables declaration//GEN-END:variables
}

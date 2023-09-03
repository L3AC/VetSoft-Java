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
import Mensajes.CódigoDSI10;
import Mensajes.CódigoErrorDRC4;
import Mensajes.CódigoErrorDSI11;
import Mensajes.CódigoErrorDSI4;
import Mensajes.CódigoErrorDSI5;
import Mensajes.CódigoErrorDSI6;
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

public class PorUsuario extends javax.swing.JFrame {
    
    Conx con = new Conx();
    Connection acceso;
    String mail;
    String codigo;
    Crypt cryp = new Crypt();
    
    public PorUsuario() {
        GlassPanePopup.install(this);
        initComponents();
        transparente();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(this);
        txtCod.setEnabled(false);
        btnVeri.setEnabled(false);
        txtNueva.setEnabled(false);
        txtNueva2.setEnabled(false);
        btnCambiar.setEnabled(false);
        lbMin.setVisible(false);

        /*Este apartado validamos los Jtexfield que no se escriban números o letras con un maximo de digitos*/
        txtUser.setDocument(new Valida(30, "[a-zA-Z]*"));
        txtCod.setDocument(new Valida(20, "[a-zA-Z0-9]*"));
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
        BtnRegresar1 = new javax.swing.JButton();
        lbMayor = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        lbCod = new javax.swing.JLabel();
        btnVeri = new Design.ButtonGradient();
        lbMin = new javax.swing.JLabel();
        lbUs2 = new javax.swing.JLabel();
        lbCod1 = new javax.swing.JLabel();
        btnEnviar = new Design.ButtonGradient();
        btnCambiar = new Design.ButtonGradient();
        txtUser = new Design.TextFieldSV();
        txtCod = new Design.TextFieldSV();
        txtNueva = new Design.PasswordField();
        txtNueva2 = new Design.PasswordField();
        lbUs3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(190, 233, 232));
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegresar1.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        BtnRegresar1.setBorder(null);
        BtnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresar1ActionPerformed(evt);
            }
        });
        panelRound2.add(BtnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 29, 28));

        lbMayor.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lbMayor.setForeground(new java.awt.Color(27, 73, 101));
        lbMayor.setText("Recuperación de contraseña por usuario");
        panelRound2.add(lbMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCod.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCod.setForeground(new java.awt.Color(0, 0, 0));
        lbCod.setText("Confirmar Contraseña");
        panelRound1.add(lbCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 180, 30));

        btnVeri.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVeri.setForeground(new java.awt.Color(0, 0, 0));
        btnVeri.setText("Verificar");
        btnVeri.setColor1(new java.awt.Color(190, 233, 232));
        btnVeri.setColor2(new java.awt.Color(190, 233, 232));
        btnVeri.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnVeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeriActionPerformed(evt);
            }
        });
        panelRound1.add(btnVeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 30));

        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 8");
        panelRound1.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 110, 30));

        lbUs2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbUs2.setForeground(new java.awt.Color(0, 0, 0));
        lbUs2.setText("Ingrese su Usuario");
        panelRound1.add(lbUs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        lbCod1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCod1.setForeground(new java.awt.Color(0, 0, 0));
        lbCod1.setText("Ingrese su código de verificación");
        panelRound1.add(lbCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));

        btnEnviar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEnviar.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviar.setText("Enviar Correo");
        btnEnviar.setColor1(new java.awt.Color(190, 233, 232));
        btnEnviar.setColor2(new java.awt.Color(190, 233, 232));
        btnEnviar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        panelRound1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 110, 30));

        btnCambiar.setForeground(new java.awt.Color(0, 0, 0));
        btnCambiar.setText("Cambiar Contraseña");
        btnCambiar.setColor1(new java.awt.Color(190, 233, 232));
        btnCambiar.setColor2(new java.awt.Color(190, 233, 232));
        btnCambiar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        panelRound1.add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 180, 30));

        txtUser.setBackground(new java.awt.Color(190, 233, 232));
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
        panelRound1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, -1));

        txtCod.setBackground(new java.awt.Color(190, 233, 232));
        txtCod.setShadowColor(new java.awt.Color(0, 0, 51));
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        panelRound1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, -1));

        txtNueva.setBackground(new java.awt.Color(190, 233, 232));
        txtNueva.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaActionPerformed(evt);
            }
        });
        txtNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNuevaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevaKeyTyped(evt);
            }
        });
        panelRound1.add(txtNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 180, -1));

        txtNueva2.setBackground(new java.awt.Color(190, 233, 232));
        txtNueva2.setShadowColor(new java.awt.Color(0, 0, 51));
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
        panelRound1.add(txtNueva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 180, -1));

        lbUs3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbUs3.setForeground(new java.awt.Color(0, 0, 0));
        lbUs3.setText("Ingrese su nueva Contraseña");
        panelRound1.add(lbUs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, 30));

        panelRound2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 734, 344));

        getContentPane().add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNueva2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNueva2KeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNueva2KeyTyped

    private void txtNueva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNueva2ActionPerformed

    }//GEN-LAST:event_txtNueva2ActionPerformed

    private void txtNuevaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevaKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNuevaKeyTyped

    private void txtNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaActionPerformed

    }//GEN-LAST:event_txtNuevaActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed

    }//GEN-LAST:event_txtCodActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtUserKeyTyped

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        // TODO add your handling code here:

        if (txtUser.getText().isEmpty() || txtCod.getText().isEmpty()
                || txtNueva.getText().isEmpty() || txtNueva2.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            if (txtNueva.getText().equals(txtNueva2.getText())) {
                try {
                    act();
                } catch (Exception ex) {
                    Logger.getLogger(PorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
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
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
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
            
            Encontrar();
            
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnVeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeriActionPerformed
        // TODO add your handling code here:
        if (txtUser.getText().isEmpty() || txtCod.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            EncCod(txtUser.getText());
        }

    }//GEN-LAST:event_btnVeriActionPerformed

    private void BtnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresar1ActionPerformed
        // TODO add your handling code here:

        RecuperacionDeContraseña newFrame = new RecuperacionDeContraseña();
        
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresar1ActionPerformed

    private void txtNuevaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevaKeyReleased
        // TODO add your handling code here:
         if (txtNueva.getText().length() >= 8) {
            lbMin.setVisible(false);
            btnCambiar.setEnabled(true);

        } else {
            lbMin.setVisible(true);
            btnCambiar.setEnabled(false);
        }
    }//GEN-LAST:event_txtNuevaKeyReleased
    
    public void transparente() {
        
        BtnRegresar1.setOpaque(false);
        BtnRegresar1.setContentAreaFilled(false);
        BtnRegresar1.setBorderPainted(false);
        
    }
    
    public void act() throws Exception {
        String cadena = "update tbUsuarios set contraseña=? "
                + "where usuario=? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        PreparedStatement ps;
        
        try {
            
            acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena);
            ps.setString(1, cryp.encrypt(txtNueva.getText(), "key"));
            ps.setString(2, txtUser.getText());
            ps.executeUpdate();
            
            Login newFrame = new Login();
            newFrame.setVisible(true);
            this.dispose();
            
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

    /*En esta función se hace el reconocimiento del codigó de verificación si es correcto o no 
     */
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
                    CódigoErrorDSI6 obj = new CódigoErrorDSI6();
                    obj.eventOK(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            GlassPanePopup.closePopupLast();
                        }
                    });
                    GlassPanePopup.showPopup(obj);
                    txtNueva.setEnabled(true);
                    txtNueva2.setEnabled(true);
                    btnCambiar.setEnabled(true);
                    txtUser.setEnabled(false);
                    btnEnviar.setEnabled(false);
                    btnVeri.setEnabled(false);
                    txtCod.setEnabled(false);
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

    //Por medio de esta función se envia el correo electronico al usuario con su debido codigó de verificación
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
            String mensaje = "<!DOCTYPE html>\n" +
"<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
"\n" +
"<head>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Código de verificación</title>\n" +
"\n" +
"    <style>\n" +
"        @import url('https://fonts.googleapis.com/css2?family=Karla:wght@300&family=Montserrat:wght@300&family=Poppins:wght@300&family=Roboto+Mono:ital@0;1&display=swap');\n" +
"\n" +
"        *, *:before, *:after {\n" +
"            -moz-box-sizing: border-box;\n" +
"            -webkit-box-sizing: border-box;\n" +
"            box-sizing: border-box;\n" +
"        }\n" +
"\n" +
"        body {\n" +
"            background-color: #1B4965;\n" +
"            margin-top: 55px;\n" +
"            margin-bottom: 55px;\n" +
"        }\n" +
"\n" +
"        form {\n" +
"            max-width: 300px;\n" +
"            margin: 10px auto;\n" +
"            padding: 10px 20px;\n" +
"            background: rgb(255, 255, 255);\n" +
"            border-radius: 5px;\n" +
"        }\n" +
"\n" +
"        h1 {\n" +
"            text-align: center;\n" +
"            font-family: Brush Script MT;\n" +
"            font-family: 'Roboto Mono', monospace;\n" +
"            font-family: 'Montserrat', sans-serif;\n" +
"            font-size: 35px;\n" +
"            color: black;\n" +
"        }\n" +
"\n" +
"        h3 {\n" +
"            text-align: center;\n" +
"            font-family: 'Karla', sans-serif;\n" +
"            color: black;\n" +
"        }\n" +
"\n" +
"        select {\n" +
"            padding: 6px;\n" +
"            height: 32px;\n" +
"            border-radius: 2px;\n" +
"        }\n" +
"\n" +
"        fieldset {\n" +
"            margin-bottom: 30px;\n" +
"            border: none;\n" +
"        }\n" +
"\n" +
"        legend {\n" +
"            font-family: Candara;\n" +
"            font-size: 1.5em;\n" +
"            margin-bottom: 10px;\n" +
"            font-family: 'Poppins', sans-serif;\n" +
"        }\n" +
"\n" +
"        label {\n" +
"            display: block;\n" +
"            margin-bottom: 8px;\n" +
"            font-family: Times New Roman;\n" +
"            font-family: 'Karla', sans-serif;\n" +
"        }\n" +
"\n" +
"            label.light {\n" +
"                font-weight: 300;\n" +
"                display: inline;\n" +
"            }\n" +
"\n" +
"        .img {\n" +
"            padding-top: 10px;\n" +
"        }\n" +
"\n" +
"        @media screen and (min-width: 480px) {\n" +
"\n" +
"            form {\n" +
"                max-width: 480px;\n" +
"            }\n" +
"        }\n" +
"\n" +
"        @media screen and (max-width: 480px) {\n" +
"\n" +
"            form {\n" +
"                max-width: 480px;\n" +
"            }\n" +
"\n" +
"            .img {\n" +
"                width: 300px;\n" +
"                padding-top: 10px;\n" +
"            }\n" +
"\n" +
"            .logo {\n" +
"                width: 40px;\n" +
"            }\n" +
"\n" +
"            @media screen and (max-width: 388px) {\n" +
"\n" +
"                form {\n" +
"                    max-width: 388px;\n" +
"                }\n" +
"\n" +
"                .img {\n" +
"                    width: 280px;\n" +
"                    padding-top: 10px;\n" +
"                }\n" +
"\n" +
"                .logo {\n" +
"                    width: 30px;\n" +
"                }\n" +
"            }\n" +
"\n" +
"            @media screen and (max-width: 374px) {\n" +
"\n" +
"                form {\n" +
"                    max-width: 374px;\n" +
"                }\n" +
"\n" +
"                .img {\n" +
"                    width: 250px;\n" +
"                    padding-top: 10px;\n" +
"                }\n" +
"\n" +
"                .logo {\n" +
"                    width: 20px;\n" +
"                }\n" +
"            }\n" +
"\n" +
"            @media screen and (max-width: 330px) {\n" +
"\n" +
"                form {\n" +
"                    max-width: 330px;\n" +
"                }\n" +
"\n" +
"                .img {\n" +
"                    width: 210px;\n" +
"                    padding-top: 10px;\n" +
"                }\n" +
"\n" +
"                .logo {\n" +
"                    width: 20px;\n" +
"                }\n" +
"            }\n" +
"        }\n" +
"    </style>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <div>\n" +
"        <form action=\"index.html\" method=\"post\">\n" +
"          <p style=\"text-align: center; \">\n" +
"            <img class=\"img\" src=\"https://cdn.icon-icons.com/icons2/2093/PNG/512/hospital_health_clinic_urban_buildings_medical_icon_128575.png\" width=\"100px\">\n" +
"        </a>\n" +
"    </p>\n" +
"            <h1> Vetsoft </h1>\n" +
"            <hr style: width=\"50%\" color=\"black\">\n" +
"            <br>\n" +
"            <fieldset>\n" +
"\n" +
"                <legend>Hola: "+ txtUser.getText()+" <b> </b></legend>\n" +
"\n" +
"                <label>\n" +
"                   Antes de completar el proceso de recuperación de contraseña debes de verificar tu código de verificación dento del programa Vetsoft\n" +
"                </label>\n" +
"            </fieldset>\n" +
"            <fieldset>\n" +
"\n" +
"                <legend>Tu código de verificación es: "+ clave +"<br> <b></b></legend>\n"+
"\n" +
"                <label>Ingresa al programa de Vetsoft y digita el código antes mencionado en el área de código de verificación.</label>\n" +
"\n" +
"                <p style=\"text-align: center; \">\n" +
"                        <img class=\"img\" src=\"https://i.gifer.com/EOt.gif\" width=\"300px\">\n" +
"                    </a>\n" +
"                </p>\n" +
"            </fieldset>\n" +
"        </form>\n" +
"    </div>\n" +
"</body>\n" +
"\n" +
"</html>" ;
            
            MimeMessage msg = new MimeMessage(ses);
            msg.setFrom(new InternetAddress(cRem));
            
            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(cRec));
            msg.setSubject(asunto);
            msg.setText(mensaje);
            
            MimeMultipart multipart = new MimeMultipart();
            MimeBodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent(mensaje, "text/html");
            
            multipart.addBodyPart(htmlPart);
            
            msg.setContent(multipart);
            //Transport.send(msg);
            
            Transport t = ses.getTransport("smtp");
            
            t.connect(cRem, pRem);//correo y contraseña
            t.sendMessage(msg, msg.getRecipients(Message.RecipientType.TO));
            t.close();
            
            CódigoErrorDSI11 obj = new CódigoErrorDSI11();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } catch (AddressException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            System.out.println(e.toString());
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            System.out.println(e.toString());
        }
    }

    //Esta función nos ayudara a encontrar el usuario y su correo electronico dentro de la base de datos para luego enviar su debido correo electronico y codigo de verificación
    public void Encontrar() {
        
        String cadena = "select * from tbUsuarios where usuario=? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        
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
                mail = st.getString("correo");
                codigo = GenerC(8);
                InsertC(codigo);
                Em(mail, codigo);
                txtCod.setEnabled(true);
                btnVeri.setEnabled(true);
                txtUser.setEnabled(false);
                btnCambiar.setEnabled(false);
                btnEnviar.setEnabled(false);
            } else {
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }        
    }

    //Por medio de esta función se le creara el codigo de verificación que luego sera enviado al usuario por medio de su correo electronico
    public void InsertC(String code) {
        String cadena = "update tbUsuarios set codigoVerif=? "
                + "where usuario=? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        
        PreparedStatement ps;
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena);
            ps.setString(1, code);
            ps.setString(2, txtUser.getText());
            ps.executeUpdate();
            CódigoDSI10 obj = new CódigoDSI10();
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

    //Esta función generara un codigo de verficación con letras y numeros para el usuario
    public String GenerC(int longi) {
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
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbUs2;
    private javax.swing.JLabel lbUs3;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    private Design.TextFieldSV txtCod;
    private Design.PasswordField txtNueva;
    private Design.PasswordField txtNueva2;
    private Design.TextFieldSV txtUser;
    // End of variables declaration//GEN-END:variables
}

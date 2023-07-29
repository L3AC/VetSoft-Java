package AVista;

import AControlador.ctUser;
import java.sql.*;
import Tipografias.Fuentes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import AModelo.Conx;
import AModelo.Crypt;
import Validation.Valida;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import AVista.Registro;
import Design.Desg;
import Design.PasswordField;
import Design.TextFieldSV;
import Mensajes.CodigoErrorDRC2;
import Mensajes.CodigoErrorLI4;
import Mensajes.CodigodeerrorDLI1;
import Mensajes.GlassPanePopup;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.mail.Message;
import javax.swing.ImageIcon;

/**
 *
 * @author Gerson
 */
public class Login extends javax.swing.JFrame {

    Fuentes tipoFuente;
    Desg dsg = new Desg();
    Valida vali = new Valida();
    Crypt cryp = new Crypt();

    private int idTipoU;
    public String lui;
    private int idUs;
    private int idCuenta;

    public Login() {
        initComponents();
        GlassPanePopup.install(this);
        setTitle("VetSoft");
        tipoFuente = new Fuentes();

        Titulo.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 32));
        VetSoft.setFont(tipoFuente.fuente(tipoFuente.COM, 1, 11));
        UsuarioL.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 25));
        PassL.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 22));
        

        txtUser.setDocument(new Valida(30, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtPass.setDocument(new Valida(30, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        setLocationRelativeTo(null);
        String iconPath = "src/Imagenes/logoC.png";
        ImageIcon icon = new ImageIcon(iconPath);
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Design.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRound2 = new Design.PanelRound();
        UsuarioL = new javax.swing.JLabel();
        PassL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnIngresar = new Design.ButtonGradient();
        txtOlvidasteContra = new javax.swing.JLabel();
        txtUser = new Design.TextFieldSV();
        txtPass = new Design.PasswordField();
        Titulo = new javax.swing.JLabel();
        VetSoft = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setResizable(false);

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn IMG1X.png"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 400));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica .png"))); // NOI18N
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 70, 70));

        panelRound2.setBackground(new java.awt.Color(133, 183, 212));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsuarioL.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        UsuarioL.setForeground(new java.awt.Color(27, 73, 101));
        UsuarioL.setText("Usuario");
        panelRound2.add(UsuarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        PassL.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        PassL.setForeground(new java.awt.Color(27, 73, 101));
        PassL.setText("Contraseña");
        panelRound2.add(PassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(27, 73, 101));
        jLabel6.setText("Registro");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        panelRound2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.setColor1(new java.awt.Color(255, 255, 255));
        btnIngresar.setColor2(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panelRound2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 140, -1));

        txtOlvidasteContra.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtOlvidasteContra.setForeground(new java.awt.Color(27, 73, 101));
        txtOlvidasteContra.setText("¿Olvidaste la contraseña?");
        txtOlvidasteContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOlvidasteContraMouseClicked(evt);
            }
        });
        panelRound2.add(txtOlvidasteContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        txtUser.setShadowColor(new java.awt.Color(0, 0, 51));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        panelRound2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 370, 50));

        txtPass.setShadowColor(new java.awt.Color(0, 0, 51));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        panelRound2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 370, 50));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 560, 290));

        Titulo.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(27, 73, 101));
        Titulo.setText("Bienvenido de vuelta");
        panelRound1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        VetSoft.setText("VetSoft+");
        panelRound1.add(VetSoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            List<TextFieldSV> lista = new ArrayList<>();
            List<PasswordField> lista1 = new ArrayList<>();
            lista.add(txtUser);
            lista1.add(txtPass);
            try {
                if (dsg.areFieldsNotEmpty(lista) || dsg.NotEmpty(lista1)) {
                    ctUser ct = new ctUser();
                    ct.usuario = txtUser.getText();
                    ct.contra = cryp.encrypt(txtPass.getText(), "key");
                    ResultSet rs = ct.ValidarLogin();
                    if (rs.next()) {
                        idTipoU = rs.getInt("idTipoUsuario");
                        idUs = rs.getInt("idUsuario");
                        rs.close();
                        SelectID();
                    } else {
                        CodigodeerrorDLI1 obj = new CodigodeerrorDLI1();
                        obj.eventOK(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                GlassPanePopup.closePopupLast();
                            }
                        });
                        GlassPanePopup.showPopup(obj);
                    }

                } else {

                    CodigoErrorLI4 obj = new CodigoErrorLI4();
                    obj.eventOK(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            GlassPanePopup.closePopupLast();
                        }
                    });
                    GlassPanePopup.showPopup(obj);
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString() + " ERROR");
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            Registro newFrame = new Registro();
            newFrame.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtUserKeyPressed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPassKeyTyped

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        //
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed

        //
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtOlvidasteContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOlvidasteContraMouseClicked
        // TODO add your handling code here:

        RecuperacionDeContraseña newFrame = new RecuperacionDeContraseña();
        newFrame.setVisible(true);
        dispose();

    }//GEN-LAST:event_txtOlvidasteContraMouseClicked

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        //vali.minL(txtUser, btnIngresar, 5);
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        //vali.minL(txtPass, btnIngresar, 5);
    }//GEN-LAST:event_txtPassKeyReleased
    public void SelectID() throws SQLException {
        try {
            ctUser ct = new ctUser();
            ct.idTipoUs = idTipoU;
            ct.idUs = idUs;
            ResultSet rs = ct.SelectTipoID();

            if (rs.next()) {
                if (idTipoU == 1) {
                    idCuenta = rs.getInt("idAdministradores");
                }
                if (idTipoU == 2) {
                    idCuenta = rs.getInt("idRecepcionista");
                }
                if (idTipoU == 4) {
                    idCuenta = rs.getInt("idDoctor");
                }
                if (idTipoU == 5) {
                    idCuenta = rs.getInt("idAsistente");
                }

                rs.close();
                Dashboard dash = new Dashboard(idTipoU, idUs, idCuenta);
                dash.setVisible(true);
                this.dispose();
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
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PassL;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel UsuarioL;
    private javax.swing.JLabel VetSoft;
    private Design.ButtonGradient btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    private javax.swing.JLabel txtOlvidasteContra;
    private Design.PasswordField txtPass;
    private Design.TextFieldSV txtUser;
    // End of variables declaration//GEN-END:variables
}

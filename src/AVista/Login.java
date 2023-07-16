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

/**
 *
 * @author Gerson
 */
public class Login extends javax.swing.JFrame {

    Fuentes tipoFuente;

    Crypt cryp = new Crypt();
    
    private int idTipoU;
    private int idUs;
    private int idCuenta;

    public Login() {
        initComponents();
        tipoFuente = new Fuentes();

        Titulo.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 32));
        VetSoft.setFont(tipoFuente.fuente(tipoFuente.COM, 1, 11));
        UsuarioL.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 25));
        PassL.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 22));
        

        TextUser.setDocument(new Valida(15, "[a-zA-Z0-9]*"));
        TextPass.setDocument(new Valida(20, "[a-zA-Z0-9]*"));
        setLocationRelativeTo(null);
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
        buttonGradient1 = new Design.ButtonGradient();
        jLabel7 = new javax.swing.JLabel();
        TextUser = new Design.TextFieldSV();
        TextPass = new Design.PasswordField();
        Titulo = new javax.swing.JLabel();
        VetSoft = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLabel6.setText("\"Registro\"");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        panelRound2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        buttonGradient1.setText("Ingresar");
        buttonGradient1.setColor1(new java.awt.Color(255, 255, 255));
        buttonGradient1.setColor2(new java.awt.Color(255, 255, 255));
        buttonGradient1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        buttonGradient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient1ActionPerformed(evt);
            }
        });
        panelRound2.add(buttonGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 140, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(27, 73, 101));
        jLabel7.setText("¿Olvidaste la contraseña?");
        panelRound2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        TextUser.setShadowColor(new java.awt.Color(153, 0, 153));
        panelRound2.add(TextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 370, 50));

        TextPass.setShadowColor(new java.awt.Color(153, 0, 153));
        panelRound2.add(TextPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 370, 50));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 560, 290));

        Titulo.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(27, 73, 101));
        Titulo.setText("Bienvenido de vuelta");
        panelRound1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

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

    private void buttonGradient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient1ActionPerformed
        try {
            try {
                ctUser ct = new ctUser();
                ct.usuario = TextUser.getText();
                ct.contra = cryp.encrypt(TextPass.getText(), "key");
                System.err.println(cryp.encrypt(TextPass.getText(), "key"));
                ResultSet rs=ct.ValidarLogin();
                if (rs.next()) {
                    idTipoU = rs.getInt("idTipoUsuario");
                    idUs = rs.getInt("idUsuario");
                    rs.close();
                    SelectID();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                }

            } catch (SQLException ex) {
                System.out.println(ex.toString() + " ERROR");
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_buttonGradient1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            // TODO add your handling code here:
            
            Registro newFrame = new Registro();
            newFrame.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel6MouseClicked
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
                JOptionPane.showMessageDialog(null, "No se encontro");
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
    private Design.PasswordField TextPass;
    private Design.TextFieldSV TextUser;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel UsuarioL;
    private javax.swing.JLabel VetSoft;
    private Design.ButtonGradient buttonGradient1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}

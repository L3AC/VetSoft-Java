/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AVista;

import Mensajes.GlassPanePopup;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Arrays;

/**
 *
 * @author Gerson
 */
public final class RecuperacionDeContraseña extends javax.swing.JFrame {

    /**
     * Creates new form RecuperacionDeContraseña
     */
    public RecuperacionDeContraseña() {
        GlassPanePopup.install(this);
        initComponents();
        this.setLocationRelativeTo(null);
        transparente();
        String corridoTumbados;
        this.getContentPane().setBackground(Color.WHITE);

        jLabel1.setFont(new Font("Comfortaa", Font.PLAIN, 18));
        LBRecup.setFont(new Font("Comfortaa", Font.PLAIN, 20));

        setLocationRelativeTo(null);
        String iconPath = "src/Imagenes/logoC.png";
        ImageIcon icon = new ImageIcon(iconPath);
        setIconImage(icon.getImage());
        setTitle("VetSoft");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desg1 = new Design.Desg();
        panelRound2 = new Design.PanelRound();
        panelRound1 = new Design.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        btnUsuario = new Design.ButtonGradient();
        btnPreguntas = new Design.ButtonGradient();
        LBRecup = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setForeground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Escoja el método de recuperación de Contraseña");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 410, -1));

        btnUsuario.setText("Por email");
        btnUsuario.setColor1(new java.awt.Color(255, 255, 255));
        btnUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        panelRound1.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 95, 338, -1));

        btnPreguntas.setText("Preguntas de confianza");
        btnPreguntas.setColor1(new java.awt.Color(255, 255, 255));
        btnPreguntas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreguntasActionPerformed(evt);
            }
        });
        panelRound1.add(btnPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 170, 336, -1));

        panelRound2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 530, 231));

        LBRecup.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LBRecup.setForeground(new java.awt.Color(27, 73, 101));
        LBRecup.setText("Recuperación de Contraseña");
        panelRound2.add(LBRecup, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 321, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panelRound2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        getContentPane().add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void transparente() {
        btnUsuario.setOpaque(false);
        btnUsuario.setContentAreaFilled(false);
        btnUsuario.setBorderPainted(false);
        btnPreguntas.setOpaque(false);
        btnPreguntas.setContentAreaFilled(false);
        btnPreguntas.setBorderPainted(false);
    }

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:

        PorUsuario newFrame = new PorUsuario();

        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreguntasActionPerformed
        // TODO add your handling code here:

        PreguntasDeConfianza newFrame = new PreguntasDeConfianza();

        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPreguntasActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Login newFrame = new Login();

        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(RecuperacionDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperacionDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperacionDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperacionDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperacionDeContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBRecup;
    private Design.ButtonGradient btnPreguntas;
    private Design.ButtonGradient btnUsuario;
    private Design.Desg desg1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}

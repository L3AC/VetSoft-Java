package AVista.Perfil;

import AControlador.ctPreguntas;
import AModelo.Crypt;
import Design.Desg;
import Design.TextFieldSV;
import Validation.Valida;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Preguntas extends javax.swing.JPanel {

    Desg dsg = new Desg();
    Valida vali = new Valida();
    Crypt cryp = new Crypt();
    private int idUs;

    public Preguntas(int idUs) throws SQLException {
        this.idUs = idUs;
        System.out.println(idUs);
        initComponents();
        enab(false);
        btnGuard.setVisible(false);

        loadRes(1, txtResp1);
        loadRes(2, txtResp2);
        loadRes(3, txtResp3);

    }

    final void enab(boolean tf) {
        List<Component> lista = new ArrayList<>();
        lista.add(txtResp1);
        lista.add(txtResp2);
        lista.add(txtResp3);
        dsg.enable(lista, tf);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        lbPreg3 = new javax.swing.JLabel();
        lbPreg1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbPreg2 = new javax.swing.JLabel();
        txtResp1 = new Design.TextFieldSV();
        txtResp2 = new Design.TextFieldSV();
        txtResp3 = new Design.TextFieldSV();
        btnGuard = new Design.ButtonGradient();
        btnAct = new Design.ButtonGradient();

        setBackground(new java.awt.Color(202, 233, 255));
        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPreg3.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lbPreg3.setText("¿Cuál es tu película favorita?");
        PCont.add(lbPreg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        lbPreg1.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lbPreg1.setText("¿Cuál es tu película favorita?");
        PCont.add(lbPreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel4.setText("Preguntas de Seguridad");
        PCont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        lbPreg2.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lbPreg2.setText("¿Cuál es el nombre de tu mejor amigo de la infancia?");
        PCont.add(lbPreg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        txtResp1.setShadowColor(new java.awt.Color(153, 0, 153));
        txtResp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResp1ActionPerformed(evt);
            }
        });
        txtResp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResp1KeyTyped(evt);
            }
        });
        PCont.add(txtResp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 430, -1));

        txtResp2.setShadowColor(new java.awt.Color(153, 0, 153));
        txtResp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResp2ActionPerformed(evt);
            }
        });
        txtResp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResp2KeyTyped(evt);
            }
        });
        PCont.add(txtResp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 430, -1));

        txtResp3.setShadowColor(new java.awt.Color(153, 0, 153));
        txtResp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResp3ActionPerformed(evt);
            }
        });
        txtResp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResp3KeyTyped(evt);
            }
        });
        PCont.add(txtResp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 430, -1));

        btnGuard.setText("Guardar");
        btnGuard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardActionPerformed(evt);
            }
        });
        PCont.add(btnGuard, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 160, 60));

        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        PCont.add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, 160, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtResp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResp1ActionPerformed

    private void txtResp1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResp1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResp1KeyTyped

    private void txtResp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResp2ActionPerformed

    private void txtResp2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResp2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResp2KeyTyped

    private void txtResp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResp3ActionPerformed

    private void txtResp3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResp3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResp3KeyTyped
    private void loadRes(int idPreg, TextFieldSV txt) throws SQLException {
        try {
            ctPreguntas ct = new ctPreguntas();
            ct.idPreg = idPreg;
            ct.idUs = idUs;
            ResultSet rs = ct.loadResp();

            if (rs.next()) {
                txt.setText(rs.getString("respuesta"));
            } else {
                txt.setText("No hay respuesta aun");
            }

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private boolean verifExist(int idPreg, TextFieldSV txt) throws SQLException {
        try {
            ctPreguntas ct = new ctPreguntas();
            ct.idPreg = idPreg;
            ct.idUs = idUs;
            ResultSet rs = ct.loadResp();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.err.println(e.toString());
            return false;
        }
    }

    private void upResp(int idPreg, int idUs, String resp) throws SQLException {
        try {
            ctPreguntas ct = new ctPreguntas();
            ct.idPreg = idPreg;
            System.err.println(idPreg);
            ct.idUs = idUs;
            System.err.println(idUs);
            ct.resp = resp;
            System.err.println(resp);
            ct.updateResp();

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private void insResp(int idPreg, int idUs, String resp) throws SQLException {
        try {
            ctPreguntas ct = new ctPreguntas();
            ct.idPreg = idPreg;
            ct.idUs = idUs;
            ct.resp = resp;
            ct.insertResp();

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private void btnGuardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardActionPerformed

        try {
            if (verifExist(1, txtResp1) && verifExist(2, txtResp2) && verifExist(3, txtResp3)) {
                System.out.println(23);
                upResp(1, idUs, txtResp1.getText());
                upResp(2, idUs, txtResp2.getText());
                upResp(3, idUs, txtResp3.getText());
            } else {
                insResp(1, idUs, txtResp1.getText());
                insResp(2, idUs, txtResp2.getText());
                insResp(3, idUs, txtResp3.getText());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnGuardActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        if (btnGuard.isVisible()) {
            btnAct.setText("Editar");
            enab(false);
            btnGuard.setVisible(false);
        } else {
            btnAct.setText("Cancelar");
            enab(true);
            btnGuard.setVisible(true);
        }
    }//GEN-LAST:event_btnActActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAct;
    private Design.ButtonGradient btnGuard;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbPreg1;
    private javax.swing.JLabel lbPreg2;
    private javax.swing.JLabel lbPreg3;
    private Design.TextFieldSV txtResp1;
    private Design.TextFieldSV txtResp2;
    private Design.TextFieldSV txtResp3;
    // End of variables declaration//GEN-END:variables
}


package AVista.Citas;

import AControlador.ctReceta;
import Design.Desg;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddReceta extends javax.swing.JPanel {

    private int idTipoUs;
    private int idCita;
    private int idCuenta;
    Desg dsg = new Desg();
    public AddReceta(int idTipoUs,int idCuenta,int idCita) {
        this.idCita=idCita;
        this.idTipoUs=idTipoUs;
        this.idCuenta=idCuenta;
        initComponents();
        lbMin.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        txtIns = new Design.TextFieldSV();
        btnAg = new Design.ButtonGradient();
        lbMin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, 60));

        txtIns.setBackground(new java.awt.Color(202, 233, 255));
        txtIns.setShadowColor(new java.awt.Color(0, 0, 51));
        txtIns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInsKeyTyped(evt);
            }
        });
        PCont.add(txtIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 1090, 50));

        btnAg.setText("Agregar");
        btnAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgActionPerformed(evt);
            }
        });
        PCont.add(btnAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 130, 50));

        lbMin.setBackground(new java.awt.Color(0, 0, 0));
        lbMin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 5");
        PCont.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 73, 101));
        jLabel3.setText("AGREGAR RECETA");
        PCont.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Instrucciones a dar");
        PCont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDCita subp = new CRUDCita(idTipoUs,idCuenta);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(AddReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgActionPerformed
       if (txtIns.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
        }else{
        ctReceta ct=new ctReceta();
        ct.idCita=idCita;
        ct.instruc=txtIns.getText();
        ct.insRe();
       }
    }//GEN-LAST:event_btnAgActionPerformed

    private void txtInsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInsKeyReleased

    }//GEN-LAST:event_txtInsKeyReleased

    private void txtInsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInsKeyTyped
        // TODO add your handling code here:
        
        if(txtIns.getText().length()>= 4){
            lbMin.setVisible(false);
        }else {
            lbMin.setVisible(true);
        } 
    }//GEN-LAST:event_txtInsKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAg;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbMin;
    private Design.TextFieldSV txtIns;
    // End of variables declaration//GEN-END:variables
}

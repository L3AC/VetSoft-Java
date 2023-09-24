package AVista.Citas;

import AControlador.ctExam;
import AControlador.ctReceta;
import Design.Desg;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class upReceta extends javax.swing.JPanel {

    private int idTipoUs;
    private int idRe;
    private int idCita;
    private int idCuenta;
    Desg dsg = new Desg();

    public upReceta(int idTipoUs, int idCuenta, int idCita) {
        this.idCita = idCita;
        this.idTipoUs = idTipoUs;
        this.idCuenta = idCuenta;
        initComponents();
        loadData();
        LbMin.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        txtIns = new Design.TextFieldSV();
        btnElim = new Design.ButtonGradient();
        LbMin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAct = new Design.ButtonGradient();
        btnReport = new Design.ButtonGradient();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        btnBack.setBackground(new java.awt.Color(190, 233, 232));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtIns.setShadowColor(new java.awt.Color(0, 0, 51));
        txtIns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInsKeyTyped(evt);
            }
        });

        btnElim.setForeground(new java.awt.Color(0, 0, 0));
        btnElim.setText("Eliminar");
        btnElim.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        LbMin.setBackground(new java.awt.Color(0, 0, 0));
        LbMin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LbMin.setForeground(new java.awt.Color(0, 0, 0));
        LbMin.setText("Minimo de digitos 5");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ACTUALIZAR RECETA");

        btnAct.setForeground(new java.awt.Color(0, 0, 0));
        btnAct.setText("Actualizar");
        btnAct.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        btnReport.setForeground(new java.awt.Color(0, 0, 0));
        btnReport.setText("Reporte");
        btnReport.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Instrucciones a dar");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330)
                        .addComponent(jLabel3))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(570, 570, 570)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(txtIns, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(LbMin)))
                .addGap(110, 110, 110))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(100, 100, 100)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(txtIns, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LbMin)
                .addGap(95, 95, 95)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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

    final void loadData() {
        try {
            ctReceta ct = new ctReceta();
            ct.idCita = idCita;

            ResultSet rs = ct.verifR();
            while (rs.next()) {
                idRe = rs.getInt("idReceta");
                txtIns.setText(rs.getString("instrucciones"));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDCita subp = new CRUDCita(idTipoUs, idCuenta);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(AddReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtInsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInsKeyReleased
        if(txtIns.getText().length()>= 5){
            LbMin.setVisible(false);
        }else {
            LbMin.setVisible(true);
            
        } 
        /*try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(HVacunas.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_txtInsKeyReleased

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        try {
            ctReceta ct = new ctReceta();
            ct.idRe = idRe;
            ct.dlRe();
            CRUDCita subp = new CRUDCita(idTipoUs, idCuenta);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(upReceta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnElimActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
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
        ctReceta ct = new ctReceta();
        ct.idRe = idRe;
        ct.instruc = txtIns.getText();
        ct.upRe();
        }
    }//GEN-LAST:event_btnActActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        HashMap<String, Object> param = new HashMap<>();
        param.put("idRe", idRe);
        dsg.reportS("Receta", "src/AVista/Citas/Receta.jasper", param);
    }//GEN-LAST:event_btnReportActionPerformed

    private void txtInsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInsKeyTyped
        // TODO add your handling code here:
         if(txtIns.getText().length()>= 4){
            LbMin.setVisible(false);
        }else {
            LbMin.setVisible(true);
            
        } 
    }//GEN-LAST:event_txtInsKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbMin;
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAct;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnElim;
    private Design.ButtonGradient btnReport;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private Design.TextFieldSV txtIns;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Citas;

import AControlador.ctDoctores;
import AControlador.ctEsp;
import AControlador.ctTipoServ;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author LEAC2
 */
public class insertCita extends javax.swing.JPanel {

    private int idTipoUs;
    private int idAnim;
    Desg dsg = new Desg();
    Map<Integer, String> cbServ = new HashMap<>();
    Map<Integer, String> cbAre = new HashMap<>();
    Map<Integer, String> cbDoct = new HashMap<>();

    public insertCita(int idTipoUs, int idAnim) throws SQLException {
        this.idTipoUs=idTipoUs;
        this.idAnim=idAnim;
        initComponents();
        loadComboServ(cbServicio);
        loadComboEsp(cbEsp);
        loadComboDoc(cbDoc);
        precio();
    }

    private void loadComboServ(JComboBox cb) throws SQLException {
        ctTipoServ ct = new ctTipoServ();
        ResultSet rs = ct.comboServ();
        while (rs.next()) {
            int idTP = rs.getInt("idTipoServicio");
            String nombre = rs.getString("Nombre");
            cb.addItem(nombre);
            cbServ.put(idTP, nombre);
        }
        cb.setSelectedIndex(0);
    }

    private void loadComboEsp(JComboBox cb) throws SQLException {
        ctEsp ct = new ctEsp();
        cbAre.clear();
        cb.removeAllItems();
        ResultSet rs = ct.loadEsp();
        while (rs.next()) {
            int idTP = rs.getInt("idEspecialidad");
            String nombre = rs.getString("Especialidad");
            cb.addItem(nombre);
            cbAre.put(idTP, nombre);
        }
        cb.setSelectedIndex(0);
    }

    private void loadComboDoc(JComboBox cb) throws SQLException {
        ctDoctores ct = new ctDoctores();
        ct.idEsp=dsg.getMap(cbAre, cbEsp.getSelectedItem().toString());
        cbDoct.clear();
        cb.removeAllItems();
        ResultSet rs = ct.comboDoc();
        while (rs.next()) {
            int idTP = rs.getInt("idDoctor");
            String nombre = rs.getString("nombre");
            cb.addItem(nombre);
            cbDoct.put(idTP, nombre);
        }
        
    }
    private void precio() throws SQLException{
        ctTipoServ ct = new ctTipoServ();
        ct.idTipoServ=dsg.getMap(cbServ, cbServicio.getSelectedItem().toString());
        ResultSet rs = ct.selectServ();
        while (rs.next()) {
            lbCosto.setText("Costo: $"+String.valueOf(rs.getDouble("costo")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        lbEsp1 = new javax.swing.JLabel();
        cbEsp = new javax.swing.JComboBox<>();
        cbServicio = new javax.swing.JComboBox<>();
        lbEsp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbCosto = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNotaCl = new Design.TextFieldSV();
        txtNotaD = new Design.TextFieldSV();
        lbEsp2 = new javax.swing.JLabel();
        cbDoc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnConfirm = new Design.ButtonGradient();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 22, 70, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 73, 101));
        jLabel2.setText("AGENDAR CITA");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 250, -1));

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbEsp1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp1.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp1.setText("Servicio");
        panelRound1.add(lbEsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 80, -1));

        cbEsp.setBackground(new java.awt.Color(255, 255, 255));
        cbEsp.setForeground(new java.awt.Color(0, 0, 0));
        cbEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspActionPerformed(evt);
            }
        });
        panelRound1.add(cbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 240, 40));

        cbServicio.setBackground(new java.awt.Color(255, 255, 255));
        cbServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbServicioActionPerformed(evt);
            }
        });
        panelRound1.add(cbServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 240, 40));

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp.setText("Área médica");
        panelRound1.add(lbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 110, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nota del cliente");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 140, 30));

        lbCosto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCosto.setForeground(new java.awt.Color(0, 0, 0));
        lbCosto.setText("Costo");
        panelRound1.add(lbCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 180, 30));
        panelRound1.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 270, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Fecha:");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 80, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Hora:");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 100, 30));

        cbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });
        panelRound1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 120, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nota del doctor");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 150, 30));
        panelRound1.add(txtNotaCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 920, 50));
        panelRound1.add(txtNotaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 920, 50));

        lbEsp2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp2.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp2.setText("Doctor");
        panelRound1.add(lbEsp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 70, -1));

        cbDoc.setBackground(new java.awt.Color(255, 255, 255));
        cbDoc.setForeground(new java.awt.Color(0, 0, 0));
        cbDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDocActionPerformed(evt);
            }
        });
        panelRound1.add(cbDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 240, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Disponible");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 180, 30));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 1010, 530));

        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 670, 150, 60));

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
        /*try {
            CRUDAnimales subp = new CRUDAnimales(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(updtAnimales.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbServicioActionPerformed
        try {
            precio();
        } catch (SQLException ex) {
            Logger.getLogger(insertCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbServicioActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        /*SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        ctAnimales ct = new ctAnimales();
        ct.idRaza = dsg.getMap(cbMapRa, cbEsp.getSelectedItem().toString());
        ct.idAnimal = idAnim;
        ct.nombre = txtNombre.getText();
        ct.peso = txtPeso.getText();
        ct.edad = dt.format(dpNaci.getCalendar().getTime());
        ct.padecimientos = txtPad.getText();
        ct.sexo = cbSexo.getSelectedItem().toString();
        ct.updtAnim();*/
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void cbEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspActionPerformed
        try {
            loadComboDoc(cbDoc);
        } catch (SQLException ex) {
            Logger.getLogger(insertCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbEspActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void cbDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDocActionPerformed
        /*try {
            //loadComboDoc(cbEsp);
        } catch (SQLException ex) {
            Logger.getLogger(insertCita.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_cbDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JComboBox<String> cbDoc;
    private javax.swing.JComboBox<String> cbEsp;
    private javax.swing.JComboBox<String> cbServicio;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbCosto;
    private javax.swing.JLabel lbEsp;
    private javax.swing.JLabel lbEsp1;
    private javax.swing.JLabel lbEsp2;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtNotaCl;
    private Design.TextFieldSV txtNotaD;
    // End of variables declaration//GEN-END:variables
}

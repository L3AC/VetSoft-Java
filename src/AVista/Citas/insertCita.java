/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Citas;

import AControlador.ctCitas;
import AControlador.ctDoctores;
import AControlador.ctEsp;
import AControlador.ctTipoServ;
import AVista.Animales.CRUDAnimales;
import AVista.Animales.updtAnimales;
import Design.Desg;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import Validation.Valida;

/**
 *
 * @author LEAC2
 */
public class insertCita extends javax.swing.JPanel {

    private int idTipoUs;
    private int idAnim;
    private int idNivelServ;
    Desg dsg = new Desg();
    Map<Integer, String> cbServ = new HashMap<>();
    Map<Integer, String> cbAre = new HashMap<>();
    Map<Integer, String> cbDoct = new HashMap<>();
    SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

    public insertCita(int idTipoUs, int idAnim,int idNivelServ) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idAnim = idAnim;
        this.idNivelServ=idNivelServ;
        initComponents();

        txtNotaCl.setDocument(new Valida(200, "[a-zA-Z0-9 ]*"));
        txtNotaD.setDocument(new Valida(200, "[a-zA-Z0-9 ]*"));
        Calendar today = Calendar.getInstance();
        today.add(Calendar.DAY_OF_MONTH, 1);
        dpFecha.setDate(today.getTime());
        dpFecha.setMinSelectableDate(today.getTime());
        loadComboServ(cbServicio);
        loadComboEsp(cbEsp);
        loadComboDoc(cbDoc);
        precio();
    }

    private void loadComboServ(JComboBox cb) throws SQLException {
        ctTipoServ ct = new ctTipoServ();
        ct.idNivelServ=idNivelServ;
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
        ct.idEsp = dsg.getMap(cbAre, cbEsp.getSelectedItem().toString());
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

    private void precio() throws SQLException {
        ctTipoServ ct = new ctTipoServ();
        ct.idTipoServ = dsg.getMap(cbServ, cbServicio.getSelectedItem().toString());
        ResultSet rs = ct.selectServ();
        while (rs.next()) {
            lbCosto.setText("Costo: $" + String.valueOf(rs.getDouble("costo")));
        }
    }

    private void dispo() throws SQLException {
        ctCitas ct = new ctCitas();
        if (cbDoct.isEmpty()) {

        } else {
            ct.idDoctor = dsg.getMap(cbDoct, cbDoc.getSelectedItem().toString());
            ct.fecha = dt.format(dpFecha.getCalendar().getTime());
            ct.hora = cbHora.getSelectedItem().toString();
            System.err.println(dt.format(dpFecha.getCalendar().getTime()) + " " + cbHora.getSelectedItem().toString());
            ResultSet rs = ct.verifDispo();
            if (rs.next()) {
                lbDispo.setText("No disponible");
                btnConfirm.setEnabled(false);
            } else {
                lbDispo.setText("Disponible");
                btnConfirm.setEnabled(true);
            }
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
        dpFecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbHora = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNotaCl = new Design.TextFieldSV();
        txtNotaD = new Design.TextFieldSV();
        lbEsp2 = new javax.swing.JLabel();
        cbDoc = new javax.swing.JComboBox<>();
        lbDispo = new javax.swing.JLabel();
        btnConfirm = new Design.ButtonGradient();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("AGENDAR CITA");

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbEsp1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp1.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp1.setText("Servicio");
        panelRound1.add(lbEsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 80, -1));

        cbEsp.setBackground(new java.awt.Color(190, 233, 232));
        cbEsp.setForeground(new java.awt.Color(0, 0, 0));
        cbEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspActionPerformed(evt);
            }
        });
        panelRound1.add(cbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 240, 40));

        cbServicio.setBackground(new java.awt.Color(190, 233, 232));
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
        panelRound1.add(dpFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 270, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Fecha:");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 80, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Hora:");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 100, 30));

        cbHora.setBackground(new java.awt.Color(190, 233, 232));
        cbHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbHora.setForeground(new java.awt.Color(0, 0, 0));
        cbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00" }));
        cbHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHoraActionPerformed(evt);
            }
        });
        panelRound1.add(cbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 120, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nota del doctor");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 150, 30));

        txtNotaCl.setBackground(new java.awt.Color(190, 233, 232));
        txtNotaCl.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtNotaCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 920, 50));

        txtNotaD.setBackground(new java.awt.Color(190, 233, 232));
        txtNotaD.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtNotaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 920, 50));

        lbEsp2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp2.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp2.setText("Doctor");
        panelRound1.add(lbEsp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 70, -1));

        cbDoc.setBackground(new java.awt.Color(190, 233, 232));
        cbDoc.setForeground(new java.awt.Color(0, 0, 0));
        cbDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDocActionPerformed(evt);
            }
        });
        panelRound1.add(cbDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 240, 40));

        lbDispo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDispo.setForeground(new java.awt.Color(0, 0, 0));
        lbDispo.setText("Disponible");
        panelRound1.add(lbDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 180, 30));

        btnConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("Confirmar");
        btnConfirm.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel5.setText("VetSoft+");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(429, 429, 429)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(430, 430, 430)
                .addComponent(jLabel4))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(1240, 1240, 1240)
                .addComponent(jLabel5))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDAnimales subp = new CRUDAnimales(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDAnimales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbServicioActionPerformed
        try {
            precio();
        } catch (SQLException ex) {
            Logger.getLogger(insertCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbServicioActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        ctCitas ct = new ctCitas();

        ct.idAnimal = idAnim;
        ct.idTipoServicio = dsg.getMap(cbServ, cbServicio.getSelectedItem().toString());
        ct.idDoctor = dsg.getMap(cbDoct, cbDoc.getSelectedItem().toString());
        ct.notaDelCliente = txtNotaCl.getText();
        ct.notaDelDoctor = txtNotaD.getText();
        ct.fecha = dt.format(dpFecha.getCalendar().getTime());
        ct.hora = cbHora.getSelectedItem().toString();
        System.err.println(dt.format(dpFecha.getCalendar().getTime()) + " " + cbHora.getSelectedItem().toString());
        ct.insertCita();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void cbEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspActionPerformed
        try {
            loadComboDoc(cbDoc);
            dispo();
        } catch (SQLException ex) {
            Logger.getLogger(insertCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbEspActionPerformed

    private void cbHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHoraActionPerformed
        try {
            dispo();
        } catch (SQLException ex) {
            Logger.getLogger(insertCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbHoraActionPerformed

    private void cbDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDocActionPerformed
        try {
            dispo();
        } catch (SQLException ex) {
            Logger.getLogger(insertCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JComboBox<String> cbDoc;
    private javax.swing.JComboBox<String> cbEsp;
    private javax.swing.JComboBox<String> cbHora;
    private javax.swing.JComboBox<String> cbServicio;
    private com.toedter.calendar.JDateChooser dpFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbCosto;
    private javax.swing.JLabel lbDispo;
    private javax.swing.JLabel lbEsp;
    private javax.swing.JLabel lbEsp1;
    private javax.swing.JLabel lbEsp2;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtNotaCl;
    private Design.TextFieldSV txtNotaD;
    // End of variables declaration//GEN-END:variables
}

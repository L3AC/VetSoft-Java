/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Citas;

import AControlador.ctCitas;
import AControlador.ctDoctores;
import AControlador.ctEsp;
import AControlador.ctTipoServ;
import Design.Desg;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import Validation.Valida;

public class updtCita extends javax.swing.JPanel {

    private int idTipoUs;
    private int idCita;
    private int idCuenta;
    Desg dsg = new Desg();
    Map<Integer, String> cbServ = new HashMap<>();
    Map<Integer, String> cbAre = new HashMap<>();
    Map<Integer, String> cbDoct = new HashMap<>();
    SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

    public updtCita(int idTipoUs, int idCita, int idCuenta) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idCita = idCita;
        this.idCuenta = idCuenta;
        initComponents();
        loadComboServ(cbServicio);
        loadComboEsp(cbEsp);
        loadComboDoc(cbDoc);
        precio();

        btnConfirm.setVisible(false);
        enab(false);
        
        txtNotaCl.setDocument(new Valida(200, "[a-zA-Z0-9 ]*"));
        txtNotaD.setDocument(new Valida(200, "[a-zA-Z0-9 ]*"));
        Calendar today = Calendar.getInstance();
        today.add(Calendar.DAY_OF_MONTH, 1);
        
        dpFecha.setDate(today.getTime());
        dpFecha.setMinSelectableDate(today.getTime());
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        lbEsp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbDispo = new javax.swing.JLabel();
        dpFecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNotaCl = new Design.TextFieldSV();
        txtNotaD = new Design.TextFieldSV();
        lbEsp2 = new javax.swing.JLabel();
        lbCosto = new javax.swing.JLabel();
        cbServicio = new javax.swing.JComboBox<>();
        cbEsp = new javax.swing.JComboBox<>();
        cbDoc = new javax.swing.JComboBox<>();
        cbHora = new javax.swing.JComboBox<>();
        lbEsp3 = new javax.swing.JLabel();
        btnEditar = new Design.ButtonGradient();
        btnConfirm = new Design.ButtonGradient();
        lbMasc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEditar1 = new Design.ButtonGradient();

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
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 52, 70, 60));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(27, 73, 101));
        lbTitulo.setText("INFORMACIÓN CITA");
        PCont.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 360, -1));

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp.setText("Área médica");
        panelRound1.add(lbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 110, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nota del cliente");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 140, 30));

        lbDispo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDispo.setForeground(new java.awt.Color(0, 0, 0));
        lbDispo.setText("Disponible");
        panelRound1.add(lbDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 180, 30));
        panelRound1.add(dpFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 270, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Fecha:");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 80, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Hora:");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nota del doctor");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 150, 30));

        txtNotaCl.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtNotaCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 920, 50));

        txtNotaD.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtNotaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 920, 50));

        lbEsp2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp2.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp2.setText("Doctor");
        panelRound1.add(lbEsp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 70, -1));

        lbCosto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCosto.setForeground(new java.awt.Color(0, 0, 0));
        lbCosto.setText("Costo");
        panelRound1.add(lbCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 180, 30));

        cbServicio.setBackground(new java.awt.Color(255, 255, 255));
        cbServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbServicioActionPerformed(evt);
            }
        });
        panelRound1.add(cbServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 240, 40));

        cbEsp.setBackground(new java.awt.Color(255, 255, 255));
        cbEsp.setForeground(new java.awt.Color(0, 0, 0));
        cbEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspActionPerformed(evt);
            }
        });
        panelRound1.add(cbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 240, 40));

        cbDoc.setBackground(new java.awt.Color(255, 255, 255));
        cbDoc.setForeground(new java.awt.Color(0, 0, 0));
        cbDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDocActionPerformed(evt);
            }
        });
        panelRound1.add(cbDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 240, 40));

        cbHora.setBackground(new java.awt.Color(255, 255, 255));
        cbHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbHora.setForeground(new java.awt.Color(0, 0, 0));
        cbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00:00", "8:00:00", "9:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00", "17:00:00", "18:00:00", "19:00:00", "20:00:00", "21:00:00" }));
        cbHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHoraActionPerformed(evt);
            }
        });
        panelRound1.add(cbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 120, 50));

        lbEsp3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp3.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp3.setText("Servicio");
        panelRound1.add(lbEsp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 80, -1));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 150, 1010, 530));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PCont.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 700, 150, 60));

        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 700, 150, 60));

        lbMasc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMasc.setForeground(new java.awt.Color(0, 0, 0));
        lbMasc.setText("Mascota:");
        PCont.add(lbMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 66, 440, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, -1, -1));

        jLabel4.setText("VetSoft+");
        PCont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 90, -1, -1));

        btnEditar1.setText("Editar");
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });
        PCont.add(btnEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 700, 150, 60));

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

    final void loadData() throws SQLException {
        try {
            ctCitas ct = new ctCitas();
            ct.idCita = idCita;

            ResultSet rs = ct.selectCita();
            while (rs.next()) {
                lbMasc.setText("Mascota: "+rs.getString("Animal"));
                cbServicio.setSelectedItem(rs.getString("Serv"));
                cbEsp.setSelectedItem(rs.getString("Especialidad"));
                cbDoc.setSelectedItem(rs.getString("Doctor"));
                dpFecha.setDate(rs.getDate("Fecha"));
                String hora=rs.getString("hora")+"";
                cbHora.setSelectedItem(hora);
                System.out.println(rs.getString("Hora")+" "+cbHora.getSelectedItem().toString());
                txtNotaCl.setText(rs.getString("notaDelCliente"));
                txtNotaD.setText(rs.getString("notaDelDoctor"));
                
            }
        } catch (Exception e) {
            System.err.println(e.toString());
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
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDCita subp = new CRUDCita(idTipoUs, idCuenta);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(updtCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (btnConfirm.isVisible()) {
            btnEditar.setText("Editar");
            enab(false);
            btnConfirm.setVisible(false);
        } else {
            btnEditar.setText("Cancelar");
            enab(true);
            btnConfirm.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    final void enab(boolean tf) {
        List<Component> lista = new ArrayList<>();
        lista.add(cbServicio);
        lista.add(cbEsp);
        lista.add(cbDoc);
        lista.add(dpFecha);
        lista.add(cbHora);
        lista.add(txtNotaCl);
        lista.add(txtNotaD);
        dsg.enable(lista, tf);

    }
    private void cbServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbServicioActionPerformed
        try {
            precio();
        } catch (SQLException ex) {
            Logger.getLogger(updtCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbServicioActionPerformed

    private void cbEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspActionPerformed
        try {
            loadComboDoc(cbDoc);
            dispo();
        } catch (SQLException ex) {
            Logger.getLogger(updtCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbEspActionPerformed

    private void cbDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDocActionPerformed
        try {
            dispo();
        } catch (SQLException ex) {
            Logger.getLogger(updtCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbDocActionPerformed

    private void cbHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHoraActionPerformed
        try {
            dispo();
        } catch (SQLException ex) {
            Logger.getLogger(updtCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbHoraActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        ctCitas ct = new ctCitas();

        ct.idCita = idCita;
        ct.idTipoServicio = dsg.getMap(cbServ, cbServicio.getSelectedItem().toString());
        ct.idDoctor = dsg.getMap(cbDoct, cbDoc.getSelectedItem().toString());
        ct.notaDelCliente = txtNotaCl.getText();
        ct.notaDelDoctor = txtNotaD.getText();
        ct.fecha = dt.format(dpFecha.getCalendar().getTime());
        ct.hora = cbHora.getSelectedItem().toString();
        System.err.println(dt.format(dpFecha.getCalendar().getTime()) + " " + cbHora.getSelectedItem().toString());
        ct.updtCita();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEditar1;
    private javax.swing.JComboBox<String> cbDoc;
    private javax.swing.JComboBox<String> cbEsp;
    private javax.swing.JComboBox<String> cbHora;
    private javax.swing.JComboBox<String> cbServicio;
    private com.toedter.calendar.JDateChooser dpFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbCosto;
    private javax.swing.JLabel lbDispo;
    private javax.swing.JLabel lbEsp;
    private javax.swing.JLabel lbEsp2;
    private javax.swing.JLabel lbEsp3;
    private javax.swing.JLabel lbMasc;
    private javax.swing.JLabel lbTitulo;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtNotaCl;
    private Design.TextFieldSV txtNotaD;
    // End of variables declaration//GEN-END:variables
}

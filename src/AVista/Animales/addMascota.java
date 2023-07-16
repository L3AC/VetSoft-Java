/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Animales;

import AControlador.ctAnimales;
import AControlador.ctEsp;
import AControlador.ctRaza;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class addMascota extends javax.swing.JPanel {

    private int idTipoUs;
    private int idCl;
    Desg dsg = new Desg();
    Map<Integer, String> cbMap = new HashMap<>();
    Map<Integer, String> cbMapRa = new HashMap<>();

    public addMascota(int idTipoUs, int idCl) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idCl = idCl;
        initComponents();
        loadComboTP(cbTipoA);
        loadComboRaza(cbRaza);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        lbEsp = new javax.swing.JLabel();
        cbRaza = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbTipoA = new javax.swing.JComboBox<>();
        lbEsp1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPad = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setText("Raza");
        PCont.add(lbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 40, -1));

        PCont.add(cbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 240, 40));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 70, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("REGISTRAR MASCOTA");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 360, -1));

        cbTipoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoAActionPerformed(evt);
            }
        });
        PCont.add(cbTipoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 240, 40));

        lbEsp1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp1.setText("Tipo de animal");
        PCont.add(lbEsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 130, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Nombre");
        PCont.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 100, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PCont.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 270, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Nacimiento (Aproximado)");
        PCont.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 250, 30));
        PCont.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 270, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Padecimientos");
        PCont.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 150, 30));

        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PCont.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 270, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Peso");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 100, 30));

        txtPad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PCont.add(txtPad, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 360, 50));

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 610, 150, 70));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hembra", "Macho" }));
        PCont.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 210, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Sexo");
        PCont.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 100, 30));

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
    private void loadComboTP(JComboBox cb) throws SQLException {
        ctRaza ct = new ctRaza();
        ResultSet rs = ct.loadTPanimal();
        while (rs.next()) {
            int idTP = rs.getInt("idTipoAnimal");
            String nombre = rs.getString("nombrePopular");
            cb.addItem(nombre);
            cbMap.put(idTP, nombre);
        }
        cb.setSelectedIndex(0);
    }

    private void loadComboRaza(JComboBox cb) throws SQLException {
        ctRaza ct = new ctRaza();
        cbMapRa.clear();
        cb.removeAllItems();
        ct.idTipoAnimal = dsg.getMap(cbMap, cbTipoA.getSelectedItem().toString());
        ResultSet rs = ct.loadRaza();
        while (rs.next()) {
            int idTP = rs.getInt("idRaza");
            String nombre = rs.getString("nombreRaza");
            cb.addItem(nombre);
            cbMapRa.put(idTP, nombre);
        }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDAnimales subp = new CRUDAnimales(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(addMascota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        ctAnimales ct = new ctAnimales();
        ct.idRaza=dsg.getMap(cbMapRa, cbRaza.getSelectedItem().toString());
        ct.idCliente=idCl;
        ct.nombre=txtNombre.getText();
        ct.peso=txtPeso.getText();
        ct.edad=dt.format(dpNaci.getCalendar().getTime());
        ct.padecimientos=txtPad.getText();
        ct.sexo=cbSexo.getSelectedItem().toString();
        ct.insertAnim();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void cbTipoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoAActionPerformed
        try {
            loadComboRaza(cbRaza);
        } catch (SQLException ex) {
            Logger.getLogger(addMascota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbTipoAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbRaza;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoA;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbEsp;
    private javax.swing.JLabel lbEsp1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPad;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}

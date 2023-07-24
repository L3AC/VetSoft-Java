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
import Validation.Valida;
import java.util.Calendar;

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
               
        txtNombre.setDocument(new Valida(25, "[a-zA-Z ]*"));
        txtPeso.setDocument(new Valida(30, "[a-zA-Z0-9]*"));
        txtPad.setDocument(new Valida(300, "[a-zA-Z0-9 ]*"));
        dpNaci.setMaxSelectableDate(Calendar.getInstance().getTime());
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbRaza = new javax.swing.JComboBox<>();
        lbEsp = new javax.swing.JLabel();
        cbTipoA = new javax.swing.JComboBox<>();
        lbEsp1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new Design.TextFieldSV();
        txtPeso = new Design.TextFieldSV();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPad = new Design.TextFieldSV();
        btnConfirm = new Design.ButtonGradient();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 73, 101));
        jLabel2.setText("REGISTRAR MASCOTA");

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hembra", "Macho" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });
        panelRound1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 220, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sexo");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 50, 30));

        cbRaza.setBackground(new java.awt.Color(255, 255, 255));
        cbRaza.setForeground(new java.awt.Color(0, 0, 0));
        panelRound1.add(cbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 240, 40));

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp.setText("Raza");
        panelRound1.add(lbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 40, -1));

        cbTipoA.setBackground(new java.awt.Color(255, 255, 255));
        cbTipoA.setForeground(new java.awt.Color(0, 0, 0));
        cbTipoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoAActionPerformed(evt);
            }
        });
        panelRound1.add(cbTipoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 240, 40));

        lbEsp1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp1.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp1.setText("Tipo de animal");
        panelRound1.add(lbEsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 130, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nacimiento (Aproximado)");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 250, 30));

        dpNaci.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 220, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 30));

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 250, 50));

        txtPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtPeso.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 190, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Peso");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Padecimientos");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 120, 30));

        txtPad.setForeground(new java.awt.Color(0, 0, 0));
        txtPad.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtPad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 710, 50));

        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel7.setText("VetSoft+");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33))))
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(558, 558, 558)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 282, Short.MAX_VALUE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
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
        ResultSet rs = ct.comboRaza();
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

    private void cbTipoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoAActionPerformed
        try {
            loadComboRaza(cbRaza);
        } catch (SQLException ex) {
            Logger.getLogger(addMascota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbTipoAActionPerformed

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

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JComboBox<String> cbRaza;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoA;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbEsp;
    private javax.swing.JLabel lbEsp1;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtNombre;
    private Design.TextFieldSV txtPad;
    private Design.TextFieldSV txtPeso;
    // End of variables declaration//GEN-END:variables
}

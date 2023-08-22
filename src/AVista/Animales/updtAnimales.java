/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Animales;

import AControlador.ctAnimales;
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

/**
 *
 * @author LEAC2
 */
public class updtAnimales extends javax.swing.JPanel {

    private int idTipoUs;
    private int idAnim;
    Desg dsg = new Desg();
    Map<Integer, String> cbMap = new HashMap<>();
    Map<Integer, String> cbMapRa = new HashMap<>();

    
    
    public updtAnimales(int idAnim) throws SQLException {
        this.idAnim = idAnim;
        initComponents();
        
        txtNombre.setDocument(new Valida(25, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtPeso.setDocument(new Valida(30, "[a-zA-Z0-9 .]*"));
        txtPad.setDocument(new Valida(300, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        dpNaci.setMaxSelectableDate(Calendar.getInstance().getTime());
        lbMin.setVisible(false);
        
        loadComboTP(cbTipoA);
        loadComboRaza(cbRaza);
        loadData();
    }

    final void loadData() throws SQLException {
        try {
            ctAnimales ct = new ctAnimales();
            ct.idAnimal = idAnim;

            ResultSet rs = ct.selectAnim();
            while (rs.next()) {
                txtNombre.setText(rs.getString("Nombre"));
                System.out.println(rs.getString("Nombre"));
                txtPeso.setText(rs.getString("Peso"));
                txtPad.setText(rs.getString("Padecimientos"));
                dpNaci.setDate(rs.getDate("edad"));
                cbTipoA.setSelectedItem(rs.getString("nombrePopular"));
                cbRaza.setSelectedItem(rs.getString("nombreRaza"));
                cbSexo.setSelectedItem(rs.getString("sexo"));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        lbEsp1 = new javax.swing.JLabel();
        cbRaza = new javax.swing.JComboBox<>();
        cbTipoA = new javax.swing.JComboBox<>();
        lbEsp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbMin = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new Design.TextFieldSV();
        txtPeso = new Design.TextFieldSV();
        txtPad = new Design.TextFieldSV();
        jLabel10 = new javax.swing.JLabel();
        btnConfirm = new Design.ButtonGradient();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setPreferredSize(new java.awt.Dimension(1320, 810));

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
        jLabel2.setText("ACTUALIZAR MASCOTA");

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbEsp1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp1.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp1.setText("Tipo de animal");
        panelRound1.add(lbEsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 130, -1));

        cbRaza.setBackground(new java.awt.Color(255, 255, 255));
        cbRaza.setForeground(new java.awt.Color(0, 0, 0));
        panelRound1.add(cbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 240, 40));

        cbTipoA.setBackground(new java.awt.Color(255, 255, 255));
        cbTipoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoAActionPerformed(evt);
            }
        });
        panelRound1.add(cbTipoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 240, 40));

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp.setText("Raza");
        panelRound1.add(lbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 40, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Peso");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 100, 30));

        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 3");
        panelRound1.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 120, 30));
        panelRound1.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 270, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nacimiento (Aproximado)");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 250, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sexo");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 100, 30));

        cbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hembra", "Macho" }));
        panelRound1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 210, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Padecimientos");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 150, 30));

        txtNombre.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 280, 50));

        txtPeso.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 270, 50));

        txtPad.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtPad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 710, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 100, 30));

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
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)))
                .addGap(35, 35, 35))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(578, 578, 578))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoAActionPerformed
        try {
            loadComboRaza(cbRaza);
        } catch (SQLException ex) {
            Logger.getLogger(updtAnimales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbTipoAActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDAnimales subp = new CRUDAnimales(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(updtAnimales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        ctAnimales ct = new ctAnimales();
        ct.idRaza = dsg.getMap(cbMapRa, cbRaza.getSelectedItem().toString());
        ct.idAnimal = idAnim;
        ct.nombre = txtNombre.getText();
        ct.peso = txtPeso.getText();
        ct.edad = dt.format(dpNaci.getCalendar().getTime());
        ct.padecimientos = txtPad.getText();
        ct.sexo = cbSexo.getSelectedItem().toString();
        ct.updtAnim();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        if(txtNombre.getText().length()>= 2){
            lbMin.setVisible(false);
        }else {
            lbMin.setVisible(true);
        } 
    }//GEN-LAST:event_txtNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JComboBox<String> cbRaza;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoA;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbEsp;
    private javax.swing.JLabel lbEsp1;
    private javax.swing.JLabel lbMin;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtNombre;
    private Design.TextFieldSV txtPad;
    private Design.TextFieldSV txtPeso;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.CUENTA;

import AControlador.ctAsistente;
import AControlador.ctCliente;
import AControlador.ctDoctores;
import AControlador.ctEsp;
import AControlador.ctRecep;
import AControlador.ctUser;
import AVista.Usuarios.CRUDusuarios;
import AVista.Usuarios.insertUs;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class insertTipoCuenta extends javax.swing.JPanel {

    private int idTipoUs;
    private int idUs;
    private int nivelRow;
    ctEsp ct = new ctEsp();
    Desg dsg = new Desg();
    Map<Integer, String> cbMap = new HashMap<>();

    public insertTipoCuenta(int idTipoUs, int idUs, int nivelRow) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idUs = idUs;
        this.nivelRow = nivelRow;
        initComponents();

        if (idTipoUs == 1) {
            if (nivelRow != 4) {
                lbEsp.setVisible(false);
                cbEsp.setVisible(false);

            } else {
                loadCombo(cbEsp);
                cbEsp.setSelectedIndex(0);
            }
            if (nivelRow != 3) {
                lbDir.setVisible(false);
                txtDir.setVisible(false);
            } else {

            }

        }
        if (idTipoUs == 2) {
            lbEsp.setVisible(false);
            cbEsp.setVisible(false);
        }

    }

    private void loadCombo(JComboBox cb) throws SQLException {
        ctEsp ct = new ctEsp();
        ResultSet rs = ct.loadEsp();
        while (rs.next()) {
            int idTP = rs.getInt("idEspecialidad");
            String nombre = rs.getString("Especialidad");
            cb.addItem(nombre);
            cbMap.put(idTP, nombre);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbEsp = new javax.swing.JLabel();
        cbEsp = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnConfirm = new Design.ButtonGradient();
        panelRound1 = new Design.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new Design.TextFieldSV();
        jLabel9 = new javax.swing.JLabel();
        txtApellidos = new Design.TextFieldSV();
        jLabel1 = new javax.swing.JLabel();
        txtDir = new Design.TextFieldSV();
        lbDir = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtDui = new Design.TextFieldSV();
        jLabel6 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 73, 101));
        jLabel2.setText("CREAR PERFIL");

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp.setText("Especialidad");

        cbEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombres");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 30));
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 314, 55));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Número de DUI");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 30));
        panelRound1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 299, 54));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Apellidos");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 100, 30));
        panelRound1.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 299, 52));

        lbDir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDir.setForeground(new java.awt.Color(0, 0, 0));
        lbDir.setText("Dirección");
        panelRound1.add(lbDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 150, 30));
        panelRound1.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 250, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nacimiento");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 150, 30));
        panelRound1.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 314, 53));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sexo");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 100, 30));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        panelRound1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 200, 40));

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(410, 410, 410)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(541, 541, 541))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
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
            CRUDusuarios subp=new CRUDusuarios(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(insertTipoCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEspActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        if (nivelRow == 2) {
            ctRecep ct = new ctRecep();
            ct.idUsuario = idUs;
            ct.nombre = txtNombre.getText();
            ct.apellido = txtApellidos.getText();
            ct.dui = txtDui.getText();
            ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
            System.out.println(dt.format(dpNaci.getCalendar().getTime()));
            ct.sexo = cbSexo.getSelectedItem().toString();
            ct.insertRe();
        }
        if (nivelRow == 3) {
            ctCliente ct = new ctCliente();
            ct.idUsuario = idUs;
            ct.nombre = txtNombre.getText();
            ct.apellido = txtApellidos.getText();
            ct.dui = txtDui.getText();
            ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
            ct.sexo = cbSexo.getSelectedItem().toString();
            ct.direccion = txtDir.getText();
            ct.insertCl();
        }
        if (nivelRow == 4) {
            ctDoctores ct = new ctDoctores();
            ct.idUsuario = idUs;
            ct.idEsp = dsg.getMap(cbMap, cbEsp.getSelectedItem().toString());
            ct.nombre = txtNombre.getText();
            ct.apellido = txtApellidos.getText();
            ct.dui = txtDui.getText();
            ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
            ct.sexo = cbSexo.getSelectedItem().toString();
            ct.insertDoc();
        }
    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JComboBox<String> cbEsp;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbDir;
    private javax.swing.JLabel lbEsp;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtApellidos;
    private Design.TextFieldSV txtDir;
    private Design.TextFieldSV txtDui;
    private Design.TextFieldSV txtNombre;
    // End of variables declaration//GEN-END:variables
}

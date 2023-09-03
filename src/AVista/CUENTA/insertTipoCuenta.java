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
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

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
        ((JTextField) dpNaci.getDateEditor().getUiComponent()).setEditable(false);

        txtNombre.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtDui.setDocument(new Valida(10, "[0-9]*"));
        txtApellidos.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtDir.setDocument(new Valida(300, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ,.]*"));
        if (idTipoUs == 1) {
            if (nivelRow != 4) {
                lbEsp.setVisible(false);
                cbEsp.setVisible(false);

            } else {
                loadCombo(cbEsp);
                cbEsp.setSelectedIndex(0);
            }
            if (nivelRow != 3) {
                lbMin3.setVisible(false);
                txtDir.setVisible(false);
            } else {

            }

        }
        if (idTipoUs == 2) {
            lbEsp.setVisible(false);
            cbEsp.setVisible(false);
        }

        Calendar fechaActual = Calendar.getInstance();
        fechaActual.add(Calendar.YEAR, -18);
        dpNaci.setMaxSelectableDate(fechaActual.getTime());
        lbMin.setVisible(false);
        lbMin1.setVisible(false);
        lbMin2.setVisible(false);
        lbMin3.setVisible(false);

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
        lbMin1 = new javax.swing.JLabel();
        txtApellidos = new Design.TextFieldSV();
        jLabel1 = new javax.swing.JLabel();
        txtDir = new Design.TextFieldSV();
        lbMin3 = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtDui = new Design.TextFieldSV();
        jLabel6 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        lbMin2 = new javax.swing.JLabel();
        lbMin = new javax.swing.JLabel();
        lbDir1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CREAR PERFIL");

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp.setText("Especialidad");

        cbEsp.setBackground(new java.awt.Color(255, 255, 255));
        cbEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(190, 233, 232));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("Confirmar");
        btnConfirm.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombres");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 30));

        txtNombre.setBackground(new java.awt.Color(190, 233, 232));
        txtNombre.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 314, 55));

        lbMin1.setForeground(new java.awt.Color(0, 0, 0));
        lbMin1.setText("Minimo de digitos 5");
        panelRound1.add(lbMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 150, 30));

        txtApellidos.setBackground(new java.awt.Color(190, 233, 232));
        txtApellidos.setShadowColor(new java.awt.Color(0, 0, 51));
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        panelRound1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 299, 54));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Apellidos");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 100, 30));

        txtDir.setBackground(new java.awt.Color(190, 233, 232));
        txtDir.setShadowColor(new java.awt.Color(0, 0, 51));
        txtDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirKeyTyped(evt);
            }
        });
        panelRound1.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 299, 52));

        lbMin3.setForeground(new java.awt.Color(0, 0, 0));
        lbMin3.setText("Minimo de digitos 10");
        panelRound1.add(lbMin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 120, 30));
        panelRound1.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 250, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nacimiento");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 150, 30));

        txtDui.setBackground(new java.awt.Color(190, 233, 232));
        txtDui.setShadowColor(new java.awt.Color(0, 0, 51));
        txtDui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDuiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuiKeyTyped(evt);
            }
        });
        panelRound1.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 314, 53));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sexo");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 30));

        cbSexo.setBackground(new java.awt.Color(190, 233, 232));
        cbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        panelRound1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 200, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Número de DUI");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 30));

        lbMin2.setForeground(new java.awt.Color(0, 0, 0));
        lbMin2.setText("Minimo de digitos 10");
        panelRound1.add(lbMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 150, 30));

        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 5");
        panelRound1.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, 30));

        lbDir1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDir1.setForeground(new java.awt.Color(0, 0, 0));
        lbDir1.setText("Dirección");
        panelRound1.add(lbDir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 150, 30));

        jPanel1.setBackground(new java.awt.Color(190, 233, 232));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("VetSoft+");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(536, 536, 536))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(410, 410, 410)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 263, Short.MAX_VALUE))))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(lbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDusuarios subp = new CRUDusuarios(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(insertTipoCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void cbEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEspActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (txtNombre.getText().isEmpty() || txtApellidos.getText().isEmpty()
                || txtDui.getText().isEmpty() || txtDir.getText().isEmpty()) {
            
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);

        } else {
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
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtDuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDuiKeyTyped

    private void txtDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtDirKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
         if(txtNombre.getText().length()>= 5){
            lbMin.setVisible(false);
            btnConfirm.setEnabled(true);
        }else {
            lbMin.setVisible(true);
            btnConfirm.setEnabled(false);
        } 
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        // TODO add your handling code here:
        if(txtApellidos.getText().length()>= 5){
            lbMin1.setVisible(false);
            btnConfirm.setEnabled(true);
        }else {
            lbMin1.setVisible(true);
            btnConfirm.setEnabled(false);
        } 
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtDuiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyReleased
        // TODO add your handling code here:
         if(txtDui.getText().length()>= 10){
            lbMin2.setVisible(false);
            btnConfirm.setEnabled(true);
        }else {
            lbMin2.setVisible(true);
            btnConfirm.setEnabled(false);
        } 
    }//GEN-LAST:event_txtDuiKeyReleased

    private void txtDirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirKeyReleased
        // TODO add your handling code here:
         if(txtDir.getText().length()>= 10){
            lbMin3.setVisible(false);
            btnConfirm.setEnabled(true);
        }else {
            lbMin3.setVisible(true);
            btnConfirm.setEnabled(false);
        } 
    }//GEN-LAST:event_txtDirKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JComboBox<String> cbEsp;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDir1;
    private javax.swing.JLabel lbEsp;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbMin1;
    private javax.swing.JLabel lbMin2;
    private javax.swing.JLabel lbMin3;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtApellidos;
    private Design.TextFieldSV txtDir;
    private Design.TextFieldSV txtDui;
    private Design.TextFieldSV txtNombre;
    // End of variables declaration//GEN-END:variables
}

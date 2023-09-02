package AVista.Perfil;

import AControlador.ctCitas;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PerfilData extends javax.swing.JPanel {

    public PerfilData() {
        //this.id
        initComponents();
        txtUser.setDocument(new Valida(30, "[a-zA-Z0-9]*"));
        txtTel.setDocument(new Valida(8, "[0-9]*"));
        txtDui.setDocument(new Valida(10, "[0-9]*"));
        txtDir.setDocument(new Valida(300, "[a-zA-Z0-9]*"));
        txtNombre.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtApellidos.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        lbMin.setVisible(false);
        lbMin1.setVisible(false);
        lbMin2.setVisible(false);
        lbMin3.setVisible(false);
        lbMin4.setVisible(false);
        lbMin5.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        txtApellidos = new Design.TextFieldSV();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new Design.TextFieldSV();
        jLabel8 = new javax.swing.JLabel();
        txtDui = new Design.TextFieldSV();
        jLabel6 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        txtDir = new Design.TextFieldSV();
        lbMin5 = new javax.swing.JLabel();
        txtUser = new Design.TextFieldSV();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new Design.TextFieldSV();
        txtTel = new Design.TextFieldSV();
        jLabel10 = new javax.swing.JLabel();
        lbMin = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        lbMin2 = new javax.swing.JLabel();
        lbMin3 = new javax.swing.JLabel();
        lbFalso = new javax.swing.JLabel();
        lbMin4 = new javax.swing.JLabel();
        cbTipoProd = new Design.Combobox();
        lbDirEsp = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnConfirm = new Design.ButtonGradient();
        btnAct = new Design.ButtonGradient();
        lbNDoc = new javax.swing.JLabel();
        lbDoc1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 73, 101));
        jLabel2.setText("CUENTA PERSONAL");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 330, 50));

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellidos.setShadowColor(new java.awt.Color(0, 0, 51));
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        panelRound1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 300, 49));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Apellidos");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nacimiento");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 150, 30));
        panelRound1.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 220, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombres");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 100, 30));

        txtNombre.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 293, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Número de DUI");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, -1));

        txtDui.setShadowColor(new java.awt.Color(0, 0, 51));
        txtDui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuiKeyTyped(evt);
            }
        });
        panelRound1.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sexo");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 100, 30));

        cbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        panelRound1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 200, 40));

        txtDir.setShadowColor(new java.awt.Color(0, 0, 51));
        txtDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirKeyTyped(evt);
            }
        });
        panelRound1.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 360, 51));

        lbMin5.setForeground(new java.awt.Color(0, 0, 0));
        lbMin5.setText("Minimo de digitos 4");
        panelRound1.add(lbMin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 110, 30));

        txtUser.setShadowColor(new java.awt.Color(0, 0, 51));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        panelRound1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 293, 51));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Correo");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, -1));

        txtCorreo.setShadowColor(new java.awt.Color(0, 0, 51));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        panelRound1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 290, 51));

        txtTel.setShadowColor(new java.awt.Color(0, 0, 51));
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        panelRound1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 240, 51));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Télefono");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 150, -1));

        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 4");
        panelRound1.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, 30));

        lbMin1.setForeground(new java.awt.Color(0, 0, 0));
        lbMin1.setText("Minimo de digitos 5");
        panelRound1.add(lbMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 110, 30));

        lbMin2.setForeground(new java.awt.Color(0, 0, 0));
        lbMin2.setText("Minimo de digitos 10");
        panelRound1.add(lbMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 120, 30));

        lbMin3.setForeground(new java.awt.Color(0, 0, 0));
        lbMin3.setText("Minimo de digitos 10");
        panelRound1.add(lbMin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 120, 30));

        lbFalso.setForeground(new java.awt.Color(0, 0, 0));
        lbFalso.setText("Correo Electronico Falso");
        panelRound1.add(lbFalso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 130, 30));

        lbMin4.setForeground(new java.awt.Color(0, 0, 0));
        lbMin4.setText("Minimo de digitos 8");
        panelRound1.add(lbMin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 110, 30));

        cbTipoProd.setForeground(new java.awt.Color(0, 0, 0));
        cbTipoProd.setLabeText("");
        cbTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoProdActionPerformed(evt);
            }
        });
        panelRound1.add(cbTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 350, 50));

        lbDirEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDirEsp.setForeground(new java.awt.Color(0, 0, 0));
        lbDirEsp.setText("Dirección");
        panelRound1.add(lbDirEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 150, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Usuario");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 30));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 1130, 440));

        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 160, 50));

        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        PCont.add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 160, 50));

        lbNDoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNDoc.setForeground(new java.awt.Color(0, 0, 0));
        lbNDoc.setText("Doctor encargado:");
        PCont.add(lbNDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 160, 30));

        lbDoc1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDoc1.setForeground(new java.awt.Color(0, 0, 0));
        lbDoc1.setText("Doctor encargado:");
        PCont.add(lbDoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 160, 30));

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

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        /*if (txtNombre.getText().isEmpty() || txtApellidos.getText().isEmpty()
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
                ct.idRecep = idCuenta;
                ct.nombre = txtNombre.getText();
                ct.apellido = txtApellidos.getText();
                ct.dui = txtDui.getText();
                ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
                ct.sexo = cbSexo.getSelectedItem().toString();
                ct.updtRecep();
            }
            if (nivelRow == 3) {
                ctCliente ct = new ctCliente();
                ct.idCliente = idCuenta;
                ct.nombre = txtNombre.getText();
                ct.apellido = txtApellidos.getText();
                ct.dui = txtDui.getText();
                ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
                ct.sexo = cbSexo.getSelectedItem().toString();
                ct.direccion = txtDir.getText();
                ct.updtCl();
            }
            if (nivelRow == 4) {
                ctDoctores ct = new ctDoctores();
                ct.idDoctor = idCuenta;
                ct.idEsp = dsg.getMap(cbMap, cbEsp.getSelectedItem().toString());
                ct.nombre = txtNombre.getText();
                ct.apellido = txtApellidos.getText();
                ct.dui = txtDui.getText();
                ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
                ct.sexo = cbSexo.getSelectedItem().toString();
                ct.updateDoc();
            }
        }*/
    }//GEN-LAST:event_btnConfirmActionPerformed
    final void loadDoc() throws SQLException {
        /*try {
            ctCitas ct = new ctCitas();
            ct.idCita = idCita;

            ResultSet rs = ct.selectCita();
            while (rs.next()) {
                lbMasc.setText("Mascota: " + rs.getString("Animal"));
                cbServicio.setSelectedItem(rs.getString("Serv"));
                cbEsp.setSelectedItem(rs.getString("Especialidad"));
                cbDoc.setSelectedItem(rs.getString("Doctor"));
                dpFecha.setDate(rs.getDate("Fecha"));
                String hora = rs.getString("hora") + "";
                cbHora.setSelectedItem(hora);
                System.out.println(rs.getString("Hora") + " " + cbHora.getSelectedItem().toString());
                txtNotaCl.setText(rs.getString("notaDelCliente"));
                txtNotaD.setText(rs.getString("notaDelDoctor"));

            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }*/
    }
    final void loadAdRe() throws SQLException {
        /*try {
            ctCitas ct = new ctCitas();
            ct.idCita = idCita;

            ResultSet rs = ct.selectCita();
            while (rs.next()) {
                lbMasc.setText("Mascota: " + rs.getString("Animal"));
                cbServicio.setSelectedItem(rs.getString("Serv"));
                cbEsp.setSelectedItem(rs.getString("Especialidad"));
                cbDoc.setSelectedItem(rs.getString("Doctor"));
                dpFecha.setDate(rs.getDate("Fecha"));
                String hora = rs.getString("hora") + "";
                cbHora.setSelectedItem(hora);
                System.out.println(rs.getString("Hora") + " " + cbHora.getSelectedItem().toString());
                txtNotaCl.setText(rs.getString("notaDelCliente"));
                txtNotaD.setText(rs.getString("notaDelDoctor"));

            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }*/
    }
    final void loadAsis() throws SQLException {
        /*try {
            ctCitas ct = new ctCitas();
            ct.idCita = idCita;

            ResultSet rs = ct.selectCita();
            while (rs.next()) {
                lbMasc.setText("Mascota: " + rs.getString("Animal"));
                cbServicio.setSelectedItem(rs.getString("Serv"));
                cbEsp.setSelectedItem(rs.getString("Especialidad"));
                cbDoc.setSelectedItem(rs.getString("Doctor"));
                dpFecha.setDate(rs.getDate("Fecha"));
                String hora = rs.getString("hora") + "";
                cbHora.setSelectedItem(hora);
                System.out.println(rs.getString("Hora") + " " + cbHora.getSelectedItem().toString());
                txtNotaCl.setText(rs.getString("notaDelCliente"));
                txtNotaD.setText(rs.getString("notaDelDoctor"));

            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }*/
    }
    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // TODO add your handling code here:
        if (txtNombre.getText().length() >= 3) {
            lbMin.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            lbMin.setVisible(true);
            btnConfirm.setEnabled(false);
        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        if (txtNombre.getText().length() >= 4) {
            lbMin1.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            lbMin1.setVisible(true);
            btnConfirm.setEnabled(false);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        if (txtApellidos.getText().length() >= 9) {
            lbMin2.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            lbMin2.setVisible(true);
            btnConfirm.setEnabled(false);
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtDuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyTyped
        // TODO add your handling code here:
        if (txtDui.getText().length() >= 9) {
            lbMin3.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            lbMin3.setVisible(true);
            btnConfirm.setEnabled(false);
        }
    }//GEN-LAST:event_txtDuiKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        // TODO add your handling code here:
        if (txtTel.getText().length() >= 7) {
            lbMin4.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            lbMin4.setVisible(true);
            btnConfirm.setEnabled(false);
        }
    }//GEN-LAST:event_txtTelKeyTyped

    private void txtDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirKeyTyped
        // TODO add your handling code here:
        if (txtDir.getText().length() >= 9) {
            lbMin5.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            lbMin5.setVisible(true);
            btnConfirm.setEnabled(false);
        }
    }//GEN-LAST:event_txtDirKeyTyped

    /*final void enab(boolean tf) {
        List<Component> lista = new ArrayList<>();
        lista.add(txtResp1);
        lista.add(txtResp2);
        lista.add(txtResp3);
        dsg.enable(lista, tf);
    }*/
    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        if (btnConfirm.isVisible()) {
            btnAct.setText("Editar");
            //enab(false);
            btnConfirm.setVisible(false);
        } else {
            btnAct.setText("Cancelar");
            //enab(true);
            btnConfirm.setVisible(true);
        }
    }//GEN-LAST:event_btnActActionPerformed

    private void cbTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoProdActionPerformed

        /*tpUs = dsg.getMap(cbTP, cbCargo.getSelectedItem().toString());
        System.out.println("ID seleccionado: " + tpUs);*/
    }//GEN-LAST:event_cbTipoProdActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAct;
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JComboBox<String> cbSexo;
    private Design.Combobox cbTipoProd;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbDirEsp;
    private javax.swing.JLabel lbDoc1;
    private javax.swing.JLabel lbFalso;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbMin1;
    private javax.swing.JLabel lbMin2;
    private javax.swing.JLabel lbMin3;
    private javax.swing.JLabel lbMin4;
    private javax.swing.JLabel lbMin5;
    private javax.swing.JLabel lbNDoc;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtApellidos;
    private Design.TextFieldSV txtCorreo;
    private Design.TextFieldSV txtDir;
    private Design.TextFieldSV txtDui;
    private Design.TextFieldSV txtNombre;
    private Design.TextFieldSV txtTel;
    private Design.TextFieldSV txtUser;
    // End of variables declaration//GEN-END:variables
}

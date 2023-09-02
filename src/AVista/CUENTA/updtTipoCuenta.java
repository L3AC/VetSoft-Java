package AVista.CUENTA;

import AControlador.ctCliente;
import AControlador.ctDoctores;
import AControlador.ctEsp;
import AControlador.ctRecep;
import AVista.Asistentes.CRUDAsistente;
import AVista.Clientes.CRUDCliente;
import AVista.Doctores.CRUDDoctores;
import AVista.Recepcionista.CRUDRecep;
import Design.Desg;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class updtTipoCuenta extends javax.swing.JPanel {

    private int idTipoUs;
    private int idCuenta;
    private int nivelRow;

    Desg dsg = new Desg();
    Map<Integer, String> cbMap = new HashMap<>();

    public updtTipoCuenta(int idTipoUs, int idCuenta, int nivelRow) throws SQLException {
        initComponents();
        this.idTipoUs = idTipoUs;
        this.idCuenta = idCuenta;
        this.nivelRow = nivelRow;
        initComponents();

        txtNombre.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtDui.setDocument(new Valida(10, "[0-9]*"));
        txtApellidos.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtDir.setDocument(new Valida(300, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ,.]*"));
        if (idTipoUs == 1) {//ADMIN

            if (nivelRow != 4) {//IDDOCTOR
                lbEsp.setVisible(false);
                cbEsp.setVisible(false);

            } else {
                loadCombo(cbEsp);
                cbEsp.setSelectedIndex(0);
                loadDoc();
            }

            if (nivelRow != 3) {//IDCLIENTE
                lbMin3.setVisible(false);
                txtDir.setVisible(false);
            } else {
                loadCl();
            }

        }
        if (nivelRow == 2) {//IDRECEP
            lbEsp.setVisible(false);
            cbEsp.setVisible(false);
            lbMin3.setVisible(false);
            txtDir.setVisible(false);
            loadRecep();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbEsp = new javax.swing.JLabel();
        cbEsp = new javax.swing.JComboBox<>();
        btnConfirm = new Design.ButtonGradient();
        panelRound1 = new Design.PanelRound();
        txtApellidos = new Design.TextFieldSV();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new Design.TextFieldSV();
        lbMin = new javax.swing.JLabel();
        txtDui = new Design.TextFieldSV();
        jLabel6 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        txtDir = new Design.TextFieldSV();
        lbMin3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbMin2 = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        lbDir1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(190, 233, 232));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ACTUALIZAR PERFIL");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 330, 50));

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp.setText("Especialidad");
        PCont.add(lbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 110, 30));

        cbEsp.setBackground(new java.awt.Color(255, 255, 255));
        PCont.add(cbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 200, 40));

        btnConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("Confirmar");
        btnConfirm.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, 182, 50));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellidos.setBackground(new java.awt.Color(190, 233, 232));
        txtApellidos.setShadowColor(new java.awt.Color(0, 0, 51));
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        panelRound1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 290, 49));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Apellidos");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nacimiento");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 150, 30));
        panelRound1.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 250, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombres");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 30));

        txtNombre.setBackground(new java.awt.Color(190, 233, 232));
        txtNombre.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 293, 51));

        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 5");
        panelRound1.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 150, -1));

        txtDui.setBackground(new java.awt.Color(190, 233, 232));
        txtDui.setShadowColor(new java.awt.Color(0, 0, 51));
        txtDui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuiKeyTyped(evt);
            }
        });
        panelRound1.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 234, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sexo");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 100, 30));

        cbSexo.setBackground(new java.awt.Color(190, 233, 232));
        cbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        panelRound1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 200, 40));

        txtDir.setBackground(new java.awt.Color(190, 233, 232));
        txtDir.setShadowColor(new java.awt.Color(0, 0, 51));
        txtDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirKeyTyped(evt);
            }
        });
        panelRound1.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 290, 51));

        lbMin3.setForeground(new java.awt.Color(0, 0, 0));
        lbMin3.setText("Minimo de digitos 10");
        panelRound1.add(lbMin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 120, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Número de DUI");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 150, -1));

        lbMin2.setForeground(new java.awt.Color(0, 0, 0));
        lbMin2.setText("Minimo de digitos 10");
        panelRound1.add(lbMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, -1));

        lbMin1.setForeground(new java.awt.Color(0, 0, 0));
        lbMin1.setText("Minimo de digitos 5");
        panelRound1.add(lbMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 150, -1));

        lbDir1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDir1.setForeground(new java.awt.Color(0, 0, 0));
        lbDir1.setText("Dirección");
        panelRound1.add(lbDir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 150, 30));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 715, 430));

        jPanel2.setBackground(new java.awt.Color(190, 233, 232));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        PCont.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N
        PCont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("VetSoft+");
        PCont.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1226, 90, 60, -1));

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

    final void loadDoc() throws SQLException {
        try {
            ctDoctores ct = new ctDoctores();
            ct.idDoctor = idCuenta;

            ResultSet rs = ct.loadData();
            while (rs.next()) {
                txtNombre.setText(rs.getString("nombre"));
                txtApellidos.setText(rs.getString("apellido"));
                txtDui.setText(rs.getString("dui"));
                dpNaci.setDate(rs.getDate("nacimiento"));
                cbEsp.setSelectedItem(rs.getString("Especialidad"));
                cbSexo.setSelectedItem(rs.getString("sexo"));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    final void loadCl() throws SQLException {
        try {
            ctCliente ct = new ctCliente();
            ct.idCliente = idCuenta;
            ResultSet rs = ct.selectCl();
            while (rs.next()) {
                txtNombre.setText(rs.getString("nombre"));
                txtApellidos.setText(rs.getString("apellido"));
                txtDui.setText(rs.getString("dui"));
                dpNaci.setDate(rs.getDate("nacimiento"));
                txtDir.setText(rs.getString("direccion"));
                cbSexo.setSelectedItem(rs.getString("sexo"));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    final void loadRecep() throws SQLException {
        try {
            ctRecep ct = new ctRecep();
            ct.idRecep = idCuenta;

            ResultSet rs = ct.selectRecep();
            while (rs.next()) {
                txtNombre.setText(rs.getString("nombre"));
                txtApellidos.setText(rs.getString("apellido"));
                txtDui.setText(rs.getString("dui"));
                dpNaci.setDate(rs.getDate("nacimiento"));
                cbSexo.setSelectedItem(rs.getString("sexo"));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            if (nivelRow == 2) {
                CRUDRecep subp = new CRUDRecep();
                dsg.ShowPanel(subp, PCont, 1320, 810);
            }
            if (nivelRow == 3) {
                CRUDCliente subp = new CRUDCliente(idTipoUs);
                dsg.ShowPanel(subp, PCont, 1320, 810);
            }
            if (nivelRow == 4) {
                CRUDDoctores subp = new CRUDDoctores(idTipoUs);
                dsg.ShowPanel(subp, PCont, 1320, 810);
            }
        } catch (SQLException ex) {
            Logger.getLogger(updtTipoCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

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
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        if(txtNombre.getText().length()>= 4){
            lbMin.setVisible(false);
            btnConfirm.setEnabled(true);
        }else {
            lbMin.setVisible(true);
            btnConfirm.setEnabled(false);
        } 
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        if(txtApellidos.getText().length()>= 4){
            lbMin1.setVisible(false);
            btnConfirm.setEnabled(true);
        }else {
            lbMin1.setVisible(true);
            btnConfirm.setEnabled(false);
        } 
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtDuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyTyped
        // TODO add your handling code here:
        if(txtDui.getText().length()>= 9){
            lbMin2.setVisible(false);
            btnConfirm.setEnabled(true);
        }else {
            lbMin2.setVisible(true);
            btnConfirm.setEnabled(false);
        } 
    }//GEN-LAST:event_txtDuiKeyTyped

    private void txtDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirKeyTyped
        // TODO add your handling code here:
        if(txtDir.getText().length()>= 9){
            lbMin3.setVisible(false);
            btnConfirm.setEnabled(true);
        }else {
            lbMin3.setVisible(true);
            btnConfirm.setEnabled(false);
        } 
    }//GEN-LAST:event_txtDirKeyTyped


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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
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

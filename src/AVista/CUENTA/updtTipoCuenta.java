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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

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
                lbDir.setVisible(false);
                txtDir.setVisible(false);
            } else {
                loadCl();
            }

        }
        if (nivelRow == 2) {//IDRECEP
            lbEsp.setVisible(false);
            cbEsp.setVisible(false);
            lbDir.setVisible(false);
            txtDir.setVisible(false);
            loadRecep();
        }
        if (idTipoUs == 2) {
            lbEsp.setVisible(false);
            cbEsp.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbEsp = new javax.swing.JLabel();
        cbEsp = new javax.swing.JComboBox<>();
        txtDui = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        btnConfirm = new javax.swing.JButton();
        dpNaci = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbDir = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("ACTUALIZAR PERFIL");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Nombres");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setText("Especialidad");

        txtDui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Número de DUI");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Sexo");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nacimiento");

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Apellidos");

        lbDir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDir.setText("Dirección");

        txtDir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270)
                .addComponent(lbDir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(cbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(dpNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PContLayout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(180, 180, 180)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbDir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbEsp;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbDir;
    private javax.swing.JLabel lbEsp;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

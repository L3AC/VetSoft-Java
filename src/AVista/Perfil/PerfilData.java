package AVista.Perfil;

import AControlador.ctAdmin;
import AControlador.ctAsistente;
import AControlador.ctCitas;
import AControlador.ctDoctores;
import AControlador.ctEsp;
import AControlador.ctRecep;
import AControlador.ctUser;
import AVista.Usuarios.insertUs;
import Design.Desg;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import Validation.Valida;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import org.apache.commons.validator.EmailValidator;

public class PerfilData extends javax.swing.JPanel {

    private int idTipoUs;
    private String user;
    private int idC;
    private int idUs;
    Desg dsg = new Desg();
    Map<Integer, String> mapEsp = new HashMap<>();
    Map<Integer, String> mapSex = new HashMap<>();

    public PerfilData(int idTipoUs, int idC, int idUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idC = idC;
        this.idUs = idUs;
        initComponents();
        txtUser.setDocument(new Valida(30, "[a-zA-Z0-9]*"));
        txtTel.setDocument(new Valida(10, "[0-9]*"));
        txtDui.setDocument(new Valida(10, "[0-9-]*"));
        txtNombre.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtApellidos.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        lbUs.setVisible(false);
        lbMin5.setVisible(false);
        lbMin1.setVisible(false);
        lbMin2.setVisible(false);
        lbMin3.setVisible(false);
        lbMin4.setVisible(false);
        lbDoc1.setVisible(false);
        lbDoc2.setVisible(false);
        lbFalso.setVisible(false);
        btnConfirm.setVisible(false);

        lbEsp.setVisible(false);
        cbEsp.setVisible(false);

        if (idTipoUs == 1) {
            loadAdRe();
        }
        if (idTipoUs == 2) {
            loadAdRe();
        }
        if (idTipoUs == 4) {
            loadDoc();
            lbEsp.setVisible(true);
            cbEsp.setVisible(true);
            loadCombo(cbEsp);
        }
        if (idTipoUs == 5) {
            loadAsis();
            lbDoc1.setVisible(true);
            lbDoc2.setVisible(true);
        }
        enab(false);
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
        txtUser = new Design.TextFieldSV();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new Design.TextFieldSV();
        txtTel = new Design.TextFieldSV();
        jLabel10 = new javax.swing.JLabel();
        lbUs = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        lbMin2 = new javax.swing.JLabel();
        lbMin3 = new javax.swing.JLabel();
        lbFalso = new javax.swing.JLabel();
        lbMin4 = new javax.swing.JLabel();
        lbEsp = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbEsp = new Design.Combobox();
        lbMin5 = new javax.swing.JLabel();
        btnConfirm = new Design.ButtonGradient();
        btnAct = new Design.ButtonGradient();
        lbDoc2 = new javax.swing.JLabel();
        lbDoc1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CUENTA PERSONAL");

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 293, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Número de DUI");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, -1));

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
        panelRound1.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sexo");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 100, 30));

        cbSexo.setBackground(new java.awt.Color(190, 233, 232));
        cbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        panelRound1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 200, 40));

        txtUser.setBackground(new java.awt.Color(190, 233, 232));
        txtUser.setShadowColor(new java.awt.Color(0, 0, 51));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        panelRound1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 293, 51));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Correo");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, -1));

        txtCorreo.setBackground(new java.awt.Color(190, 233, 232));
        txtCorreo.setShadowColor(new java.awt.Color(0, 0, 51));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });
        panelRound1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 290, 51));

        txtTel.setBackground(new java.awt.Color(190, 233, 232));
        txtTel.setShadowColor(new java.awt.Color(0, 0, 51));
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        panelRound1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 240, 51));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Télefono");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 150, -1));

        lbUs.setForeground(new java.awt.Color(0, 0, 0));
        lbUs.setText("Ya existe usuario");
        panelRound1.add(lbUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 110, 30));

        lbMin1.setForeground(new java.awt.Color(0, 0, 0));
        lbMin1.setText("Minimo de digitos 5");
        panelRound1.add(lbMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 110, 30));

        lbMin2.setForeground(new java.awt.Color(0, 0, 0));
        lbMin2.setText("Minimo de digitos 5");
        panelRound1.add(lbMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 120, 30));

        lbMin3.setForeground(new java.awt.Color(0, 0, 0));
        lbMin3.setText("Minimo de digitos 10");
        panelRound1.add(lbMin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 120, 30));

        lbFalso.setForeground(new java.awt.Color(0, 0, 0));
        lbFalso.setText("Correo Electronico Falso");
        panelRound1.add(lbFalso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 150, 30));

        lbMin4.setForeground(new java.awt.Color(0, 0, 0));
        lbMin4.setText("Minimo de digitos 8");
        panelRound1.add(lbMin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 110, 30));

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp.setText("Especialidad");
        panelRound1.add(lbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 150, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Usuario");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 30));

        cbEsp.setBackground(new java.awt.Color(190, 233, 232));
        cbEsp.setForeground(new java.awt.Color(0, 0, 0));
        cbEsp.setLabeText("");
        cbEsp.setLightWeightPopupEnabled(false);
        cbEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspActionPerformed(evt);
            }
        });
        panelRound1.add(cbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 210, 40));

        lbMin5.setForeground(new java.awt.Color(0, 0, 0));
        lbMin5.setText("Minimo de digitos 4");
        panelRound1.add(lbMin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, 30));

        btnConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("Confirmar");
        btnConfirm.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnAct.setForeground(new java.awt.Color(0, 0, 0));
        btnAct.setText("Actualizar");
        btnAct.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        lbDoc2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDoc2.setForeground(new java.awt.Color(0, 0, 0));
        lbDoc2.setText("Doctor encargado:");

        lbDoc1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDoc1.setForeground(new java.awt.Color(0, 0, 0));
        lbDoc1.setText("Doctor encargado:");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbDoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            mapEsp.put(idTP, nombre);
        }
    }

    final void enab(boolean tf) {
        List<Component> lista = new ArrayList<>();
        lista.add(txtUser);
        lista.add(txtNombre);
        lista.add(txtApellidos);
        lista.add(txtDui);
        lista.add(txtCorreo);
        lista.add(txtTel);
        lista.add(dpNaci);
        lista.add(cbSexo);
        lista.add(cbEsp);
        dsg.enable(lista, tf);
    }

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (txtNombre.getText().isEmpty() || txtApellidos.getText().isEmpty()
                || txtDui.getText().isEmpty() || txtTel.getText().isEmpty()
                || txtCorreo.getText().isEmpty() || dpNaci.getDate()==null) {

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
            if (idTipoUs == 1) {
                ctUser ct = new ctUser();
                ctAdmin ct2 = new ctAdmin();
                ct.idUs = idUs;
                ct.usuario = txtUser.getText();
                ct.correo = txtCorreo.getText();
                ct.telefono = txtTel.getText();
                ct.upUs2();
                ct2.nombre = txtNombre.getText();
                ct2.apellido = txtApellidos.getText();
                ct2.dui = txtDui.getText();
                ct2.sexo = cbSexo.getSelectedItem().toString();
                ct2.nacimiento = dt.format(dpNaci.getCalendar().getTime());
                ct2.idAdmin = idC;
                ct2.updAdmin();
            }
            if (idTipoUs == 2) {
                ctUser ct = new ctUser();
                ctRecep ct2 = new ctRecep();
                ct.idUs = idUs;
                ct.usuario = txtUser.getText();
                ct.correo = txtCorreo.getText();
                ct.telefono = txtTel.getText();
                ct.upUs2();
                ct2.nombre = txtNombre.getText();
                ct2.apellido = txtApellidos.getText();
                ct2.dui = txtDui.getText();
                ct2.sexo = cbSexo.getSelectedItem().toString();
                ct2.nacimiento = dt.format(dpNaci.getCalendar().getTime());
                ct2.idRecep = idC;
                ct2.updtRecep();
            }
            if (idTipoUs == 4) {
                ctUser ct = new ctUser();
                ctDoctores ct2 = new ctDoctores();
                ct.idUs = idUs;
                ct.usuario = txtUser.getText();
                ct.correo = txtCorreo.getText();
                ct.telefono = txtTel.getText();
                ct.upUs2();
                ct2.nombre = txtNombre.getText();
                ct2.apellido = txtApellidos.getText();
                ct2.dui = txtDui.getText();
                ct2.sexo = cbSexo.getSelectedItem().toString();
                ct2.nacimiento = dt.format(dpNaci.getCalendar().getTime());
                ct2.idEsp = dsg.getMap(mapEsp, cbEsp.getSelectedItem().toString());
                ct2.idDoctor = idC;
                ct2.updateDoc();
            }
            if (idTipoUs == 5) {
                ctUser ct = new ctUser();
                ctAsistente ct2 = new ctAsistente();
                ct.idUs = idUs;
                ct.usuario = txtUser.getText();
                ct.correo = txtCorreo.getText();
                ct.telefono = txtTel.getText();
                ct.upUs2();
                ct2.nombre = txtNombre.getText();
                ct2.apellido = txtApellidos.getText();
                ct2.dui = txtDui.getText();
                ct2.sexo = cbSexo.getSelectedItem().toString();
                ct2.nacimiento = dt.format(dpNaci.getCalendar().getTime());
                ct2.upAsis2();
            }
        }
    }//GEN-LAST:event_btnConfirmActionPerformed
    final void loadAdRe() throws SQLException {
        try {

            ctUser ct = new ctUser();
            ct.idTipoUs = idTipoUs;
            ct.idUs = idUs;
            ResultSet rs = ct.perfilD();

            while (rs.next()) {
                txtUser.setText(rs.getString("usuario"));
                user = rs.getString("usuario");
                System.out.print(user);
                txtNombre.setText(rs.getString("Nombre"));
                txtApellidos.setText(rs.getString("Apellido"));
                txtDui.setText(rs.getString("DUI"));
                txtCorreo.setText(rs.getString("correo"));
                txtTel.setText(rs.getString("telefono"));
                dpNaci.setDate(rs.getDate("nacimiento"));
                cbSexo.setSelectedItem(rs.getString("sexo"));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    final void loadDoc() throws SQLException {
        try {
            ctUser ct = new ctUser();
            ct.idTipoUs = idTipoUs;
            ct.idUs = idUs;
            ResultSet rs = ct.perfilD();

            while (rs.next()) {
                txtUser.setText(rs.getString("usuario"));
                user = rs.getString("usuario");
                txtNombre.setText(rs.getString("Nombre"));
                txtApellidos.setText(rs.getString("Apellido"));
                txtDui.setText(rs.getString("DUI"));
                txtCorreo.setText(rs.getString("correo"));
                txtTel.setText(rs.getString("telefono"));
                dpNaci.setDate(rs.getDate("nacimiento"));
                cbSexo.setSelectedItem(rs.getString("sexo"));
                cbEsp.setSelectedItem(rs.getString("esp"));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    final void loadAsis() throws SQLException {
        try {
            ctUser ct = new ctUser();
            ct.idTipoUs = idTipoUs;
            ct.idUs = idUs;
            ResultSet rs = ct.perfilD();

            while (rs.next()) {
                txtUser.setText(rs.getString("usuario"));
                user = rs.getString("usuario");
                txtNombre.setText(rs.getString("Nombre"));
                txtApellidos.setText(rs.getString("Apellido"));
                txtDui.setText(rs.getString("DUI"));
                txtCorreo.setText(rs.getString("correo"));
                txtTel.setText(rs.getString("telefono"));
                dpNaci.setDate(rs.getDate("nacimiento"));
                cbSexo.setSelectedItem(rs.getString("sexo"));
                lbDoc2.setText(rs.getString("doc"));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtUserKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtDuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDuiKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTelKeyTyped

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed

        if (btnConfirm.isVisible()) {
            btnAct.setText("Editar");
            enab(false);
            btnConfirm.setVisible(false);
        } else {
            btnAct.setText("Cancelar");
            enab(true);
            btnConfirm.setVisible(true);
        }
    }//GEN-LAST:event_btnActActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased

        ctUser ctUs = new ctUser();
        ctUs.usuario = txtUser.getText().toString();
        try {
            if (ctUs.verifUs().next()) {
                if (txtUser.getText().equals(user)) {
                    lbUs.setVisible(false);
                    btnConfirm.setEnabled(true);
                } else {
                    lbUs.setVisible(true);
                    btnConfirm.setEnabled(false);
                }
            } else {
                lbUs.setVisible(false);
                btnConfirm.setEnabled(true);
            }
            if (txtUser.getText().length() >= 4 && txtNombre.getText().length() >= 5
                    && txtApellidos.getText().length() >= 5 && txtDui.getText().length() >= 10
                    && txtTel.getText().length() >= 8 && dpNaci.getDate()==null) {

                lbMin5.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                if (txtUser.getText().length() >= 4) {
                    lbMin5.setVisible(false);
                    btnConfirm.setEnabled(true);
                } else {
                    if (txtUser.getText().equals(user)) {
                        lbMin5.setVisible(false);
                        btnConfirm.setEnabled(true);
                    } else {
                        lbMin5.setVisible(true);
                        btnConfirm.setEnabled(false);
                    }

                }
    }//GEN-LAST:event_txtUserKeyReleased
        } catch (SQLException ex) {
            Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        if (txtNombre.getText().length() >= 5 && txtUser.getText().length() >= 4 && txtApellidos.getText().length() >= 5 && txtDui.getText().length() >= 10 && txtTel.getText().length() >= 8 && dpNaci.getDate()==null) {
            lbMin1.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtNombre.getText().length() >= 5) {
                lbMin1.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin1.setVisible(true);
                btnConfirm.setEnabled(false);
            }
    }//GEN-LAST:event_txtNombreKeyReleased
    }
    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        // TODO add your handling code here:
        if (txtApellidos.getText().length() >= 5 && txtNombre.getText().length() >= 5 && txtUser.getText().length() >= 4 && txtDui.getText().length() >= 10 && txtTel.getText().length() >= 8 && dpNaci.getDate()==null) {
            lbMin2.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtApellidos.getText().length() >= 5) {
                lbMin2.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin2.setVisible(true);
                btnConfirm.setEnabled(false);
            }
    }//GEN-LAST:event_txtApellidosKeyReleased
    }
    private void txtDuiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyReleased
        // TODO add your handling code here:
        if (txtDui.getText().length() >= 10 && txtNombre.getText().length() >= 5 && txtUser.getText().length() >= 4 && txtApellidos.getText().length() >= 5 && txtTel.getText().length() >= 8 && dpNaci.getDate()==null) {
            lbMin3.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtDui.getText().length() >= 10) {
                lbMin3.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin3.setVisible(true);
                btnConfirm.setEnabled(false);
            }
    }//GEN-LAST:event_txtDuiKeyReleased
    }
    private void txtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyReleased
        // TODO add your handling code here:
        if (txtTel.getText().length() >= 8 && txtNombre.getText().length() >= 5 && txtUser.getText().length() >= 4 && txtApellidos.getText().length() >= 5 && txtDui.getText().length() >= 10 && dpNaci.getDate()==null) {
            lbMin4.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtTel.getText().length() >= 8) {
                lbMin4.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin4.setVisible(true);
                btnConfirm.setEnabled(false);
            }
    }//GEN-LAST:event_txtTelKeyReleased
    }
    private void cbEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspActionPerformed

    }//GEN-LAST:event_cbEspActionPerformed

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        if (EmailValidator.getInstance().isValid(txtCorreo.getText())) {
            //if(verificar_Email(jTextField1.getText())){    

            lbFalso.setVisible(false);
            btnConfirm.setEnabled(true);

        } else {

            lbFalso.setVisible(true);
            btnConfirm.setEnabled(false);

        }
    }//GEN-LAST:event_txtCorreoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAct;
    private Design.ButtonGradient btnConfirm;
    private Design.Combobox cbEsp;
    private javax.swing.JComboBox<String> cbSexo;
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
    private javax.swing.JLabel lbDoc1;
    private javax.swing.JLabel lbDoc2;
    private javax.swing.JLabel lbEsp;
    private javax.swing.JLabel lbFalso;
    private javax.swing.JLabel lbMin1;
    private javax.swing.JLabel lbMin2;
    private javax.swing.JLabel lbMin3;
    private javax.swing.JLabel lbMin4;
    private javax.swing.JLabel lbMin5;
    private javax.swing.JLabel lbUs;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtApellidos;
    private Design.TextFieldSV txtCorreo;
    private Design.TextFieldSV txtDui;
    private Design.TextFieldSV txtNombre;
    private Design.TextFieldSV txtTel;
    private Design.TextFieldSV txtUser;
    // End of variables declaration//GEN-END:variables
}

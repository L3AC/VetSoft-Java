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
import Mensajes.Campos;
import Mensajes.CódigoErrorDSI2;
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
        txtDui.setDocument(new Valida(10, "[0-9-]*"));
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
                lbDirec.setVisible(false);
            } else {
                loadCl();

            }

        }
        if (nivelRow == 2) {//IDRECEP
            lbEsp.setVisible(false);
            cbEsp.setVisible(false);
            lbMin3.setVisible(false);
            txtDir.setVisible(false);
            lbDirec.setVisible(false);
            loadRecep();
        }
        if (nivelRow == 3) {//IDCL
            lbEsp.setVisible(false);
            cbEsp.setVisible(false);
            /*lbMin3.setVisible(false);
            txtDir.setVisible(false);
            lbDirec.setVisible(false);*/
            loadCl();
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
        lbDirec = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        btnBack.setBackground(new java.awt.Color(190, 233, 232));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ACTUALIZAR PERFIL");

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp.setText("Especialidad");

        cbEsp.setBackground(new java.awt.Color(255, 255, 255));

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDuiKeyReleased(evt);
            }
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirKeyReleased(evt);
            }
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

        lbDirec.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDirec.setForeground(new java.awt.Color(0, 0, 0));
        lbDirec.setText("Dirección");
        panelRound1.add(lbDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 150, 30));

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("VetSoft+");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(390, 390, 390)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)))
                .addGap(30, 30, 30)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        if (nivelRow == 3) {
            if (txtNombre.getText().isEmpty() || txtApellidos.getText().isEmpty()
                    || txtDui.getText().isEmpty() || txtDir.getText().isEmpty() || dpNaci.getDate()==null) {
                CódigoErrorDSI5 obj = new CódigoErrorDSI5();
                obj.eventOK(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        GlassPanePopup.closePopupLast();
                    }
                });
                GlassPanePopup.showPopup(obj);
            } else {
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
                    
                    CRUDCliente subp;
                    try {
                        subp = new CRUDCliente(idTipoUs);
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    } catch (SQLException ex) {
                        Logger.getLogger(updtTipoCuenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                }
            }
        } else {
            if (txtNombre.getText().isEmpty() || txtApellidos.getText().isEmpty()
                    || txtDui.getText().isEmpty()) {
                CódigoErrorDSI5 obj = new CódigoErrorDSI5();
                obj.eventOK(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        GlassPanePopup.closePopupLast();
                    }
                });
                GlassPanePopup.showPopup(obj);
            } else {
                if (nivelRow == 2) {
                    ctRecep ct = new ctRecep();
                    ct.idRecep = idCuenta;
                    ct.nombre = txtNombre.getText();
                    ct.apellido = txtApellidos.getText();
                    ct.dui = txtDui.getText();
                    ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
                    ct.sexo = cbSexo.getSelectedItem().toString();
                    ct.updtRecep();
                    CRUDRecep subp;
                    try {
                        subp = new CRUDRecep();
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    } catch (SQLException ex) {
                        Logger.getLogger(updtTipoCuenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
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
                    CRUDDoctores subp;
                    try {
                        subp = new CRUDDoctores(idTipoUs);
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    } catch (SQLException ex) {
                        Logger.getLogger(updtTipoCuenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Campos obj = new Campos();
                    obj.eventOK(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            GlassPanePopup.closePopupLast();
                        }
                    });
                    GlassPanePopup.showPopup(obj);
                }
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
        if (txtNombre.getText().length() >= 3 && txtApellidos.getText().length() >= 5 && txtDui.getText().length() >= 10 && txtDir.getText().length() >= 10 && dpNaci.getDate()==null) {
            lbMin.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtNombre.getText().length() >= 3) {
                lbMin.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin.setVisible(true);
                btnConfirm.setEnabled(false);
            }
        }

    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        // TODO add your handling code here:
        if (txtApellidos.getText().length() >= 5 && txtNombre.getText().length() >= 3 && txtDui.getText().length() >= 10 && txtDir.getText().length() >= 10 && dpNaci.getDate()==null) {
            lbMin1.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtApellidos.getText().length() >= 5) {
                lbMin1.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin1.setVisible(true);
                btnConfirm.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtDuiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyReleased
        // TODO add your handling code here:
        if (txtDui.getText().length() >= 10 && txtNombre.getText().length() >= 3 && txtApellidos.getText().length() >= 5 && txtDir.getText().length() >= 10 && dpNaci.getDate()==null) {
            lbMin2.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtDui.getText().length() >= 10) {
                lbMin2.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin2.setVisible(true);
                btnConfirm.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtDuiKeyReleased

    private void txtDirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirKeyReleased
        // TODO add your handling code here:
        if (txtDir.getText().length() >= 10 && txtNombre.getText().length() >= 3 && txtApellidos.getText().length() >= 5 && txtDui.getText().length() >= 10 && dpNaci.getDate()==null) {
            lbMin3.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtDir.getText().length() >= 10) {
                lbMin3.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin3.setVisible(true);
                btnConfirm.setEnabled(false);
            }
    }//GEN-LAST:event_txtDirKeyReleased
    }

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
    private javax.swing.JLabel lbDirec;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AVista;

import AControlador.ctAsistente;
import AControlador.ctDoctores;
import AControlador.ctEsp;
import AControlador.ctRecep;
import AControlador.ctTipoUs;
import AControlador.ctUser;
import AModelo.Crypt;
import AVista.Usuarios.insertUs;
import Design.Desg;
import Mensajes.CodigoDeErrorDLI3;
import Mensajes.CódigoErrorDSI2;
import Mensajes.CódigoErrorDSI3;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import Validation.Valida;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.commons.validator.EmailValidator;

/**
 *
 * @author Gerson
 */
public class Registro extends javax.swing.JFrame {

    private int idTipoUs;
    private int idDoc;
    private int idUs;
    private int nivelC;
    private int tpUs;
    Crypt cryp = new Crypt();
    ctTipoUs ctTP = new ctTipoUs();
    Desg dsg = new Desg();
    Map<Integer, String> cbMap = new HashMap<>();

    public Registro() {
        initComponents();
    }

    public Registro(int idTipoUs, int idDoc) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idDoc = idDoc;
        GlassPanePopup.install(this);
        initComponents();
        lbDisp.setVisible(false);
        lbMinCor.setVisible(false);
        loadEsp(cbEsp);

        GlassPanePopup.install(this);

        /*Este apartado de validar los Jtexfield*/
        txtUsuario.setDocument(new Valida(30, "[a-zA-Z0-9ZáéíóúÁÉÍÓÚñÑüÜ]*"));
        txtTel.setDocument(new Valida(8, "[0-9]*"));
        txtContra.setDocument(new Valida(30, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ]*"));
        txtCorreo.setDocument(new Valida(50, "[a-zA-Z0-9@._ZáéíóúÁÉÍÓÚñÑüÜ]*"));
        txtDui.setDocument(new Valida(10, "[0-9-]*"));
        txtApellidos.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        setLocationRelativeTo(null);

        String iconPath = "src/Imagenes/logoC.png";
        ImageIcon icon = new ImageIcon(iconPath);
        setIconImage(icon.getImage());
        setTitle("VetSoft");
        lbMinCon.setVisible(false);lbMinT.setVisible(false);
        lbMinAp.setVisible(false);lbMinN.setVisible(false);
        lbMinCor.setVisible(false);
        lbMinUs.setVisible(false);lbEsp.setVisible(false);
        cbEsp.setVisible(false);lbAsign.setVisible(false);
        lbDoc.setVisible(false);

        if (idTipoUs == 2) {//RECEPCIONISTA

        }
        if (idTipoUs == 4) {//Doctor
            lbEsp.setVisible(true);
            cbEsp.setVisible(true);
        }
        if (idTipoUs == 5) {//Asistente
            lbAsign.setVisible(true);
            lbDoc.setVisible(true);
            selectDoc();
        }
        Calendar fechaActual = Calendar.getInstance();
        fechaActual.add(Calendar.YEAR, -18);
        dpNaci.setMaxSelectableDate(fechaActual.getTime());

    }

//Esto nos ayudara a que el comboBox cargue los tipos de usuarios disponibles dentro del sistema de escritorio que se pueden registrar
    private void loadEsp(JComboBox cb) throws SQLException {
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

        panelRound1 = new Design.PanelRound();
        panelRound2 = new Design.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbEsp = new javax.swing.JLabel();
        btnRegistrar = new Design.ButtonGradient();
        lbMinCor = new javax.swing.JLabel();
        txtTel = new Design.TextFieldSV();
        txtUsuario = new Design.TextFieldSV();
        txtCorreo = new Design.TextFieldSV();
        txtContra = new Design.PasswordField();
        cbEsp = new Design.Combobox();
        lbDisp = new javax.swing.JLabel();
        lbMinT = new javax.swing.JLabel();
        lbMinCon = new javax.swing.JLabel();
        lbMinUs = new javax.swing.JLabel();
        txtDui = new Design.TextFieldSV();
        txtNombre = new Design.TextFieldSV();
        txtApellidos = new Design.TextFieldSV();
        cbSexo = new Design.Combobox();
        jLabel5 = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbMinD = new javax.swing.JLabel();
        lbMinAp = new javax.swing.JLabel();
        lbMinN = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        lbAsign = new javax.swing.JLabel();
        lbDoc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panelRound1.setBackground(new java.awt.Color(190, 233, 232));
        panelRound1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setForeground(new java.awt.Color(202, 233, 255));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Usuario");
        panelRound2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 70, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Correo electrónico");
        panelRound2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 150, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Apellidos");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp.setText("Especialidad");
        panelRound2.add(lbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 110, -1));

        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setColor1(new java.awt.Color(190, 233, 232));
        btnRegistrar.setColor2(new java.awt.Color(190, 233, 232));
        btnRegistrar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        panelRound2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, 170, 40));

        lbMinCor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMinCor.setForeground(new java.awt.Color(0, 0, 0));
        lbMinCor.setText("Correo electrónico falso");
        panelRound2.add(lbMinCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 150, -1));

        txtTel.setBackground(new java.awt.Color(190, 233, 232));
        txtTel.setShadowColor(new java.awt.Color(0, 0, 51));
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelKeyReleased(evt);
            }
        });
        panelRound2.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 180, -1));

        txtUsuario.setBackground(new java.awt.Color(190, 233, 232));
        txtUsuario.setShadowColor(new java.awt.Color(0, 0, 51));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });
        panelRound2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, -1));

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
        panelRound2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 210, -1));

        txtContra.setBackground(new java.awt.Color(190, 233, 232));
        txtContra.setShadowColor(new java.awt.Color(0, 0, 51));
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraKeyReleased(evt);
            }
        });
        panelRound2.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 180, -1));

        cbEsp.setBackground(new java.awt.Color(190, 233, 232));
        cbEsp.setForeground(new java.awt.Color(0, 0, 0));
        cbEsp.setLabeText("Especialidad");
        cbEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspActionPerformed(evt);
            }
        });
        panelRound2.add(cbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 200, 40));

        lbDisp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDisp.setForeground(new java.awt.Color(0, 0, 0));
        lbDisp.setText("Usuario no disponible");
        panelRound2.add(lbDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 140, -1));

        lbMinT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMinT.setForeground(new java.awt.Color(0, 0, 0));
        lbMinT.setText("Minimo de digitos 8");
        lbMinT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbMinTKeyTyped(evt);
            }
        });
        panelRound2.add(lbMinT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 140, -1));

        lbMinCon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMinCon.setForeground(new java.awt.Color(0, 0, 0));
        lbMinCon.setText("Minimo de digitos 8");
        lbMinCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbMinConKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbMinConKeyTyped(evt);
            }
        });
        panelRound2.add(lbMinCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 140, -1));

        lbMinUs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMinUs.setForeground(new java.awt.Color(0, 0, 0));
        lbMinUs.setText("Minimo de digitos 4");
        panelRound2.add(lbMinUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 150, -1));

        txtDui.setBackground(new java.awt.Color(190, 233, 232));
        txtDui.setShadowColor(new java.awt.Color(0, 0, 51));
        txtDui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDuiKeyReleased(evt);
            }
        });
        panelRound2.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 260, -1));

        txtNombre.setBackground(new java.awt.Color(190, 233, 232));
        txtNombre.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        panelRound2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 250, -1));

        txtApellidos.setBackground(new java.awt.Color(190, 233, 232));
        txtApellidos.setShadowColor(new java.awt.Color(0, 0, 51));
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
        });
        panelRound2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 240, -1));

        cbSexo.setBackground(new java.awt.Color(190, 233, 232));
        cbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Femenino", "Masculino" }));
        cbSexo.setLabeText("");
        cbSexo.setLineColor(new java.awt.Color(255, 255, 255));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });
        panelRound2.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 160, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nacimiento");
        panelRound2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, -1, -1));
        panelRound2.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 240, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombres");
        panelRound2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Dui");
        panelRound2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Teléfono");
        panelRound2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 70, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Sexo");
        panelRound2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 40, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Contraseña");
        panelRound2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        lbMinD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMinD.setForeground(new java.awt.Color(0, 0, 0));
        lbMinD.setText("Minimo de digitos 10");
        lbMinD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbMinDKeyTyped(evt);
            }
        });
        panelRound2.add(lbMinD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 140, -1));

        lbMinAp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMinAp.setForeground(new java.awt.Color(0, 0, 0));
        lbMinAp.setText("Minimo de digitos 5");
        lbMinAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbMinApKeyTyped(evt);
            }
        });
        panelRound2.add(lbMinAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 140, -1));

        lbMinN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMinN.setForeground(new java.awt.Color(0, 0, 0));
        lbMinN.setText("Minimo de digitos 5");
        lbMinN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbMinNKeyTyped(evt);
            }
        });
        panelRound2.add(lbMinN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 140, -1));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1090, 470));

        Titulo.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Registro");
        panelRound1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        lbAsign.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbAsign.setForeground(new java.awt.Color(0, 0, 0));
        lbAsign.setText("Doctor asignado");
        panelRound1.add(lbAsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        lbDoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDoc.setForeground(new java.awt.Color(0, 0, 0));
        lbDoc.setText("Nombre");
        panelRound1.add(lbDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 310, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Cuando se le de al botón registrar se verificaran que todo lo anteriormente mencionado se este validado por ejemplo que los campos no esten vacios entreo otros mas
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtUsuario.getText().isEmpty() || txtContra.getText().isEmpty()
                || txtTel.getText().isEmpty() || txtCorreo.getText().isEmpty()
                || txtNombre.getText().isEmpty() || txtApellidos.getText().isEmpty()
                || txtDui.getText().isEmpty() || dpNaci.getDate() == null) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            try {
                SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                //CREAR USUARIO
                createUs();

                //AGARRAR IDUSUARIO
                selectUs();
                //CREAR CUENTA
                if (nivelC == 2) {//RECEPCIONISTA
                    ctRecep ct = new ctRecep();
                    ct.idUsuario = idUs;
                    ct.nombre = txtNombre.getText();
                    ct.apellido = txtApellidos.getText();
                    ct.dui = txtDui.getText();
                    ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
                    ct.sexo = cbSexo.getSelectedItem().toString();
                    ct.insertRe();
                    showFrame();
                }
                if (nivelC == 4) {//DOCTOR
                    ctDoctores ct = new ctDoctores();
                    ct.idUsuario = idUs;
                    ct.idEsp = dsg.getMap(cbMap, cbEsp.getSelectedItem().toString());
                    ct.nombre = txtNombre.getText();
                    ct.apellido = txtApellidos.getText();
                    ct.dui = txtDui.getText();
                    ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
                    ct.sexo = cbSexo.getSelectedItem().toString();
                    ct.insertDoc();
                    showFrame();
                }
                if (nivelC == 5) {//ASISTENTE
                    ctAsistente ct = new ctAsistente();
                    ct.idDoctor = idDoc;
                    ct.idUsuario = idUs;
                    ct.nombre = txtNombre.getText();
                    ct.apellido = txtApellidos.getText();
                    ct.dui = txtDui.getText();
                    ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
                    ct.sexo = cbSexo.getSelectedItem().toString();
                    ct.insertAsis();
                    showFrame();
                }

            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    final void createUs() {
        ctUser ctUs = new ctUser();
        ctUs.idTipoCuenta = idTipoUs;
        ctUs.usuario = txtUsuario.getText();
        ctUs.correo = txtCorreo.getText();
        ctUs.telefono = txtTel.getText();
        try {
            ctUs.contra = cryp.encrypt(txtContra.getText(), "key");

        } catch (Exception ex) {
            Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
        }
        ctUs.insertUs();
    }

    final void selectUs() throws SQLException {
        ctUser ctu = new ctUser();
        ctu.usuario = txtUsuario.getText();
        ResultSet rs = ctu.verifUs();
        if (rs.next()) {
            nivelC = rs.getInt("idTipoUsuario");
            idUs = rs.getInt("idUsuario");
        }
    }

    final void selectDoc() throws SQLException {
        ctDoctores ct = new ctDoctores();
        ct.idDoctor = idDoc;
        ResultSet rs = ct.selectDoc();
        if (rs.next()) {
            lbDoc.setText(rs.getString("doc"));
        }
    }

    final void showFrame() {
        Login newFrame = new Login();
        newFrame.setVisible(true);
        dispose();
        CódigoErrorDSI2 obj = new CódigoErrorDSI2();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
    }
    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void cbEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspActionPerformed
        // TODO add your handling code here:
        tpUs = dsg.getMap(cbMap, cbEsp.getSelectedItem().toString());
        System.out.println("ID seleccionado: " + tpUs);
    }//GEN-LAST:event_cbEspActionPerformed

    //Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros, donde si solo escribe dos numeros le saldra un texfield
    //Esto nos ayuda a verificar si el correo electronico es verdadero llamando a una libreria anteriormente puesta en el en apartado de librerias donde solamente se manda a llamar para validar
    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        // TODO add your handling code here:

        if (EmailValidator.getInstance().isValid(txtCorreo.getText())) {
            //if(verificar_Email(jTextField1.getText())){    

            lbMinCor.setVisible(false);
            btnRegistrar.setEnabled(true);

        } else {

            lbMinCor.setVisible(true);
            btnRegistrar.setEnabled(false);

        }
    }//GEN-LAST:event_txtCorreoKeyReleased

    //En este apartado validamos si el usuario ya existe en la base de datos y no se vuelva a repetir donde se le mostrar un texfield
    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        // TODO add your handling code here:
        ctUser ctUs = new ctUser();
        ctUs.usuario = txtUsuario.getText().toString();

        try {
            if (ctUs.verifUs().next()) {
                lbDisp.setVisible(true);
                btnRegistrar.setEnabled(false);

            } else {
                lbDisp.setVisible(false);
                btnRegistrar.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (txtUsuario.getText().length() >= 4 && txtTel.getText().length() >= 8 && txtContra.getText().length() >= 8 && txtDui.getText().length() >= 10 && txtNombre.getText().length() >= 5 && txtApellidos.getText().length() >= 5 && dpNaci.getDate() == null) {
            lbMinUs.setVisible(false);
            btnRegistrar.setEnabled(true);
        } else {
            if (txtUsuario.getText().length() >= 4) {
                lbMinUs.setVisible(false);
                btnRegistrar.setEnabled(true);
            } else {
                lbMinUs.setVisible(true);
                btnRegistrar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void lbMinConKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbMinConKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_lbMinConKeyTyped

    private void lbMinTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbMinTKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lbMinTKeyTyped

    //Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros, donde si solo escribe dos numeros le saldra un texfield
    private void txtContraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyReleased
        // TODO add your handling code here:
        if (txtContra.getText().length() >= 8 && txtUsuario.getText().length() >= 4 && txtTel.getText().length() >= 8 && txtDui.getText().length() >= 10 && txtNombre.getText().length() >= 5 && txtApellidos.getText().length() >= 5 && dpNaci.getDate() == null) {
            lbMinCon.setVisible(false);
            btnRegistrar.setEnabled(true);

        } else {
            if (txtContra.getText().length() >= 8) {
                lbMinCon.setVisible(false);
                btnRegistrar.setEnabled(true);
            } else {
                lbMinCon.setVisible(true);
                btnRegistrar.setEnabled(false);
            }

        }
    }//GEN-LAST:event_txtContraKeyReleased

    //Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros donde si solo escribe dos numeros le saldra un texfield
    private void txtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyReleased
        // TODO add your handling code here:
        if (txtTel.getText().length() >= 8 && txtUsuario.getText().length() >= 4 && txtContra.getText().length() >= 8 && txtDui.getText().length() >= 10 && txtNombre.getText().length() >= 5 && txtApellidos.getText().length() >= 5 && dpNaci.getDate() == null) {
            lbMinT.setVisible(false);
            btnRegistrar.setEnabled(true);
        } else {
            if (txtTel.getText().length() >= 8) {
                lbMinT.setVisible(false);
                btnRegistrar.setEnabled(true);
            } else {
                lbMinT.setVisible(true);
                btnRegistrar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtTelKeyReleased

    private void txtDuiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyReleased
        // TODO add your handling code here:
        if (txtDui.getText().length() >= 10 && txtUsuario.getText().length() >= 4 && txtContra.getText().length() >= 8 && txtNombre.getText().length() >= 5 && txtTel.getText().length() >= 8 && txtApellidos.getText().length() >= 5 && dpNaci.getDate() == null) {
            lbMinD.setVisible(false);
            btnRegistrar.setEnabled(true);
        } else {
            if (txtDui.getText().length() >= 10) {
                lbMinD.setVisible(false);
                btnRegistrar.setEnabled(true);
            } else {
                lbMinD.setVisible(true);
                btnRegistrar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtDuiKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        if (txtNombre.getText().length() >= 5 && txtUsuario.getText().length() >= 4 && txtContra.getText().length() >= 8 && txtDui.getText().length() >= 10 && txtTel.getText().length() >= 8 && txtApellidos.getText().length() >= 5 && dpNaci.getDate() == null) {
            lbMinN.setVisible(false);
            btnRegistrar.setEnabled(true);
        } else {
            if (txtNombre.getText().length() >= 5) {
                lbMinN.setVisible(false);
                btnRegistrar.setEnabled(true);
            } else {
                lbMinN.setVisible(true);
                btnRegistrar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        // TODO add your handling code here:
        if (txtApellidos.getText().length() >= 5 && txtUsuario.getText().length() >= 4 && txtContra.getText().length() >= 8 && txtDui.getText().length() >= 10 && txtTel.getText().length() >= 8 && txtNombre.getText().length() >= 5 && dpNaci.getDate() == null) {
            lbMinAp.setVisible(false);
            btnRegistrar.setEnabled(true);
        } else {
            if (txtApellidos.getText().length() >= 5) {
                lbMinAp.setVisible(false);
                btnRegistrar.setEnabled(true);
            } else {
                lbMinAp.setVisible(true);
                btnRegistrar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void lbMinDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbMinDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lbMinDKeyTyped

    private void lbMinApKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbMinApKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lbMinApKeyTyped

    private void lbMinNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbMinNKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lbMinNKeyTyped

    private void lbMinConKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbMinConKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbMinConKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private Design.ButtonGradient btnRegistrar;
    private Design.Combobox cbEsp;
    private Design.Combobox cbSexo;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbAsign;
    private javax.swing.JLabel lbDisp;
    private javax.swing.JLabel lbDoc;
    private javax.swing.JLabel lbEsp;
    private javax.swing.JLabel lbMinAp;
    private javax.swing.JLabel lbMinCon;
    private javax.swing.JLabel lbMinCor;
    private javax.swing.JLabel lbMinD;
    private javax.swing.JLabel lbMinN;
    private javax.swing.JLabel lbMinT;
    private javax.swing.JLabel lbMinUs;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    private Design.TextFieldSV txtApellidos;
    private Design.PasswordField txtContra;
    private Design.TextFieldSV txtCorreo;
    private Design.TextFieldSV txtDui;
    private Design.TextFieldSV txtNombre;
    private Design.TextFieldSV txtTel;
    private Design.TextFieldSV txtUsuario;
    // End of variables declaration//GEN-END:variables
}

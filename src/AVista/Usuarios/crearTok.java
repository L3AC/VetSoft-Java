package AVista.Usuarios;

import AControlador.ctDoctores;
import AControlador.ctPreRegistro;
import AControlador.ctTipoUs;
import AControlador.ctUser;
import AVista.Doctores.CRUDDoctores;
import Design.Desg;
import Mensajes.CodigoErrorDRC2;
import Mensajes.Correo;
import Mensajes.CódigoErrorDSI11;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.validator.EmailValidator;

public class crearTok extends javax.swing.JPanel {

    Desg dsg = new Desg();
    DefaultTableModel model;
    Map<Integer, String> cbMap = new HashMap<>();
    private int idTipoUs;

    public crearTok(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        initComponents();
        lbDui.setVisible(false);
        lbDui1.setVisible(false);
        lbFalso.setVisible(false);
        panelR2.setVisible(false);
        loadCombo(cbCargo);
        txtCorreo.setDocument(new Valida(40, "[a-zA-Z0-9@._]*"));
        txtDui.setDocument(new Valida(10, "[0-9-]*"));
        if (idTipoUs == 2) {//ENTRA COMO RECEPCIONISTA
            btnDelT.setVisible(false);
            cbCargo.setVisible(false);
            lbCargo.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        lbCargo = new javax.swing.JLabel();
        panelR2 = new Design.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        txtBusq1 = new Design.TextFieldSV();
        lbDoc1 = new javax.swing.JLabel();
        lbDoc = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new Design.TextFieldSV();
        lbFalso = new javax.swing.JLabel();
        txtDui = new Design.TextFieldSV();
        lbDui = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbCargo = new Design.Combobox();
        lbDui1 = new javax.swing.JLabel();
        btnTok = new Design.ButtonGradient();
        btnDelT = new Design.ButtonGradient();

        PCont.setBackground(new java.awt.Color(190, 233, 232));
        PCont.setPreferredSize(new java.awt.Dimension(1320, 810));

        btnBack.setBackground(new java.awt.Color(190, 233, 232));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CREAR TOKEN");

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(0, 0, 0));
        lbCargo.setText("Nivel usuario");
        panelRound1.add(lbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 120, -1));

        panelR2.setBackground(new java.awt.Color(255, 255, 255));
        panelR2.setRoundBottomLeft(50);
        panelR2.setRoundBottomRight(50);
        panelR2.setRoundTopLeft(50);
        panelR2.setRoundTopRight(50);
        panelR2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbData.setBackground(new java.awt.Color(255, 255, 255));
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "idDoctor", "Especialidad", "Nombre"
            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbData);

        panelR2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 610, 370));

        txtBusq1.setBackground(new java.awt.Color(190, 233, 232));
        txtBusq1.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusq1ActionPerformed(evt);
            }
        });
        txtBusq1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusq1KeyReleased(evt);
            }
        });
        panelR2.add(txtBusq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 280, 40));

        lbDoc1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDoc1.setForeground(new java.awt.Color(0, 0, 0));
        lbDoc1.setText("Doctor");
        panelR2.add(lbDoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 70, -1));

        lbDoc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDoc.setForeground(new java.awt.Color(0, 0, 0));
        lbDoc.setText("Doctor");
        panelR2.add(lbDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 70, -1));

        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusqActionPerformed(evt);
            }
        });
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        panelR2.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 280, 40));

        panelRound1.add(panelR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 680, 500));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Correo electrónico");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, -1));

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
        panelRound1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 280, 40));

        lbFalso.setForeground(new java.awt.Color(0, 0, 0));
        lbFalso.setText("Correo electronico falso");
        panelRound1.add(lbFalso, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 140, 30));

        txtDui.setShadowColor(new java.awt.Color(0, 0, 51));
        txtDui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuiActionPerformed(evt);
            }
        });
        txtDui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDuiKeyReleased(evt);
            }
        });
        panelRound1.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 280, 40));

        lbDui.setForeground(new java.awt.Color(0, 0, 0));
        lbDui.setText("Ya esta relacionado con una cuenta");
        panelRound1.add(lbDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 210, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DUI");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 40, -1));

        cbCargo.setForeground(new java.awt.Color(0, 0, 0));
        cbCargo.setLabeText("Nivel de Usuario");
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        panelRound1.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 190, 40));

        lbDui1.setForeground(new java.awt.Color(0, 0, 0));
        lbDui1.setText("Minimo de digitos 10, incluye el guión (-)");
        panelRound1.add(lbDui1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 250, 30));

        btnTok.setForeground(new java.awt.Color(0, 0, 0));
        btnTok.setText("Enviar token");
        btnTok.setColor1(new java.awt.Color(190, 233, 232));
        btnTok.setColor2(new java.awt.Color(190, 233, 232));
        btnTok.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnTok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTokActionPerformed(evt);
            }
        });
        panelRound1.add(btnTok, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 150, 50));

        btnDelT.setForeground(new java.awt.Color(255, 255, 255));
        btnDelT.setText("Eliminar tokens");
        btnDelT.setColor1(new java.awt.Color(255, 102, 102));
        btnDelT.setColor2(new java.awt.Color(255, 102, 102));
        btnDelT.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnDelT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360)
                .addComponent(jLabel5)
                .addGap(380, 380, 380)
                .addComponent(btnDelT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(btnDelT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loadCombo(JComboBox cb) throws SQLException {
        ctTipoUs ctTP = new ctTipoUs();
        ResultSet rs = ctTP.selectUser();
        while (rs.next()) {
            int idTP = rs.getInt("idTipoUsuario");
            String nombre = rs.getString("nivel");
            cb.addItem(nombre);
            cbMap.put(idTP, nombre);
        }
    }

    final void loadD() throws SQLException {
        String[] column = {"idDoctor", "Especialidad", "Nombre"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 3);
        CargarTabla();
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
            int fila = tbData.getSelectedRow();
        }

    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            ctDoctores ctD = new ctDoctores();
            ctD.nombre = txtBusq.getText().toString();
            ResultSet rs = ctD.cargarDoc();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idDoctor"), rs.getString("especialidad"),
                    rs.getString("Nombre")};
                model.addRow(oValores);
            }
        } catch (Exception e) {

        }
    }
    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        if (EmailValidator.getInstance().isValid(txtCorreo.getText())) {

            lbFalso.setVisible(false);
            btnTok.setEnabled(true);

        } else {

            lbFalso.setVisible(true);
            btnTok.setEnabled(false);

        }
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(crearTok.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void txtBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqActionPerformed

    private void btnTokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTokActionPerformed
        if (txtDui.getText().isEmpty() || txtCorreo.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {

            String token = GenerC(10);
            //VERIFICAR SI SE ENVIA

            if (Em(txtCorreo.getText(), token)) {
                //MENSAJE
                CódigoErrorDSI11 obj = new CódigoErrorDSI11();
                obj.eventOK(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        GlassPanePopup.closePopupLast();
                    }
                });
                GlassPanePopup.showPopup(obj);
                //REGISTRO
                ctPreRegistro ct = new ctPreRegistro();

                ct.dui = txtDui.getText();
                ct.token = token;
                if (idTipoUs == 2) {//SI ENTRA COMO RECEPCIONISTA SOLO VA A PODER CREAR CLIENTES
                    ct.idNivelUs = 3;
                } else {
                    ct.idNivelUs = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());
                }
                if (dsg.getMap(cbMap, cbCargo.getSelectedItem().toString()) == 5) {
                    ct.idDoc = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                } else {
                    ct.idDoc = 0;
                }
                ct.insertT();

                try {
                    CRUDusuarios subp = new CRUDusuarios(idTipoUs);
                    dsg.ShowPanel(subp, PCont, 1320, 810);
                } catch (SQLException ex) {
                    Logger.getLogger(crearTok.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                //MENSAJE DE QUE NO SE PUDO ENVIAR CORREO
                Correo obj = new Correo();
                obj.eventOK(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        GlassPanePopup.closePopupLast();
                    }
                });
                GlassPanePopup.showPopup(obj);
            }
        }

    }//GEN-LAST:event_btnTokActionPerformed
    public String GenerC(int longi) {
        String num = "0123456789";
        String lmin = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String caract = lmin + num;
        Random cod = new Random();
        String result = "";
        for (int i = 0; i < longi; i++) {
            int posic = cod.nextInt(caract.length());
            char caracter = caract.charAt(posic);
            result += caracter;
        }
        return result;

    }
    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
        if (dsg.getMap(cbMap, cbCargo.getSelectedItem().toString()) == 5) {//SI ES ASISTENTE
            panelR2.setVisible(true);
            try {
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(crearTok.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            panelR2.setVisible(false);
        }
        System.out.println("ID seleccionado: " + dsg.getMap(cbMap, cbCargo.getSelectedItem().toString()));
    }//GEN-LAST:event_cbCargoActionPerformed

    private void txtDuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuiActionPerformed

    private void txtDuiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyReleased
        ctUser ctUs = new ctUser();
        ctUs.dui = txtDui.getText().toString();

        try {
            if (ctUs.duiPre().next()) {
                lbDui.setVisible(true);
                btnTok.setEnabled(false);

            } else {
                lbDui.setVisible(false);
                btnTok.setEnabled(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (txtDui.getText().length() >= 10) {
            lbDui1.setVisible(false);
            btnTok.setEnabled(true);
        } else {
            lbDui1.setVisible(true);
            btnTok.setEnabled(false);
        }
    }//GEN-LAST:event_txtDuiKeyReleased


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDusuarios subp = new CRUDusuarios(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(crearTok.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDataMouseClicked

    private void txtBusq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusq1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusq1ActionPerformed

    private void txtBusq1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusq1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusq1KeyReleased

    private void btnDelTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelTActionPerformed
        UIManager.put("OptionPane.messageDialogTitle", "Confirmación");
        int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Desea eliminar todos los tokens?",
                "Advertencia",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new Object[]{"Sí", "No"},
                "No");

        if (opcion == JOptionPane.YES_OPTION) {
            ctPreRegistro ct = new ctPreRegistro();
            ct.delAllT();
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnDelTActionPerformed
    public boolean Em(String txt, String clave) {
        try {
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.ssl.protocols", "TLSv1.2");

            Session ses = Session.getDefaultInstance(props);

            String cRem = "vetsoftsoporte@gmail.com";
            String pRem = "jtsteydqiifilcpi";
            String cRec = txt;
            String asunto = "VETSOFT TOKEN";
            String mensaje = "<!DOCTYPE html>\n"
                    + "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                    + "\n"
                    + "<head>\n"
                    + "    <meta charset=\"utf-8\">\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "    <title>TOKEN PARA CREAR CUENTA</title>\n"
                    + "\n"
                    + "    <style>\n"
                    + "        @import url('https://fonts.googleapis.com/css2?family=Karla:wght@300&family=Montserrat:wght@300&family=Poppins:wght@300&family=Roboto+Mono:ital@0;1&display=swap');\n"
                    + "\n"
                    + "        *, *:before, *:after {\n"
                    + "            -moz-box-sizing: border-box;\n"
                    + "            -webkit-box-sizing: border-box;\n"
                    + "            box-sizing: border-box;\n"
                    + "        }\n"
                    + "\n"
                    + "        body {\n"
                    + "            background-color: #1B4965;\n"
                    + "            margin-top: 55px;\n"
                    + "            margin-bottom: 55px;\n"
                    + "        }\n"
                    + "\n"
                    + "        form {\n"
                    + "            max-width: 300px;\n"
                    + "            margin: 10px auto;\n"
                    + "            padding: 10px 20px;\n"
                    + "            background: rgb(255, 255, 255);\n"
                    + "            border-radius: 5px;\n"
                    + "        }\n"
                    + "\n"
                    + "        h1 {\n"
                    + "            text-align: center;\n"
                    + "            font-family: Brush Script MT;\n"
                    + "            font-family: 'Roboto Mono', monospace;\n"
                    + "            font-family: 'Montserrat', sans-serif;\n"
                    + "            font-size: 35px;\n"
                    + "            color: black;\n"
                    + "        }\n"
                    + "\n"
                    + "        h3 {\n"
                    + "            text-align: center;\n"
                    + "            font-family: 'Karla', sans-serif;\n"
                    + "            color: black;\n"
                    + "        }\n"
                    + "\n"
                    + "        select {\n"
                    + "            padding: 6px;\n"
                    + "            height: 32px;\n"
                    + "            border-radius: 2px;\n"
                    + "        }\n"
                    + "\n"
                    + "        fieldset {\n"
                    + "            margin-bottom: 30px;\n"
                    + "            border: none;\n"
                    + "        }\n"
                    + "\n"
                    + "        legend {\n"
                    + "            font-family: Candara;\n"
                    + "            font-size: 1.5em;\n"
                    + "            margin-bottom: 10px;\n"
                    + "            font-family: 'Poppins', sans-serif;\n"
                    + "        }\n"
                    + "\n"
                    + "        label {\n"
                    + "            display: block;\n"
                    + "            margin-bottom: 8px;\n"
                    + "            font-family: Times New Roman;\n"
                    + "            font-family: 'Karla', sans-serif;\n"
                    + "        }\n"
                    + "\n"
                    + "            label.light {\n"
                    + "                font-weight: 300;\n"
                    + "                display: inline;\n"
                    + "            }\n"
                    + "\n"
                    + "        .img {\n"
                    + "            padding-top: 10px;\n"
                    + "        }\n"
                    + "\n"
                    + "        @media screen and (min-width: 480px) {\n"
                    + "\n"
                    + "            form {\n"
                    + "                max-width: 480px;\n"
                    + "            }\n"
                    + "        }\n"
                    + "\n"
                    + "        @media screen and (max-width: 480px) {\n"
                    + "\n"
                    + "            form {\n"
                    + "                max-width: 480px;\n"
                    + "            }\n"
                    + "\n"
                    + "            .img {\n"
                    + "                width: 300px;\n"
                    + "                padding-top: 10px;\n"
                    + "            }\n"
                    + "\n"
                    + "            .logo {\n"
                    + "                width: 40px;\n"
                    + "            }\n"
                    + "\n"
                    + "            @media screen and (max-width: 388px) {\n"
                    + "\n"
                    + "                form {\n"
                    + "                    max-width: 388px;\n"
                    + "                }\n"
                    + "\n"
                    + "                .img {\n"
                    + "                    width: 280px;\n"
                    + "                    padding-top: 10px;\n"
                    + "                }\n"
                    + "\n"
                    + "                .logo {\n"
                    + "                    width: 30px;\n"
                    + "                }\n"
                    + "            }\n"
                    + "\n"
                    + "            @media screen and (max-width: 374px) {\n"
                    + "\n"
                    + "                form {\n"
                    + "                    max-width: 374px;\n"
                    + "                }\n"
                    + "\n"
                    + "                .img {\n"
                    + "                    width: 250px;\n"
                    + "                    padding-top: 10px;\n"
                    + "                }\n"
                    + "\n"
                    + "                .logo {\n"
                    + "                    width: 20px;\n"
                    + "                }\n"
                    + "            }\n"
                    + "\n"
                    + "            @media screen and (max-width: 330px) {\n"
                    + "\n"
                    + "                form {\n"
                    + "                    max-width: 330px;\n"
                    + "                }\n"
                    + "\n"
                    + "                .img {\n"
                    + "                    width: 210px;\n"
                    + "                    padding-top: 10px;\n"
                    + "                }\n"
                    + "\n"
                    + "                .logo {\n"
                    + "                    width: 20px;\n"
                    + "                }\n"
                    + "            }\n"
                    + "        }\n"
                    + "    </style>\n"
                    + "</head>\n"
                    + "\n"
                    + "<body>\n"
                    + "    <div>\n"
                    + "        <form action=\"index.html\" method=\"post\">\n"
                    + "          <p style=\"text-align: center; \">\n"
                    + "            <img class=\"img\" src=\"https://cdn.icon-icons.com/icons2/2093/PNG/512/hospital_health_clinic_urban_buildings_medical_icon_128575.png\" width=\"100px\">\n"
                    + "        </a>\n"
                    + "    </p>\n"
                    + "            <h1> Vetsoft </h1>\n"
                    + "            <hr style: width=\"50%\" color=\"black\">\n"
                    + "            <br>\n"
                    + "            <fieldset>\n"
                    + "\n"
                    + "                <legend>Hola querido usuario<b> </b></legend>\n"
                    + "\n"
                    + "                <label>\n"
                    + "                   Antes de completar el proceso de registro de su cuenta dento del programa Vetsoft, recuerde que este token no tiene que compartirlo con ninguna otra persona\n"
                    + "                </label>\n"
                    + "            </fieldset>\n"
                    + "            <fieldset>\n"
                    + "\n"
                    + "                <legend>Tu tóken para crear tu cuenta es: " + clave + "<br> <b></b></legend>\n"
                    + "\n"
                    + "                <label>Ingresa al programa de Vetsoft y digita el token antes mencionado en el apartado de registro.</label>\n"
                    + "\n"
                    + "                <p style=\"text-align: center; \">\n"
                    + "                        <img class=\"img\" src=\"https://3.bp.blogspot.com/-zKi3VgfDUs4/XItCT72IdOI/AAAAAAAAAA4/Rb7xzF2gCu8LS7NrDjxnKEbkkyg-3jQQwCPcBGAYYCw/s1600/seguridad-1.gif\" width=\"300px\">\n"
                    + "                    </a>\n"
                    + "                </p>\n"
                    + "            </fieldset>\n"
                    + "        </form>\n"
                    + "    </div>\n"
                    + "</body>\n"
                    + "\n"
                    + "</html>";

            MimeMessage msg = new MimeMessage(ses);
            msg.setFrom(new InternetAddress(cRem));

            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(cRec));
            msg.setSubject(asunto);
            msg.setText(mensaje);

            MimeMultipart multipart = new MimeMultipart();
            MimeBodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent(mensaje, "text/html");

            multipart.addBodyPart(htmlPart);

            msg.setContent(multipart);
            //Transport.send(msg);

            Transport t = ses.getTransport("smtp");

            t.connect(cRem, pRem);//correo y contraseña
            t.sendMessage(msg, msg.getRecipients(Message.RecipientType.TO));
            t.close();

            return true;

        } catch (AddressException e) {

            System.out.println(e.toString());
            return false;
        } catch (MessagingException e) {

            System.out.println(e.toString());
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnDelT;
    private Design.ButtonGradient btnTok;
    private Design.Combobox cbCargo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbDoc;
    private javax.swing.JLabel lbDoc1;
    private javax.swing.JLabel lbDui;
    private javax.swing.JLabel lbDui1;
    private javax.swing.JLabel lbFalso;
    private Design.PanelRound panelR2;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtBusq1;
    private Design.TextFieldSV txtCorreo;
    private Design.TextFieldSV txtDui;
    // End of variables declaration//GEN-END:variables
}

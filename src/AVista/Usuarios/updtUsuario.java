package AVista.Usuarios;

import AControlador.ctTipoUs;
import AControlador.ctUser;
import Design.Desg;
import Mensajes.Campos;
import Mensajes.CódigoErrorDSI2;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import Tipografias.Fuentes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.apache.commons.validator.EmailValidator;

public class updtUsuario extends javax.swing.JPanel {

    private int idTipoUs;
    private int idUs;
    private int tpUs;
    ctTipoUs ctTP = new ctTipoUs();
    ctUser ctUs = new ctUser();
    Desg dsg = new Desg();
    Map<Integer, String> cbMap = new HashMap<>();
    Fuentes tipoFuente;

    public updtUsuario(int idTipoUs, int idUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idUs = idUs;
        initComponents();

        tipoFuente = new Fuentes();

        jLabel2.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 32));
        jLabel9.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 17));
        jLabel6.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 17));
        jLabel10.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 17));
        lbCargo.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 17));
        txtUsuario.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 15));
        txtTel.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 15));
        txtCorreo.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 15));

        txtUsuario.setDocument(new Valida(30, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtCorreo.setDocument(new Valida(50, "[a-zA-Z0-9@._]*"));
        txtTel.setDocument(new Valida(10, "[0-9]*"));
        lbDisp.setVisible(false);
        lbMin.setVisible(false);
        lbMin1.setVisible(false);
        lbFalso.setVisible(false);
        if (idTipoUs == 1) {

        } else {
            lbCargo.setVisible(false);
            cbCargo.setVisible(false);
        }
        loadCombo(cbCargo);
        CargarDatos();

    }

    final void CargarDatos() throws SQLException {
        try {
            ctUs.idUs = idUs;
            ResultSet rs = ctUs.loadData();
            while (rs.next()) {
                txtUsuario.setText(rs.getString("usuario"));
                txtCorreo.setText(rs.getString("correo"));
                txtTel.setText(rs.getString("telefono"));
                cbCargo.setSelectedItem(rs.getString("Cargo"));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private void loadCombo(JComboBox cb) throws SQLException {
        ResultSet rs = ctTP.selectTP();
        while (rs.next()) {
            int idTP = rs.getInt("idTipoUsuario");
            String nombre = rs.getString("nivel");
            cb.addItem(nombre);
            cbMap.put(idTP, nombre);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnConfirmar = new Design.ButtonGradient();
        panelRound1 = new Design.PanelRound();
        cbCargo = new javax.swing.JComboBox<>();
        lbCargo = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbDisp = new javax.swing.JLabel();
        txtUsuario = new Design.TextFieldSV();
        txtTel = new Design.TextFieldSV();
        txtCorreo = new Design.TextFieldSV();
        jLabel10 = new javax.swing.JLabel();
        lbFalso = new javax.swing.JLabel();
        lbMin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ACTUALIZAR USUARIO");

        btnBack.setBackground(new java.awt.Color(190, 233, 232));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbCargo.setBackground(new java.awt.Color(190, 233, 232));
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        panelRound1.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 160, 40));

        lbCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(0, 0, 0));
        lbCargo.setText("Nivel de cargo");
        panelRound1.add(lbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 140, 40));

        lbMin1.setForeground(new java.awt.Color(0, 0, 0));
        lbMin1.setText("Minimo de digitos 8");
        panelRound1.add(lbMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Teléfono");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 120, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Usuario");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, 30));

        lbDisp.setForeground(new java.awt.Color(0, 0, 0));
        lbDisp.setText("Usuario no disponible");
        panelRound1.add(lbDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, 30));

        txtUsuario.setBackground(new java.awt.Color(190, 233, 232));
        txtUsuario.setShadowColor(new java.awt.Color(0, 0, 51));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        panelRound1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 230, 50));

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
        panelRound1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 230, 50));

        txtCorreo.setBackground(new java.awt.Color(190, 233, 232));
        txtCorreo.setShadowColor(new java.awt.Color(0, 0, 51));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });
        panelRound1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 230, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Correo electrónico");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 230, 30));

        lbFalso.setForeground(new java.awt.Color(0, 0, 0));
        lbFalso.setText("Correo electrónico falso");
        panelRound1.add(lbFalso, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 150, 30));

        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 4");
        panelRound1.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("VetSoft+");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(528, 528, 528))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(22, 22, 22)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
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

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
        /*tpUs = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());  
        System.out.println("ID seleccionado: " + tpUs);*/
    }//GEN-LAST:event_cbCargoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDusuarios subp = new CRUDusuarios(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(updtUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (txtUsuario.getText().isEmpty() || txtTel.getText().isEmpty() || txtCorreo.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            ctUser ctUs = new ctUser();
            if (idTipoUs == 1) {
                ctUs.idTipoCuenta = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());
            }
            if (idTipoUs == 2) {
                ctUs.idTipoCuenta = 3;
            }
            ctUs.usuario = txtUsuario.getText();
            ctUs.correo = txtCorreo.getText();
            ctUs.telefono = txtTel.getText();
            ctUs.idUs = idUs;
            ctUs.updtUs();
             Campos obj = new Campos();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
    }//GEN-LAST:event_btnConfirmarActionPerformed
    }
    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        // TODO add your handling code here:
        if (EmailValidator.getInstance().isValid(txtCorreo.getText())) {
            //if(verificar_Email(jTextField1.getText())){    

            lbFalso.setVisible(false);
            btnConfirmar.setEnabled(true);

        } else {

            lbFalso.setVisible(true);
            btnConfirmar.setEnabled(false);

        }
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_txtTelKeyTyped

    private void txtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyReleased
        // TODO add your handling code here:
        if (txtTel.getText().length() >= 8 && txtUsuario.getText().length() >= 4) {
            lbMin1.setVisible(false);
            btnConfirmar.setEnabled(true);
        } else {
            if (txtTel.getText().length() >= 8) {
            lbMin1.setVisible(false);
            btnConfirmar.setEnabled(true);
            }
        else {
            lbMin1.setVisible(true);
            btnConfirmar.setEnabled(false);
        }
    }//GEN-LAST:event_txtTelKeyReleased
    }
    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        // TODO add your handling code here:
        ctUser ctUs = new ctUser();
        ctUs.usuario = txtUsuario.getText().toString();
        try {
            if (ctUs.verifUs().next()) {
                lbDisp.setVisible(true);
                btnConfirmar.setEnabled(false);

            } else {
                lbDisp.setVisible(false);
                btnConfirmar.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (txtUsuario.getText().length() >= 4 && txtTel.getText().length() >= 8) {
            lbMin.setVisible(false);
            btnConfirmar.setEnabled(true);
        } else {
            if (txtUsuario.getText().length() >= 4) {
                lbMin.setVisible(false);
                btnConfirmar.setEnabled(true);
            } else {
                lbMin.setVisible(true);
                btnConfirmar.setEnabled(false);
            }
    }//GEN-LAST:event_txtUsuarioKeyReleased
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirmar;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbDisp;
    private javax.swing.JLabel lbFalso;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbMin1;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtCorreo;
    private Design.TextFieldSV txtTel;
    private Design.TextFieldSV txtUsuario;
    // End of variables declaration//GEN-END:variables
}

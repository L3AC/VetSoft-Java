package AVista.Usuarios;

import AControlador.ctTipoUs;
import AControlador.ctUser;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class updtUsuario extends javax.swing.JPanel {

    private int idTipoUs;
    private int idUs;
    private int tpUs;
    ctTipoUs ctTP = new ctTipoUs();
    ctUser ctUs = new ctUser();
    Desg dsg = new Desg();
    Map<Integer, String> cbMap = new HashMap<>();

    public updtUsuario(int idTipoUs, int idUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idUs = idUs;
        initComponents();
        lbDisp.setVisible(false);
        if(idTipoUs==1){
           
        }
        else{
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
    private void loadCombo(JComboBox cb) throws SQLException{
        ResultSet rs=ctTP.selectTP();
        while (rs.next()) {
                int idTP=rs.getInt("idTipoUsuario");
                String nombre=rs.getString("nivel");
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
        buttonGradient1 = new Design.ButtonGradient();
        panelRound1 = new Design.PanelRound();
        cbCargo = new javax.swing.JComboBox<>();
        lbCargo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsuario = new Design.Textfield();
        lbDisp = new javax.swing.JLabel();
        txtCorreo = new Design.Textfield();
        txtTel = new Design.Textfield();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 73, 101));
        jLabel2.setText("ACTUALIZAR USUARIO");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        buttonGradient1.setText("Confirmar");
        buttonGradient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient1ActionPerformed(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbCargo.setBackground(new java.awt.Color(255, 255, 255));
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        panelRound1.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 160, 40));

        lbCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(0, 0, 0));
        lbCargo.setText("Nivel de cargo");
        panelRound1.add(lbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 130, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Correo electrónico");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Teléfono");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 80, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Usuario");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, 30));

        txtUsuario.setAnimationColor(new java.awt.Color(153, 204, 255));
        panelRound1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 213, -1));

        lbDisp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDisp.setForeground(new java.awt.Color(0, 0, 0));
        lbDisp.setText("Usuario no disponible");
        panelRound1.add(lbDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 190, 30));

        txtCorreo.setAnimationColor(new java.awt.Color(153, 204, 255));
        txtCorreo.setAutoscrolls(false);
        panelRound1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 245, -1));

        txtTel.setAnimationColor(new java.awt.Color(153, 204, 255));
        panelRound1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 215, -1));

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(532, 532, 532)
                        .addComponent(buttonGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(buttonGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
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

    private void buttonGradient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient1ActionPerformed

        ctUser ctUs=new ctUser();
        if(idTipoUs==1){
            ctUs.idTipoCuenta=dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());
        }
        if(idTipoUs==2){
            ctUs.idTipoCuenta=3;
        }
        ctUs.usuario=txtUsuario.getText();
        ctUs.correo=txtCorreo.getText();
        ctUs.telefono=txtTel.getText();
        ctUs.idUs=idUs;
        ctUs.updtUs();
    }//GEN-LAST:event_buttonGradient1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient buttonGradient1;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbDisp;
    private Design.PanelRound panelRound1;
    private Design.Textfield txtCorreo;
    private Design.Textfield txtTel;
    private Design.Textfield txtUsuario;
    // End of variables declaration//GEN-END:variables
}

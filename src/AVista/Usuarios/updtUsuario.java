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
        jLabel9 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lbDisp = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        lbCargo = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtTel = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("ACTUALIZAR USUARIO");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Usuario");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });

        lbDisp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDisp.setText("Usuario no disponible");

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Correo electrónico");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Teléfono");

        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });

        lbCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCargo.setText("Nivel de cargo");

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtTel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(370, 370, 370)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260)
                .addComponent(jLabel8))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(lbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
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

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
        /*tpUs = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());  
        System.out.println("ID seleccionado: " + tpUs);*/
    }//GEN-LAST:event_cbCargoActionPerformed

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDusuarios subp = new CRUDusuarios(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(updtUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        ctUser ctUs=new ctUser();
        ctUs.usuario=txtUsuario.getText().toString();
        try {
            if(ctUs.verifUs().next()){
                lbDisp.setVisible(true);
                btnConfirm.setEnabled(false);
            }
            else{
                lbDisp.setVisible(false);
                btnConfirm.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(insertUs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        ctUser ctUs=new ctUser();
        ctUs.idTipoCuenta=dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());
        ctUs.usuario=txtUsuario.getText();
        ctUs.correo=txtCorreo.getText();
        ctUs.telefono=txtTel.getText();
        ctUs.idUs=idUs;
        ctUs.updtUs();
        
    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbDisp;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

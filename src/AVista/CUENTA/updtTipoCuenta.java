
package AVista.CUENTA;

import AControlador.ctCliente;
import AControlador.ctDoctores;
import AControlador.ctEsp;
import AControlador.ctRecep;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;

public class updtTipoCuenta extends javax.swing.JPanel {

    private int idTipoUs;
    private int idCuenta;
    private int nivelRow;
    ctEsp ct = new ctEsp();
    Desg dsg = new Desg();
    Map<Integer, String> cbMap = new HashMap<>();
    
    public updtTipoCuenta(int idTipoUs, int idCuenta, int nivelRow) throws SQLException {
        initComponents();
        this.idTipoUs = idTipoUs;
        this.idCuenta = idCuenta;
        this.nivelRow = nivelRow;
        initComponents();

        if (idTipoUs == 1) {
            if (nivelRow != 4) {
                lbEsp.setVisible(false);
                cbEsp.setVisible(false);
    
            } else {
                loadCombo(cbEsp);
                cbEsp.setSelectedIndex(0);
            }
            if(nivelRow!=3){
                lbDir.setVisible(false);
                txtDir.setVisible(false);  
            }
            else{
                
            }

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

        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 70, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("ACTUALIZAR PERFIL");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 330, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Nombres");
        PCont.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 100, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PCont.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 270, 50));

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setText("Especialidad");
        PCont.add(lbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 110, 30));

        PCont.add(cbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 200, 40));

        txtDui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PCont.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 220, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Número de DUI");
        PCont.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Sexo");
        PCont.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 100, 30));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        PCont.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 200, 40));

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 140, 70));
        PCont.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 250, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nacimiento");
        PCont.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 150, 30));

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PCont.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 270, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Apellidos");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 100, 30));

        lbDir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDir.setText("Dirección");
        PCont.add(lbDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 150, 30));

        txtDir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PCont.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 360, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loadCombo(JComboBox cb) throws SQLException {
        ctEsp ct = new ctEsp();
        ResultSet rs = ct.selectEsp();
        while (rs.next()) {
            int idTP = rs.getInt("idEspecialidad");
            String nombre = rs.getString("especialidad");
            cb.addItem(nombre);
            cbMap.put(idTP, nombre);

        }
    }
    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        SimpleDateFormat dt =new SimpleDateFormat("yyyy-MM-dd");
        if(nivelRow==2){
            ctRecep ct=new ctRecep();
            ct.idRecep=idCuenta;
            ct.nombre=txtNombre.getText();
            ct.apellido=txtApellidos.getText();
            ct.dui=txtDui.getText();
            ct.nacimiento=dt.format(dpNaci.getCalendar().getTime());
            System.out.println(dt.format(dpNaci.getCalendar().getTime()));
            ct.sexo=cbSexo.getSelectedItem().toString();
            ct.updtRecep();
        }
        if(nivelRow==3){
            ctCliente ct=new ctCliente();
            ct.idCliente=idCuenta;
            ct.nombre=txtNombre.getText();
            ct.apellido=txtApellidos.getText();
            ct.dui=txtDui.getText();
            ct.nacimiento=dt.format(dpNaci.getCalendar().getTime());
            ct.sexo=cbSexo.getSelectedItem().toString();
            ct.direccion=txtDir.getText();
            ct.updtCl();
        }
        if(nivelRow==4){
            ctDoctores ct=new ctDoctores();
            ct.idDoctor=idCuenta;
            ct.idEsp=dsg.getMap(cbMap, cbEsp.getSelectedItem().toString());
            ct.nombre=txtNombre.getText();
            ct.apellido=txtApellidos.getText();
            ct.dui=txtDui.getText();
            ct.nacimiento=dt.format(dpNaci.getCalendar().getTime());
            ct.sexo=cbSexo.getSelectedItem().toString();
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

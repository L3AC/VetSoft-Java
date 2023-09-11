
package AVista.Perfil;

import AControlador.ctUser;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeguridadC extends javax.swing.JPanel {
    private int idTipoUs;
    private int idUs;
    private String contra;
    Desg dsg = new Desg();

    public SeguridadC(int idTipoUs,int idUs) throws SQLException {
        this.idTipoUs=idTipoUs;
        this.idTipoUs=idTipoUs;
        initComponents();
        loadInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtProd = new Design.TextFieldSV();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProd1 = new Design.TextFieldSV();
        jLabel4 = new javax.swing.JLabel();
        txtProd2 = new Design.TextFieldSV();
        btnConfirm = new Design.ButtonGradient();
        btnConfirm1 = new Design.ButtonGradient();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        jPanel1.setBackground(new java.awt.Color(190, 233, 232));

        txtProd.setShadowColor(new java.awt.Color(0, 0, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese su contraseña actual");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese su nueva contraseña");

        txtProd1.setShadowColor(new java.awt.Color(0, 0, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Digite su contraseña de nuevo");

        txtProd2.setShadowColor(new java.awt.Color(0, 0, 51));

        btnConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("Verificar");
        btnConfirm.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnConfirm1.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirm1.setText("Cambiar");
        btnConfirm1.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(27, 73, 101));
        jLabel5.setText("CAMBIO DE CONTRASEÑA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(600, 600, 600)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addComponent(txtProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addComponent(txtProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(590, 590, 590)
                        .addComponent(btnConfirm1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)))
                .addGap(420, 420, 420))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(txtProd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(txtProd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnConfirm1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        /*if (txtNombre.getText().isEmpty() || txtApellidos.getText().isEmpty()
            || txtDui.getText().isEmpty() || txtDir.getText().isEmpty()) {

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
        }*/
    }//GEN-LAST:event_btnConfirmActionPerformed

    final void loadInfo() throws SQLException {
        try {

            ctUser ct = new ctUser();
            ct.idUs = idUs;
            ResultSet rs = ct.loadData();

            while (rs.next()) {
                contra = rs.getString("usuario");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    private void btnConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirm1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.ButtonGradient btnConfirm;
    private Design.ButtonGradient btnConfirm1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private Design.TextFieldSV txtProd;
    private Design.TextFieldSV txtProd1;
    private Design.TextFieldSV txtProd2;
    // End of variables declaration//GEN-END:variables
}

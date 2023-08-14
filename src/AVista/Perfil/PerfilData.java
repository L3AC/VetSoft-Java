
package AVista.Perfil;


public class PerfilData extends javax.swing.JPanel {

    public PerfilData() {
        initComponents();
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
        txtDir = new Design.TextFieldSV();
        lbDir = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre1 = new Design.TextFieldSV();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new Design.TextFieldSV();
        txtTel = new Design.TextFieldSV();
        jLabel10 = new javax.swing.JLabel();
        btnConfirm = new Design.ButtonGradient();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 73, 101));
        jLabel2.setText("CUENTA PERSONAL");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 330, 50));

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellidos.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 300, 49));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Apellidos");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nacimiento");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 150, 30));
        panelRound1.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 280, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombres");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 100, 30));

        txtNombre.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 293, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Número de DUI");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, -1));

        txtDui.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sexo");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 100, 30));

        cbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        panelRound1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 200, 40));

        txtDir.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 360, 51));

        lbDir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDir.setForeground(new java.awt.Color(0, 0, 0));
        lbDir.setText("Dirección");
        panelRound1.add(lbDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Usuario");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 30));

        txtNombre1.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 293, 51));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Correo");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, -1));

        txtCorreo.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 290, 51));

        txtTel.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 240, 51));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Télefono");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 150, -1));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 1090, 460));

        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 660, 182, 60));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbDir;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtApellidos;
    private Design.TextFieldSV txtCorreo;
    private Design.TextFieldSV txtDir;
    private Design.TextFieldSV txtDui;
    private Design.TextFieldSV txtNombre;
    private Design.TextFieldSV txtNombre1;
    private Design.TextFieldSV txtTel;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.CUENTA;

import AControlador.ctEsp;
import AControlador.ctUser;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;

public class insertTipoCuenta extends javax.swing.JPanel {

    private int idTipoUs;
    private int idUs;
    private int nivelRow;
    ctEsp ct = new ctEsp();
    Desg dsg = new Desg();
    Map<Integer, String> cbMap= new HashMap<>();
    
    public insertTipoCuenta(int idTipoUs,int idUs,int nivelRow) throws SQLException {
        this.idTipoUs=idTipoUs;
        this.idUs=idUs;
        this.nivelRow=nivelRow;
        initComponents();
        
        dpNaci.getJCalendar().setEnabled(false);
       
        if(idTipoUs==1){
            if(nivelRow!=4){
                lbEsp.setVisible(false);
                cbEsp.setVisible(false);
            }
            else{
                loadCombo(cbEsp);
                cbEsp.setSelectedIndex(0);
            }
          
        }
        if(idTipoUs==2){
            lbEsp.setVisible(false);
            cbEsp.setVisible(false);
        }
        
    }
    private void loadCombo(JComboBox cb) throws SQLException{
        ctEsp ct=new ctEsp();
        ResultSet rs=ct.selectEsp();
        while (rs.next()) {
                int idTP=rs.getInt("idEspecialidad");
                String nombre=rs.getString("especialidad");
                cb.addItem(nombre);
                cbMap.put(idTP, nombre);
                
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbEsp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDui = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        cbEsp = new javax.swing.JComboBox<>();
        dpNaci = new com.toedter.calendar.JDateChooser();
        btnBack = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("CREAR PERFIL");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 235, 50));

        lbEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp.setText("Especialidad");
        PCont.add(lbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 110, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Nombres");
        PCont.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 100, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setText("nombre");
        PCont.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 270, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Número de DUI");
        PCont.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 150, 30));

        txtDui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDui.setText("DUI");
        PCont.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 220, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Sexo");
        PCont.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 100, 30));

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirm.setText("Confirmar");
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 140, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nacimiento");
        PCont.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 150, 30));

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtApellidos.setText("apellidos");
        PCont.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 270, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Apellidos");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 100, 30));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        PCont.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 200, 40));

        PCont.add(cbEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 160, 40));
        PCont.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 250, 40));

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

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


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
    private javax.swing.JLabel lbEsp;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

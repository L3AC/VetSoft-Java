/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Usuarios;

import AControlador.ctEsp;
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

/**
 *
 * @author LEAC2
 */
public class insertUs extends javax.swing.JPanel {

    private int idTipoUs;
    private int tpUs;
    ctTipoUs ctTP=new ctTipoUs();
    ctUser ctUs=new ctUser();
    Desg dsg = new Desg();
    Map<Integer, String> cbMap= new HashMap<>();
    
    public insertUs(int idTipoUs) throws SQLException {
        this.idTipoUs=idTipoUs;
        initComponents();
        loadCombo(cbCargo);
        cbCargo.setSelectedIndex(0);
        
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
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        txtApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nivel de cargo");
        PCont.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("CREAR USUARIO");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 270, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("No disponible");
        PCont.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 130, 30));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        PCont.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 270, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Correo electrónico");
        PCont.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 150, 30));

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PCont.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 270, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Teléfono");
        PCont.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 80, 30));

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirm.setText("Confirmar");
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 140, 70));

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PCont.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 270, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Contraseña");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 100, 30));

        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        PCont.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 160, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Usuario");
        PCont.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 70, 30));

        txtTel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        PCont.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 270, 50));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 60, 50));

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
        int selectedId = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());
        tpUs=selectedId;  
        System.out.println("ID seleccionado: " + tpUs);
    }//GEN-LAST:event_cbCargoActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        ctUs.usuario=txtUsuario.getText().toString();
    }//GEN-LAST:event_txtUsuarioKeyTyped

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

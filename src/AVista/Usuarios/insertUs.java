/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Usuarios;

import AControlador.ctEsp;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;

/**
 *
 * @author LEAC2
 */
public class insertUs extends javax.swing.JPanel {

    ctEsp ctE=new ctEsp();
    Map<Integer, String> cbMap= new HashMap<>();
    
    public insertUs() {
        initComponents();
    }
    private void loadCombo(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDui = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        txtApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        cbTipo1 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nivel de cargo");
        PCont.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("CREAR USUARIO");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 270, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Usuario");
        PCont.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 70, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setText("Usuario");
        PCont.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 270, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Correo electrónico");
        PCont.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 150, 30));

        txtDui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDui.setText("DUI");
        PCont.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 270, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Teléfono");
        PCont.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 80, 30));

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirm.setText("Confirmar");
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 140, 70));

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtApellidos.setText("Apellidos");
        PCont.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 270, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Contraseña");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 100, 30));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        PCont.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 270, 50));

        cbTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Doctor", "Asistente", "Recepcionista" }));
        PCont.add(cbTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 160, 40));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista;

/**
 *
 * @author rodri
 */
public class Preguntaaas extends javax.swing.JPanel {


    public Preguntaaas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtTeléfono1 = new Design.TextFieldSV();
        txtTeléfono2 = new Design.TextFieldSV();
        txtTeléfono3 = new Design.TextFieldSV();

        setBackground(new java.awt.Color(202, 233, 255));
        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        jLabel3.setText("¿Cuál es tu película favorita?");
        PCont.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PCont.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, 110, 40));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        jLabel2.setText("¿Cuál es tu película favorita?");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PCont.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 110, 40));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel4.setText("Preguntas de Seguridad");
        PCont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        jLabel1.setText("¿Cuál es el nombre de tu mejor amigo de la infancia?");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 80, 60));

        txtTeléfono1.setShadowColor(new java.awt.Color(153, 0, 153));
        txtTeléfono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeléfono1ActionPerformed(evt);
            }
        });
        txtTeléfono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTeléfono1KeyTyped(evt);
            }
        });
        PCont.add(txtTeléfono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 430, -1));

        txtTeléfono2.setShadowColor(new java.awt.Color(153, 0, 153));
        txtTeléfono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeléfono2ActionPerformed(evt);
            }
        });
        txtTeléfono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTeléfono2KeyTyped(evt);
            }
        });
        PCont.add(txtTeléfono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 430, -1));

        txtTeléfono3.setShadowColor(new java.awt.Color(153, 0, 153));
        txtTeléfono3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeléfono3ActionPerformed(evt);
            }
        });
        txtTeléfono3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTeléfono3KeyTyped(evt);
            }
        });
        PCont.add(txtTeléfono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 430, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtTeléfono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeléfono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeléfono1ActionPerformed

    private void txtTeléfono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeléfono1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeléfono1KeyTyped

    private void txtTeléfono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeléfono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeléfono2ActionPerformed

    private void txtTeléfono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeléfono2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeléfono2KeyTyped

    private void txtTeléfono3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeléfono3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeléfono3ActionPerformed

    private void txtTeléfono3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeléfono3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeléfono3KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private Design.TextFieldSV txtTeléfono1;
    private Design.TextFieldSV txtTeléfono2;
    private Design.TextFieldSV txtTeléfono3;
    // End of variables declaration//GEN-END:variables
}

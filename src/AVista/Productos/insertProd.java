package AVista.Productos;

import AControlador.ctProd;
import AControlador.ctRaza;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class insertProd extends javax.swing.JPanel {

    private int idTipoUs;
    Desg dsg = new Desg();

    public insertProd(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        initComponents();
//        loadD();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        btnAgregar = new Design.ButtonGradient();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio");
        PCont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        txtBusq.setBackground(new java.awt.Color(202, 233, 255));
        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 550, -1));

        btnAgregar.setText("Confirmar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        PCont.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 140, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre del producto");
        PCont.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Proveedor");
        PCont.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAgregar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}


package AVista.CRUDS;

import AControlador.ctCliente;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class CRUDCliente extends javax.swing.JPanel {

    public int nUs;
    private int idCl;
    ctCliente ct = new ctCliente();
    Desg dsg = new Desg();
    insertTipoC subp =new insertTipoC();
    DefaultTableModel model;
    
    public CRUDCliente(int nUs) throws SQLException {
        initComponents();
        loadD();
    }

    public CRUDCliente() throws SQLException {
        initComponents();
        loadD();
    }

    final void loadD() throws SQLException{ 
        String[] column = {"idCliente", "Nombre", "Edad", "Sexo"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model,tbData, 0);
        CargarTabla ();
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        try {
            ct.nombre=txtBusq.getText().toString();
            ResultSet rs = ct.cargarCl();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idCliente"), rs.getString("Nombre")
                , rs.getString("Edad") , rs.getString("Sexo") };
                        model.addRow(oValores);
            }
        } catch (Exception e) {

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        txtBusq = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        btnAddM = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 810));
        setVerifyInputWhenFocusTarget(false);

        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBusq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusqKeyTyped(evt);
            }
        });
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 710, 40));

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idCliente", "Nombre", "Edad", "Sexo"
            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        PCont.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 1020, 610));

        btnAddM.setText("Agregar mascota");
        btnAddM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMActionPerformed(evt);
            }
        });
        PCont.add(btnAddM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 160, 130, 50));

        btnReservas.setText("Reservas");
        PCont.add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 250, 130, 50));

        btnInsert.setText("Insertar");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        PCont.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 340, 130, 50));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PCont.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 430, 130, 50));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 520, 130, 50));

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

    private void txtBusqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyTyped
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyTyped

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        int fila = tbData.getSelectedRow();
        idCl = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnAddMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMActionPerformed

    }//GEN-LAST:event_btnAddMActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        //subp();
        dsg.ShowPanel(subp, PCont, 1320, 810);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ct.idCliente=idCl;
        ct.deleteCl();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnAddM;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReservas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbData;
    private javax.swing.JTextField txtBusq;
    // End of variables declaration//GEN-END:variables
}

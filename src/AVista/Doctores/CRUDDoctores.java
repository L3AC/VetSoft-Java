
package AVista.Doctores;

import AControlador.ctUser;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class CRUDDoctores extends javax.swing.JPanel {

    public int idTipoUs;
    private int idDocRow;
    private int idDoc;
    ctUser ct = new ctUser();
    Desg dsg = new Desg();
    DefaultTableModel model;
    
    public CRUDDoctores() {
        initComponents();
    }

    final void loadD() throws SQLException {
        String[] column = {"idDoctor", "Especialidad", "Nombre"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0,5);
        CargarTabla();
        tbData.setRowSelectionInterval(0, 0);
        int fila = tbData.getSelectedRow();
        idDocRow = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        try {
            ct.usuario = txtBusq.getText().toString();
            ct.idTipoUs=idTipoUs;
            ResultSet rs = ct.cargarUs();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idDoctor"),rs.getString("Especialidad"),
                    rs.getString("Nombre")};
                model.addRow(oValores);
            }
        } catch (Exception e) {

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        btnEditar = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBusq = new javax.swing.JTextField();
        btnInsert1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 360, 130, 50));

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "idDoctor", "Especialidad", "Nombre"
            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 127, 1020, 610));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 270, 130, 50));

        btnInsert.setText("Mis asistentes");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 130, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del doctor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 56, 200, -1));

        txtBusq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        jPanel1.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 49, 710, 40));

        btnInsert1.setText("Agregar asistente");
        btnInsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 180, 130, 50));

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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /*ct.idUs = idUsRow;
        ct.deleteUs();
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        /*int fila = tbData.getSelectedRow();
        idUsRow = Integer.parseInt(tbData.getValueAt(fila, 0).toString());*/
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        /*updtUsuario subp;
        try {
            subp = new updtUsuario(idTipoUs,idUsRow);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        /*insertUs subp;
        try {
            subp = new insertUs(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsert1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnInsert1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private SwingTable.Table tbData;
    private javax.swing.JTextField txtBusq;
    // End of variables declaration//GEN-END:variables
}

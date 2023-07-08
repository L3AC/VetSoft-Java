/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Usuarios;

import AControlador.ctCliente;
import AControlador.ctUser;
import AVista.CUENTA.insertTipoCuenta;
import AVista.CUENTA.updtTipoCuenta;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LEAC2
 */
public class CRUDusuarios extends javax.swing.JPanel {

    public int idTipoUs;
    private int idUsRow;
    ctUser ct = new ctUser();
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDusuarios(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        initComponents();
        loadD();
        verifPerfil();
    }

    final void loadD() throws SQLException {
        String[] column = {"idUsuario", "idTipoUsuario", "Cargo", "Usuario", "Correo", "Teléfono"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 6);
        dsg.ColumnHide(model, tbData, 1, 6);
        CargarTabla();
        tbData.setRowSelectionInterval(0, 0);
        int fila = tbData.getSelectedRow();
        idUsRow = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        try {
            ct.usuario = txtBusq.getText().toString();
            ct.idTipoUs = idTipoUs;
            ResultSet rs = ct.cargarUs();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idUsuario"), rs.getInt("idTipoUsuario"),
                    rs.getString("Cargo"),
                    rs.getString("usuario"), rs.getString("correo"),
                    rs.getString("telefono")};
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
        btnInsert = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        jLabel1 = new javax.swing.JLabel();
        btnAddCuenta = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setPreferredSize(new java.awt.Dimension(1320, 810));

        txtBusq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });

        btnInsert.setText("CREAR USUARIO");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idUsuario", "usuario", "correo", "telefono"
            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del usuario");

        btnAddCuenta.setText("CREAR CUENTA");
        btnAddCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btnAddCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addComponent(btnAddCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

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

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        insertUs subp;
        try {
            subp = new insertUs(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        updtUsuario subp;
        try {
            subp = new updtUsuario(idTipoUs, idUsRow);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ct.idUs = idUsRow;
        ct.deleteUs();
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        verifPerfil();

    }//GEN-LAST:event_tbDataMouseClicked
    final void verifPerfil(){
        int fila = tbData.getSelectedRow();
        idUsRow = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
        int nivelRow = Integer.parseInt(tbData.getValueAt(fila, 1).toString());

        if (nivelRow == 2 || nivelRow == 3 || nivelRow == 4) {
            btnAddCuenta.setVisible(true);
            ct.idUs = idUsRow;
            ct.idTipoCuenta = nivelRow;

            try {
                if (ct.verifPerfil().next()) {
                    btnAddCuenta.setVisible(false);
                } else {
                    btnAddCuenta.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            btnAddCuenta.setVisible(false);
        }
    }
    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnAddCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCuentaActionPerformed
        insertTipoCuenta subp = new insertTipoCuenta(idTipoUs);
        dsg.ShowPanel(subp, PCont, 1320, 810);
    }//GEN-LAST:event_btnAddCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnAddCuenta;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private SwingTable.Table tbData;
    private javax.swing.JTextField txtBusq;
    // End of variables declaration//GEN-END:variables
}

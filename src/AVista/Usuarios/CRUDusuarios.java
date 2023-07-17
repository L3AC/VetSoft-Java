/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Usuarios;

import AControlador.ctCliente;
import AControlador.ctRecep;
import AControlador.ctUser;
import AVista.CUENTA.insertTipoCuenta;
import AVista.CUENTA.updtTipoCuenta;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LEAC2
 */
public class CRUDusuarios extends javax.swing.JPanel {

    private int idTipoUs;
    private int idUsRow;
    private int nivelRow;
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
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
            int fila = tbData.getSelectedRow();
            idUsRow = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
        }

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
                    rs.getString("Usuario"), rs.getString("Correo"),
                    rs.getString("Telefono")};
                model.addRow(oValores);
            }
        } catch (Exception e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        btnAddCuenta = new Design.ButtonGradient();
        btnInsert = new Design.ButtonGradient();
        btnEditar = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setPreferredSize(new java.awt.Dimension(1320, 810));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del usuario");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 56, 200, -1));
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 700, 50));

        btnAddCuenta.setText("CREAR CUENTA");
        btnAddCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCuentaActionPerformed(evt);
            }
        });
        PCont.add(btnAddCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 150, 140, 50));

        btnInsert.setText("CREAR USUARIO");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        PCont.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 250, 140, 50));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PCont.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 330, 140, 50));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 410, 140, 50));

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1020, 410));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 1050, 460));

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

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        verifPerfil();

    }//GEN-LAST:event_tbDataMouseClicked

    private void btnAddCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCuentaActionPerformed
        insertTipoCuenta subp;
        try {
            subp = new insertTipoCuenta(idTipoUs, idUsRow,
     Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 1).toString()));
            
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddCuentaActionPerformed

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
        UIManager.put("OptionPane.messageDialogTitle", "Confirmación");
        int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Desea eliminar el registro?",
                "Advertencia",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new Object[]{"Sí", "No"},
                "No");

        if (opcion == JOptionPane.YES_OPTION) {
            try {
                ctUser ct = new ctUser();
                ct.idUs = idUsRow;
                ct.deleteUs();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    final void verifPerfil() {
        idUsRow = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
        nivelRow = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 1).toString());

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
        } else {
            btnAddCuenta.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAddCuenta;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEliminar;
    private Design.ButtonGradient btnInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

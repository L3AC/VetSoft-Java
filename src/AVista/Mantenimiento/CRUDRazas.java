/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Mantenimiento;

import AControlador.ctRaza;
import Design.Desg;
import Validation.Valida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author godna
 */
public class CRUDRazas extends javax.swing.JPanel {

    private int idRaza;
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDRazas() throws SQLException {
        initComponents();
        loadD();
        txtBusq.setDocument(new Valida(100, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
    }

    final void loadD() throws SQLException {
        String[] column = {"idRaza", "Tipo Animal", "Raza"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbRaza, 0, 3);
        CargarTabla();
        if (tbRaza.getRowCount() > 0) {
            tbRaza.setRowSelectionInterval(0, 0);
            int fila = tbRaza.getSelectedRow();
            idRaza = Integer.parseInt(tbRaza.getValueAt(fila, 0).toString());
        }
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            ctRaza ct = new ctRaza();
            ct.nombreRaza = txtBusq.getText().toString();
            ResultSet rs = ct.selectRaza();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idRaza"), rs.getString(
                    "nombrePopular"), rs.getString(
                    "nombreRaza")};
                model.addRow(oValores);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldSV1 = new Design.TextFieldSV();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new Design.ButtonGradient();
        btnEditar = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        txtBusq = new Design.TextFieldSV();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRaza = new SwingTable.Table();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1320, 810));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldSV1.setBackground(new java.awt.Color(202, 233, 255));
        add(textFieldSV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(987, 238, 286, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre de la Raza");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1038, 188, -1, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1018, 362, 193, 39));

        btnEditar.setText("Editar");
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1018, 457, 193, 38));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1018, 545, 193, 40));

        txtBusq.setBackground(new java.awt.Color(202, 233, 255));
        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusqActionPerformed(evt);
            }
        });
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 550, -1));

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbRaza.setBackground(new java.awt.Color(255, 255, 255));
        tbRaza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "idRaza", "Raza", "NombrePopular"
            }
        ));
        jScrollPane1.setViewportView(tbRaza);
        if (tbRaza.getColumnModel().getColumnCount() > 0) {
            tbRaza.getColumnModel().getColumn(1).setResizable(false);
        }

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 892, 450));

        add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 161, 933, 505));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1209, 25, -1, -1));

        jLabel3.setText("VetSoft+");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1226, 95, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre de la Raza");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDRazas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void txtBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqActionPerformed

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
                ctRaza ct = new ctRaza();
                ct.idRaza = Integer.parseInt(tbRaza.getValueAt(tbRaza.getSelectedRow(), 0).toString());
                ct.deleteRaza();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDEsp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.ButtonGradient btnAgregar;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbRaza;
    private Design.TextFieldSV textFieldSV1;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

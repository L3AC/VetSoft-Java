/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Mantenimiento;

import AControlador.ctRaza;
import AControlador.ctTipoServ;
import Design.Desg;
import Mensajes.CódigoError;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
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
    Map<Integer, String> cbMapNPS = new HashMap<>();

    public CRUDRazas() throws SQLException {
        initComponents();
        loadD();
        txtBusq.setDocument(new Valida(100, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        loadCombo(cbTIpoA);
        if (tbData.getRowCount() > 0) {
            setData();
        }
    }

    final void loadD() throws SQLException {
        String[] column = {"idRaza", "Tipo Animal", "Raza"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 3);
        CargarTabla();
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
            int fila = tbData.getSelectedRow();
            idRaza = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
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

    private void loadCombo(JComboBox cb) throws SQLException {
        ctRaza ct = new ctRaza();
        ResultSet rs = ct.loadTPanimal();
        while (rs.next()) {
            int idTP = rs.getInt("idTipoAnimal");
            String nombre = rs.getString("nombrePopular");
            cb.addItem(nombre);
            cbMapNPS.put(idTP, nombre);
        }
        cb.setSelectedIndex(0);
    }

    final void setData() {
        txtNR.setText(tbData.getValueAt(tbData.getSelectedRow(), 2).toString());
        cbTIpoA.setSelectedItem(tbData.getValueAt(tbData.getSelectedRow(), 1).toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNR = new Design.TextFieldSV();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new Design.ButtonGradient();
        btnEditar = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        txtBusq = new Design.TextFieldSV();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbTIpoA = new Design.Combobox();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(190, 233, 232));
        setPreferredSize(new java.awt.Dimension(1320, 810));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNR.setBackground(new java.awt.Color(255, 255, 255));
        txtNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNRActionPerformed(evt);
            }
        });
        add(txtNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, 286, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de animal");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 170, -1, -1));

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 440, 160, 50));

        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 510, 160, 50));

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 580, 160, 50));

        txtBusq.setBackground(new java.awt.Color(255, 255, 255));
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

        tbData.setBackground(new java.awt.Color(255, 255, 255));
        tbData.setModel(new javax.swing.table.DefaultTableModel(
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
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);
        if (tbData.getColumnModel().getColumnCount() > 0) {
            tbData.getColumnModel().getColumn(1).setResizable(false);
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

        cbTIpoA.setForeground(new java.awt.Color(0, 0, 0));
        cbTIpoA.setLabeText("");
        cbTIpoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTIpoAActionPerformed(evt);
            }
        });
        add(cbTIpoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 210, 230, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre de la Raza");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 310, -1, -1));
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
        if (model.getRowCount() > 0) {
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
                    ct.idRaza = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                    ct.deleteRaza();
                    loadD();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUDEsp.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (opcion == JOptionPane.NO_OPTION) {

            }
        } else {
            CódigoError obj = new CódigoError();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNR.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            try {
                ctRaza ct = new ctRaza();
                ct.idTipoAnimal = dsg.getMap(cbMapNPS, cbTIpoA.getSelectedItem().toString());
                ct.nombreRaza = txtNR.getText();
                ct.insRaza();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDRazas.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnAgregarActionPerformed
    }
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (txtNR.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            if (model.getRowCount() > 0) {
                try {
                    ctRaza ct = new ctRaza();
                    ct.idTipoAnimal = dsg.getMap(cbMapNPS, cbTIpoA.getSelectedItem().toString());
                    ct.nombreRaza = txtNR.getText();
                    ct.idRaza = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                    ct.upRaza();
                    loadD();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUDRazas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                CódigoError obj = new CódigoError();
                obj.eventOK(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        GlassPanePopup.closePopupLast();
                    }
                });
                GlassPanePopup.showPopup(obj);
            }
    }//GEN-LAST:event_btnEditarActionPerformed
    }
    private void cbTIpoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTIpoAActionPerformed
        /*// TODO add your handling code here:
        tpUs = dsg.getMap(cbMap, cbCargo.getSelectedItem().toString());
        System.out.println("ID seleccionado: " + tpUs);*/
    }//GEN-LAST:event_cbTIpoAActionPerformed

    private void txtNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNRActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        if (tbData.getRowCount() > 0) {
            setData();
        }
    }//GEN-LAST:event_tbDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.ButtonGradient btnAgregar;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEliminar;
    private Design.Combobox cbTIpoA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtNR;
    // End of variables declaration//GEN-END:variables
}

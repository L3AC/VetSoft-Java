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
import SwingScroll.ScrollBar;
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

public class CRUDRazas extends javax.swing.JPanel {

    private int idRaza;
    Desg dsg = new Desg();
    DefaultTableModel model;
    Map<Integer, String> cbMapNPS = new HashMap<>();

    public CRUDRazas() throws SQLException {
        initComponents();
                 jScrollPane1.setVerticalScrollBar(new ScrollBar());
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

        txtNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNRActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de animal");

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel3.setText("VetSoft+");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre de la Raza");

        cbTIpoA.setForeground(new java.awt.Color(0, 0, 0));
        cbTIpoA.setLabeText("");
        cbTIpoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTIpoAActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre de la Raza");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addGap(49, 49, 49)
                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(389, 389, 389)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3))))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cbTIpoA, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addComponent(txtNR, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(cbTIpoA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtNR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
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

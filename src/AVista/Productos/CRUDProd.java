/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Productos;

import AControlador.ctProd;
import Design.Desg;
import Mensajes.CódogpErrorDIFC1;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class CRUDProd extends javax.swing.JPanel {

    private int idTipoUs;
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDProd(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        initComponents();
        loadD();
    }

    final void loadD() throws SQLException {
        String[] column = {"idProducto", "tipo", "Nombre", "Proveedor", "Precio"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 5);
        CargarTabla();
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
        }
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            ctProd ct = new ctProd();
            ct.producto = txtBusq.getText().toString();
            ResultSet rs = ct.tbProd();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idProducto"), rs.getString(
                    "tipo"), rs.getString("Nombre"),
                    rs.getString("Proveedor"), rs.getString("Precio")};
                model.addRow(oValores);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        jLabel1 = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        btnEliminar = new Design.ButtonGradient();
        btnEjemp = new Design.ButtonGradient();
        btnEditar = new Design.ButtonGradient();
        btnAgregar = new Design.ButtonGradient();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbData.setBackground(new java.awt.Color(255, 255, 255));
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Servicio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(tbData);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 930, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Producto:");

        txtBusq.setBackground(new java.awt.Color(255, 255, 255));
        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
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

        btnEjemp.setForeground(new java.awt.Color(0, 0, 0));
        btnEjemp.setText("Ejemplares");
        btnEjemp.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEjemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjempActionPerformed(evt);
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

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEjemp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(btnEjemp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
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
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnEjempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjempActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                CRUDEjemp subp = new CRUDEjemp(idTipoUs,
                        Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()));
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            CódogpErrorDIFC1 obj = new CódogpErrorDIFC1();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_btnEjempActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tbData.getRowCount() > 0) {
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
                ctProd ct = new ctProd();
                ct.idProd = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.dlProd();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
        } else {
            CódogpErrorDIFC1 obj = new CódogpErrorDIFC1();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                updateProd subp = new updateProd(idTipoUs,
                        Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()));
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            CódogpErrorDIFC1 obj = new CódogpErrorDIFC1();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                insertProd subp = new insertProd(idTipoUs);
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            CódogpErrorDIFC1 obj = new CódogpErrorDIFC1();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAgregar;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEjemp;
    private Design.ButtonGradient btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

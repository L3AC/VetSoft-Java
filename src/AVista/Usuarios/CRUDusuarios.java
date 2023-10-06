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
import Mensajes.CódigoError;
import Mensajes.CódogpErrorDIFC1;
import Mensajes.GlassPanePopup;
import SwingScroll.ScrollBar;
import Tipografias.Fuentes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    Fuentes tipoFuente;

    public CRUDusuarios(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        initComponents();
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        loadD();
        tipoFuente = new Fuentes();

        jLabel1.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 18));
        tbData.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 13));
        btnEliminar.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 14));
        btnEditar.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 14));
        btnInsert.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 14));
        btnAddCuenta.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 14));

        if (tbData.getRowCount() > 0) {
            verifPerfil();
        }
        txtBusq.setDocument(new Valida(100, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
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
            System.err.println(e.toString());
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
        btnTok = new Design.ButtonGradient();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));
        PCont.setPreferredSize(new java.awt.Dimension(1320, 810));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del usuario:");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 76, 200, -1));

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
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 69, 700, 50));

        btnAddCuenta.setForeground(new java.awt.Color(0, 0, 0));
        btnAddCuenta.setText("Crear Cuenta");
        btnAddCuenta.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAddCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCuentaActionPerformed(evt);
            }
        });
        PCont.add(btnAddCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 480, 160, 53));

        btnInsert.setForeground(new java.awt.Color(0, 0, 0));
        btnInsert.setText("Crear Usuario");
        btnInsert.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        PCont.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 400, 160, 52));

        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PCont.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1122, 226, 160, 53));

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1122, 315, 160, 52));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbData.setBackground(new java.awt.Color(255, 255, 255));
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
        tbData.setGridColor(new java.awt.Color(204, 204, 204));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1010, 410));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 157, 1067, 460));

        btnTok.setForeground(new java.awt.Color(0, 0, 0));
        btnTok.setText("Crear token");
        btnTok.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnTok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTokActionPerformed(evt);
            }
        });
        PCont.add(btnTok, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, 160, 52));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        if (tbData.getRowCount() > 0) {
            verifPerfil();
        }
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnAddCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCuentaActionPerformed
        if (tbData.getRowCount() > 0) {
            insertTipoCuenta subp;
            try {
                subp = new insertTipoCuenta(idTipoUs, idUsRow,
                        Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 1).toString()));

                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_btnAddCuentaActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (tbData.getRowCount() > 0) {
            insertUs subp;
            try {
                subp = new insertUs(idTipoUs);
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tbData.getRowCount() > 0) {

            try {
                updtUsuario subp = new updtUsuario(idTipoUs, idUsRow);
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
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
                    ctUser ct = new ctUser();
                    ct.idUs = idUsRow;
                    ct.deleteUs();
                    loadD();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void txtBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqActionPerformed

    }//GEN-LAST:event_txtBusqActionPerformed

    private void btnTokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTokActionPerformed
        try {
            updtUsuario subp = new updtUsuario(idTipoUs, idUsRow);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTokActionPerformed
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
    private Design.ButtonGradient btnTok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

package AVista.Clientes;

import AVista.CUENTA.updtTipoCuenta;
import AVista.CUENTA.insertTipoCuenta;
import AControlador.ctCliente;
import AControlador.ctDoctores;
import AVista.Animales.addMascota;
import Design.Desg;
import Design.PanelRound;
import Mensajes.CódigoError;
import Mensajes.GlassPanePopup;
import Tipografias.Fuentes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import Validation.Valida;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUDCliente extends javax.swing.JPanel {

    public int nUs;
    private int idCl;
    ctCliente ct = new ctCliente();
    Desg dsg = new Desg();
    DefaultTableModel model;
    Fuentes tipoFuente;

    public CRUDCliente(int nUs) throws SQLException {
        this.nUs = nUs;
        initComponents();
        loadD();

        tipoFuente = new Fuentes();

        jLabel1.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 18));
        txtBusq.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 18));
        tbData.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 18));
        if (nUs == 4 || nUs == 5) {
            btnEditar.setVisible(false);
            btnEliminar.setVisible(false);
            btnReservas.setVisible(false);
        }

    }

    public CRUDCliente() throws SQLException {
        initComponents();
        loadD();
    }

    final void loadD() throws SQLException {
        String[] column = {"idCliente", "Nombre", "Edad", "Sexo"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 4);
        CargarTabla();
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
            idCl = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
        }
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        try {
            ct.nombre = txtBusq.getText().toString();
            ResultSet rs = ct.cargarCl();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idCliente"), rs.getString("Nombre"),
                    rs.getString("Edad"), rs.getString("Sexo")};
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
        txtBusq = new Design.TextFieldSV();
        btnAddM = new Design.ButtonGradient();
        btnReservas = new Design.ButtonGradient();
        btnEditar = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReservas1 = new Design.ButtonGradient();

        setPreferredSize(new java.awt.Dimension(1320, 810));
        setVerifyInputWhenFocusTarget(false);

        PCont.setBackground(new java.awt.Color(202, 233, 255));
        PCont.setForeground(new java.awt.Color(255, 255, 255));

        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });

        btnAddM.setForeground(new java.awt.Color(0, 0, 0));
        btnAddM.setText("Agregar mascota");
        btnAddM.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAddM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMActionPerformed(evt);
            }
        });

        btnReservas.setForeground(new java.awt.Color(0, 0, 0));
        btnReservas.setText("Reservar Producto");
        btnReservas.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
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

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
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
                "idCliente", "Nombre", "Edad", "Sexo"
            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 930, 430));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del cliente:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("VetSoft+");

        btnReservas1.setForeground(new java.awt.Color(0, 0, 0));
        btnReservas1.setText("Compra");
        btnReservas1.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnReservas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)))
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnReservas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReservas1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnAddM, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnReservas1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))))
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

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        int fila = tbData.getSelectedRow();
        idCl = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnAddMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                addMascota subp = new addMascota(nUs,
                        Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()));
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_btnAddMActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tbData.getRowCount() > 0) {
            updtTipoCuenta subp;
            try {
                subp = new updtTipoCuenta(nUs, idCl, 3);
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
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
                ct.idCliente = idCl;
                ct.deleteCl();
                try {
                    loadD();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                CRUDEjemRe subp = new CRUDEjemRe(Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()), nUs);
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnReservas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservas1ActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                CRUDFactReserv subp = new CRUDFactReserv(Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()), nUs);
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
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


    }//GEN-LAST:event_btnReservas1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAddM;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEliminar;
    private Design.ButtonGradient btnReservas;
    private Design.ButtonGradient btnReservas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

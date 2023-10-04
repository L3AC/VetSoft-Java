package AVista.Mantenimiento;

import AControlador.ctEsp;
import AControlador.ctTipoServ;
import AVista.Usuarios.CRUDusuarios;
import Design.Desg;
import Mensajes.CódigoError;
import Mensajes.CódigoErrorDSI5;
import Mensajes.CódogpErrorDIFC1;
import Mensajes.GlassPanePopup;
import SwingScroll.ScrollBar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import Validation.Valida;
import static groovy.ui.text.FindReplaceUtility.dispose;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUDEsp extends javax.swing.JPanel {

    private int idEsp;
    private int idEsRow;
    Desg dsg = new Desg();
    DefaultTableModel model;
    public int nUs;

    public CRUDEsp(int nUs) throws SQLException {
        this.nUs = nUs;
        initComponents();
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        loadD();
        txtBusq.setDocument(new Valida(100, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        if (tbData.getRowCount() > 0) {
            setData();
        }
    }


    final void loadD() throws SQLException {
        String[] column = {"idEspecialidad", "Especialidad"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 2);
        CargarTabla();
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
            int fila = tbData.getSelectedRow();
            idEsp = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
        }
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            ctEsp ct = new ctEsp();
            ct.esp = txtBusq.getText().toString();
            ResultSet rs = ct.selectEsp();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idEspecialidad"), rs.getString(
                    "Especialidad")};

                model.addRow(oValores);
            }
        } catch (Exception e) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEsp = new Design.TextFieldSV();
        btnEliminar = new Design.ButtonGradient();
        btnAct = new Design.ButtonGradient();
        btnAgregar = new Design.ButtonGradient();
        jLabel2 = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(190, 233, 232));
        setPreferredSize(new java.awt.Dimension(1320, 810));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Especialidad:");

        txtEsp.setShadowColor(new java.awt.Color(0, 0, 51));

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAct.setForeground(new java.awt.Color(0, 0, 0));
        btnAct.setText("Actualizar");
        btnAct.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre de la Especialidad");

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
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Especialidades"
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
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 750, 370));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel4.setText("VetSoft+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(420, 420, 420)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(txtEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        if (tbData.getRowCount() > 0) {
            setData();
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
    }//GEN-LAST:event_tbDataMouseClicked

    private void setData() {
        idEsp = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
        txtEsp.setText(tbData.getValueAt(tbData.getSelectedRow(), 1).toString());
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (txtEsp.getText().isEmpty()) {
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
                ctEsp ctEs = new ctEsp();

                ctEs.esp = txtEsp.getText();
                ctEs.idEsp = idEsp;
                ctEs.insertEsp();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDEsp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        if (txtEsp.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            if (tbData.getRowCount() > 0) {
                try {
                    ctEsp ctEs = new ctEsp();

                    ctEs.esp = txtEsp.getText();
                    ctEs.idEsp = idEsp;
                    ctEs.updtEsp();
                    loadD();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUDEsp.class.getName()).log(Level.SEVERE, null, ex);
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

    }//GEN-LAST:event_btnActActionPerformed
    }
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
                    ctEsp ct = new ctEsp();
                    ct.idEsp = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                    ct.deleteEsp();
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
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqActionPerformed

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_txtBusqKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.ButtonGradient btnAct;
    private Design.ButtonGradient btnAgregar;
    private Design.ButtonGradient btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtEsp;
    // End of variables declaration//GEN-END:variables
}

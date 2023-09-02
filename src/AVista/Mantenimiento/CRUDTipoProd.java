/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Mantenimiento;

import AControlador.ctProd;
import AControlador.ctTipoServ;
import Design.Desg;
import Design.TextFieldSV;
import Mensajes.CódogpErrorDIFC1;
import Mensajes.GlassPanePopup;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LEAC2
 */
public class CRUDTipoProd extends javax.swing.JPanel {

    private int idTipoUs;
    private int idEsRow;
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDTipoProd(int idTipoUs) throws SQLException {
        this.idTipoUs=idTipoUs;
        initComponents();
        loadD();
        setData();
        txtBusq.setDocument(new Valida(100, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtProd.setDocument(new Valida(100, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
    }

    final void loadD() throws SQLException {
        String[] column = {"idTipoProducto", "Tipo de producto"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 2);
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
            ct.tipoProd = txtBusq.getText().toString();
            ResultSet rs = ct.tableTProd();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idTipoProducto"), rs.getString("tipo")};
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
        txtBusq = new Design.TextFieldSV();
        jLabel2 = new javax.swing.JLabel();
        txtProd = new Design.TextFieldSV();
        btnAgregar = new Design.ButtonGradient();
        btnAct = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        btnLimp = new Design.ButtonGradient();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        txtBusq.setBackground(new java.awt.Color(255, 255, 255));
        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tipo de producto");

        txtProd.setBackground(new java.awt.Color(255, 255, 255));
        txtProd.setShadowColor(new java.awt.Color(0, 0, 51));

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimp.setForeground(new java.awt.Color(0, 0, 0));
        btnLimp.setText("Limpiar");
        btnLimp.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Producto:");

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
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
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 780, 410));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel4.setText("VetSoft+");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(btnLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43))))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    final void setData() {      
        txtProd.setText(tbData.getValueAt(tbData.getSelectedRow(), 1).toString());
    }
    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        setData();
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        List<TextFieldSV> lista = new ArrayList<>();
        lista.add(txtProd);
        try {
            if (dsg.areFieldsNotEmpty(lista)) {//VERIFICAR QUE NO ESTE VACIO
                ctProd ct = new ctProd();
               
                ct.tipoProd = txtProd.getText();
                ct.insertTProd();
                loadD();
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDTipoProd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
 if (tbData.getRowCount() > 0) {
        try {
            List<TextFieldSV> lista = new ArrayList<>();
            lista.add(txtProd);
           // lista.add(txtServ);
            if (dsg.areFieldsNotEmpty(lista)) {
                ctProd ct = new ctProd();
                ct.idTipoProd = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.tipoProd = txtProd.getText();
                ct.updtTProd();
                loadD();
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDTipoProd.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_btnActActionPerformed

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
                ct.idTipoProd = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.deleteTProd();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDTipoProd.class.getName()).log(Level.SEVERE, null, ex);
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

    private void btnLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpActionPerformed
        txtProd.setText(null);
    }//GEN-LAST:event_btnLimpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAct;
    private Design.ButtonGradient btnAgregar;
    private Design.ButtonGradient btnEliminar;
    private Design.ButtonGradient btnLimp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtProd;
    // End of variables declaration//GEN-END:variables
}

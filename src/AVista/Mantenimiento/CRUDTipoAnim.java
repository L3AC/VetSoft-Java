/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Mantenimiento;

import AControlador.ctEsp;
import AControlador.ctTipoAnim;
import AControlador.ctTipoServ;
import Design.Desg;
import Design.TextFieldSV;
import Validation.Valida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LEAC2
 */
public class CRUDTipoAnim extends javax.swing.JPanel {

    private int idTipoUs;
    ctEsp ct = new ctEsp();
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDTipoAnim(int idTipoUs) {
        this.idTipoUs = idTipoUs;
        initComponents();
        txtBusq.setDocument(new Valida(100, "[a-zA-Z0-9 ]*"));
        txtNC.setDocument(new Valida(50, "[a-zA-Z0-9 ]*"));
        txtNP.setDocument(new Valida(50, "[0-9]*"));
    }

    final void loadD() throws SQLException {
        String[] column = {"idTipoAnimal", "nombrePopular", "nombreCientifico"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 2);
        dsg.ColumnHide(model, tbData, 1, 2);
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
            ctTipoAnim ct = new ctTipoAnim();
            //ct.Nombre = txtBusq.getText().toString();
            ResultSet rs = ct.tableTPA();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idTipoAnimal"), rs.getInt("nombrePopular"),
                    rs.getString("nombreCientifico")};

                model.addRow(oValores);
            }
        } catch (Exception e) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        txtNC = new Design.TextFieldSV();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNP = new Design.TextFieldSV();
        jLabel1 = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        btnLimp = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        btnAct = new Design.ButtonGradient();
        btnAgregar = new Design.ButtonGradient();

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        PCont.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 137, 780, 610));

        txtNC.setShadowColor(new java.awt.Color(153, 0, 153));
        PCont.add(txtNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 310, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nombre científico del animal");
        PCont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre popular del animal");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, -1, -1));

        txtNP.setShadowColor(new java.awt.Color(153, 0, 153));
        PCont.add(txtNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 310, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Animal");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        txtBusq.setShadowColor(new java.awt.Color(153, 0, 153));
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 470, -1));

        btnLimp.setText("Limpiar");
        btnLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpActionPerformed(evt);
            }
        });
        PCont.add(btnLimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 40, 110, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 450, 110, 40));

        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        PCont.add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 450, 110, 40));

        btnAgregar.setText("Agregar");
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        PCont.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, 110, 40));

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
        txtNC.setText(tbData.getValueAt(tbData.getSelectedRow(), 1).toString());
        txtNP.setText(tbData.getValueAt(tbData.getSelectedRow(), 2).toString());
    }
    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        //setData();
    }//GEN-LAST:event_tbDataMouseClicked

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpActionPerformed

    }//GEN-LAST:event_btnLimpActionPerformed

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
                ctTipoServ ct = new ctTipoServ();
                ct.idTipoServ = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.deleteServ();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDTipoAnim.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        try {
            List<TextFieldSV> lista = new ArrayList<>();
            lista.add(txtNP);
            lista.add(txtNC);
            if (dsg.areFieldsNotEmpty(lista)) {
                ctTipoAnim ct = new ctTipoAnim();
                ct.idTipoAnim = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.nPopular = txtNP.getText();
                ct.nCient = txtNC.getText();
                ct.insertTPA();
                loadD();
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDTipoAnim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        List<TextFieldSV> lista = new ArrayList<>();
        lista.add(txtNP);
        lista.add(txtNC);
        try {
            if (dsg.areFieldsNotEmpty(lista)) {//VERIFICAR QUE NO ESTE VACIO
                ctTipoAnim ct = new ctTipoAnim();
                ct.idTipoAnim = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.nPopular = txtNP.getText();
                ct.nCient = txtNC.getText();
                ct.updtTPA();
                loadD();
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDTipoAnim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAct;
    private Design.ButtonGradient btnAgregar;
    private Design.ButtonGradient btnEliminar;
    private Design.ButtonGradient btnLimp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtNC;
    private Design.TextFieldSV txtNP;
    // End of variables declaration//GEN-END:variables
}

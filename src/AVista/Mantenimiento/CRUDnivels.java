/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Mantenimiento;

import AControlador.ctProd;
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
public class CRUDnivels extends javax.swing.JPanel {

    private int idTipoUs;
    private int idEsRow;
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDnivels() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBusq.setBackground(new java.awt.Color(202, 233, 255));
        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 118, 470, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nivel de servicio");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 200, -1, -1));

        txtProd.setBackground(new java.awt.Color(202, 233, 255));
        txtProd.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 238, 310, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        PCont.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 312, 110, 40));

        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        PCont.add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 312, 110, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 312, 110, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 115, -1, -1));

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

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 198, 820, 456));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N
        PCont.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1213, 21, -1, -1));

        jLabel4.setText("VetSoft+");
        PCont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 97, -1, -1));

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

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        /*List<TextFieldSV> lista = new ArrayList<>();
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
        }*/
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        /*try {
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
        }*/
    }//GEN-LAST:event_btnActActionPerformed

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
                ctProd ct = new ctProd();
                ct.idTipoProd = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.deleteTProd();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDTipoProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        //setData();
    }//GEN-LAST:event_tbDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
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
    private Design.TextFieldSV txtProd;
    // End of variables declaration//GEN-END:variables
}

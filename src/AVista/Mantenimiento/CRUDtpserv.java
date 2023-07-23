/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Mantenimiento;

import AControlador.ctCitas;
import AControlador.ctEsp;
import AControlador.ctRaza;
import AControlador.ctTipoServ;
import Design.Desg;
import Design.TextFieldSV;
import Validation.Valida;
import java.awt.TextField;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class CRUDtpserv extends javax.swing.JPanel {

    private int idTipoUs;
    private int idEsRow;
    ctEsp ct = new ctEsp();
    Desg dsg = new Desg();
    DefaultTableModel model;
    Map<Integer, String> cbMapNPS = new HashMap<>();

    public CRUDtpserv(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        initComponents();
        txtServ.setDocument(new Valida(50, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtCosto.setDocument(new Valida(50, "[0-9.]*"));
        loadD();
        loadCombo(cbNivelS);
        setData();
    }

    final void loadD() throws SQLException {
        String[] column = {"idTipoServicio", "idNIvelServicio", "Prioridad", "Nombre", "Costo"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 5);
        dsg.ColumnHide(model, tbData, 1, 5);
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
            ctTipoServ ct = new ctTipoServ();
            ct.Nombre = txtBusq.getText().toString();
            ResultSet rs = ct.tableServ();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idTipoServicio"), rs.getInt("idNivelServicio"),
                    rs.getString("Prioridad"), rs.getString("Nombre"),
                    rs.getFloat("Costo")};

                model.addRow(oValores);
            }
        } catch (Exception e) {

        }

    }

    private void loadCombo(JComboBox cb) throws SQLException {
        ctTipoServ ct = new ctTipoServ();
        ResultSet rs = ct.comboPrior();
        while (rs.next()) {
            int idTP = rs.getInt("idNivelServicio");
            String nombre = rs.getString("prioridad");
            cb.addItem(nombre);
            cbMapNPS.put(idTP, nombre);
        }
        cb.setSelectedIndex(0);
    }

    final void setData() {
        txtServ.setText(tbData.getValueAt(tbData.getSelectedRow(), 3).toString());
        txtCosto.setText(tbData.getValueAt(tbData.getSelectedRow(), 4).toString());
        cbNivelS.setSelectedItem(tbData.getValueAt(tbData.getSelectedRow(), 2).toString());
    }

    final void cleanData() {
        cbNivelS.setSelectedIndex(-1);
        txtServ.setText(null);
        txtCosto.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCosto = new Design.TextFieldSV();
        btnAgregar = new Design.ButtonGradient();
        btnLimp = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        cbNivelS = new Design.Combobox();
        txtBusq = new Design.TextFieldSV();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtServ = new Design.TextFieldSV();
        btnAct = new Design.ButtonGradient();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Costo del servicio");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, -1, -1));

        txtCosto.setBackground(new java.awt.Color(202, 233, 255));
        txtCosto.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, 310, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        PCont.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 110, 40));

        btnLimp.setText("Limpiar");
        btnLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpActionPerformed(evt);
            }
        });
        PCont.add(btnLimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 110, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 560, 110, 40));

        cbNivelS.setBackground(new java.awt.Color(202, 233, 255));
        cbNivelS.setForeground(new java.awt.Color(80, 80, 80));
        cbNivelS.setLabeText("");
        cbNivelS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNivelSActionPerformed(evt);
            }
        });
        PCont.add(cbNivelS, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 270, 40));

        txtBusq.setBackground(new java.awt.Color(202, 233, 255));
        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 470, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Prioridad de atención");
        PCont.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre del servicio");
        PCont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, -1, -1));

        txtServ.setBackground(new java.awt.Color(202, 233, 255));
        txtServ.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 310, -1));

        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        PCont.add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 560, 110, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Servicio:");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 780, 440));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 820, 500));

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
        setData();
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        List<TextFieldSV> lista = new ArrayList<>();
        lista.add(txtCosto);
        lista.add(txtServ);
        try {
            if (dsg.areFieldsNotEmpty(lista)) {//VERIFICAR QUE NO ESTE VACIO
                ctTipoServ ct = new ctTipoServ();
                ct.idNivelServ = dsg.getMap(cbMapNPS, cbNivelS.getSelectedItem().toString());;
                ct.Nombre = txtServ.getText();
                ct.Costo = Float.parseFloat(txtCosto.getText());
                ct.insertServ();
                loadD();
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDtpserv.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpActionPerformed
        cleanData();
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
                Logger.getLogger(CRUDtpserv.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cbNivelSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNivelSActionPerformed


    }//GEN-LAST:event_cbNivelSActionPerformed

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        try {
            List<TextFieldSV> lista = new ArrayList<>();
            lista.add(txtCosto);
            lista.add(txtServ);
            if (dsg.areFieldsNotEmpty(lista)) {
                ctTipoServ ct = new ctTipoServ();
                ct.idTipoServ = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.idNivelServ = dsg.getMap(cbMapNPS, cbNivelS.getSelectedItem().toString());;
                ct.Nombre = txtServ.getText();
                ct.Costo = Float.parseFloat(txtCosto.getText());
                ct.updtServ();
                loadD();
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDtpserv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAct;
    private Design.ButtonGradient btnAgregar;
    private Design.ButtonGradient btnEliminar;
    private Design.ButtonGradient btnLimp;
    private Design.Combobox cbNivelS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtCosto;
    private Design.TextFieldSV txtServ;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Mantenimiento;

import AControlador.ctPreguntas;
import AControlador.ctTipoServ;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDPregN extends javax.swing.JPanel {

    private int idTipoUs;
    private int idEsRow;
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDPregN() throws SQLException {
        initComponents();
        loadD();
        if(tbData.getRowCount()>0){
            setData();
        }
    }

    final void loadD() throws SQLException {
        String[] column = {"idPregunta", "Pregunta"};
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
            ctPreguntas ct = new ctPreguntas();
            ct.enun = txtBusq.getText().toString();
            ResultSet rs = ct.loadNPreg();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idPregunta"), rs.getString("enunciado")};
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
        txtPreg = new Design.TextFieldSV();
        btnAct = new Design.ButtonGradient();
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
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 470, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Titulo de la pregunta");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, -1, -1));

        txtPreg.setBackground(new java.awt.Color(202, 233, 255));
        txtPreg.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtPreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, 310, -1));

        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        PCont.add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 120, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pregunta:");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 670, 250));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 720, 290));

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

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                ctPreguntas ct = new ctPreguntas();
                ct.idPreg = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.enun = txtPreg.getText();
                ct.upNPreg();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDnivels.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros");
        }
    }//GEN-LAST:event_btnActActionPerformed

    final void setData() {
        txtPreg.setText(tbData.getValueAt(tbData.getSelectedRow(), 1).toString());
    }
    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        setData();
    }//GEN-LAST:event_tbDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtPreg;
    // End of variables declaration//GEN-END:variables
}

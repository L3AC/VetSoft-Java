/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Asistentes;

import AControlador.ctAsistente;
import AControlador.ctCliente;
import AControlador.ctRecep;
import AVista.CUENTA.updtTipoCuenta;
import Design.Desg;
import Mensajes.CódogpErrorDIFC1;
import Mensajes.GlassPanePopup;
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
public class CRUDAsistente extends javax.swing.JPanel {

    public int idTipoUs;
    private int idAsis;
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDAsistente(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        initComponents();
        loadD();
        if(idTipoUs==1){
            
        }
        else{
            btnEditar.setVisible(false);
            btnEliminar.setVisible(false);
        }
        
    }

    final void loadD() throws SQLException {
        String[] column = {"idAsistente", "Doctor a cargo", "Nombre", "Edad", "Sexo"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 5);
        CargarTabla();
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
            idAsis = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
        }
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            ctAsistente ct = new ctAsistente();
            ct.nombre = txtBusq.getText().toString();
            ResultSet rs = ct.cargarAsis();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idAsistente"), rs.getString("Doctor a cargo"),
                    rs.getString("Nombre"), rs.getString("Edad"),
                    rs.getString("Sexo")};
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
        btnEditar = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        txtBusq = new Design.TextFieldSV();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));

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

        txtBusq.setBackground(new java.awt.Color(255, 255, 255));
        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 950, 390));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del doctor a cargo:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel3.setText("VetSoft+");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(106, 106, 106)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(51, 51, 51)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
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
        idAsis = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tbData.getRowCount() > 0){
        UPDTAsistente subp;
        try {
            subp = new UPDTAsistente(idTipoUs, Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()));
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDAsistente.class.getName()).log(Level.SEVERE, null, ex);
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tbData.getRowCount() > 0){
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
                ctAsistente ct = new ctAsistente();
                ct.idAsistente = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.deleteAsis();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDAsistente.class.getName()).log(Level.SEVERE, null, ex);
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

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDAsistente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

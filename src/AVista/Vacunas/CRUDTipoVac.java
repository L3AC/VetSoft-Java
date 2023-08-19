package AVista.Vacunas;

import AControlador.ctCliente;
import AControlador.ctVacunas;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class CRUDTipoVac extends javax.swing.JPanel {

    public int idUs;
    private int idTPV;
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDTipoVac(int idUs) throws SQLException {
        this.idUs = idUs;
        initComponents();
        loadD();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        btnAddM = new Design.ButtonGradient();
        btnEditar = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        jLabel6 = new javax.swing.JLabel();
        txtUso = new Design.TextFieldSV();
        jLabel7 = new javax.swing.JLabel();
        txtVacuna = new Design.TextFieldSV();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre de vacuna:");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 74, -1, -1));

        txtBusq.setBackground(new java.awt.Color(202, 233, 255));
        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 66, 470, 50));

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 620, 430));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 680, 495));

        btnAddM.setText("Agregar ");
        btnAddM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMActionPerformed(evt);
            }
        });
        PCont.add(btnAddM, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 130, 50));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PCont.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, 130, 48));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 490, 130, 49));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre de la vacuna");
        PCont.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, -1, -1));

        txtUso.setBackground(new java.awt.Color(202, 233, 255));
        txtUso.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 440, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Para que sirve la vacuna");
        PCont.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, -1, -1));

        txtVacuna.setBackground(new java.awt.Color(202, 233, 255));
        txtVacuna.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 290, -1));

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
        String[] column = {"idTipoVacuna", "Vacuna", "Uso"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 3);
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
            ctVacunas ct=new ctVacunas();
            ct.nombreVac = txtBusq.getText().toString();
            ResultSet rs = ct.loadTPVac();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idTipoVacuna"), rs.getString("NombreVacuna"),
                    rs.getString("Utilidad")};
                model.addRow(oValores);
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDTipoVac.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtBusqKeyReleased

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
           txtVacuna.setText(tbData.getValueAt(tbData.getSelectedRow(), 1).toString());
           txtUso.setText(tbData.getValueAt(tbData.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnAddMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMActionPerformed
        try {
            ctVacunas ct=new ctVacunas();
            ct.nombreVac=txtVacuna.getText().toString();
            ct.util=txtUso.getText().toString();
            ct.insTPVac();
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDTipoVac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddMActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            ctVacunas ct=new ctVacunas();
            ct.idTipoVac=Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
            ct.nombreVac=txtVacuna.getText().toString();
            ct.util=txtUso.getText().toString();
            ct.upTPVac();
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDTipoVac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            ctVacunas ct=new ctVacunas();
            ct.idTipoVac= Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
            ct.delTPVac();
            try {
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDTipoVac.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAddM;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtUso;
    private Design.TextFieldSV txtVacuna;
    // End of variables declaration//GEN-END:variables
}

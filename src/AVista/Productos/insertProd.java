package AVista.Productos;

import AControlador.ctProd;
import AControlador.ctRaza;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class insertProd extends javax.swing.JPanel {

    private int idTipoUs;
    Desg dsg = new Desg();
    DefaultTableModel model;

    public insertProd(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        initComponents();
        loadD();
    }

    final void loadD() throws SQLException {
        String[] column = {"idProducto", "tipo", "Nombre", "Proveedor", "Precio"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 5);
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
            ct.producto = txtBusq.getText().toString();
            ResultSet rs = ct.tbProd();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idProducto"), rs.getString(
                    "tipo"), rs.getString("Nombre"),
                    rs.getString("Proveedor"),rs.getString("Precio")};
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
        jLabel4 = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        btnAgregar = new Design.ButtonGradient();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        btnEditar = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        btnCrear = new Design.ButtonGradient();

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre del producto");
        PCont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        txtBusq.setBackground(new java.awt.Color(202, 233, 255));
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
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 550, -1));

        btnAgregar.setText("Agregar ejemplares");
        PCont.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, 193, 39));

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbData.setBackground(new java.awt.Color(255, 255, 255));
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "idRaza", "Raza", "NombrePopular"
            }
        ));
        jScrollPane1.setViewportView(tbData);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 892, 450));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 161, 933, 505));

        btnEditar.setText("Editar");
        PCont.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, 193, 38));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 360, 193, 40));

        btnCrear.setText("Crear");
        PCont.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 193, 39));

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

    private void txtBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqActionPerformed

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(insertProd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased

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
                ct.idProd = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.dlProd();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(insertProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAgregar;
    private Design.ButtonGradient btnCrear;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEliminar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

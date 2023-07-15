package AVista.Animales;

import AControlador.ctAnimales;
import AControlador.ctCliente;
import AControlador.ctRecep;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class CRUDAnimales extends javax.swing.JPanel {

    public int idTipoUs;
    private int idAnimal;
    
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDAnimales() throws SQLException {
        initComponents();
        loadD();
    }

    final void loadD() throws SQLException {
        
        String[] column = {"idAnimal", "Animal", "Nombre", "Dueño"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 4);
        CargarTabla();
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
            int fila = tbData.getSelectedRow();
            idAnimal = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
        }
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        ctAnimales ct = new ctAnimales();
        try {
            ct.nombre = txtBusq.getText().toString();
            ResultSet rs = ct.cargarAnim();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idAnimal"), rs.getString("Animal"),
                    rs.getString("Nombre"), rs.getString("Dueño")};
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        txtBusq = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnReservas1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnReservas2 = new javax.swing.JButton();
        btnReservas3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idAnimal", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        PCont.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 1020, 610));

        txtBusq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 710, 40));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PCont.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 330, 140, 50));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 410, 140, 50));

        btnReservas1.setText("Emergencia");
        PCont.add(btnReservas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 130, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nombre de la mascota");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 200, -1));

        btnReservas2.setText("Agendar Cita");
        PCont.add(btnReservas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 160, 140, 50));

        btnReservas3.setText("Expediente");
        PCont.add(btnReservas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 240, 140, 50));

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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //dsg.ShowPanel(subpU, PCont, 1320, 810);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /*ct.idCliente=idCl;
        ct.deleteCl();*/
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        int fila = tbData.getSelectedRow();
        idAnimal = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_tbDataMouseClicked

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnReservas1;
    private javax.swing.JButton btnReservas2;
    private javax.swing.JButton btnReservas3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private SwingTable.Table tbData;
    private javax.swing.JTextField txtBusq;
    // End of variables declaration//GEN-END:variables
}

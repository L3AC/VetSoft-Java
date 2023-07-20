package AVista.Mantenimiento;

import AControlador.ctEsp;
import AVista.Usuarios.CRUDusuarios;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import Validation.Valida;


public class CRUDEsp extends javax.swing.JPanel {

    private int idEsp;
    private int idEsRow;
    ctEsp ct = new ctEsp();
    Desg dsg = new Desg();
    DefaultTableModel model;
    public int nUs;
    
    public CRUDEsp(int nUs) throws SQLException {
        this.nUs = nUs;
        initComponents();
        loadD();
        
        txtBusq.setDocument(new Valida(100, "[a-zA-Z0-9]*"));
    }

  
    public CRUDEsp() throws SQLException {
        initComponents();
        loadD();
        txtBusq.setDocument(new Valida(100, "[a-zA-Z0-9]*"));
    }

    final void loadD() throws SQLException {
        String[] column = {"idEspecialidad", "Especialidad"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0,2);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        txtBusq = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEsp = new Design.TextFieldSV();
        btnEliminar = new Design.ButtonGradient();
        btnAct = new Design.ButtonGradient();
        btnAgregar = new Design.ButtonGradient();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 137, 780, 610));

        txtBusq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 62, 710, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Nombre de la Especialidad");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, -1, -1));
        add(txtEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 310, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, 110, 40));

        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 370, 110, 40));

        btnAgregar.setText("Agregar");
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 430, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        
        idEsp = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tbDataMouseClicked

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
   try {
            ctEsp ctEs=new ctEsp();
            
            ctEs.esp=txtEsp.getText();
            ctEs.idEsp=idEsp;
            ctEs.insertEsp();
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDEsp.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        try {
            ctEsp ctEs=new ctEsp();
            
            ctEs.esp=txtEsp.getText();
            ctEs.idEsp=idEsp;
            ctEs.updtEsp();
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDEsp.class.getName()).log(Level.SEVERE, null, ex);
        }

          
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
                ctEsp ct = new ctEsp();
                ct.idEsp = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.deleteEsp();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDEsp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        
    }                                           
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.ButtonGradient btnAct;
    private Design.ButtonGradient btnAgregar;
    private Design.ButtonGradient btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private SwingTable.Table tbData;
    private javax.swing.JTextField txtBusq;
    private Design.TextFieldSV txtEsp;
    // End of variables declaration//GEN-END:variables
}

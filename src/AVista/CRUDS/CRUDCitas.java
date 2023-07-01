/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AVista.CRUDS;
import java.sql.*;
import AVista.CRUDS.CRUDCitas;
import javax.swing.table.DefaultTableModel;
import AModelo.Conx;

public class CRUDCitas extends javax.swing.JFrame {

    
    public CRUDCitas() {
        initComponents();
        Mostrar();
    }

    
    public void Mostrar(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.setColumnIdentifiers(new Object[]{"idCita", "fechahora","Nombre","Dueño","Doctores"});
        
        try{
            Statement statement = Conx.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select * from tbUsers");

            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("idCita"),rs.getInt("fechahora"),rs.getString("Nombre"),rs.getString("Dueño"),rs.getString("Doctores")});
            }
            tbData.setModel(modelo);
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public void  Eliminar(){
        int filaSelecionada = tbData.getSelectedRow();

        String idSelecionado = tbData.getValueAt(filaSelecionada,0).toString();

        try{
           PreparedStatement deleteCita = Conx.getConexion().prepareStatement("delete from tbCitas where idCita=?");
           deleteCita.setString(1, idSelecionado);
           deleteCita.executeUpdate();
           Mostrar();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }     
    }
    
    public void Editar(){
        
        int filaSelecionada = tbData.getSelectedRow();

        String idSelecionado = tbData.getValueAt(filaSelecionada,0).toString();

        try{
           PreparedStatement updateCita = Conx.getConexion().prepareStatement("UPDATE cita set idCita=?,fechahora=?,Nombre=?,Dueño=?,Doctores=? WHERE id=?");
           updateCita.setString(1, idSelecionado);
           updateCita.executeUpdate();
           Mostrar();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        txtBusq = new javax.swing.JTextField();
        btnAddM = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idCita", "Fecha", "Nombre", "Dueño", "Doctores"
            }
        ));
        jScrollPane1.setViewportView(tbData);
        if (tbData.getColumnModel().getColumnCount() > 0) {
            tbData.getColumnModel().getColumn(4).setResizable(false);
        }

        PCont.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 1020, 610));

        txtBusq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 710, 40));

        btnAddM.setText("Receta");
        PCont.add(btnAddM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 160, 130, 50));

        btnReservas.setText("Factura");
        PCont.add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 250, 130, 50));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PCont.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 340, 130, 50));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 430, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUDCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnAddM;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnReservas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbData;
    private javax.swing.JTextField txtBusq;
    // End of variables declaration//GEN-END:variables
}

package AVista.Citas;

import AControlador.ctAnimales;
import AControlador.ctCitas;
import AControlador.ctDoctores;
import AVista.Animales.CRUDAnimales;
import AVista.Animales.updtAnimales;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Validation.Valida;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CRUDCita extends javax.swing.JPanel {

    private int idTipoUs;
    private int idCita;
    private int idCuenta;
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDCita(int idTipoUS, int idCuenta) throws SQLException {
        this.idTipoUs = idTipoUS;
        this.idCuenta = idCuenta;
        initComponents();
        loadD();

        if(idTipoUS==4||idTipoUS==1){//DOCTOR Y ADMIN
            
        }
        else{
            btnRec.setVisible(false);
        }
        if(idTipoUS==5){//ASISTENTE
            btnAceptar.setVisible(false);
            btnEliminar.setVisible(false);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        txtBusq = new Design.TextFieldSV();
        panelRound1 = new Design.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        btnRec = new Design.ButtonGradient();
        btnFact = new Design.ButtonGradient();
        btnEditar = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        btnAceptar = new Design.ButtonGradient();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 63, 700, 50));

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
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbData);

        panelRound1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1000, -1));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 167, 1080, 490));

        btnRec.setText("Receta");
        PCont.add(btnRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(1151, 428, 120, 40));

        btnFact.setText("Factura");
        btnFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactActionPerformed(evt);
            }
        });
        PCont.add(btnFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1151, 502, 120, 40));

        btnEditar.setText("+ Info");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PCont.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1151, 281, 120, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1151, 357, 120, 40));

        btnAceptar.setText("Aceptar cita");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        PCont.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 140, 120, 46));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del dueño:");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 70, 168, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1217, 22, -1, -1));

        jLabel3.setText("VetSoft+");
        PCont.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1234, 89, -1, -1));

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
        String[] column = {"idCita", "idAnimal", "Estado", "Fecha", "Mascota", "Dueño", "Doctor"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 7);
        dsg.ColumnHide(model, tbData, 1, 7);
        if (idTipoUs == 4) {
            docTabla();
            System.err.println("doc");
        } else {
            otherTabla();
             System.err.println("oth");
        }
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
            int fila = tbData.getSelectedRow();
            idCita = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
        }

    }

    final void docTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            ctCitas ctD = new ctCitas();
            ctD.idDoctor = idCuenta;
            ctD.cliente = txtBusq.getText().toString();
            ResultSet rs = ctD.citaDoc();
            //System.err.println(txtBusq.getText().toString());
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idCita"), rs.getInt("idAnimal"),
                    rs.getString("Estado"), rs.getString("Fecha"),
                    rs.getString("Mascota"), rs.getString("Dueño"),
                    rs.getString("Doctor")};
                model.addRow(oValores);
            }
        } catch (Exception e) {

        }
    }

    final void otherTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            ctCitas ctD = new ctCitas();
            ctD.cliente = txtBusq.getText().toString();
            ResultSet rs = ctD.citaOther();
            
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idCita"), rs.getInt("idAnimal"),
                    rs.getString("Estado"), rs.getString("Fecha"),
                    rs.getString("Mascota"), rs.getString("Dueño"),
                    rs.getString("Doctor")};
                model.addRow(oValores);
            }
        } catch (Exception e) {

        }
    }

    private void estate() throws SQLException {
        ctCitas ct = new ctCitas();
        ct.idCita = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
        ResultSet rs = ct.verifEstate();
        if (rs.next()) {
            btnAceptar.setVisible(true);
        }
        else{
            btnAceptar.setVisible(false);
        }
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            updtCita subp = new updtCita(idTipoUs,
                    Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()),
                    idCuenta);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDAnimales.class.getName()).log(Level.SEVERE, null, ex);
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
            ctCitas ct=new ctCitas();
            ct.idCita = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
            ct.deleteCita();
            try {
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDAnimales.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        try {
            estate();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        UIManager.put("OptionPane.messageDialogTitle", "Confirmación");
        int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Desea confirmar cita?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new Object[]{"Sí", "No"},
                "No");

        if (opcion == JOptionPane.YES_OPTION) {
            ctCitas ct=new ctCitas();
            ct.idCita = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
            ct.aceptCita();
            try {
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDAnimales.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactActionPerformed
        
    }//GEN-LAST:event_btnFactActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAceptar;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEliminar;
    private Design.ButtonGradient btnFact;
    private Design.ButtonGradient btnRec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

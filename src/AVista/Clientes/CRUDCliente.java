package AVista.Clientes;

import AVista.CUENTA.updtTipoCuenta;
import AVista.CUENTA.insertTipoCuenta;
import AControlador.ctCliente;
import AControlador.ctDoctores;
import AVista.Animales.addMascota;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import Validation.Valida;

public class CRUDCliente extends javax.swing.JPanel {

    public int nUs;
    private int idCl;
    ctCliente ct = new ctCliente();
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDCliente(int nUs) throws SQLException {
        this.nUs = nUs;
        initComponents();
        loadD();
        if(nUs==4||nUs==5){
            btnEditar.setVisible(false);
            btnEliminar.setVisible(false);
            btnReservas.setVisible(false);
        }
        
    }

    public CRUDCliente() throws SQLException {
        initComponents();
        loadD();
    }

    final void loadD() throws SQLException {
        String[] column = {"idCliente", "Nombre", "Edad", "Sexo"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 4);
        CargarTabla();
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
            idCl = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
        }
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        try {
            ct.nombre = txtBusq.getText().toString();
            ResultSet rs = ct.cargarCl();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idCliente"), rs.getString("Nombre"),
                    rs.getString("Edad"), rs.getString("Sexo")};
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
        txtBusq = new Design.TextFieldSV();
        btnAddM = new Design.ButtonGradient();
        btnReservas = new Design.ButtonGradient();
        btnEditar = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReservas1 = new Design.ButtonGradient();

        setPreferredSize(new java.awt.Dimension(1320, 810));
        setVerifyInputWhenFocusTarget(false);

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBusq.setBackground(new java.awt.Color(202, 233, 255));
        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 66, 718, 52));

        btnAddM.setText("Agregar mascota");
        btnAddM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMActionPerformed(evt);
            }
        });
        PCont.add(btnAddM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 160, 146, 51));

        btnReservas.setText("Reservar Producto");
        PCont.add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, 146, 52));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        PCont.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 240, 146, 48));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PCont.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 310, 146, 49));

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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 930, 430));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 136, 1011, 495));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del cliente:");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 74, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1223, 18, -1, -1));

        jLabel3.setText("VetSoft+");
        PCont.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 88, -1, -1));

        btnReservas1.setText("Compra");
        PCont.add(btnReservas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 460, 146, 52));

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
        int fila = tbData.getSelectedRow();
        idCl = Integer.parseInt(tbData.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnAddMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMActionPerformed
        try {
            addMascota subp = new addMascota(nUs,
                    Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()));
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddMActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        updtTipoCuenta subp;
        try {
            subp = new updtTipoCuenta(nUs, idCl, 3);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
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
            ct.idCliente = idCl;
            ct.deleteCl();
            try {
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAddM;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEliminar;
    private Design.ButtonGradient btnReservas;
    private Design.ButtonGradient btnReservas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

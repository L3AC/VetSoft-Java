
package AVista.Vacunas;

import AControlador.ctExam;
import AControlador.ctVacunas;
import AVista.Animales.CRUDAnimales;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class HVacunas extends javax.swing.JPanel {

    public int idTipoUs;
    private int idAnim;
    Desg dsg = new Desg();
    DefaultTableModel model;
    
    public HVacunas(int idTipoUs, int idAnim) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idAnim = idAnim;
        initComponents();
        loadD();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        btnCart = new Design.ButtonGradient();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        btnElim = new Design.ButtonGradient();
        btnAct = new Design.ButtonGradient();
        txtDosis = new Design.TextFieldSV();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, 60));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Dosis aplicadas");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 180, -1, -1));

        txtBusq.setBackground(new java.awt.Color(202, 233, 255));
        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 470, 50));

        btnCart.setText("Reporte");
        btnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartActionPerformed(evt);
            }
        });
        PCont.add(btnCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 470, 130, 50));

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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 900, 430));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 970, 495));

        btnElim.setText("Eliminar");
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });
        PCont.add(btnElim, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 390, 130, 50));

        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        PCont.add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 310, 130, 50));

        txtDosis.setBackground(new java.awt.Color(202, 233, 255));
        txtDosis.setShadowColor(new java.awt.Color(0, 0, 51));
        txtDosis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDosisKeyReleased(evt);
            }
        });
        PCont.add(txtDosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 220, 70, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre de vacuna:");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

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
        String[] column = {"idTipoVacuna", "Vacuna", "Dosis","Uso"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 4);
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
            ctVacunas ct = new ctVacunas();
            ct.nombreVac = txtBusq.getText().toString();
            ct.idAnimal=idAnim;
            ResultSet rs = ct.loadVac();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idVacunacion"), rs.getString("NombreVacuna"),
                    rs.getInt("Dosis"),rs.getString("Utilidad")};
                model.addRow(oValores);
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    final void loadData() {
        try {
            ctVacunas ct = new ctVacunas();
            ct.idVac=Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()); ;

            ResultSet rs = ct.cargarV();
            while (rs.next()) {
                txtDosis.setText( String.valueOf(rs.getInt("dosis")));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDAnimales subp = new CRUDAnimales(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(HVacunas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(HVacunas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartActionPerformed
            HashMap<String, Object> param = new HashMap<>();
        param.put("idA", idAnim);
        dsg.reportS("Reporte Vacunas", "src/AVista/Vacunas/Vacunas.jasper", param);
    }//GEN-LAST:event_btnCartActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        loadData();
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
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
                ctVacunas ct=new ctVacunas();
                ct.idVac= Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.delVac();
                loadD();
                loadData();
                try {
                    loadD();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUDTipoVac.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(HVacunas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opcion == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnElimActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        try {
            ctVacunas ct=new ctVacunas();
            ct.idVac=Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
            ct.dosis=Integer.parseInt(txtDosis.getText());
            ct.upVac();
            loadD();
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(HVacunas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActActionPerformed

    private void txtDosisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDosisKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDosisKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAct;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnCart;
    private Design.ButtonGradient btnElim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtDosis;
    // End of variables declaration//GEN-END:variables
}

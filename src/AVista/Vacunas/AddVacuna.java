package AVista.Vacunas;

import AControlador.ctVacunas;
import AVista.Animales.CRUDAnimales;
import AVista.Animales.addMascota;
import AVista.Usuarios.CRUDusuarios;
import Design.Desg;
import Mensajes.CódogpErrorDIFC1;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AddVacuna extends javax.swing.JPanel {

    public int idTipoUs;
    private int idAnim;

    Desg dsg = new Desg();
    DefaultTableModel model;

    public AddVacuna(int idTipoUs, int idAnim) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idAnim = idAnim;
        initComponents();
        loadD();
        verifVac();
    }

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
            ctVacunas ct = new ctVacunas();
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

    final void verifVac() throws SQLException {
        ctVacunas ct=new ctVacunas();
        ct.idAnimal=idAnim;
        ct.idTipoVac=Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
        
        if(ct.verifVac().next()){
            btnAddM.setVisible(false);
        }
        else{
            btnAddM.setVisible(true);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnAddM = new Design.ButtonGradient();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        txtBusq = new Design.TextFieldSV();
        jLabel1 = new javax.swing.JLabel();
        btnBack3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddM.setForeground(new java.awt.Color(0, 0, 0));
        btnAddM.setText("Agregar ");
        btnAddM.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAddM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMActionPerformed(evt);
            }
        });
        PCont.add(btnAddM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, 160, 50));

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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 900, 430));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 970, 495));

        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 470, 50));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre de vacuna:");
        PCont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        btnBack3.setBackground(new java.awt.Color(190, 233, 232));
        btnBack3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack3.setBorder(null);
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });
        PCont.add(btnBack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, 60));

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

    private void btnAddMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMActionPerformed
if (tbData.getRowCount() > 0) {
        try {
            ctVacunas ct = new ctVacunas();
            ct.idAnimal = idAnim;
            ct.idTipoVac = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());;
            ct.insVac();
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(AddVacuna.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_btnAddMActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        try { 
            verifVac();
        } catch (SQLException ex) {
            Logger.getLogger(AddVacuna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbDataMouseClicked

    
    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(AddVacuna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        try {
            CRUDAnimales subp = new CRUDAnimales(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(addMascota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBack3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAddM;
    private javax.swing.JButton btnBack3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

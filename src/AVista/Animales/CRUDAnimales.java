package AVista.Animales;

import AControlador.ctAnimales;
import AControlador.ctCliente;
import AControlador.ctRecep;
import AVista.Citas.insertCita;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import Validation.Valida;

public class CRUDAnimales extends javax.swing.JPanel {

    public int idTipoUs;
    private int idAnimal;
    
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CRUDAnimales(int idTipoUs) throws SQLException {
        this.idTipoUs=idTipoUs;
        initComponents();
        loadD();
        
        txtBusq.setDocument(new Valida(50, "[a-zA-Z]*"));
        
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
        jLabel1 = new javax.swing.JLabel();
        btnEmergen = new Design.ButtonGradient();
        btnAgendar = new Design.ButtonGradient();
        btnReservas3 = new Design.ButtonGradient();
        btnEditar = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        txtBusq = new Design.TextFieldSV();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        btnVac = new Design.ButtonGradient();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del dueño");

        btnEmergen.setText("Emergencia");

        btnAgendar.setText("Agendar Cita");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        btnReservas3.setText("Examenes");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1020, 460));

        btnVac.setText("Vacunaciones");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(btnEmergen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVac, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservas3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnEmergen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnVac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnReservas3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        idAnimal = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tbDataMouseClicked

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
            ctAnimales ct=new ctAnimales();
            ct.idAnimal = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
            ct.deleteAnim();
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
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        try {
            updtAnimales subp = new updtAnimales(Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()));
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDAnimales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        try {
            insertCita subp = new insertCita(idTipoUs,Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()));
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDAnimales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void txtBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAgendar;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEliminar;
    private Design.ButtonGradient btnEmergen;
    private Design.ButtonGradient btnReservas3;
    private Design.ButtonGradient btnVac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

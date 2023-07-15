/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Asistentes;

import AControlador.ctAsistente;
import AControlador.ctDoctores;
import Design.Desg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class UPDTAsistente extends javax.swing.JPanel {

    private int idDoc;
    private int idTipoUs;
    private int idAsis;
    Desg dsg = new Desg();
    DefaultTableModel model;

    public UPDTAsistente(int idTipoUs, int idAsis) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idAsis = idAsis;
        initComponents();
        loadD();
        loadAsis();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbDoc = new javax.swing.JLabel();
        txtBusq = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        txtNombre = new javax.swing.JTextField();
        lbNom = new javax.swing.JLabel();
        lbDui = new javax.swing.JLabel();
        txtDui = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        lbApell = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lbNaci = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        btnConfirm = new javax.swing.JButton();
        lbDoc1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("CREAR PERFIL");

        lbDoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDoc.setText("doctor");

        txtBusq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Doctor");

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idUsuario", "Cargo", "usuario", "correo", "telefono"
            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNom.setText("Nombres");

        lbDui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDui.setText("Número de DUI");

        txtDui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSexo.setText("Sexo");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        lbApell.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbApell.setText("Apellidos");

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbNaci.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNaci.setText("Nacimiento");

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lbDoc1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDoc1.setText("Doctor:");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(lbDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDui, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lbApell, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lbNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dpNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lbDui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(lbApell, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lbNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(dpNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    final void loadD() throws SQLException {
        String[] column = {"idDoctor", "Especialidad", "Nombre"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 3);
        CargarTabla();
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
            idDoc = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
        }
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            ctDoctores ct = new ctDoctores();
            ct.nombre = txtBusq.getText().toString();
            ResultSet rs = ct.cargarDoc();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idDoctor"), rs.getString("especialidad"),
                    rs.getString("Nombre")};
                model.addRow(oValores);
            }
        } catch (Exception e) {

        }
    }

    final void loadAsis() throws SQLException {
        try {
            ctAsistente ct = new ctAsistente();
            ct.idAsistente = idAsis;

            ResultSet rs = ct.selectAsis();
            while (rs.next()) {
                
                txtNombre.setText(rs.getString("Nombre"));
                txtApellidos.setText(rs.getString("Apellido"));
                txtDui.setText(rs.getString("DUI"));
                dpNaci.setDate(rs.getDate("Nacimiento"));
                cbSexo.setSelectedItem(rs.getString("Sexo"));
                lbDoc.setText(rs.getString("doc"));
            }
            
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDAsistente subp = new CRUDAsistente(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CREARasistente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        lbDoc.setText(tbData.getValueAt(tbData.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        ctAsistente ct = new ctAsistente();
        ct.idAsistente = idAsis;
        ct.idDoctor = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());;
        ct.nombre = txtNombre.getText();
        ct.apellido = txtApellidos.getText();
        ct.dui = txtDui.getText();
        ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
        ct.sexo = cbSexo.getSelectedItem().toString();
        ct.updtAsis();
    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbApell;
    private javax.swing.JLabel lbDoc;
    private javax.swing.JLabel lbDoc1;
    private javax.swing.JLabel lbDui;
    private javax.swing.JLabel lbNaci;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbSexo;
    private SwingTable.Table tbData;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBusq;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

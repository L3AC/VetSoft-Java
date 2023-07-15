/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Asistentes;

import AControlador.ctAsistente;
import AControlador.ctDoctores;
import AControlador.ctUser;
import AVista.Doctores.CRUDDoctores;
import AVista.Usuarios.CRUDusuarios;
import Design.Desg;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LEAC2
 */
public class CREARasistente extends javax.swing.JPanel {

    private int idDoc;
    private int idUsAsis;
    private int idTipoUs;
    private int idCuenta;
    
    Desg dsg = new Desg();
    DefaultTableModel model;

    public CREARasistente(int idDoc) throws SQLException {
        this.idDoc = idDoc;
        initComponents();
        loadD();
        lbVerif.setVisible(false);
        verifPerfil();
    }

    final void loadD() throws SQLException {
        String[] column = {"idUsuario", "Usuario", "Correo", "Telefono"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 4);
        CargarTabla();
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
            idUsAsis = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
        }
    }

    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            ctAsistente ct = new ctAsistente();
            ct.usuario = txtBusq.getText().toString();
            ResultSet rs = ct.usAsis();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idUsuario"),
                    rs.getString("usuario"), rs.getString("correo"),
                    rs.getString("telefono")};
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
        btnBack = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbApell = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lbNaci = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        txtDui = new javax.swing.JTextField();
        lbDui = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        btnConfirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        txtBusq = new javax.swing.JTextField();
        lbVerif = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("CREAR PERFIL");

        lbApell.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbApell.setText("Apellidos");

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbNaci.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNaci.setText("Nacimiento");

        txtDui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbDui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDui.setText("Número de DUI");

        lbSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSexo.setText("Sexo");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

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

        txtBusq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });

        lbVerif.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbVerif.setText("Ya hay un perfil creado con este usuario");

        lbNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNom.setText("Nombres");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(441, 441, 441)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(823, 823, 823)
                        .addComponent(lbVerif, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDui, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(dpNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(lbVerif, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDDoctores subp=new CRUDDoctores(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CREARasistente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
       SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
       ctAsistente ct=new ctAsistente();
       ct.idDoctor=idDoc;
       ct.idUsuario=Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
       ct.nombre=txtNombre.getText();
       ct.apellido=txtApellidos.getText();
       ct.dui=txtDui.getText();
       ct.nacimiento=dt.format(dpNaci.getCalendar().getTime());
       ct.sexo=cbSexo.getSelectedItem().toString();
       ct.insertAsis();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        try {
            verifPerfil();
        } catch (SQLException ex) {
            Logger.getLogger(CREARasistente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbDataMouseClicked

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDAsistente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased
    
    final void verifPerfil() throws SQLException {
        ctAsistente ctAs = new ctAsistente();
        ctAs.idUsuario = idUsAsis = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
        
        List<Component> lista = new ArrayList<>();
        lista.add(lbNom);
        lista.add(lbApell);
        lista.add(lbDui);
        lista.add(lbNaci);
        lista.add(lbSexo);
        lista.add(txtNombre);
        lista.add(txtApellidos);
        lista.add(txtDui);
        lista.add(cbSexo);
        lista.add(dpNaci);
        lista.add(btnConfirm);//AGREGAR A UNA LISTA PARA SER DESABILITADOS

        if (ctAs.verifPerfil().next()) {
            lbVerif.setVisible(true);
            dsg.visib(lista, false);
        } else {
            lbVerif.setVisible(false);
            dsg.visib(lista, true);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbApell;
    private javax.swing.JLabel lbDui;
    private javax.swing.JLabel lbNaci;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbVerif;
    private SwingTable.Table tbData;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBusq;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

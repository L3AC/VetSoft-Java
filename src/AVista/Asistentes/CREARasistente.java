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
import Validation.Valida;

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

        txtNombre.setDocument(new Valida(50, "[a-zA-Z]*"));
        txtDui.setDocument(new Valida(10, "[0-9]*"));
        txtApellidos.setDocument(new Valida(50, "[a-zA-Z]*"));
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
        jLabel2 = new javax.swing.JLabel();
        lbApell = new javax.swing.JLabel();
        lbNaci = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        lbDui = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        lbVerif = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        btnConfirm = new Design.ButtonGradient();
        txtNombre = new Design.TextFieldSV();
        txtDui = new Design.TextFieldSV();
        txtApellidos = new Design.TextFieldSV();
        txtBusq = new Design.TextFieldSV();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        jLabel5 = new javax.swing.JLabel();

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
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 51, 70, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 73, 101));
        jLabel2.setText("CREAR PERFIL");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 230, 50));

        lbApell.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbApell.setForeground(new java.awt.Color(0, 0, 0));
        lbApell.setText("Apellidos");
        PCont.add(lbApell, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, 100, 30));

        lbNaci.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNaci.setForeground(new java.awt.Color(0, 0, 0));
        lbNaci.setText("Nacimiento");
        PCont.add(lbNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 370, 110, 30));

        dpNaci.setBackground(new java.awt.Color(255, 255, 255));
        PCont.add(dpNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 410, 260, 40));

        lbDui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDui.setForeground(new java.awt.Color(0, 0, 0));
        lbDui.setText("Número de DUI");
        PCont.add(lbDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 150, 30));

        lbSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSexo.setForeground(new java.awt.Color(0, 0, 0));
        lbSexo.setText("Sexo");
        PCont.add(lbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 100, 30));

        cbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbSexo.setForeground(new java.awt.Color(27, 73, 101));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        PCont.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 200, 40));

        lbVerif.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbVerif.setForeground(new java.awt.Color(0, 0, 0));
        lbVerif.setText("Ya hay un perfil creado con este usuario");
        PCont.add(lbVerif, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 350, 30));

        lbNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNom.setForeground(new java.awt.Color(0, 0, 0));
        lbNom.setText("Nombres");
        PCont.add(lbNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 100, 30));

        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 510, 145, 45));

        txtNombre.setBackground(new java.awt.Color(202, 233, 255));
        txtNombre.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 287, -1));

        txtDui.setBackground(new java.awt.Color(202, 233, 255));
        txtDui.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 287, -1));

        txtApellidos.setBackground(new java.awt.Color(202, 233, 255));
        txtApellidos.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 270, 287, -1));

        txtBusq.setBackground(new java.awt.Color(202, 233, 255));
        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 310, -1));

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbData.setBackground(new java.awt.Color(255, 255, 255));
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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, 360));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 561, 400));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Usuario:");
        PCont.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 72, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDDoctores subp = new CRUDDoctores(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CREARasistente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        try {
            verifPerfil();
        } catch (SQLException ex) {
            Logger.getLogger(CREARasistente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        ctAsistente ct = new ctAsistente();
        ct.idDoctor = idDoc;
        ct.idUsuario = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
        ct.nombre = txtNombre.getText();
        ct.apellido = txtApellidos.getText();
        ct.dui = txtDui.getText();
        ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
        ct.sexo = cbSexo.getSelectedItem().toString();
        ct.insertAsis();
    }//GEN-LAST:event_btnConfirmActionPerformed

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
    private Design.ButtonGradient btnConfirm;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser dpNaci;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbApell;
    private javax.swing.JLabel lbDui;
    private javax.swing.JLabel lbNaci;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbVerif;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtApellidos;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtDui;
    private Design.TextFieldSV txtNombre;
    // End of variables declaration//GEN-END:variables
}

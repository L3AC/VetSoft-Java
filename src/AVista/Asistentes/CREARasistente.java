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
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

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

        txtNombre.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtDui.setDocument(new Valida(10, "[0-9]*"));
        txtApellidos.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));

        Calendar fechaActual = Calendar.getInstance();
        fechaActual.add(Calendar.YEAR, -18);
        dpNaci.setMaxSelectableDate(fechaActual.getTime());
        verifPerfil();
        lbMin.setVisible(false);
        lbMin1.setVisible(false);
        lbMin2.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbMin = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        lbMin2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        btnBack.setBackground(new java.awt.Color(190, 233, 232));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CREAR PERFIL");

        lbApell.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbApell.setForeground(new java.awt.Color(0, 0, 0));
        lbApell.setText("Apellidos");

        lbNaci.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNaci.setForeground(new java.awt.Color(0, 0, 0));
        lbNaci.setText("Nacimiento");

        dpNaci.setBackground(new java.awt.Color(255, 255, 255));

        lbDui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDui.setForeground(new java.awt.Color(0, 0, 0));
        lbDui.setText("Número de DUI");

        lbSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSexo.setForeground(new java.awt.Color(0, 0, 0));
        lbSexo.setText("Sexo");

        cbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbSexo.setForeground(new java.awt.Color(27, 73, 101));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        lbVerif.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbVerif.setForeground(new java.awt.Color(0, 0, 0));
        lbVerif.setText("Ya hay un perfil creado con este usuario");

        lbNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNom.setForeground(new java.awt.Color(0, 0, 0));
        lbNom.setText("Nombres");

        btnConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("Confirmar");
        btnConfirm.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        txtNombre.setShadowColor(new java.awt.Color(0, 0, 51));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtDui.setShadowColor(new java.awt.Color(0, 0, 51));
        txtDui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDuiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuiKeyTyped(evt);
            }
        });

        txtApellidos.setShadowColor(new java.awt.Color(0, 0, 51));
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Usuario:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("VetSoft+");

        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 3");

        lbMin1.setForeground(new java.awt.Color(0, 0, 0));
        lbMin1.setText("Minimo de digitos 5");

        lbMin2.setForeground(new java.awt.Color(0, 0, 0));
        lbMin2.setText("Minimo de digitos 10");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDui, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PContLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbApell, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PContLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lbNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(dpNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PContLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lbMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(PContLayout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMin2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(441, 441, 441)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(390, 390, 390)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbVerif, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(299, 299, 299))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addGap(14, 14, 14)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVerif, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lbDui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PContLayout.createSequentialGroup()
                                .addComponent(lbApell, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(dpNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMin2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

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

        if (txtApellidos.getText().isEmpty() || txtNombre.getText().isEmpty() || txtDui.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
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
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDuiKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        if (txtNombre.getText().length() >= 3) {
            lbMin.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            lbMin.setVisible(true);
            btnConfirm.setEnabled(false);
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        // TODO add your handling code here:
        if (txtApellidos.getText().length() >= 5) {
            lbMin1.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            lbMin1.setVisible(true);
            btnConfirm.setEnabled(false);
        }
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtDuiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyReleased
        // TODO add your handling code here:
        if (txtDui.getText().length() >= 10) {
            lbMin2.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            lbMin2.setVisible(true);
            btnConfirm.setEnabled(false);
        }
    }//GEN-LAST:event_txtDuiKeyReleased

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbApell;
    private javax.swing.JLabel lbDui;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbMin1;
    private javax.swing.JLabel lbMin2;
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

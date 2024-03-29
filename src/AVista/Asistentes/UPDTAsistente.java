/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Asistentes;

import AControlador.ctAsistente;
import AControlador.ctDoctores;
import Design.Desg;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

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
/*Este apartado de validar los Jtexfield*/
        txtNombre.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));
        txtDui.setDocument(new Valida(10, "[0-9]*"));
        txtApellidos.setDocument(new Valida(50, "[a-zA-Z-ZáéíóúÁÉÍÓÚñÑüÜ´ ]*"));

        Calendar fechaActual = Calendar.getInstance();
        fechaActual.add(Calendar.YEAR, -18);
        dpNaci.setMaxSelectableDate(fechaActual.getTime());
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
        lbNom = new javax.swing.JLabel();
        lbDui = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        lbApell = new javax.swing.JLabel();
        lbNaci = new javax.swing.JLabel();
        dpNaci = new com.toedter.calendar.JDateChooser();
        lbDoc1 = new javax.swing.JLabel();
        txtNombre = new Design.TextFieldSV();
        txtDui = new Design.TextFieldSV();
        txtApellidos = new Design.TextFieldSV();
        btnConfirm = new Design.ButtonGradient();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        jLabel5 = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        lbMin2 = new javax.swing.JLabel();
        lbMin = new javax.swing.JLabel();

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
        jLabel2.setText("EDITAR PERFIL");

        lbDoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDoc.setForeground(new java.awt.Color(0, 0, 0));
        lbDoc.setText("doctor");

        lbNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNom.setForeground(new java.awt.Color(0, 0, 0));
        lbNom.setText("Nombres");

        lbDui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDui.setForeground(new java.awt.Color(0, 0, 0));
        lbDui.setText("Número de DUI");

        lbSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSexo.setForeground(new java.awt.Color(0, 0, 0));
        lbSexo.setText("Sexo");

        cbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        lbApell.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbApell.setForeground(new java.awt.Color(0, 0, 0));
        lbApell.setText("Apellidos");

        lbNaci.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNaci.setForeground(new java.awt.Color(0, 0, 0));
        lbNaci.setText("Nacimiento");

        lbDoc1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDoc1.setForeground(new java.awt.Color(0, 0, 0));
        lbDoc1.setText("Doctor a cargo:");

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

        btnConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("Confirmar");
        btnConfirm.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 540, 330));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Doctor:");

        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        jLabel3.setText("VetSoft+");

        lbMin1.setForeground(new java.awt.Color(0, 0, 0));
        lbMin1.setText("Minimo de digitos 10");

        lbMin2.setForeground(new java.awt.Color(0, 0, 0));
        lbMin2.setText("Minimo de digitos 10");

        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 3");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDui, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMin2)
                                    .addComponent(lbMin))))))
                .addGap(64, 64, 64)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbMin1))
                    .addComponent(lbApell, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(420, 420, 420)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(lbDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))))))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PContLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PContLayout.createSequentialGroup()
                                .addComponent(lbApell, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                                .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(lbMin2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(221, 221, 221))))
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

    //Esto nos ayudara a cargar los datos dentro de la tabla y ponerlo en columnas
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
//Esto nos ayudara a cargar los datos dentro de la tabla 
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
//Esto nos ayudara a cargar los datos
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

     //Esto nos ayudara a retroceder de crud
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDAsistente subp = new CRUDAsistente(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CREARasistente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed
    //Es para agarrar el Id
    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        lbDoc.setText(tbData.getValueAt(tbData.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tbDataMouseClicked

    //Esto nos ayudara a confirmar los cambios 
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (txtApellidos.getText().isEmpty() || txtDui.getText().isEmpty() || txtNombre.getText().isEmpty() || dpNaci.getDate()==null) {
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
            ct.idAsistente = idAsis;
            ct.idDoctor = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());;
            ct.nombre = txtNombre.getText();
            ct.apellido = txtApellidos.getText();
            ct.dui = txtDui.getText();
            ct.nacimiento = dt.format(dpNaci.getCalendar().getTime());
            ct.sexo = cbSexo.getSelectedItem().toString();
            ct.updtAsis();
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

        //Esto nos ayudara a buscar de manera mas facil algun registro
    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(UPDTAsistente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtDuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_txtDuiKeyTyped
//Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros, donde si solo escribe dos numeros le saldra un texfield
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        if (txtNombre.getText().length() >= 3 && txtApellidos.getText().length() >= 5 && txtDui.getText().length() >= 10 && dpNaci.getDate()==null) {
            lbMin.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtNombre.getText().length() >= 3) {
                lbMin.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin.setVisible(true);
                btnConfirm.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtNombreKeyReleased
//Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros, donde si solo escribe dos numeros le saldra un texfield
    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        // TODO add your handling code here:
        if (txtApellidos.getText().length() >= 5 && txtNombre.getText().length() >= 3 && txtDui.getText().length() >= 10 && dpNaci.getDate()==null) {
            lbMin1.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtApellidos.getText().length() >= 5) {
                lbMin1.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin1.setVisible(true);
                btnConfirm.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtApellidosKeyReleased
//Esto nos ayuda a poner un minimo de digitos a los texfield para no escribir por ejemplo solo 2 numeros, donde si solo escribe dos numeros le saldra un texfield
    private void txtDuiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyReleased
        // TODO add your handling code here:
        if (txtDui.getText().length() >= 10 && txtNombre.getText().length() >= 3 && txtApellidos.getText().length() >= 5 && dpNaci.getDate()==null) {
            lbMin2.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtDui.getText().length() >= 10) {
                lbMin2.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin2.setVisible(true);
                btnConfirm.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtDuiKeyReleased


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
    private javax.swing.JLabel lbDoc;
    private javax.swing.JLabel lbDoc1;
    private javax.swing.JLabel lbDui;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbMin1;
    private javax.swing.JLabel lbMin2;
    private javax.swing.JLabel lbNaci;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbSexo;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtApellidos;
    private Design.TextFieldSV txtBusq;
    private Design.TextFieldSV txtDui;
    private Design.TextFieldSV txtNombre;
    // End of variables declaration//GEN-END:variables
}

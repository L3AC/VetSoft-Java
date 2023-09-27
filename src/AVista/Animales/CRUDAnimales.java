package AVista.Animales;

import AControlador.ctAnimales;
import AControlador.ctCliente;
import AControlador.ctRecep;
import AVista.Citas.insertCita;
import AVista.Vacunas.AddVacuna;
import AVista.Vacunas.HVacunas;
import Design.Desg;
import Mensajes.CódigoError;
import Mensajes.CódogpErrorDIFC1;
import Mensajes.GlassPanePopup;
import SwingScroll.ScrollBar;
import Tipografias.Fuentes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUDAnimales extends javax.swing.JPanel {

    public int idTipoUs;
    private int idAnimal;

    Desg dsg = new Desg();
    Fuentes tipoFuente;
    DefaultTableModel model;

    public CRUDAnimales(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
         jScrollPane1.setVerticalScrollBar(new ScrollBar());
        initComponents();
        loadD();
   /*Este apartado de setFound nos ayuda a poner un tipo de fuente en especifico y el tamaño de la letra*/
        tipoFuente = new Fuentes();    
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 18));
        txtBusq.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 18));
        tbData.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 18));

        txtBusq.setDocument(new Valida(50, "[a-zA-Z]*"));
        btnEmergen.setVisible(false);
        if(idTipoUs==2){
            btnEditar.setVisible(false);
            btnEliminar.setVisible(false);
            btnAddV.setVisible(false);
            btnVac.setVisible(false);
            btnExam.setVisible(false);
        }

    }

    //Esta nos ayudara para cargar los datos en columna a la tabla 
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

    //Esto nos ayudara a cargar los datos dentro de la tabla
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
        btnEmergen = new Design.ButtonGradient();
        btnAgendar = new Design.ButtonGradient();
        btnExam = new Design.ButtonGradient();
        btnEditar = new Design.ButtonGradient();
        btnEliminar = new Design.ButtonGradient();
        txtBusq = new Design.TextFieldSV();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        btnVac = new Design.ButtonGradient();
        jLabel2 = new javax.swing.JLabel();
        btnAddV = new Design.ButtonGradient();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));
        PCont.setFocusCycleRoot(true);

        btnEmergen.setForeground(new java.awt.Color(0, 0, 0));
        btnEmergen.setText("Emergencia");
        btnEmergen.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEmergen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergenActionPerformed(evt);
            }
        });

        btnAgendar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgendar.setText("Agendar Cita");
        btnAgendar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        btnExam.setForeground(new java.awt.Color(0, 0, 0));
        btnExam.setText("Examenes");
        btnExam.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamActionPerformed(evt);
            }
        });

        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtBusq.setShadowColor(new java.awt.Color(0, 0, 51));
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

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
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
                "idAnimal", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 910, 460));

        btnVac.setForeground(new java.awt.Color(0, 0, 0));
        btnVac.setText("Vacunas");
        btnVac.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnVac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del dueño:");

        btnAddV.setForeground(new java.awt.Color(0, 0, 0));
        btnAddV.setText("Agregar vacuna");
        btnAddV.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAddV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddV, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(btnVac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmergen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmergen, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnVac, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnAddV, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnExam, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 157, Short.MAX_VALUE))
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

    //Esto nos ayuda a agarrar el Id de la tabla
    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        idAnimal = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tbDataMouseClicked

    //Esto nos ayuda a eliminar los datos de una tabla por medio del ID
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tbData.getRowCount() > 0) {
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
                ctAnimales ct = new ctAnimales();
                ct.idAnimal = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.deleteAnim();
                try {
                    loadD();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUDAnimales.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (opcion == JOptionPane.NO_OPTION) {

            }
        } else {
           CódigoError obj = new CódigoError();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    //Esto nos ayuda a buscar lo que necesitamos enla tabla por medio del ID
    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    //Esto nos ayuda para recoger el Id del animal y podernos mandar a otro crud y poder editar la info
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                updtAnimales subp = new updtAnimales(Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()));
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDAnimales.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
           CódigoError obj = new CódigoError();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    //Esto nos ayuda a insertar una cita a alguna mascota
    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                insertCita subp = new insertCita(idTipoUs, Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()), 2);
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDAnimales.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            CódigoError obj = new CódigoError();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void txtBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqActionPerformed

    //Esto nos ayuda a mandarnos a otro crud para poder ver los examenes de que tiene el animal
    private void btnExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                CRUDExam subp = new CRUDExam(idAnimal, idTipoUs);
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDAnimales.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
           CódigoError obj = new CódigoError();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_btnExamActionPerformed

    //Esto nos ayuda a ver la pantalla de vacunas si tiene el animal
    private void btnVacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                HVacunas subp = new HVacunas(idTipoUs, Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()));
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(HVacunas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
           CódigoError obj = new CódigoError();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_btnVacActionPerformed

    //Esto nos ayuda a añadir una vacuna a algun animal
    private void btnAddVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                AddVacuna subp = new AddVacuna(idTipoUs, Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString()));
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(CRUDAnimales.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            CódigoError obj = new CódigoError();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_btnAddVActionPerformed

    private void btnEmergenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmergenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAddV;
    private Design.ButtonGradient btnAgendar;
    private Design.ButtonGradient btnEditar;
    private Design.ButtonGradient btnEliminar;
    private Design.ButtonGradient btnEmergen;
    private Design.ButtonGradient btnExam;
    private Design.ButtonGradient btnVac;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

package AVista.Clientes;

import AControlador.ctCliente;
import AControlador.ctEjem;
import AControlador.ctReservFact;
import Design.Desg;
import Mensajes.CódigoError;
import Mensajes.CódogpErrorDIFC1;
import Mensajes.GlassPanePopup;
import Tipografias.Fuentes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class CRUDEjemRe extends javax.swing.JPanel {

    private int idTipoUs;
    private int idCl;
    Desg dsg = new Desg();
    DefaultTableModel model;
    Fuentes tipoFuente;

    public CRUDEjemRe(int idCl, int idTipoUs) throws SQLException {
        this.idCl = idCl;
        this.idTipoUs = idTipoUs;
        initComponents();
        loadD();
        
        //Este apartado nos ayuda a llamar la clase "Fuentes" y poder colocar diferente tipografia, tamaño y estilo a los textos
        tipoFuente = new Fuentes();
        
        jLabel4.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 24));
        txtBusq.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 18));
        tbData.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 18));
        btnAgregar.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 22));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        panelRound1 = new Design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new SwingTable.Table();
        btnAgregar = new Design.ButtonGradient();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(202, 233, 255));

        jLabel3.setText("VetSoft+");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica 64px.png"))); // NOI18N

        btnBack.setBackground(new java.awt.Color(202, 233, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Producto");

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
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Servicio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(tbData);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1050, 500));

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Reservar producto");
        btnAgregar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addGap(30, 30, 30)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
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

   //Este apartado nos ayuda a poder cargar los datos de la base 
    final void loadD() throws SQLException {
        String[] column = {"idEjemplar", "Tipo", "Producto", "Precio"};
        model = new DefaultTableModel(null, column);
        dsg.ColumnHide(model, tbData, 0, 4);
        CargarTabla();
        if (tbData.getRowCount() > 0) {
            tbData.setRowSelectionInterval(0, 0);
        }
    }

    //Metodo para cargar la tabla y colocar sus componentes como (Nombre de las cabeceras de las columnas)
    final void CargarTabla() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        try {
            ctEjem ct = new ctEjem();
            ct.nombre = txtBusq.getText().toString();
            ResultSet rs = ct.tbEjemRe();
            while (rs.next()) {
                Object[] oValores = {rs.getInt("idEjemplar"), rs.getString("tipo"),
                    rs.getString("producto"), rs.getFloat("precio")};
                model.addRow(oValores);
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    //Esto nos ayuda a que la flecha para regresar, regrese al CRUDCliente
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        try {
            CRUDCliente subp = new CRUDCliente(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDEjemRe.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqActionPerformed

    //Nos ayuda a buscar los datos en la tabla
    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        try {
            loadD();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDEjemRe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBusqKeyReleased

    //Nos ayuda a poder reservar un producto de la tabla segun el producto seleccionado
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (tbData.getRowCount() > 0) {
            try {
                ctReservFact ct = new ctReservFact();
                ct.idCl = idCl;
                ct.idEjem = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct.insEjemRe();
                ctEjem ct2 = new ctEjem();
                ct2.idEjem = Integer.parseInt(tbData.getValueAt(tbData.getSelectedRow(), 0).toString());
                ct2.estado = "Reservado";
                ct2.stateEjemRe();
                loadD();
            } catch (SQLException ex) {
                Logger.getLogger(CRUDEjemRe.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAgregar;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private Design.PanelRound panelRound1;
    private SwingTable.Table tbData;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

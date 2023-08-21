package AVista.Animales;

import AControlador.ctTipoServ;
import AVista.Productos.updateProd;
import Design.Desg;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class insertExam extends javax.swing.JPanel {

    private int idTipoUs;
    private int idAnim;
    private byte[] bImg;
    
    Desg dsg = new Desg();
    DefaultTableModel model;
    Map<Integer, String> cbServ = new HashMap<>();

    public insertExam(int idAnim, int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idAnim = idAnim;
        initComponents();
        loadComboServ(cbTp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        panelRound1 = new Design.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        txtNotaCl = new Design.TextFieldSV();
        lbImg = new javax.swing.JLabel();
        cbTp = new Design.Combobox();
        btnSelect = new Design.ButtonGradient();
        lbEsp2 = new javax.swing.JLabel();
        btnConfirm = new Design.ButtonGradient();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(202, 233, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nota");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 50, 30));

        txtNotaCl.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtNotaCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 920, 50));

        lbImg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbImg.setForeground(new java.awt.Color(0, 0, 0));
        panelRound1.add(lbImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 320, 280));

        cbTp.setForeground(new java.awt.Color(80, 80, 80));
        cbTp.setLabeText("");
        cbTp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTpActionPerformed(evt);
            }
        });
        panelRound1.add(cbTp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 270, 40));

        btnSelect.setText("Seleccionar foto");
        btnSelect.setColor1(new java.awt.Color(255, 255, 255));
        btnSelect.setColor2(new java.awt.Color(255, 255, 255));
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        panelRound1.add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 120, 40));

        lbEsp2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp2.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp2.setText("Tipo de servicio");
        panelRound1.add(lbEsp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, -1));

        PCont.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 980, 440));

        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, 140, 60));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 73, 101));
        jLabel2.setText("REGISTRAR EXAMEN MÉDICO");
        PCont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        try {
            CRUDExam subp = new CRUDExam(idAnim,idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(insertExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        /*ctCitas ct = new ctCitas();

        ct.idAnimal = idAnim;
        ct.idTipoServicio = dsg.getMap(cbServ, cbServicio.getSelectedItem().toString());
        ct.idDoctor = dsg.getMap(cbDoct, cbDoc.getSelectedItem().toString());
        ct.notaDelCliente = txtNotaCl.getText();
        ct.notaDelDoctor = txtNotaD.getText();
        ct.fecha = dt.format(dpFecha.getCalendar().getTime());
        ct.hora = cbHora.getSelectedItem().toString();
        System.err.println(dt.format(dpFecha.getCalendar().getTime()) + " " + cbHora.getSelectedItem().toString());
        ct.insertCita();*/
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar imagen");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif"));
        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                bImg = dsg.selectImg(file);
                dsg.putImg(lbImg, bImg);
            } catch (IOException ex) {
                Logger.getLogger(updateProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void cbTpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTpActionPerformed

    }//GEN-LAST:event_cbTpActionPerformed

    private void loadComboServ(JComboBox cb) throws SQLException {
        ctTipoServ ct = new ctTipoServ();
        ct.idNivelServ = 3;
        ResultSet rs = ct.comboServ();
        while (rs.next()) {
            int idTP = rs.getInt("idTipoServicio");
            String nombre = rs.getString("Nombre");
            cb.addItem(nombre);
            cbServ.put(idTP, nombre);
        }
        cb.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private Design.ButtonGradient btnSelect;
    private Design.Combobox cbTp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbEsp2;
    private javax.swing.JLabel lbImg;
    private Design.PanelRound panelRound1;
    private Design.TextFieldSV txtNotaCl;
    // End of variables declaration//GEN-END:variables
}

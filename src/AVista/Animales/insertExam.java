package AVista.Animales;

import AControlador.ctExam;
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
        txtNota = new Design.TextFieldSV();
        lbImg = new javax.swing.JLabel();
        cbTp = new Design.Combobox();
        btnSelect = new Design.ButtonGradient();
        lbEsp2 = new javax.swing.JLabel();
        btnConfirm = new Design.ButtonGradient();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        panelRound1.setBackground(new java.awt.Color(190, 233, 232));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nota:");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 50, 30));

        txtNota.setShadowColor(new java.awt.Color(0, 0, 51));
        panelRound1.add(txtNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 920, 50));

        lbImg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbImg.setForeground(new java.awt.Color(0, 0, 0));
        lbImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImgMouseClicked(evt);
            }
        });
        panelRound1.add(lbImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 320, 280));

        cbTp.setForeground(new java.awt.Color(80, 80, 80));
        cbTp.setLabeText("");
        panelRound1.add(cbTp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 270, 40));

        btnSelect.setBackground(new java.awt.Color(190, 233, 232));
        btnSelect.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSelect.setForeground(new java.awt.Color(0, 0, 0));
        btnSelect.setText("Seleccionar foto");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        panelRound1.add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 190, 40));

        lbEsp2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEsp2.setForeground(new java.awt.Color(0, 0, 0));
        lbEsp2.setText("Tipo de servicio");
        panelRound1.add(lbEsp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, -1));

        btnConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("Confirmar");
        btnConfirm.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

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
        jLabel2.setText("REGISTRAR EXAMEN MÉDICO");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291)
                        .addComponent(jLabel2))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(590, 590, 590)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(170, 170, 170))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2)))
                .addGap(50, 50, 50)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    //Esto nos ayuda a retroceder de pantalla
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        try {
            CRUDExam subp = new CRUDExam(idAnim,idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(insertExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    //Esto nos ayuda a confirmar los daots ingresador
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        ctExam ct=new ctExam();
        ct.idAnim=idAnim;
        ct.idTipoS=dsg.getMap(cbServ, cbTp.getSelectedItem().toString());
        ct.image=bImg;
        ct.nota=txtNota.getText().toString();
        ct.insExam();
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    //Esto nos ayuda a buscar las imagenes dentro de la pc 
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

    private void lbImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImgMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbImgMouseClicked
// Esto nos ayuda a cargar la información dentro del combobox
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
    private Design.TextFieldSV txtNota;
    // End of variables declaration//GEN-END:variables
}

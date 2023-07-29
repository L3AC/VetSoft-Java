/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Productos;

import AControlador.ctProd;
import Design.Desg;
import Design.TextFieldSV;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LEAC2
 */
public class updateProd extends javax.swing.JPanel {

    private int idTipoUs;
    private int idProd;
    private byte[] bytesImagen;
    Desg dsg = new Desg();
        Map<Integer, String> cbTP = new HashMap<>();

    public updateProd(int idTipoUs, int idProd) throws SQLException {
        this.idTipoUs = idTipoUs;
        this.idProd = idProd;
        initComponents();
        loadCombo(cbTipoProd);
        loadDoc();
    }

    final void loadDoc()  {
        try {
            ctProd ct = new ctProd();
            ct.idProd= idProd;

            ResultSet rs = ct.selectProd();
            while (rs.next()) {
                cbTipoProd.setSelectedItem(rs.getString("tipo"));
                txtProducto.setText(rs.getString("nombre"));
                txtProv.setText(rs.getString("proveedor"));
                txtPrecio.setText(rs.getString("precio"));
                bytesImagen=rs.getBytes("img");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
        private void loadCombo(JComboBox cb) throws SQLException {
        ctProd ct = new ctProd();
        ResultSet rs = ct.comboTProd();
        while (rs.next()) {
            int idTP = rs.getInt("idTipoProducto");
            String nombre = rs.getString("tipo");
            cb.addItem(nombre);
            cbTP.put(idTP, nombre);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        cbTipoProd = new Design.Combobox();
        jLabel6 = new javax.swing.JLabel();
        txtProv = new Design.TextFieldSV();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new Design.TextFieldSV();
        btnConfirm = new Design.ButtonGradient();
        txtProducto = new Design.TextFieldSV();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSelect = new Design.ButtonGradient();
        lbImg = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbTipoProd.setForeground(new java.awt.Color(0, 0, 0));
        cbTipoProd.setLabeText("");
        cbTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoProdActionPerformed(evt);
            }
        });
        PCont.add(cbTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 180, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Proveedor");
        PCont.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, -1));

        txtProv.setBackground(new java.awt.Color(202, 233, 255));
        txtProv.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 280, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Precio");
        PCont.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, -1, -1));

        txtPrecio.setBackground(new java.awt.Color(202, 233, 255));
        txtPrecio.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, 160, -1));

        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        PCont.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 680, 140, 50));

        txtProducto.setBackground(new java.awt.Color(202, 233, 255));
        txtProducto.setShadowColor(new java.awt.Color(0, 0, 51));
        PCont.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre del producto");
        PCont.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo de producto");
        PCont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        btnSelect.setText("Seleccionar foto");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        PCont.add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 190, 50));

        lbImg.setBackground(new java.awt.Color(204, 204, 204));
        lbImg.setForeground(new java.awt.Color(255, 255, 255));
        lbImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImgMouseClicked(evt);
            }
        });
        PCont.add(lbImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 300, 260));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flechita.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        PCont.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 70, 60));

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

    private void cbTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoProdActionPerformed

        /*tpUs = dsg.getMap(cbTP, cbCargo.getSelectedItem().toString());
        System.out.println("ID seleccionado: " + tpUs);*/
    }//GEN-LAST:event_cbTipoProdActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        List<TextFieldSV> lista = new ArrayList<>();
        lista.add(txtProducto);
        lista.add(txtProv);
        lista.add(txtPrecio);
        if (dsg.areFieldsNotEmpty(lista) && bytesImagen != null) {
            ctProd ct = new ctProd();
            ct.idProd=idProd;
            ct.idTipoProd = dsg.getMap(cbTP, cbTipoProd.getSelectedItem().toString());
            ct.producto = txtProducto.getText();
            ct.proveedor = txtProv.getText();
            ct.precio = Float.parseFloat(txtPrecio.getText());
            ct.upProd();
        }
        else{
            JOptionPane.showMessageDialog(null, "Campos vacíos");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar imagen");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif"));
        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                bytesImagen = dsg.selectImg(file);
                dsg.putImg(lbImg, bytesImagen);
            } catch (IOException ex) {
                Logger.getLogger(updateProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void lbImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImgMouseClicked

        Foto subp = new Foto(idTipoUs, 1, bytesImagen, 2);
        dsg.ShowPanel(subp, PCont, 1320, 810);
    }//GEN-LAST:event_lbImgMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDProd subp = new CRUDProd(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(updateProd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private Design.ButtonGradient btnSelect;
    private Design.Combobox cbTipoProd;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbImg;
    private Design.TextFieldSV txtPrecio;
    private Design.TextFieldSV txtProducto;
    private Design.TextFieldSV txtProv;
    // End of variables declaration//GEN-END:variables
}

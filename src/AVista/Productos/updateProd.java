/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Productos;

import AControlador.ctProd;
import Design.Desg;
import Design.TextFieldSV;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import Validation.Valida;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        txtProducto.setDocument(new Valida(300, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´& ,.]*"));
        txtProv.setDocument(new Valida(300, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´& ,.]*"));
        txtPrecio.setDocument(new Valida(10, "[0-9.]*"));
        loadCombo(cbTipoProd);
        loadData();

        lbMin.setVisible(false);
        lbMin1.setVisible(false);
        lbMin2.setVisible(false);
    }

    final void loadData() {
        try {
            ctProd ct = new ctProd();
            ct.idProd = idProd;

            ResultSet rs = ct.selectProd();
            while (rs.next()) {
                cbTipoProd.setSelectedItem(rs.getString("tipo"));
                txtProducto.setText(rs.getString("nombre"));
                txtProv.setText(rs.getString("proveedor"));
                txtPrecio.setText(rs.getString("precio"));
                bytesImagen = rs.getBytes("img");
                lbImg.setSize(300, 260);
                dsg.putImg(lbImg, bytesImagen);
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
        lbMin2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSelect = new Design.ButtonGradient();
        lbImg = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        lbMin = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));

        cbTipoProd.setForeground(new java.awt.Color(0, 0, 0));
        cbTipoProd.setLabeText("");
        cbTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoProdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Proveedor");

        txtProv.setShadowColor(new java.awt.Color(0, 0, 51));
        txtProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Precio");

        txtPrecio.setShadowColor(new java.awt.Color(0, 0, 51));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
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

        txtProducto.setShadowColor(new java.awt.Color(0, 0, 51));
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });

        lbMin2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMin2.setForeground(new java.awt.Color(0, 0, 0));
        lbMin2.setText("Minimo de digitos 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo de producto");

        btnSelect.setForeground(new java.awt.Color(0, 0, 0));
        btnSelect.setText("Seleccionar foto");
        btnSelect.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        lbImg.setBackground(new java.awt.Color(204, 204, 204));
        lbImg.setForeground(new java.awt.Color(255, 255, 255));
        lbImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImgMouseClicked(evt);
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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre del producto");

        lbMin1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMin1.setForeground(new java.awt.Color(0, 0, 0));
        lbMin1.setText("Minimo de digitos 3");

        lbMin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 3");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(370, 370, 370)
                .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel4)
                .addGap(263, 263, 263)
                .addComponent(jLabel6))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(cbTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbMin))
                    .addComponent(txtProv, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel8)
                .addGap(247, 247, 247)
                .addComponent(jLabel7))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbMin1))
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbMin2))
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lbMin))
                    .addComponent(txtProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMin1)
                            .addComponent(lbMin2))))
                .addGap(64, 64, 64)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void cbTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoProdActionPerformed
        /*tpUs = dsg.getMap(cbTP, cbCargo.getSelectedItem().toString());
        System.out.println("ID seleccionado: " + tpUs);*/
    }//GEN-LAST:event_cbTipoProdActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (txtProv.getText().isEmpty() || txtProducto.getText().isEmpty() || txtPrecio.getText().isEmpty()) {
            CódigoErrorDSI5 obj = new CódigoErrorDSI5();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        } else {
            List<TextFieldSV> lista = new ArrayList<>();
            lista.add(txtProducto);
            lista.add(txtProv);
            lista.add(txtPrecio);
            if (dsg.areFieldsNotEmpty(lista) && bytesImagen != null) {
                ctProd ct = new ctProd();
                ct.idProd = idProd;
                ct.idTipoProd = dsg.getMap(cbTP, cbTipoProd.getSelectedItem().toString());
                ct.producto = txtProducto.getText();
                ct.proveedor = txtProv.getText();
                ct.precio = Float.parseFloat(txtPrecio.getText());
                ct.image = bytesImagen;
                ct.upProd();
            } else {
                CódigoErrorDSI5 obj = new CódigoErrorDSI5();
                obj.eventOK(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        GlassPanePopup.closePopupLast();
                    }
                });
                GlassPanePopup.showPopup(obj);
            }
    }//GEN-LAST:event_btnConfirmActionPerformed
    }
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

    private void txtProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtProvKeyTyped

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvKeyReleased
        // TODO add your handling code here:
        if (txtProv.getText().length() >= 3 && txtProducto.getText().length() >= 3 && txtPrecio.getText().length() >= 2) {
            lbMin.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtProv.getText().length() >= 3) {
                lbMin.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin.setVisible(true);
                btnConfirm.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtProvKeyReleased

    private void txtProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyReleased
        // TODO add your handling code here:
        if (txtProducto.getText().length() >= 3 && txtProv.getText().length() >= 3 && txtPrecio.getText().length() >= 2) {
            lbMin1.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtProducto.getText().length() >= 3) {
                lbMin1.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin1.setVisible(true);
                btnConfirm.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtProductoKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        // TODO add your handling code here:
        if (txtPrecio.getText().length() >= 2 && txtProducto.getText().length() >= 3 && txtProv.getText().length() >= 3) {
            lbMin2.setVisible(false);
            btnConfirm.setEnabled(true);
        } else {
            if (txtPrecio.getText().length() >= 2) {
                lbMin2.setVisible(false);
                btnConfirm.setEnabled(true);
            } else {
                lbMin2.setVisible(true);
                btnConfirm.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtPrecioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnConfirm;
    private Design.ButtonGradient btnSelect;
    private Design.Combobox cbTipoProd;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbImg;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbMin1;
    private javax.swing.JLabel lbMin2;
    private Design.TextFieldSV txtPrecio;
    private Design.TextFieldSV txtProducto;
    private Design.TextFieldSV txtProv;
    // End of variables declaration//GEN-END:variables
}

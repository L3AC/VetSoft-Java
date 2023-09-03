package AVista.Productos;

import AControlador.ctDoctores;
import AControlador.ctEsp;
import AControlador.ctProd;
import AControlador.ctRaza;
import Design.Desg;
import Design.TextFieldSV;
import Mensajes.CódigoErrorDSI5;
import Mensajes.GlassPanePopup;
import Validation.Valida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class insertProd extends javax.swing.JPanel {

    private int idTipoUs;
    private byte[] bytesImagen;
    Desg dsg = new Desg();
    Map<Integer, String> cbTP = new HashMap<>();

    public insertProd(int idTipoUs) throws SQLException {
        this.idTipoUs = idTipoUs;
        initComponents();
         loadCombo(cbTipoProd);
         
         txtProducto.setDocument(new Valida(300, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ,.]*"));
         txtProv.setDocument(new Valida(300, "[a-zA-Z0-9-ZáéíóúÁÉÍÓÚñÑüÜ´ ,.]*"));
         txtPrecio.setDocument(new Valida(10, "[0-9]*"));
         lbMin.setVisible(false);
        lbMin1.setVisible(false);
        lbMin2.setVisible(false);
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
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new Design.TextFieldSV();
        btnAgregar = new Design.ButtonGradient();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProducto = new Design.TextFieldSV();
        txtProv = new Design.TextFieldSV();
        btnSelect = new Design.ButtonGradient();
        btnBack = new javax.swing.JButton();
        cbTipoProd = new Design.Combobox();
        jLabel7 = new javax.swing.JLabel();
        lbImg = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        lbMin = new javax.swing.JLabel();
        lbMin2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(190, 233, 232));
        PCont.setPreferredSize(new java.awt.Dimension(1320, 810));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo de producto");

        txtPrecio.setShadowColor(new java.awt.Color(0, 0, 51));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Confirmar");
        btnAgregar.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre del producto");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Proveedor");

        txtProducto.setShadowColor(new java.awt.Color(0, 0, 51));
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });

        txtProv.setShadowColor(new java.awt.Color(0, 0, 51));
        txtProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvKeyTyped(evt);
            }
        });

        btnSelect.setForeground(new java.awt.Color(0, 0, 0));
        btnSelect.setText("Seleccionar foto");
        btnSelect.setFont(new java.awt.Font("Comfortaa Regular", 0, 14)); // NOI18N
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
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

        cbTipoProd.setForeground(new java.awt.Color(0, 0, 0));
        cbTipoProd.setLabeText("");
        cbTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoProdActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Precio");

        lbImg.setBackground(new java.awt.Color(204, 204, 204));
        lbImg.setForeground(new java.awt.Color(255, 255, 255));
        lbImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImgMouseClicked(evt);
            }
        });

        lbMin1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMin1.setForeground(new java.awt.Color(0, 0, 0));
        lbMin1.setText("Minimo de digitos 3");

        lbMin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMin.setForeground(new java.awt.Color(0, 0, 0));
        lbMin.setText("Minimo de digitos 3");

        lbMin2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMin2.setForeground(new java.awt.Color(0, 0, 0));
        lbMin2.setText("Minimo de digitos 2");

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
                .addGap(262, 262, 262)
                .addComponent(jLabel6))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel5)
                .addGap(244, 244, 244)
                .addComponent(jLabel7))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbMin1)))
                .addGap(130, 130, 130)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbMin2))
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(cbTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbMin))
                    .addComponent(txtProv, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(txtProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMin)
                .addGap(37, 37, 37)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMin1)
                    .addComponent(lbMin2))
                .addGap(48, 48, 48)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        List<TextFieldSV> lista = new ArrayList<>();
        lista.add(txtProducto);
        lista.add(txtProv);
        lista.add(txtPrecio);
        if ( dsg.areFieldsNotEmpty(lista) && bytesImagen != null) {
            ctProd ct = new ctProd();
            ct.idTipoProd = dsg.getMap(cbTP, cbTipoProd.getSelectedItem().toString());
            ct.producto = txtProducto.getText();
            ct.proveedor = txtProv.getText();
            ct.precio = Float.parseFloat(txtPrecio.getText());
            ct.image=bytesImagen;
            ct.insProd();
        }
        else{
              CódigoErrorDSI5 obj = new CódigoErrorDSI5();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void lbImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImgMouseClicked

        /*Foto subp = new Foto(idTipoUs, 1, bytesImagen, 2);
        dsg.ShowPanel(subp, PCont, 1320, 810);*/
    }//GEN-LAST:event_lbImgMouseClicked

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            CRUDProd subp = new CRUDProd(idTipoUs);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDProd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoProdActionPerformed

        /*tpUs = dsg.getMap(cbTP, cbCargo.getSelectedItem().toString());
        System.out.println("ID seleccionado: " + tpUs);*/
    }//GEN-LAST:event_cbTipoProdActionPerformed

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
        if(txtProv.getText().length()>= 3){
            lbMin.setVisible(false);
             btnAgregar.setEnabled(true);
        }else {
            lbMin.setVisible(true);
            btnAgregar.setEnabled(false);
        } 
    }//GEN-LAST:event_txtProvKeyReleased

    private void txtProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyReleased
        // TODO add your handling code here:
        if(txtProducto.getText().length()>= 3){
            lbMin1.setVisible(false);
             btnAgregar.setEnabled(true);
        }else {
            lbMin1.setVisible(true);
             btnAgregar.setEnabled(false);
        } 
    }//GEN-LAST:event_txtProductoKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        // TODO add your handling code here:
          if(txtPrecio.getText().length()>= 2){
            lbMin2.setVisible(false);
             btnAgregar.setEnabled(true);
        }else {
            lbMin2.setVisible(true);
             btnAgregar.setEnabled(false);
        } 
    }//GEN-LAST:event_txtPrecioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private Design.ButtonGradient btnAgregar;
    private javax.swing.JButton btnBack;
    private Design.ButtonGradient btnSelect;
    private Design.Combobox cbTipoProd;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbImg;
    private javax.swing.JLabel lbMin;
    private javax.swing.JLabel lbMin1;
    private javax.swing.JLabel lbMin2;
    private Design.TextFieldSV txtPrecio;
    private Design.TextFieldSV txtProducto;
    private Design.TextFieldSV txtProv;
    // End of variables declaration//GEN-END:variables
}

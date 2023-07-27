/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Productos;

import Design.Desg;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LEAC2
 */
public class updateProd extends javax.swing.JPanel {

    /**
     * Creates new form updateProd
     */
    Desg dsg = new Desg();

    public updateProd() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        lbImg = new javax.swing.JLabel();
        btnImg = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));
        PCont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImgMouseClicked(evt);
            }
        });
        PCont.add(lbImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 200, 150));

        btnImg.setText("Select");
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });
        PCont.add(btnImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCont, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar imagen");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif"));
        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                byte[] bytesImagen = dsg.selectImg(file);
                dsg.putImg(lbImg,bytesImagen);
            } catch (IOException ex) {
                Logger.getLogger(updateProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnImgActionPerformed

    private void lbImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImgMouseClicked
        boolean isFullScreen = false;
        ImageIcon originalImageIcon = new ImageIcon("C:/Users/LEAC2/Downloads/one.png");
        int previousWidth = 0;
        int previousHeight = 0;
        if (isFullScreen) {
                // Restaura el tamaño original de la imagen
                lbImg.setIcon(originalImageIcon);
                PCont.setPreferredSize(new Dimension(previousWidth, previousHeight));
                PCont.revalidate();
                PCont.repaint();
            } else {
                // Pone la imagen en pantalla completa
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                previousWidth = PCont.getWidth();
                previousHeight = PCont.getHeight();

                PCont.setPreferredSize(screenSize);
                PCont.revalidate();
                PCont.repaint();

                Image scaledImage = originalImageIcon.getImage().getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_DEFAULT);
                ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                lbImg.setIcon(scaledImageIcon);
            }

            // Cambia el estado del modo pantalla completa
            isFullScreen = !isFullScreen;
    }//GEN-LAST:event_lbImgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JButton btnImg;
    private javax.swing.JLabel lbImg;
    // End of variables declaration//GEN-END:variables
}

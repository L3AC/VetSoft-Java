package AVista.Productos;

import AVista.Animales.updateExam;
import AVista.Clientes.CRUDCliente;
import Design.Desg;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Foto extends javax.swing.JPanel {

    private int idTipoUs;
    private int idProd;
    private int idAnim;
    private int idExam;
    private int window;
    private byte[] bytesImagen;
    Desg dsg = new Desg();

    //PRODUCTOS
    public Foto(int idTipoUs, int idP, byte[] bytesImagen, int window) {
        this.window = window;
        this.idTipoUs = idTipoUs;
        this.idProd = idP;
        this.bytesImagen = bytesImagen;
        initComponents();
        lbImg.setSize(760, 760);
        dsg.putImg(lbImg, bytesImagen);
    }

    //EXAMENES
    public Foto(int idA, int idTipoUs, int idExam, byte[] bytesImagen, int window) {
        this.window = window;
        this.idTipoUs = idTipoUs;
        this.idAnim = idA;
        this.idExam = idExam;
        this.bytesImagen = bytesImagen;
        initComponents();
        lbImg.setSize(760, 760);
        dsg.putImg(lbImg, bytesImagen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCont = new javax.swing.JPanel();
        lbImg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1320, 810));

        PCont.setBackground(new java.awt.Color(255, 255, 255));

        lbImg.setPreferredSize(new java.awt.Dimension(1320, 810));
        lbImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

    private void lbImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImgMouseClicked
        if (window == 1) {
            try {
                updateProd subp = new updateProd(idTipoUs, idProd);
                dsg.ShowPanel(subp, PCont, 1320, 810);
            } catch (SQLException ex) {
                Logger.getLogger(Foto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (window == 2) {
            updateExam subp = new updateExam(idAnim, idTipoUs, idExam);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        }

    }//GEN-LAST:event_lbImgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JLabel lbImg;
    // End of variables declaration//GEN-END:variables

}

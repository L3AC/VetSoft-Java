package AVista.Productos;

import AVista.Clientes.CRUDCliente;
import Design.Desg;

public class Foto extends javax.swing.JPanel {

    private int idTipoUs;
    private int idProd;
    private int window;
    private byte[] bytesImagen;
    Desg dsg = new Desg();

    public Foto(int idTipoUs, byte[] bytesImagen, int window) {
        this.window = window;
        this.idTipoUs = idTipoUs;
        this.bytesImagen = bytesImagen;
        initComponents();
        dsg.putImg(lbImg, bytesImagen);
    }

    public Foto(int idTipoUs, int idProd, byte[] bytesImagen, int window) {
        this.window = window;
        this.idTipoUs = idTipoUs;
        this.idProd = idProd;
        this.bytesImagen = bytesImagen;
        initComponents();
        dsg.Showfoto(lbImg, PCont, 800, 800);
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
                .addGap(223, 223, 223)
                .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
            /*insertProd subp = new insertProd(idTipoU);
            dsg.ShowPanel(subp, PCont, 1320, 810);*/
        }
        if (window == 2) {
            updateProd subp = new updateProd(idTipoUs, idProd);
            dsg.ShowPanel(subp, PCont, 1320, 810);
        }

    }//GEN-LAST:event_lbImgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private javax.swing.JLabel lbImg;
    // End of variables declaration//GEN-END:variables

}

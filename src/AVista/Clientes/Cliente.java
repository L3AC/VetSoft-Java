/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Clientes;

import AControlador.ctCliente;
import AVista.RecuperacionDeContraseña;
import Design.Desg;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author godna
 */
public class Cliente extends javax.swing.JPanel {

 
    
    private String nombre;
    private String apellido;
  Desg dsg = new Desg();
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    private boolean selected;

    public Cliente(String nombre) throws SQLException {
        this.nombre=nombre;
        initComponents();
        setData();
        setOpaque(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        
            
        
    
    }
    
    

    public void setData() throws SQLException {

        try {
        
                txtNom.setText(nombre);

                

           // }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    @Override
    public void paint(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(242, 242, 242));
        if (selected) {
            g2.setColor(new Color(94, 156, 255));
            //g2.drawRoundRect(0,0,getWidth(),, WIDTH, WIDTH, HEIGHT, WIDTH, HEIGHT);
        }
        g2.dispose();
        super.paint(graphics);
    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelC = new Design.PictureBox();
        pic = new Design.PictureBox();
        txtNom = new javax.swing.JLabel();

        setBackground(new Color(255,255,255,0));
        setForeground(new Color(255,255,255,0));
        setName("ClienteP"); // NOI18N
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        PanelC.setImage(new javax.swing.ImageIcon(getClass().getResource("/AVista/Clientes/Cliente5.png"))); // NOI18N

        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/AVista/Clientes/ClienteI.png"))); // NOI18N
        PanelC.add(pic);
        pic.setBounds(40, 20, 70, 90);

        txtNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNom.setForeground(new java.awt.Color(27, 73, 101));
        txtNom.setText("Nombre");
        PanelC.add(txtNom);
        txtNom.setBounds(130, 50, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelC, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.PictureBox PanelC;
    private Design.PictureBox pic;
    private javax.swing.JLabel txtNom;
    // End of variables declaration//GEN-END:variables
}

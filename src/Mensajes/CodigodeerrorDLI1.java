/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Mensajes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author ESTUDIANTE
 */
public class CodigodeerrorDLI1 extends javax.swing.JPanel {

    /**
     * Creates new form CodigodeerrorLI1
     */
    public CodigodeerrorDLI1() {
        initComponents();
        txt1.setBackground(new Color(0, 0, 0, 0));
        txt1.setOpaque(false);
    }
    
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
        g2.dispose();
        super.paintComponent(grphcs);
    }
    
    public void EventErrorLI1(ActionListener event){
    cmdok.addActionListener(event);
    }
    
    public void eventOK(ActionListener event) {
        cmdok.addActionListener(event);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Design.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        cmdok = new Mensajes.Boton();

        setBackground(new Color(255,255,255,0));
        setForeground(new Color(255,255,255,0));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código de error \"DLI-1\"");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(133, 133, 133));
        txt1.setText("“Datos Incorrectos”");
        panelRound1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 160, -1));

        cmdok.setBackground(new java.awt.Color(95, 171, 211));
        cmdok.setForeground(new java.awt.Color(255, 255, 255));
        cmdok.setText("Ok");
        cmdok.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panelRound1.add(cmdok, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Mensajes.Boton cmdok;
    private javax.swing.JLabel jLabel1;
    private Design.PanelRound panelRound1;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Mensajes;

import java.awt.Color;

/**
 *
 * @author ESTUDIANTE
 */
public class CódogpErrorDIFC1 extends javax.swing.JPanel {

    /**
     * Creates new form CódogpErrorDIFC1
     */
    public CódogpErrorDIFC1() {
        initComponents();
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
        txt = new javax.swing.JLabel();
        boton1 = new Mensajes.Boton();

        setBackground(new Color(255,255,255,0));
        setForeground(new Color(255,255,255,0));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código de error \"DIFC-1\"");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txt.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txt.setForeground(new java.awt.Color(133, 133, 133));
        txt.setText("\"Información No Disponible\"");
        panelRound1.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        boton1.setBackground(new java.awt.Color(48, 170, 63));
        boton1.setBorder(null);
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("Ok");
        boton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        boton1.setMaximumSize(new java.awt.Dimension(29, 34));
        boton1.setMinimumSize(new java.awt.Dimension(29, 34));
        panelRound1.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Mensajes.Boton boton1;
    private javax.swing.JLabel jLabel1;
    private Design.PanelRound panelRound1;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}

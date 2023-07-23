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
public class CodigoErrorDRC3 extends javax.swing.JPanel {

    /**
     * Creates new form CodigoErrorDRC3
     */
    public CodigoErrorDRC3() {
        initComponents();
         txt.setBackground(new Color(0, 0, 0, 0));
        txt.setOpaque(false);
    }
    
       protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
        g2.dispose();
        super.paintComponent(grphcs);
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
        cmdOk = new Mensajes.Boton();

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
        jLabel1.setText("Código de error \"DRC-3\"");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txt.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txt.setForeground(new java.awt.Color(133, 133, 133));
        txt.setText("“Codigo Invalido”");
        panelRound1.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        cmdOk.setBackground(new java.awt.Color(95, 171, 211));
        cmdOk.setBorder(null);
        cmdOk.setForeground(new java.awt.Color(255, 255, 255));
        cmdOk.setText("Ok");
        cmdOk.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cmdOk.setMaximumSize(new java.awt.Dimension(29, 34));
        cmdOk.setMinimumSize(new java.awt.Dimension(29, 34));
        panelRound1.add(cmdOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
public void EventErrorLI1(ActionListener event){
    cmdOk.addActionListener(event);
    }
    
    public void eventOK(ActionListener event) {
        cmdOk.addActionListener(event);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Mensajes.Boton cmdOk;
    private javax.swing.JLabel jLabel1;
    private Design.PanelRound panelRound1;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}

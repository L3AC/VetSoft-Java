package AVista;

import AVista.CRUDS.CRUDCita;
import AVista.CRUDS.CRUDCliente;
import AVista.CRUDS.insertTipoC;
import java.awt.Component;
import JavaMenu.MenuSelectEvent;
import AVista.VentanaAdminUsuarios;
import AVista.Login;
import Design.Desg;
import Mensajes.MensajeNoEncontroUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Mensajes.GlassPanePopup;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Dashboard extends javax.swing.JFrame {

    private static Dashboard dash;
    private int idTipoU;
    private int idUs;
    private int idTipoC;
    Desg dsg = new Desg();

    public Dashboard() {
        initComponents();
        init();
        GlassPanePopup.install(this);
    }

    public Dashboard(int idTipoU, int idUs, int idTipoC) {
        this.idTipoU = idTipoU;
        this.idUs = idUs;
        this.idTipoC = idTipoC;
        initComponents();
        init();
        GlassPanePopup.install(this);
    }

    private void init() {
        dash = this;

        menu1.addEvent(new MenuSelectEvent() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                //try {
                    if (index == 0) {try {
                        //CLIENTES
                        CRUDCliente subCl = new CRUDCliente(idTipoU);
                        //dsg.ShowPanel(subCl, PCont, 1320, 810);
                        showForm(subCl);
                        System.out.println("clientes");
                        } catch (SQLException ex) {
                            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if (index == 1) {//CLIENTES
                        CRUDCita subCl = new CRUDCita();
                        dsg.ShowPanel(subCl, PCont, 1320, 810);
                        System.out.println("citas");
                    }
                    
                /*} catch (Exception e) {
                    System.out.println(e.toString()+" prueba");
                }*/

            }
        });
        menu1.setSelectedIndex(0, 0);

    }
    public void showForm(JPanel com) {
        PCont.removeAll();
        PCont.add(com);
        PCont.repaint();
        PCont.revalidate();
    }
    public static Dashboard getMain() {
        return dash;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new AVista.PanelRound();
        PanelMenu = new AVista.PanelRound();
        menu1 = new JavaMenu.Menu();
        PCont = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1570, 810));
        setPreferredSize(new java.awt.Dimension(1570, 810));
        setResizable(false);

        body.setBackground(new java.awt.Color(204, 204, 204));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMenu.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 250, 511));

        body.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 810));

        PCont.setBackground(new java.awt.Color(187, 180, 187));
        PCont.setToolTipText("");

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );

        body.add(PCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1320, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 1569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PCont;
    private AVista.PanelRound PanelMenu;
    private AVista.PanelRound body;
    private JavaMenu.Menu menu1;
    // End of variables declaration//GEN-END:variables
}

package AVista;

import AVista.Animales.CRUDAnimales;
import AVista.Asistentes.CRUDAsistente;
import AVista.Citas.CRUDCita;
import AVista.Clientes.CRUDCliente;
import AVista.CUENTA.insertTipoCuenta;
import AVista.Doctores.CRUDDoctores;
import AVista.Home.Home;
import java.awt.Component;
import JavaMenu.MenuSelectEvent;
import AVista.VentanaAdminUsuarios;
import AVista.Login;
import AVista.Mantenimiento.CRUDEsp;
import AVista.Recepcionista.CRUDRecep;
import AVista.Usuarios.CRUDusuarios;
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
    private int idCuenta;
    Desg dsg = new Desg();

    public Dashboard() {
        initComponents();
        initAdmin();
        GlassPanePopup.install(this);
    }

    public Dashboard(int idTipoU, int idUs, int idCuenta) {
        this.idTipoU = idTipoU;
        this.idUs = idUs;
        this.idCuenta = idCuenta;
        initComponents();
        if (idTipoU == 1) {
            menuDoc.setVisible(false);
            menuRecep.setVisible(false);
            initAdmin();
        }
        if (idTipoU == 2) {
            menuDoc.setVisible(false);
            menuAdmin.setVisible(false);
            initRecep();
        }
        if (idTipoU >= 4) {
            menuAdmin.setVisible(false);
            menuRecep.setVisible(false);
            initDoc();
        }
        //initAdmin();
        GlassPanePopup.install(this);
    }

    private void initAdmin() {
        dash = this;
        menuAdmin.addEvent(new MenuSelectEvent() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                try {
                    //INICIO
                    if (index == 0) {//HOME
                        Home subp = new Home();
                        dsg.ShowPanel(subp, PCont, 1320, 810);

                    }
                    //GESTION PRINCIPAL
                    if (index == 1 && indexSubMenu == 1) {//USUARIOS
                        CRUDusuarios subp = new CRUDusuarios(idTipoU);
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    }
                    if (index == 1 && indexSubMenu == 2) {//CLIENTES
                        CRUDCliente subp = new CRUDCliente(idTipoU);
                        dsg.ShowPanel(subp, PCont, 1320, 810);

                    }
                    if (index == 1 && indexSubMenu == 3) {//ANIMALES
                        CRUDAnimales subp = new CRUDAnimales();
                        dsg.ShowPanel(subp, PCont, 1320, 810);

                    }
                    if (index == 1 && indexSubMenu == 4) {//CITAS
                        CRUDCita subp = new CRUDCita();
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    }
                    if (index == 2 && indexSubMenu == 1) {//RECEPCIONISTA
                        CRUDRecep subp = new CRUDRecep();
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    }
                    if (index == 2 && indexSubMenu == 2) {//DOCTORES
                        CRUDDoctores subp = new CRUDDoctores(idTipoU);
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    }
                    if (index == 2 && indexSubMenu == 3) {//ASISTENTES
                        CRUDAsistente subp = new CRUDAsistente(idTipoU, idCuenta);
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    }
                    //TIENDA
                    if (index == 3 && indexSubMenu == 1) {

                    }
                    //MANTENIMIENTO
                    if (index == 4 && indexSubMenu == 1) {
                        CRUDEsp subp = new CRUDEsp ();
                        dsg.ShowPanel(subp, PCont, 1320, 810);

                    }
                    //CUENTA
                    if (index == 5 && indexSubMenu == 1) {

                    }

                } catch (NullPointerException e) {
                    StackTraceElement[] stackTrace = e.getStackTrace();

                    if (stackTrace.length > 0) {
                        // Obtener la línea de error del NullPointerException
                        int lineNumber = stackTrace[0].getLineNumber();

                        // Imprimir la línea de error
                        System.out.println("NullPointerException en la línea: " + lineNumber);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        menuAdmin.setSelectedIndex(0, 0);

    }

    private void initRecep() {
        dash = this;
        menuRecep.addEvent(new MenuSelectEvent() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                try {
                    //INICIO
                    if (index == 0) {//HOME
                        Home subp = new Home();
                        dsg.ShowPanel(subp, PCont, 1320, 810);

                    }
                    //GESTION PRINCIPAL
                    if (index == 1 && indexSubMenu == 1) {//USUARIOS
                        CRUDusuarios subp = new CRUDusuarios(idTipoU);
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    }
                    if (index == 1 && indexSubMenu == 2) {//CLIENTES
                        CRUDCliente subp = new CRUDCliente(idTipoU);
                        dsg.ShowPanel(subp, PCont, 1320, 810);

                    }
                    if (index == 1 && indexSubMenu == 3) {//ANIMALES
                        CRUDAnimales subp = new CRUDAnimales();
                        dsg.ShowPanel(subp, PCont, 1320, 810);

                    }
                    if (index == 1 && indexSubMenu == 4) {//CITAS
                        CRUDCita subp = new CRUDCita();
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    }
                    //TIENDA
                    if (index == 2 && indexSubMenu == 1) {//RESERVAS

                    }
                    if (index == 2 && indexSubMenu == 2) {//PRODUCTOS

                    }
                    //MANTENIMIENTO
                    if (index == 3 && indexSubMenu == 1) {

                    }
                    //CUENTA
                    if (index == 4 && indexSubMenu == 1) {

                    }

                } catch (Exception e) {
                    System.out.println(e.toString() + " prueba");
                }

            }
        });
        menuRecep.setSelectedIndex(0, 0);

    }

    private void initDoc() {
        dash = this;
        menuDoc.addEvent(new MenuSelectEvent() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                try {
                    //INICIO
                    if (index == 0) {//HOME
                        Home subp = new Home();
                        dsg.ShowPanel(subp, PCont, 1320, 810);

                    }
                    //GESTION PRINCIPAL
                    if (index == 1 && indexSubMenu == 1) {//CLIENTES
                        CRUDCliente subp = new CRUDCliente(idTipoU);
                        dsg.ShowPanel(subp, PCont, 1320, 810);

                    }
                    if (index == 1 && indexSubMenu == 2) {//ANIMALES
                        CRUDAnimales subp = new CRUDAnimales();
                        dsg.ShowPanel(subp, PCont, 1320, 810);

                    }
                    if (index == 1 && indexSubMenu == 3) {//CITAS
                        CRUDCita subp = new CRUDCita();
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    }
                    if (index == 1 && indexSubMenu == 4) {//DOCTORES
                        CRUDDoctores subp = new CRUDDoctores(idTipoU);
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    }
                    if (index == 1 && indexSubMenu == 5) {//ASISTENTES
                        CRUDAsistente subp = new CRUDAsistente(idTipoU, idCuenta);
                        dsg.ShowPanel(subp, PCont, 1320, 810);
                    }
                 
                    //CUENTA
                    if (index == 2 && indexSubMenu == 1) {

                    }
                } catch (Exception e) {
                    System.out.println(e.toString() + " prueba");
                }

            }
        });
        menuDoc.setSelectedIndex(0, 0);

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

        body = new Design.PanelRound();
        PanelMenu = new Design.PanelRound();
        menuAdmin = new JavaMenu.MenuAdmin();
        menuDoc = new JavaMenu.MenuDoc();
        menuRecep = new JavaMenu.MenuRecep();
        PCont = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1570, 810));
        setPreferredSize(new java.awt.Dimension(1570, 810));
        setResizable(false);

        body.setBackground(new java.awt.Color(204, 204, 204));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuAdmin.setPreferredSize(new java.awt.Dimension(250, 770));
        PanelMenu.add(menuAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 250, 770));
        PanelMenu.add(menuDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 250, 770));
        PanelMenu.add(menuRecep, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 250, 770));

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
    private Design.PanelRound PanelMenu;
    private Design.PanelRound body;
    private JavaMenu.MenuAdmin menuAdmin;
    private JavaMenu.MenuDoc menuDoc;
    private JavaMenu.MenuRecep menuRecep;
    // End of variables declaration//GEN-END:variables
}

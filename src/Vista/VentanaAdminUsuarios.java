/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Tipografias.Fuentes;
/**
 *
 * @author godna
 */
public class VentanaAdminUsuarios extends javax.swing.JFrame {

    
    Fuentes tipoFuente;
    public VentanaAdminUsuarios() {
        initComponents();
        
         tipoFuente = new Fuentes();
         VetSoft.setFont(tipoFuente.fuente(tipoFuente.COM,1,14));
         Citas.setFont(tipoFuente.fuente(tipoFuente.COM,1,20));
          Cuenta.setFont(tipoFuente.fuente(tipoFuente.COM,1,20));
           Mantenimiento.setFont(tipoFuente.fuente(tipoFuente.COM,1,20));
            Mascotas.setFont(tipoFuente.fuente(tipoFuente.COM,1,20));
             Productos.setFont(tipoFuente.fuente(tipoFuente.COM,1,20));
              Reservas.setFont(tipoFuente.fuente(tipoFuente.COM,1,20));
               Usuarios.setFont(tipoFuente.fuente(tipoFuente.COM,1,20));
                Clientes.setFont(tipoFuente.fuente(tipoFuente.COM,1,20));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LogoVetSoft = new javax.swing.JLabel();
        VetSoft = new javax.swing.JLabel();
        Clientes = new javax.swing.JLabel();
        Mascotas = new javax.swing.JLabel();
        Citas = new javax.swing.JLabel();
        Productos = new javax.swing.JLabel();
        Reservas = new javax.swing.JLabel();
        Usuarios = new javax.swing.JLabel();
        Cuenta = new javax.swing.JLabel();
        Mantenimiento = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(190, 233, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 171, 211));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoVetSoft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashscreen/Assets/LogoVetSoft075x.png"))); // NOI18N
        jPanel2.add(LogoVetSoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        VetSoft.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VetSoft.setText("VetSoft+");
        jPanel2.add(VetSoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 70, 20));

        Clientes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Clientes.setForeground(new java.awt.Color(27, 73, 101));
        Clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clientes.setText("Clientes");
        jPanel2.add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        Mascotas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Mascotas.setForeground(new java.awt.Color(27, 73, 101));
        Mascotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mascotas.setText("Mascotas");
        jPanel2.add(Mascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Citas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Citas.setForeground(new java.awt.Color(27, 73, 101));
        Citas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Citas.setText("Citas");
        jPanel2.add(Citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        Productos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Productos.setForeground(new java.awt.Color(27, 73, 101));
        Productos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Productos.setText("Productos");
        jPanel2.add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Reservas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Reservas.setForeground(new java.awt.Color(27, 73, 101));
        Reservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reservas.setText("Reservas");
        jPanel2.add(Reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        Usuarios.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Usuarios.setForeground(new java.awt.Color(27, 73, 101));
        Usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuarios.setText("Usuarios");
        jPanel2.add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        Cuenta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Cuenta.setForeground(new java.awt.Color(27, 73, 101));
        Cuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuenta.setText("Mi Cuenta");
        jPanel2.add(Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        Mantenimiento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Mantenimiento.setForeground(new java.awt.Color(27, 73, 101));
        Mantenimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mantenimiento.setText("Mantenimiento");
        jPanel2.add(Mantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 400));

        jPanel3.setBackground(new java.awt.Color(95, 171, 211));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 470, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
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
            java.util.logging.Logger.getLogger(VentanaAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdminUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Citas;
    private javax.swing.JLabel Clientes;
    private javax.swing.JLabel Cuenta;
    private javax.swing.JLabel LogoVetSoft;
    private javax.swing.JLabel Mantenimiento;
    private javax.swing.JLabel Mascotas;
    private javax.swing.JLabel Productos;
    private javax.swing.JLabel Reservas;
    private javax.swing.JLabel Usuarios;
    private javax.swing.JLabel VetSoft;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

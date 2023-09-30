
package AVista.Clientes;

import AControlador.ctCliente;
import AModelo.Conx;
import AVista.CUENTA.insertTipoCuenta;
import Design.PanelCliente;
import AVista.Clientes.Cliente;
import AVista.Clientes.CRUDClientesN;
import AVista.Usuarios.CRUDusuarios;
import Design.Desg;
import EventsCliente.Events;
import Mensajes.CódigoError;
import Mensajes.GlassPanePopup;
import SwingScroll.ScrollBar;
import Tipografias.Fuentes;
//import static com.sun.org.omg.CORBA.ValueMemberHelper.id;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
//import static jdk.nashorn.internal.runtime.Debug.id;



public class CRUDClientesN extends javax.swing.JPanel {
                 Fuentes tipoFuente;
                 Desg dsg = new Desg();
                 Cliente c;
                    private int idCl;

    //private String nombre;


         

           
    public CRUDClientesN() throws SQLException {
        initComponents();
        scroll.setVerticalScrollBar(new ScrollBar());
        DataProductos();
         tipoFuente = new Fuentes();

        /*Este apartado de setFont nos ayuda a poner un tipo de fuente en especifico y el tamaño de la letra*/
        Titulo.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 32));
        
       

   }
    

    
    public final void DataProductos() throws SQLException { 
      
        try {
            ctCliente ccliente = new ctCliente();
            ResultSet rs = ccliente.CargarCCI();
            
            while (rs.next()) {
                addItem(rs.getInt("idCliente"),rs.getString("nombre"),
                        rs.getString("apellido"));                    
            }
        } catch (Exception ex) {

        }
    }

    //Metodo para agregar la carta
    public void addItem(int id,String nombre,String apell) throws SQLException {
        try {
            Cliente card = new Cliente(id,nombre,apell);
            card.setData();
            card.setSize(298, 142);
            panelCliente.add(card);
            panelCliente.repaint();
            panelCliente.revalidate();
        
           
       
    } catch (SQLException ex) {
        Logger.getLogger(CRUDusuarios.class.getName()).log(Level.SEVERE, null, ex);
    }
}
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        PCont = new Design.BackGround();
        header = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        txtBusq = new Design.TextFieldSV();
        buttonGradient1 = new Design.ButtonGradient();
        scroll = new javax.swing.JScrollPane();
        panelCliente = new Design.PanelCliente();

        jCheckBox1.setText("jCheckBox1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        PCont.setBackground(new java.awt.Color(190, 233, 232));
        PCont.setForeground(new java.awt.Color(190, 233, 232));

        header.setBackground(new java.awt.Color(190, 233, 232));
        header.setOpaque(false);

        Titulo.setText("Clientes");

        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(496, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(337, 337, 337)
                .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(txtBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        buttonGradient1.setBackground(new java.awt.Color(202, 233, 255));
        buttonGradient1.setText("Agregar");
        buttonGradient1.setColor1(new java.awt.Color(202, 233, 255));
        buttonGradient1.setColor2(new java.awt.Color(202, 233, 255));

        scroll.setBorder(null);

        panelCliente.setBackground(new java.awt.Color(190, 233, 232));
        scroll.setViewportView(panelCliente);

        javax.swing.GroupLayout PContLayout = new javax.swing.GroupLayout(PCont);
        PCont.setLayout(PContLayout);
        PContLayout.setHorizontalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PContLayout.createSequentialGroup()
                .addComponent(scroll)
                .addContainerGap())
            .addGroup(PContLayout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(buttonGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PContLayout.setVerticalGroup(
            PContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased

        
    }//GEN-LAST:event_txtBusqKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design.BackGround PCont;
    private javax.swing.JLabel Titulo;
    private Design.ButtonGradient buttonGradient1;
    private javax.swing.JPanel header;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private Design.PanelCliente panelCliente;
    private javax.swing.JScrollPane scroll;
    private Design.TextFieldSV txtBusq;
    // End of variables declaration//GEN-END:variables
}

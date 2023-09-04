
package AVista.Clientes;

import AControlador.ctCliente;
import Design.PanelCliente;
import Tipografias.Fuentes;
import java.awt.BorderLayout;
;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;



public class CRUDClientesN extends javax.swing.JPanel {
                 Fuentes tipoFuente;
               
    //private String nombre;

    public CRUDClientesN() throws SQLException {
        initComponents();
        DataProductos();
         tipoFuente = new Fuentes();

        /*Este apartado de setFont nos ayuda a poner un tipo de fuente en especifico y el tamaño de la letra*/
        Titulo.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 32));
        //addItem(ccliente);
    }

    public final void DataProductos() throws SQLException {

        try {
            ctCliente ccliente = new ctCliente();
            ResultSet rs = ccliente.CargarCCI();
            while (rs.next()) {
                addItem(rs.getString("nombre"));
                
           
            }
        } catch (Exception ex) {

        }
    }

    //Metodo para agregar la carta
    public void addItem(String nombre) throws SQLException {
        try {
            Cliente card = new Cliente(nombre);
            card.setData();
            card.setSize(341, 152);
            panelCliente.add(card);
            panelCliente.repaint();
            panelCliente.revalidate();

        } catch (Exception ex) {
            System.err.println(ex.toString());
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

        backGround1 = new Design.BackGround();
        header = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        panelCliente = new Design.PanelCliente();
        buttonGradient1 = new Design.ButtonGradient();

        header.setOpaque(false);

        Titulo.setText("Clientes");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(622, 622, 622))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(40, 40, 40))
        );

        buttonGradient1.setText("Agregar");
        buttonGradient1.setColor1(new java.awt.Color(51, 51, 51));
        buttonGradient1.setColor2(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout backGround1Layout = new javax.swing.GroupLayout(backGround1);
        backGround1.setLayout(backGround1Layout);
        backGround1Layout.setHorizontalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backGround1Layout.createSequentialGroup()
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(buttonGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        backGround1Layout.setVerticalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGround1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(buttonGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private Design.BackGround backGround1;
    private Design.ButtonGradient buttonGradient1;
    private javax.swing.JPanel header;
    private Design.PanelCliente panelCliente;
    // End of variables declaration//GEN-END:variables
}

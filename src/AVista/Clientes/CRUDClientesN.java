/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AVista.Clientes;

import AControlador.ctCliente;
import AControlador.ctVariableGlobal;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingUtilities;

/**
 *
 * @author godna
 */
public class CRUDClientesN extends javax.swing.JPanel {

    /**
     * Creates new form CRUDClientesN
     */
    

    public CRUDClientesN() throws SQLException {
        initComponents();
        DataProductos();
        addItem(ccliente);
    }
    //Habilitar eventos de la carta
//private EventCard event;
//
//    public void setEvent(EventCard event) {
//        this.event = event;
//    }
    
    ctCliente ccliente = new ctCliente();
    
    public final void DataProductos(){
    try{
     ccliente.idUsuario =ctVariableGlobal.idus; 
    ResultSet rs = ccliente.CargarCCI();
        System.out.println("1");
    while(rs.next()){
        System.out.println("2");
        addItem((ctCliente) ccliente.CargarCCI());
        System.out.println("3");
    }
    }catch(Exception ex){
        System.out.println("    no funciona me mato por que elegi software");
    }
    }


  //Metodo para agregar la carta
public void addItem(ctCliente data) throws SQLException{
//Clase para el componente

try{
    Cliente card = new Cliente();
    card.setData(data);
    card.setSize(341, 152);
  System.out.println("Me mato por que elegi software");
    panelCliente.add(card);
    panelCliente.repaint();
    panelCliente.revalidate();
    System.out.println("Hasta aqui llega mi paciencia");
    }catch(Exception ex){
        System.out.println("dios");
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
        panelCliente = new Design.PanelCliente();

        header.setOpaque(false);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backGround1Layout = new javax.swing.GroupLayout(backGround1);
        backGround1.setLayout(backGround1Layout);
        backGround1Layout.setHorizontalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        backGround1Layout.setVerticalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGround1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addContainerGap())
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
    private Design.BackGround backGround1;
    private javax.swing.JPanel header;
    private Design.PanelCliente panelCliente;
    // End of variables declaration//GEN-END:variables
}

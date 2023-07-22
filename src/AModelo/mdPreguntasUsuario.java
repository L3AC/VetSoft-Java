/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class mdPreguntasUsuario {
    
    Connection con = Conx.Conectar();
    PreparedStatement ps;
    ResultSet rs;
     
   public boolean insertarPreg (String preg1, String preg2, String preg3){
        String query = "insert into tbPreguntasUsuarios values(?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, preg1);
            ps.setString(2, preg2);
            ps.setString(3, preg3);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Campos ingresados");
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
   }
   
   public boolean actualizarPreg (String preg1, String preg2, String preg3){
       String query = "update tbPreguntasUsuarios set idTipoServicio=?,idDoctor=?,"
                + "notaDelCliente=?,notaDelDoctor=?,fecha=?,hora=? where idPreguntaUsuario=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, preg1);
            ps.setString(2, preg2);
            ps.setString(3, preg3);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Campos actualizados");
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
   }
}

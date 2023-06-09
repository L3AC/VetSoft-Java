/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class mdEsp {
    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;
    
    public ResultSet loadEsp() {
        String query = "select * from tbEspecialidades;";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    
    public ResultSet selectEsp() {
        String query = "select * from tbEspecialidades where idEspecialidad=?;";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    
      public boolean deleteEsp(int idE) {
        String query = "DELETE tbEspecialidades where idEspecialidades=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idE);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false;
        }
    }
      public boolean insertEsp(int idEsp, String Especialidad) {
        String query = "insert into tbEspecialidades(idEspecialidad, Especialidad)"
                + " values(?,?);";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idEsp);
            ps.setString(2, Especialidad);
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

    public boolean updateEsp(int idEsp, String Esp) {
        String query = "update tbEspecialidades SET Especialidad=? \n" +
        "where idEspecialidad=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, Esp);
            ps.setInt(2, idEsp);
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

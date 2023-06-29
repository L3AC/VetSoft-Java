package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class mdAnimales {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    public ResultSet cargarAnim() {
        String query = "EXEC selectAnim;";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }
        public boolean deleteAnim() {
        String query = "EXEC deleteAnim ?;";
        try {
            ps = con.prepareStatement(query);
            ps.executeQuery();
             JOptionPane.showMessageDialog(null, "Registro eliminado");
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false;
        }
    }
    
        public boolean insertAnim(int idCl,int idR,String padec,String nombre,
                String peso,String edad,String sexo ) {
        String query = "EXEC insertAnim ?,?,?,?,?,?,?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idCl);
            ps.setInt(2, idR);
            ps.setString(3, padec);
            ps.setString(4, nombre);
            ps.setString(5, peso);
            ps.setString(6, edad);
            ps.setString(7, sexo);
            ps.executeQuery();
             JOptionPane.showMessageDialog(null, "Campos ingresados");
            return true;
            
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
             JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }
                public boolean updateAnim(int idA,int idR,String padec,String nombre,
                String peso,String edad,String sexo ) {
        String query = "EXEC updtAnim ?,?,?,?,?,?,?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idA);
            ps.setInt(2, idR);
            ps.setString(3, padec);
            ps.setString(4, nombre);
            ps.setString(5, peso);
            ps.setString(6, edad);
            ps.setString(7, sexo);
            ps.executeQuery();
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

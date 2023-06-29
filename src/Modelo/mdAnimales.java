package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class mdAnimales {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    private ResultSet SelectAnim() {
        String query = "select * from tbAnimales";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al cargar");
            return null; //DIO ERROR
        }
    }
    
        private boolean updateAnim(int idA,int idR,String padec,String nombre,
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

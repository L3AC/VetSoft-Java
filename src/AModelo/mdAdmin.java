package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mdAdmin {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    
    // Esto nos ayuda a actualizar los datos
    public boolean upAdmin(int idC, String nombre, String apellido, String dui, String naci, String sexo) {
        String query = "update tbAdministradores SET nombre=?,apellido=?,DUI=?,nacimiento=?,sexo=? \n"
                + "where idAdministradores=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, dui);
            ps.setString(4, naci);
            ps.setString(5, sexo);
            ps.setInt(6, idC);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }
}

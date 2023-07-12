package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mdRecep {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    public ResultSet cargarRecep(String nombre) {
        String query = "select idRecepcionista,CONCAT(nombre,' ',apellido) as 'Nombre',DATEDIFF(YEAR, nacimiento, GETDATE()) as 'Edad'\n"
                + "                ,sexo as Sexo from tbRecepcionistas where CONCAT(nombre,' ',apellido) like ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + nombre + "%");
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public ResultSet selectRecep(int idD) {
        String query = "select * from tbRecepcionistas where idRecepcionista=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idD);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public boolean insertRe(int idUs, String nombre, String apellido,
            String dui, String naci, String sexo) {
        String query = "insert into tbRecepcionistas values(?,?,?,?,?,?,GETDATE());";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, dui);
            ps.setString(5, naci);
            ps.setString(6, sexo);
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

    public boolean updateRecep(int idC, String nombre, String apellido, String dui, String naci, String sexo) {
        String query = "update tbRecepcionistas SET nombre=?,apellido=?,DUI=?,nacimiento=?,sexo=? \n"
                + "where idRecepcionista=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, dui);
            ps.setString(4, naci);
            ps.setString(5, sexo);
            ps.setInt(6, idC);
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

    public boolean deleteRecep(int idD) {
        String query = "DELETE tbRecepcionistas where idRecepcionista=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idD);
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
}

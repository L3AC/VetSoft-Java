package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class mdClientes {

    Connection con = Conx.Conectar();

    ResultSet rs;
    PreparedStatement ps;

    public ResultSet cargarCl() {
        String query = "select idCliente,CONCAT(nombre,' ',apellido) as 'Nombre',DATEDIFF(YEAR, nacimiento, GETDATE()) as 'Edad'\n"
                + ",sexo from tbClientes;";
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

    public boolean deleteCl() {
        String query = "EXEC deleteCl ?;";
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

    public boolean insertCl(int idUs, String nombre, String apellido, String dui, String naci, String sexo) {
        String query = "insert into tbClientes values(?,?,?,?,?,?,?);";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, dui);
            ps.setString(5, naci);
            ps.setString(6, sexo);
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

    public boolean updateCl(int idCl, String nombre, String apellido, String dui, String naci, String sexo) {
        String query = "update tbClientes SET nombre=?,apellido=?,DUI=?,nacimiento=?,sexo=? \n" +
        "where idCliente=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idCl);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, dui);
            ps.setString(5, naci);
            ps.setString(6, sexo);
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

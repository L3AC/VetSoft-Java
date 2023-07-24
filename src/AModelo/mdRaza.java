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

public class mdRaza {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    public ResultSet loadTPanimal() {
        String query = "select * from tbTipoAnimales;";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }

        public ResultSet comboRaza(int idTP) {
        String query = "select idRaza,nombreRaza from tbRazas r, tbTipoAnimales ta where r.idTipoAnimal=ta.idTipoAnimal and r.idTipoAnimal=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idTP);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    public ResultSet selectRaza(String nombreRaza) {
        String query = "select r.idRaza,ta.nombrePopular,r.nombreRaza from tbRazas r,tbTipoAnimales ta "
                + "where r.idTipoAnimal=ta.idTipoAnimal and r.nombreRaza like ?";
        try {
            ps = con.prepareStatement(query);
             ps.setString(1, "%"+nombreRaza+"%");
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    
    public ResultSet loadRaza(String nombreRaza) {
        String query = "select * from tbRazas where nombreRaza like ?;";
        try {
            ps = con.prepareStatement(query);
             ps.setString(1,    "%"+nombreRaza+"%");
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }

    public boolean deleteTPA(int idE) {
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

    public boolean insertTPA(int idEsp, String Especialidad) {
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

    public boolean updateTPA(int idEsp, String Esp) {
        String query = "update tbEspecialidades SET Especialidad=? \n"
                + "where idEspecialidad=?;";
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
    
    public boolean deleteRaza(int idRaza) {
        String query = "DELETE tbRazas where idRaza=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idRaza);
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

    public boolean insertRaza(int idEsp, String Especialidad) {
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

    public boolean updateRaza(int idEsp, String Esp) {
        String query = "update tbEspecialidades SET Especialidad=? \n"
                + "where idEspecialidad=?;";
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

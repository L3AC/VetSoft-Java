
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
    
    //Esto nos ayudara a cargar las especialidades que existen en la base de datos dentro del sistema
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
    
    //Esto nos ayudara a seleccionar la especialidad dentro del sistema
    public ResultSet selectEsp(String Esp) {
        String query = "select * from tbEspecialidades where especialidad like ?;";
        try {
            ps = con.prepareStatement(query);
             ps.setString(1,    "%"+Esp+"%");
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    
    //Esto nos ayudara a eliminar alguna especialidad dentro del sistema y base de datos
      public boolean deleteEsp(int idEsp) {
        String query = "DELETE tbEspecialidades where idEspecialidad=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idEsp);
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
      
      //Esto nos ayudara a insertar una nueva especialidad dentro del sistema y base de datos
      public boolean insertEsp(int idEsp, String Especialidad) {
        String query = "insert into tbEspecialidades values(?);";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, Especialidad);
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

      //Esto nos ayudara a actualizar las especialidades que existan dentro de la base de datos y sistema
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

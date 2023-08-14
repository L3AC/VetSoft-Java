package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mdPreguntas {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;

    public ResultSet selectResp(int idUs, int idPreg) {
        String query = "select * from tbPreguntasUsuarios where idUsuario=? and idPregunta=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            ps.setInt(2, idPreg);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }

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

    public boolean updateEsp(int idEsp, String Esp) {
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

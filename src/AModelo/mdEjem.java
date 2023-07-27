package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mdEjem {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;

    public ResultSet selectEjem(String n1) {
        String query = "select * from tbEspecialidades where especialidad like ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + n1 + "%");
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
}

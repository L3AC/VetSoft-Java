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

    public ResultSet loadResp(int idUs, int idPreg) {
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

    public ResultSet verifExist(int idUs, int idPreg) {
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

    public boolean insertResp(int idPreg, int idUs, String resp) {
        String query = "insert into tbPreguntasUsuarios values(?,?,?);";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idPreg);
            ps.setString(2, resp);
            ps.setInt(3, idUs);
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

    public boolean updateResp( int idP,int idUs, String resp) {
        String query = "update tbPreguntasUsuarios set respuesta=? "
                + "where idUsuario=? and idPregunta=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, resp);
            ps.setInt(2, idUs);
            ps.setInt(3, idP);
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

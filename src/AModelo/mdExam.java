package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mdExam {

    Connection con = Conx.Conectar();
    PreparedStatement ps;
    ResultSet rs;

    public ResultSet loadExam(int id1, String n1) {
        String query = "select idExamenClinico,ts.Nombre,Nota from tbExamenesClinicos ec,tbTipoServicio ts \n"
                + "where ec.idTipoServicio=ts.idTipoServicio and ts.Nombre like ? and idAnimal=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + n1 + "%");
            ps.setInt(2, id1);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }

    public ResultSet selectExam(int id1) {
        String query = "select idExamenClinico,ec.idTipoServicio,imagen,ts.Nombre,Nota from tbExamenesClinicos ec,tbTipoServicio ts \n"
                + "  where ec.idTipoServicio=ts.idTipoServicio and idAnimal=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id1);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }

    public boolean insExam(int id1, int id2, byte[] img, String n1) {
        String query = "insert tbExamenesClinicos values(?,?,?,?,GETDATE());";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id1);
            ps.setInt(2, id2);
            ps.setBytes(3, img);
            ps.setString(4, n1);
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

    public boolean delExam(int id1) {
        String query = "delete tbExamenesClinicos where idExamenClinico=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id1);
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

    public boolean upExam(int id1, byte[] img, String n1, int id2) {
        String query = "UPDATE tbExamenesClinicos set idTipoServicio=?, "
                + "imagen=?,Nota=? where idExamenClinico=?;";
        try {
            ps.setInt(1, id1);
            ps.setBytes(2, img);
            ps.setString(3, n1);
            ps.setInt(4, id2);
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

package AModelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class mdCitas {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    public ResultSet cargarCita(String cliente) {
        String query = "SET LANGUAGE Spanish\n"
                + "select idCita, c.idAnimal,CONVERT(varchar, fechahora, 100) as 'Fecha',a.Nombre as 'Mascota',CONCAT(cl.Nombre,' ',cl.Apellido) as 'Dueño',CONCAT(d.Nombre,' ',d.Apellido) as 'Doctor'\n"
                + "from tbCitas c, tbAnimales a,tbDoctores d,tbClientes cl where c.idAnimal=a.idAnimal and c.idDoctor=d.idDoctor and cl.idCliente=a.idCliente and Estado='Aceptada' and 'Dueño' like ?\n"
                + "or cl.idCliente=a.idCliente and c.idAnimal=a.idAnimal and c.idDoctor=d.idDoctor and Estado='Pendiente' and 'Dueño' like ?;;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + cliente + "%");
            ps.setString(2, "%" + cliente + "%");
            rs = ps.executeQuery();
            System.err.println(query);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public ResultSet selectCita(int idC) {
        String query = "select * from tbCitas where idCita=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idC);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public boolean deleteCita(int idC) {
        String query = "DELETE tbCitas where idCita=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idC);
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

    public boolean insertCita(int idAni, int idTS, int idD, String notaCl, String notaDoc, String fechahora) {
        String query = "insert into tbCitas values(?,?,?,'Pendiente',?,?,?,GETDATE())";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idAni);
            ps.setInt(2, idTS);
            ps.setInt(3, idD);
            ps.setString(4, notaCl);
            ps.setString(5, notaDoc);
            ps.setString(6, fechahora);
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

    public boolean updateCita(int idCita, int idAni, int idTS, int idD, String estado, String nCl, String nDoc, String fechahora) {
        String query = "update tbCitas set idAnimal=?,idTipoServicio=?,idDoctor=?,estado=?,"
                + "notaDelCliente=?,notaDelDoctor=?,fechahora=? where idCita=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idAni);
            ps.setInt(2, idTS);
            ps.setInt(3, idD);
            ps.setString(4, estado);
            ps.setString(5, nCl);
            ps.setString(6, nDoc);
            ps.setString(7, fechahora);
            ps.setInt(8, idCita);
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

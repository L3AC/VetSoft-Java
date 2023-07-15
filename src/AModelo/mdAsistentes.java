package AModelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class mdAsistentes {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    public ResultSet cargarAsis(String nombre) {//TABLA
        String query = "select idAsistente,CONCAT(d.nombre,' ',d.apellido) as 'Doctor a cargo',"
        +"CONCAT(a.nombre,' ',a.apellido) as 'Nombre',DATEDIFF(YEAR, a.nacimiento, GETDATE()) as 'Edad',"
        +"a.sexo as Sexo from tbAsistentes a,tbDoctores d where a.idDoctor=d.idDoctor and "
        +" CONCAT(d.nombre,' ',d.apellido) like ?;";
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

    public ResultSet verifPerfil(int idUs) {//TABLA
        String query = "select u.usuario from tbUsuarios u, tbAsistentes c "
                + "where u.idUsuario=c.idUsuario and u.idUsuario=?;";
        try {

            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }
    public ResultSet usAsis(String nombre) {//TABLA
        String query = "select * from tbUsuarios where idTipoUsuario=5 and usuario like ?;";
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

    public ResultSet selectAsis(int idD) {
        String query = "select a.Nombre, a.Apellido,a.DUI,a.Nacimiento,a.Sexo,CONCAT(d.nombre,' ',d.Apellido) as 'doc'\n" +
        "from tbAsistentes a, tbDoctores d where a.idDoctor=d.idDoctor and idAsistente=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idD);
            System.out.println(ps.toString());
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public boolean insertAsis(int idUs, int idDoc, String nombre, String apellido,
            String dui, String naci, String sexo) {
        String query = "insert into tbAsistentes values(?,?,?,?,?,?,?,getdate());";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            ps.setInt(2, idDoc);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setString(5, dui);
            ps.setString(6, naci);
            ps.setString(7, sexo);
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

    public boolean updtAsis(int idC, int idDoc, String nombre, String apellido,
            String dui, String naci, String sexo) {
        String query = "update tbAsistentes SET idDoctor=?, nombre=?,apellido=?,DUI=?,nacimiento=?,sexo=? \n"
                + "where idAsistente=?;";
        try {
            ps = con.prepareStatement(query);
             ps.setInt(1, idDoc);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, dui);
            ps.setString(5, naci);
            ps.setString(6, sexo);
            ps.setInt(7, idC);
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

    public boolean deleteAsis(int idD) {
        String query = "DELETE tbAsistentes where idAsistente=?;";
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

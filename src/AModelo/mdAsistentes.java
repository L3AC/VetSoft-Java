
package AModelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class mdAsistentes {
    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;
    
    public ResultSet cargarAsis(String nombre) {//TABLA
        String query = "select idUsuario,usuario,correo,telefono from tbUsuarios u,tbTipoUsuario tu \n"
                + "where u.idTipoUsuario=tu.idTipoUsuario and usuario like ? and u.idTipoUsuario=5;";
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
    public boolean insertAsis(int idUs,int idDoc, String nombre, String apellido,
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
}

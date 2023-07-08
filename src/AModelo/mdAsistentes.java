
package AModelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class mdAsistentes {
    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;
    
    public ResultSet cargarAsis(String nombre) {//TABLA
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
}

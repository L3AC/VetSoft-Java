package AModelo;
import java.sql.*;
import javax.swing.JOptionPane;
public class mdDoctores {
    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    public ResultSet loadData(int idUs) {//EDITAR
        String query = "select idUsuario,tu.nivel as 'Cargo',usuario,correo,telefono from tbUsuarios u,\n" +
        "tbTipoUsuario tu where u.idTipoUsuario=tu.idTipoUsuario and idUsuario=?;";
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
    public ResultSet cargarDoc(String nombre) {//TABLA
        String query = "select idDoctor,especialidad,CONCAT(d.nombre,' ',d.apellido) as 'Nombre' from  " +
        " tbDoctores d, tbEspecialidades e where d.idEspecialidad=e.idEspecialidad and 'Nombre' like ? ;";
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
}

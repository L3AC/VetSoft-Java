package AModelo;
import java.sql.*;
import javax.swing.JOptionPane;
public class mdDoctores {
    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    public ResultSet loadData(int idUs) {
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
    public ResultSet cargarDoc(String nombre,int nUs) {
        String query = "select idDoctor,especialidad,CONCAT(nombre,' ',apellido) as 'Nombre' from  \n" +
        "tbDoctores d, tbEspecialidades e where d.idEspecialidad=e.idEspecialidad;";
        try {
            
            ps = con.prepareStatement(query);
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

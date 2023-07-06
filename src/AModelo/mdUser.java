package AModelo;

import AVista.Dashboard;
import AVista.VentanaAdminUsuarios;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class mdUser {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;

    public ResultSet cargarUs(String nombre,int nUs) {
        String query = "";
        try {
            if(nUs==1){//ADMIN
                query="select idUsuario,tu.nivel as 'Cargo',usuario,correo,telefono from tbUsuarios u,tbTipoUsuario tu \n"
                + "where u.idTipoUsuario=tu.idTipoUsuario and usuario like ?;";
            }
            if(nUs==2){//RECEPCIONISTA
                query="select idUsuario,tu.nivel as 'Cargo',usuario,correo,telefono from tbUsuarios u,tbTipoUsuario tu \n"
                + "where u.idTipoUsuario=tu.idTipoUsuario and usuario like ? and u.idTipoUsuario>=4;";
            }
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

    public ResultSet SelectTipoUs(String usuario, String passw) throws SQLException {
        String url = "SELECT * FROM tbUsuarios WHERE usuario = ? COLLATE SQL_Latin1_General_CP1_CS_AS \n"
                + " AND contraseña = ? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        try {

            ps = con.prepareStatement(url);
            ps.setString(1, usuario);
            ps.setString(2, passw);//ENCRIPTAR
            rs = ps.executeQuery();

            return rs;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            return null; //DIO ERROR
        }
    }

    public ResultSet SelectTipoID(int idTipoU, int idUs) throws SQLException {
        String url = "SELECT * FROM tbAdministradores WHERE idUsuario = ?;";
        System.out.println(idUs + " " + idTipoU);
        try {

            if (idTipoU == 1) {
                url = "SELECT * FROM tbAdministradores WHERE idUsuario = ?;";
            }
            if (idTipoU == 2) {
                url = "SELECT * FROM tbRecepcionistas WHERE idUsuario = ?;";
            }
            if (idTipoU == 4) {
                url = "SELECT * FROM tbDoctores WHERE idUsuario = ?;";
            }
            if (idTipoU == 5) {
                url = "SELECT * FROM tbAsistentes WHERE idUsuario = ?;";
            }
            ps = con.prepareStatement(url);
            ps.setInt(1, idUs);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            return null; //DIO ERROR
        }
    }

}

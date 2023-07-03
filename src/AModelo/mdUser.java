package AModelo;

import AVista.Dashboard;
import AVista.VentanaAdminUsuarios;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mdUser {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    ResultSet rs;
    PreparedStatement ps;

    public ResultSet SelectTipoUs(String usuario, String passw) {
        String url = "SELECT * FROM tbUsuarios WHERE usuario = ? COLLATE SQL_Latin1_General_CP1_CS_AS \n"
                + "                AND contraseña = ? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        try {

            ps = con.prepareStatement(url);
            ps.setString(1, usuario);
            ps.setString(2, passw);//ENCRIPTAR
            rs = ps.executeQuery();

            return rs;
            /*if (rs.next()) {
                return rs.getInt("idTipoUsuario");
            } else {
                return 0;//NO HAY NADA
            }*/
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            return null; //DIO ERROR
        }
    }

    public ResultSet SelectTipoID(int idTipoU, int idUs) {
        String url = null;
        try {
            if (idTipoU == 1) {
                url="SELECT * FROM tbAdministradores WHERE idUsuario = ?;";
            }
            if (idTipoU == 2) {
                url="SELECT * FROM tbRecepcionistas WHERE idUsuario = ?;";
            }
            if (idTipoU == 4) {
                url="SELECT * FROM tbDoctores WHERE idUsuario = ?;";
            }
            if (idTipoU == 5) {
                url="SELECT * FROM tbAsistentes WHERE idUsuario = ?;";
            }
            ps = con.prepareStatement(url);
            ps.setInt(1, idUs);
            rs = ps.executeQuery();

            return rs;
            /*if (rs.next()) {
                return rs.getInt("idTipoUsuario");
            } else {
                return 0;//NO HAY NADA
            }*/
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            return null; //DIO ERROR
        }
    }

}

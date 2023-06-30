package AModelo;

import AVista.Dashboard;
import AVista.VentanaAdminUsuarios;
import Vista.CRUDS.VentanaCitas;
import Vista.CRUDS.VentanaMascotas;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mdUser {
 Connection con = Conx.Conectar();
 Crypt cripto = new Crypt();
 ResultSet rs;
 PreparedStatement ps;

    public int SelectTipoUs(String usuario, String passw) {
        String url = "SELECT idTipoUsuario   FROM tbUsuarios WHERE usuario = ? AND contraseña = ?";
        try {
   
            ps= con.prepareStatement(url);
            ps.setString(1, usuario);
            ps.setString(2, passw);//ENCRIPTAR
            rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt("idTipoUsuario");
            } else {
                return 0;//NO HAY NADA
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            return 0; //DIO ERROR
        }
        finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(mdUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(mdUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(mdUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

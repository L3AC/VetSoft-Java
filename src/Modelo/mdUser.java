package Modelo;

import Vista.Dashboard;
import Vista.VentanaAdminUsuarios;
import Vista.VentanaCitas;
import Vista.VentanaMascotas;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mdUser {
 Connection con = Conx.Conectar();
 ResultSet rs;
 PreparedStatement st;

    public int SelectTipoUs(String usuario, String passw) {
        String url = "SELECT idTipoUsuario   FROM tbUsuarios WHERE usuario = ? AND contraseña = ?";
        try {
   
            st = con.prepareStatement(url);
            st.setString(1, usuario);
            st.setString(2, passw);
            rs = st.executeQuery();
            
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
                st.close();
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

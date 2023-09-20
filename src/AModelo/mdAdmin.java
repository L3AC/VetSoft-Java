package AModelo;

import Mensajes.CódigoDeErrorDLI2;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mdAdmin {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    
    // Esto nos ayuda a actualizar los datos
    public boolean upAdmin(int idC, String nombre, String apellido, String dui, String naci, String sexo) {
        String query = "update tbAdministradores SET nombre=?,apellido=?,DUI=?,nacimiento=?,sexo=? \n"
                + "where idAdministradores=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, dui);
            ps.setString(4, naci);
            ps.setString(5, sexo);
            ps.setInt(6, idC);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            CódigoDeErrorDLI2 obj = new CódigoDeErrorDLI2();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
            return false; //DIO ERROR
        }
    }
}

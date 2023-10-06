package AModelo;

import Mensajes.CódigoDeErrorDLI2;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mdPreRegistro {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertT(int idTipoC, String token,String dui, int idD) {
        String query = "insert into tbPreRegistros values(?,?,?,?);";
        try {

            ps = con.prepareStatement(query);

            ps.setInt(1, idTipoC);
            ps.setString(2, token);
            ps.setString(3, dui);
            ps.setInt(4, idD);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
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

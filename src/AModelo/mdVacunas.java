
package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mdVacunas {
    Connection con = Conx.Conectar();
    PreparedStatement ps;
    ResultSet rs;
    
    public ResultSet loadResp(int idUs, int idPreg) {
        String query = "select * from tbPreguntasUsuarios where idUsuario=? and idPregunta=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            ps.setInt(2, idPreg);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
}

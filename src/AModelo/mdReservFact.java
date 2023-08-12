package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mdReservFact {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;

    public ResultSet tbReservF(int idCl,String n1) {

        String query = "select rp.idReservaProducto,rp.idEjemplar,tp.tipo,p.Nombre as Producto,Precio \n"
                + "from tbReservaProductos rp,tbEjemplares e,tbProductos p,tbTipoProductos tp,tbClientes c\n"
                + "where e.idProducto=p.idProducto and tp.idTipoProducto=p.idTipoProducto and \n"
                + "rp.idEjemplar=e.idEjemplar and rp.idCliente=c.idCliente and p.Nombre like ? and rp.idCliente=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + n1 + "%");
            ps.setInt(2, idCl);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public boolean insEjemRe(int idEjem, int idCl) {
        String query = "insert into tbReservaProductos values(?,?,GETDATE())";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idEjem);
            ps.setInt(2, idCl);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Reservado");
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }

    public boolean dlEjemRe(int id) {
        String query = "delete tbReservaProductos where idReservaProducto=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }
}

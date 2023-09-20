package AModelo;

import Mensajes.CódigoErrorDSI3;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    //Esto nos ayudara a ver la reserva de producto que a hecho el cliente dentro del sistema
    public ResultSet tbReservF(int idCl, String n1) {

        String query = "select rp.idReservaProducto,rp.idEjemplar,tp.tipo,p.Nombre as Producto,Precio \n"
                + "from tbReservaProductos rp,tbEjemplares e,tbProductos p,tbTipoProductos tp,tbClientes c\n"
                + "where e.idProducto=p.idProducto and tp.idTipoProducto=p.idTipoProducto and \n"
                + "rp.idEjemplar=e.idEjemplar and rp.idCliente=c.idCliente and p.Nombre like ? and rp.idCliente=? and e.Estado='Reservado'";
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

    public ResultSet selecR(int idCl) {

        String query = "select * from tbReservaProductos where idCliente=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idCl);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    //Esto nos ayudara a ver que tipo de de producto es por medio del ejemplar y ver si esta reservado o no
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

    //Esto nos ayudara a borrar algun producto reservado dentro del sistema
    public boolean dlEjemRe(int id) {
        String query = "delete tbReservaProductos where idReservaProducto=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
             CódigoErrorDSI3 obj = new CódigoErrorDSI3();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }

}

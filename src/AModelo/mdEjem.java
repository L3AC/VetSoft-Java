package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mdEjem {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;

    public ResultSet tbEjem(String n1, int idP) {

        String query = "select idEjemplar,tp.tipo,p.Nombre,Estado from tbEjemplares e, tbProductos p, "
                + "tbTipoProductos tp where e.idProducto=p.idProducto and "
                + "tp.idTipoProducto=p.idTipoProducto and Estado like ? and e.idProducto=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + n1 + "%");
            ps.setInt(2, idP);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public boolean dlEjem(int id) {
        String query = "DELETE tbEjemplares where idEjemplar=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false;
        }
    }

    public boolean insEjem(int id) {
        String query = "insert into tbEjemplares values(?,'Disponible',getdate())";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Campos ingresados");
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }

    //TABLA DE RESERVAS DE EJEMPLARES 
    public ResultSet tbEjemRe(String n1) {

        String query = "select idEjemplar,tp.tipo,p.Nombre as Producto,Precio from tbEjemplares e,tbProductos p,tbTipoProductos tp \n"
                + "where e.idProducto=p.idProducto and tp.idTipoProducto=p.idTipoProducto\n"
                + "and Estado='Disponible' and p.Nombre like ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + n1 + "%");
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }
    

    public boolean stateEjemRe(int id,String est) {
        String query = "update tbEjemplares set Estado=? where idEjemplar=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, est);
            ps.setInt(2, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Campo Actualizado");
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false;
        }
    }

    public boolean insEjemRe(int idEjem,int idCl) {
        String query = "insert into tbReservaProductos values(?,?,GETDATE())";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idEjem);
            ps.setInt(2, idCl);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Campos ingresados");
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }

    public boolean dlEjemRe(int id) {
        String query = "delete ";
        try {
            ps = con.prepareStatement(query);
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

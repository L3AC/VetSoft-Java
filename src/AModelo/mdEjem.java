package AModelo;

import Mensajes.Campos;
import Mensajes.CódigoDeErrorDLI2;
import Mensajes.CódigoErrorDSI3;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    //Esto nos ayudara dentro del sistema a cargar el tipo de ejemplar que esta en la base de datos
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
            CódigoDeErrorDLI2 obj = new CódigoDeErrorDLI2();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
            return null; //DIO ERROR
        }
    }

    //Esto nos ayudara a borrar el ejemplar del producto dentro del sistema y base de datos
    public boolean dlEjem(int id) {
        String query = "DELETE tbEjemplares where idEjemplar=?;";
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
            CódigoDeErrorDLI2 obj = new CódigoDeErrorDLI2();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
            return false;
        }
    }

    //Esto nos ayudara a insertar un nuevo ejemplar de algun producto dentro del sistema
    public boolean insEjem(int id) {
        String query = "insert into tbEjemplares values(?,'Disponible',getdate())";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
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
            CódigoDeErrorDLI2 obj = new CódigoDeErrorDLI2();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
            return null; //DIO ERROR
        }
    }
    

    //Esto nos ayudara a actualizar los ejemplares de los productos dentro del sistema
    public boolean stateEjemRe(int id,String est) {
        String query = "update tbEjemplares set Estado=? where idEjemplar=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, est);
            ps.setInt(2, id);
            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Campo Actualizado");
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
            return false;
        }
    }
}

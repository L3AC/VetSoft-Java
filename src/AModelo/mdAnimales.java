package AModelo;

import Mensajes.Campos;
import Mensajes.CodigodeerrorDLI1;
import Mensajes.CódigoErrorDSI1;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;

public class mdAnimales {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    /*Esto nos ayuda a cargar la mascota que esta 
que esta registrado dentro de la base de datos con su nombre, nombre popular, la raza, el dueño, tipo de animal entre otras*/
    public ResultSet cargarAnim(String nombre) {
        String query = "select idAnimal,nombrePopular as 'Animal',a.nombre as 'Nombre',CONCAT(c.nombre,' ',c.apellido) as 'Dueño'\n"
                + "	from tbAnimales a,tbTipoAnimales ta,tbRazas r,tbClientes c where a.idCliente=c.idCliente and\n"
                + "	ta.idTipoAnimal=r.idTipoAnimal and a.idRaza=r.idRaza and CONCAT(c.nombre,' ',c.apellido) like ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + nombre + "%");
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    //Esto nos ayuda a seleccionar el animal con su debida raza, tipo de animal y el id del animal dentro de la base de datos
    public ResultSet selectAnim(int idA) {
        String query = "select * from tbAnimales a,tbRazas r,tbTipoAnimales tp "
                + " where a.idRaza=r.idRaza and r.idTipoAnimal=tp.idTipoAnimal and idAnimal=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idA);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    //Esto nos ayudara cuando se quiera borrar el registro de alguna mascota dentro del sistema
    public boolean deleteAnim(int idA) {
        String query = "delete tbAnimales where idAnimal=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idA);
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

    //Esto nos ayudara a poder registrar nuevas mascotas dentro del sistema 
    public boolean insertAnim(int idCl, int idR, String padec, String nombre,
            String peso, String edad, String sexo) {
        String query = "insert into tbAnimales values(?,?,?,?,?,?,?,GETDATE());";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idCl);
            ps.setInt(2, idR);
            ps.setString(3, padec);
            ps.setString(4, nombre);
            ps.setString(5, peso);
            ps.setString(6, edad);
            ps.setString(7, sexo);
            ps.executeUpdate();
            Campos obj = new Campos();
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

    //Esto nos ayudara a actualizar algun campo a la mascota por ejemplo la edad que puede ser actualizada
    public boolean updateAnim(int idA, int idR, String padec, String nombre,
            String peso, String edad, String sexo) {
        String query = "update tbAnimales set idRaza=?,padecimientos=?,nombre=?,peso=?,edad=?,sexo=?\n"
                + "	where idAnimal=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idR);
            ps.setString(2, padec);
            ps.setString(3, nombre);
            ps.setString(4, peso);
            ps.setString(5, edad);
            ps.setString(6, sexo);
            ps.setInt(7, idA);

            ps.executeUpdate();
            CódigoErrorDSI1 obj = new CódigoErrorDSI1();
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

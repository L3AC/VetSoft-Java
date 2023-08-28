package AModelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class mdClientes {

    Connection con = Conx.Conectar();

    ResultSet rs;
    PreparedStatement ps;

    //Esto nos ayudara a cargar la informacion del cliente dentro del sistema
    public ResultSet cargarCl(String nombre) {
        String query = "select idCliente,CONCAT(nombre,' ',apellido) as 'Nombre',DATEDIFF(YEAR, nacimiento, GETDATE()) as 'Edad'\n"
                + ",sexo as Sexo from tbClientes where CONCAT(nombre,' ',apellido) like ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%"+nombre+"%");
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }
    //Aqui se seleccionara el cliente por medio de su Id dentro de la base de datos
        public ResultSet selectCl(int idD) {
        String query = "select * from tbClientes where idCliente=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idD);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

        //Esto nos ayudara a poder borrar algun cliente dentro del sistema y base de datos
    public boolean deleteCl(int idD) {
        String query = "DELETE tbClientes where idCliente=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idD);
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

    //Esto nos ayudara a insertar un nuevo cliente dentro del sistema y base de datos
    public boolean insertCl(int idUs, String nombre, String apellido,
            String dui, String naci, String sexo,String direccion) {
        String query = "insert into tbClientes"
                + " values(?,?,?,?,?,?,?,GETDATE());";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, dui);
            ps.setString(5, naci);
            ps.setString(6, sexo);
            ps.setString(7, direccion);
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

    //Esto nos ayudara a actualizar algun campo dentro de la información del cliente
    public boolean updateCl(int idCl, String nombre, String apellido, String dui, String naci, String sexo) {
        String query = "update tbClientes SET nombre=?,apellido=?,DUI=?,nacimiento=?,sexo=? \n" +
        "where idCliente=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, dui);
            ps.setString(4, naci);
            ps.setString(5, sexo);
            ps.setInt(6, idCl);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Campos actualizados");
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }

    }


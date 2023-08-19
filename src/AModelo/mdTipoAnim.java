/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LEAC2
 */
public class mdTipoAnim {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;

    //Esto nos ayudara a cargar los datos del usuario dentro del sistema
    public ResultSet loadData(int idUs) {//EDITAR INFO
        String query = "select idUsuario,tu.nivel as 'Cargo',usuario,correo,telefono from tbUsuarios u,\n"
                + "tbTipoUsuario tu where u.idTipoUsuario=tu.idTipoUsuario and idUsuario=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    //Esto nos ayudara a cargar los nombre populares de los animales
    public ResultSet tableTPA(String nombre) {//TABLA
        String query = "select * from tbTipoAnimales where nombrePopular like ?;";
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

    //Esto nos ayudara a insertar dentro de la tabla tipo de animales el nombre popular del animal
    public boolean insertTPA(String n1, String n2) {
        String query = "insert into tbTipoAnimales values(?,?);";
        try {

            ps = con.prepareStatement(query);
            ps.setString(1, n1);
            ps.setString(2, n2);
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

    //Esto nos ayudara a actualizar los datos de la tabla tipo animales
    public boolean updtTPA(int id1, String n1, String n2) {
        String query = "update tbTipoAnimales set nombrePopular=? , nombreCientifico=? where idTipoAnimal=?;";
        try {

            ps = con.prepareStatement(query);
            ps.setString(1, n1);
            ps.setString(2, n2);
            ps.setInt(3, id1);
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
    
//Esto nos ayudara a eliminar algun tipo de animal por medio del id dentro del sistema
    public boolean deleteTPA(int idD) {
        String query = "delete tbTipoAnimales where idTipoAnimal=?";
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

}

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
public class mdTipoServ {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;

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

    public ResultSet tableServ(String nombre) {//TABLA
        String query = "select idTipoServicio,ts.idNivelServicio,ns.Prioridad,Nombre,costo from tbTipoServicio ts, tbNivelServicio ns\n"
                + "where ns.idNivelServicio=ts.idNivelServicio;";
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

    public ResultSet comboServ() {//EDITAR INFO
        String query = "select * from tbTipoServicio where idNivelServicio=2;";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public ResultSet selectServ(int id) {//EDITAR INFO
        String query = "select * from tbTipoServicio where idNivelServicio=2 and idTipoServicio=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public boolean insertServ(int idNs, String serv, float costo) {
        String query = "insert into tbTipoServicio values(?,?,?);";
        try {

            ps = con.prepareStatement(query);

            ps.setInt(1, idNs);
            ps.setString(2, serv);
            ps.setFloat(3, costo);
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

    public boolean updtServ(int idTipoS, int idNs, String serv, float costo) {
        String query = "update tbTipoServicio set idNivelServicio=?, Nombre=?,costo=? where idTipoServicio=?;";
        try {

            ps = con.prepareStatement(query);
            ps.setInt(1, idNs);
            ps.setString(2, serv);
            ps.setFloat(3, costo);
            ps.setInt(4, idTipoS);
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

    public boolean deleteServ(int idD) {
        String query = "delete tbTipoServicio where idTipoServicio=?";
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

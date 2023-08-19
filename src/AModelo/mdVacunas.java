
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
    
    //TIPO DE VACUNA
    public ResultSet loadTPVac(String n1) {
        String query = "select * from tbTipoVacunas where NombreVacuna like ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%"+n1+"%");
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    
    //Esto nos ayudara a insertar si hay nuevos tipos de vacunas
    public boolean insTPVac(String n1,String n2) {
        String query = "insert into tbTipoVacunas values(?,?);";
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
    
    //Esto nos ayudara a eliminar algun tipo de vacunas 
    public boolean delTPVac(int id1) {
        String query = "DELETE tbTipoVacunas where idTipoVacuna=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id1);
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

    //Esto nos ayudara a actualizar algun campo dentro de la tabla tipo de vacunas
    public boolean upTPVac(String n1,String n2,int id1) {
        String query = "update tbTipoVacunas set NombreVacuna=?,Utilidad=? "
                + "where idTipoVacuna=?;";
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
    //VACUNACIONES
    public boolean insVac(int id1,int id2) {
        String query = "insert into tbVacunaciones values(?,?,getdate());";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id1);
            ps.setInt(2, id2);
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
    public boolean delVac(int id1) {
        String query = "DELETE tbVacunaciones where idVacunacion=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id1);
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

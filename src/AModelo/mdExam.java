
package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mdExam {
    Connection con = Conx.Conectar();
    PreparedStatement ps;
    ResultSet rs;
    
    public ResultSet loadTPVac(String n1) {
        String query = "select * from tbTipoVacunas where NombreVacuna like ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + n1 + "%");
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }

    //Esto nos ayudara a insertar si hay nuevos tipos de vacunas
    public boolean insTPVac(String n1, String n2) {
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
}

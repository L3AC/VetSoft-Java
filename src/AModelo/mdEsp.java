/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class mdEsp {
    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean selectEsp() {
        String query = "select * from tbEspecialidades";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}

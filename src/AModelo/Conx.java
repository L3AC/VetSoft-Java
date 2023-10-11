/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AModelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LEAC2
 */

// Esta es la conexión a la base de datos con el usuario, contraseña y el localhost
public class Conx {
    public static Connection Conectar(){
        String cadena = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=VetSoft2;"
            + "user=userSQL;"
            + "password=pasf2;"
            + "encrypt=false;"
            + "loginTimeout=10;";
        
        try {
            Connection con = DriverManager.getConnection(cadena);
            return con;
        } catch(SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}

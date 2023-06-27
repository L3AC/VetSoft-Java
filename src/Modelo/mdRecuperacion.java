/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection; // Para establecer la conexión con la base de datos
import java.sql.DriverManager; // Para manejar el controlador de la base de datos
import java.sql.PreparedStatement; // Para ejecutar consultas preparadas
import java.sql.ResultSet; // Para obtener los resultados de las consultas
import java.sql.SQLException; // Para manejar las excepciones de SQL
import java.util.Properties; // Para configurar las propiedades del correo electrónico
import java.util.Random; // Para generar el código de verificación
import Modelo.Conx;
import javax.mail.*; // Para enviar el correo electrónico
import javax.mail.internet.*; // Para trabajar con objetos relacionados con el correo electrónico
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Gerson
 */
public class mdRecuperacion {
    
    //Conx con = new Conx();
    Connection acceso;
    //int User;
    String Preguntas2;
    String pasw;
    
    
    public ResultSet EncCod(String user) {
        String cadena = "SELECT * FROM tbUsuarios\n" +
"    WHERE usuario = ? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        Connection con = Conx.Conectar();
        PreparedStatement ps;
        ResultSet st;
        
        try{    
            ps = con.prepareStatement(cadena);
            ps.setString(1, user);
            st = ps.executeQuery();
            if (st.next()) {
                JOptionPane.showMessageDialog(null, "Usuario Encontrado");
                return st;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no Encontrado");
                return null;//NO HAY NADA
            }
            /*int found = st.getRow();
            if (found==1) {
                JOptionPane.showMessageDialog(null, "Usuario Encontrado");
                return st;
            } else{
               // System.out.println(st.getInt("IdUsuario"));
                JOptionPane.showMessageDialog(null, "Usuario no Encontrado");
                return null;
            }*/
        } catch (SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
          return null;
        }   
    }
    
    /*public void EncExist(int user){//
    
        String cadena = "EXEC existPreg ?;";
        
        PreparedStatement ps;
        ResultSet st;
        
        try{
        acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ps.setInt(1, User);
            st = ps.executeQuery();
            st.last();
            int found = st.getRow();
            if (found == 1){
                JOptionPane.showMessageDialog(null, "Se encontraron respuestas");
               User = st.getInt("idUsuario");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron respuestas");
                
            }
        }catch (SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
        }   
    }*/
    
    public ResultSet VerifUS(String user){
    String cadena = "SELECT *FROM tbUsuarios\n" +
"    WHERE usuario = ? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        
        PreparedStatement ps;
        ResultSet st;
        
        try{
        //acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, user);
            st = ps.executeQuery();
            st.last();
            int found = st.getRow();
            if(found == 1){
                return st;
            /*User = st.getInt("idUsuario");
            pasw = st.getString("contraseña");
            System.out.println(pasw);*/
            }else {
            return null;
            }
        }catch (SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
          return null;
        }
    
}
    
    
    
   /* public boolean VerificarExistencia(JTextField resp, int idpreg){
    
    String cadena = "EXEC selectPregUs ?,?,?;";
        
        PreparedStatement ps;
        ResultSet st;
        
        try{
        acceso = con.Conectar();
            ps = acceso.prepareStatement(cadena, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ps.setInt(1, User);
            ps.setInt(2,idpreg);
            ps.setString(3, resp.toString());
            st = ps.executeQuery();
            st.last();
            int found = st.getRow();
            
            if(found == 1){
                return true; 
            }else{
                JOptionPane.showMessageDialog(null, "Respuestas Incorrectas");
            
            }
        }  catch (SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
        
        
        
    }
        return false;
}*/
 
}



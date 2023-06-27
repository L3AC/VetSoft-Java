/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.sql.*;
import Modelo.mdRecuperacion;
import java.sql.SQLException;
import Modelo.Conx;
/**
 *
 * @author Gerson
 */
public class ctRecuperacion {
    
    public String enunciado;
    public int idPregunta;
    public String respuesta;
    public int idUsuario;
    public String Usuario;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
    public ResultSet EncCod(){
        mdRecuperacion recup = new mdRecuperacion();
        return recup.EncCod(Usuario);
    }
    /*public ResultSet VerifUS(){
        mdRecuperacion recups = new mdRecuperacion();
        return recups.VerifUS(Usuario);
    }*/
   
   
}

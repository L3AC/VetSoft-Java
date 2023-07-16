/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AControlador;

import AModelo.mdTipoUs;
import AModelo.mdUser;
import java.sql.ResultSet;

/**
 *
 * @author LEAC2
 */
public class ctTipoUs {

    public static String usuario;
    private int idTipoUs;
    private String cargo;

    public int getIdTipoUs() {
        return idTipoUs;
    }

    public void setIdTipoUs(int idTipoUs) {
        this.idTipoUs = idTipoUs;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    mdTipoUs md=new mdTipoUs();
    
    public ResultSet selectTP(){
        return md.selectTP();
    }
    
    
    public ResultSet selectUser(){
    return md.selectUser();
    }
}

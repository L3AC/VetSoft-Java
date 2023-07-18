/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AControlador;

import AModelo.mdTipoServ;
import java.sql.ResultSet;


public class ctTipoServ {
    public int idTipoServ;
    public int idNivelServ;
    public String Nombre;
    public Double Costo;

    public int getIdTipoServ() {
        return idTipoServ;
    }

    public void setIdTipoServ(int idTipoServ) {
        this.idTipoServ = idTipoServ;
    }

    public int getIdNivelServ() {
        return idNivelServ;
    }

    public void setIdNivelServ(int idNivelServ) {
        this.idNivelServ = idNivelServ;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getCosto() {
        return Costo;
    }

    public void setCosto(Double Costo) {
        this.Costo = Costo;
    }
    
    mdTipoServ md=new mdTipoServ();
    
    public ResultSet comboServ(){
        return md.comboServ();
    }
    public ResultSet selectServ(){
        return md.selectServ(idTipoServ);
    }
}

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
    public String prioridad;
    public String Nombre;
    public float Costo;

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

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float Costo) {
        this.Costo = Costo;
    }

    mdTipoServ md = new mdTipoServ();

    public ResultSet comboServ() {
        return md.comboServ();
    }

    public ResultSet selectServ() {
        return md.selectServ(idTipoServ);
    }

    public ResultSet tableServ() {
        return md.tableServ(Nombre);
    }

    public ResultSet comboPrior() {
        return md.comboPrior();
    }

    public boolean insertServ() {
        return md.insertServ(idNivelServ, Nombre, Costo);
    }

    public boolean updtServ() {
        return md.updtServ(idTipoServ, idNivelServ, Nombre, Costo);
    }

    public boolean deleteServ() {
        return md.deleteServ(idTipoServ);
    }

}

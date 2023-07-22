/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AControlador;

import AModelo.mdRaza;
import java.sql.ResultSet;

/**
 *
 * @author LEAC2
 */
public class ctRaza {

    public int idTipoAnimal;
    public String nombrePopular;
    public int idRaza;
    public String nombreRaza;

    public int getIdTipoAnimal() {
        return idTipoAnimal;
    }

    public void setIdTipoAnimal(int idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }

    public String getNombrePopular() {
        return nombrePopular;
    }

    public void setNombrePopular(String nombrePopular) {
        this.nombrePopular = nombrePopular;
    }

    public int getIdRaza() {
        return idRaza;
    }

    public void setIdRaza(int idRaza) {
        this.idRaza = idRaza;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    mdRaza md = new mdRaza();

    public ResultSet loadTPanimal() {
        return md.loadTPanimal();
    }
   /* public ResultSet loadRaza() {
        return md.loadRaza(idRaza);
    }*/

    /*public boolean insertAnim() {
        return ani.insertAnim(idCliente, idRaza, padecimientos, nombre, peso, edad, sexo);
    }

    public boolean updtAnim() {
        return ani.updateAnim(idAnimal, idRaza, padecimientos, nombre, peso, edad, sexo);
    }

    public boolean deleteAnim() {
        return ani.deleteAnim(idAnimal);
    }*/

    public ResultSet selectRaza() {
        return md.selectRaza(nombreRaza);
    }
}

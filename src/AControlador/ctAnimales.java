package AControlador;

import AModelo.mdAnimales;
import java.sql.*;

public class ctAnimales {

    public int idAnimal;
    public int idCliente;
    public int idRaza;
    public String padecimientos;
    public String nombre;
    public String peso;
    public String edad;
    public String sexo;

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdRaza() {
        return idRaza;
    }

    public void setIdRaza(int idRaza) {
        this.idRaza = idRaza;
    }

    public String getPadecimientos() {
        return padecimientos;
    }

    public void setPadecimientos(String padecimientos) {
        this.padecimientos = padecimientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    mdAnimales ani = new mdAnimales();

    public ResultSet cargarAnim() {
        return ani.cargarAnim(nombre);
    }

    public boolean insertAnim() {
        return ani.insertAnim(idCliente, idRaza, padecimientos, nombre, peso, edad, sexo);
    }

    public boolean updtAnim() {
        return ani.updateAnim(idAnimal, idRaza, padecimientos, nombre, peso, edad, sexo);
    }

    public boolean deleteAnim() {
        return ani.deleteAnim(idAnimal);
    }
     public ResultSet selectAnim() {
        return ani.selectAnim(idAnimal);
    }

}

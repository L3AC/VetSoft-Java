
package Controlador;
import java.sql.*;

public class ctAnimales {
    public int idAnimal;
    public int idCliente;
    public int idRaza;
    public String padecimientos;
    public String nombre;
    public int peso;
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
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
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
   
   public ResultSet  cargarData(){
       
      return null;
   }
    
    
}

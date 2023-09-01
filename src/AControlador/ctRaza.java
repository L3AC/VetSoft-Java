
package AControlador;

import AModelo.mdRaza;
import java.sql.ResultSet;

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
    public ResultSet comboRaza() {
        return md.comboRaza(idTipoAnimal);
    }
   public boolean deleteRaza(){
       return md.deleteRaza(idRaza);
   }
    public boolean insRaza(){
       return md.insertRaza(idTipoAnimal,nombreRaza);
   }
     public boolean upRaza(){
       return md.updateRaza(idTipoAnimal,nombreRaza,idRaza);
   }
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
    public ResultSet loadRaza(){
        return md.loadRaza(nombreRaza);
    }
}

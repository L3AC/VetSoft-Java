
package AControlador;

import AModelo.mdReservFact;
import java.sql.ResultSet;

public class ctReservFact {
        public int idEjem;
    public int idCl;
    public int idReserv;
    public int idProd;
    public String estado;
    public String nombre;

    public int getIdEjem() {
        return idEjem;
    }

    public void setIdEjem(int idEjem) {
        this.idEjem = idEjem;
    }

    public int getIdCl() {
        return idCl;
    }

    public void setIdCl(int idCl) {
        this.idCl = idCl;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    mdReservFact md = new mdReservFact();
    
    public ResultSet tbReservF() {
        return md.tbReservF(idCl,nombre);
    }
    
    public boolean insEjemRe() {    
        return md.insEjemRe(idEjem, idCl);
    }

    public boolean dlEjemRe() {
        return md.dlEjemRe(idReserv);
    }
}

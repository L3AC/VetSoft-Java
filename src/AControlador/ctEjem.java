package AControlador;

import AModelo.mdEjem;
import java.sql.ResultSet;

public class ctEjem {

    public int idEjem;
    public int idCl;
    public int idProd;
    public String estado;

    public int getIdEjem() {
        return idEjem;
    }

    public void setIdEjem(int idEjem) {
        this.idEjem = idEjem;
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

    public int getIdCl() {
        return idCl;
    }

    public void setIdCl(int idCl) {
        this.idCl = idCl;
    }

    mdEjem md = new mdEjem();

    //TABLA DE EJEMPLARES
    public ResultSet tbEjem() {
        return md.tbEjem(estado, idProd);
    }

    public boolean dlEjem() {
        return md.dlEjem(idEjem);
    }

    public boolean insEjem() {
        return md.insEjem(idProd);
    }
    //TABLA DE RESERVAS DE EJEMPLARES
    
}

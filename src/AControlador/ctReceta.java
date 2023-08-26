package AControlador;

import AModelo.mdReceta;
import java.sql.ResultSet;

public class ctReceta {

    public int idRe;
    public int idCita;
    public String instruc;

    public int getIdRe() {
        return idRe;
    }

    public void setIdRe(int idRe) {
        this.idRe = idRe;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getInstruc() {
        return instruc;
    }

    public void setInstruc(String instruc) {
        this.instruc = instruc;
    }

    mdReceta md = new mdReceta();
    
    public ResultSet verifR() {
        return md.verifR(idCita);
    }

    public boolean dlRe() {
        return md.dlRe(idRe);
    }

    public boolean upRe() {
        return md.upRe(instruc, idRe);
    }

    public boolean insRe() {
        return md.insRe(idCita, instruc);
    }

}

package AControlador;

import AModelo.mdVacunas;
import java.sql.ResultSet;

public class ctVacunas {

    public int idTipoVac;
    public int idVac;
    public int idAnimal;
    public String nombreVac;
    public String util;

    public int getIdTipoVac() {
        return idTipoVac;
    }

    public void setIdTipoVac(int idTipoVac) {
        this.idTipoVac = idTipoVac;
    }

    public int getIdVac() {
        return idVac;
    }

    public void setIdVac(int idVac) {
        this.idVac = idVac;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombreVac() {
        return nombreVac;
    }

    public void setNombreVac(String nombreVac) {
        this.nombreVac = nombreVac;
    }

    public String getUtil() {
        return util;
    }

    public void setUtil(String util) {
        this.util = util;
    }

    mdVacunas md = new mdVacunas();

    //tipo de vacunas
    public ResultSet loadTPVac() {
        return md.loadTPVac(nombreVac);
    }

    public boolean upTPVac() {
        return md.upTPVac(nombreVac, util, idTipoVac);
    }

    public boolean insTPVac() {
        return md.insTPVac(nombreVac, util);
    }

    public boolean delTPVac() {
        return md.delTPVac(idTipoVac);
    }

    //VACUNACION
    public boolean insVac() {
        return md.insVac(idAnimal, idTipoVac);
    }

    public boolean delVac() {
        return md.delVac(idVac);
    }

    public ResultSet verifVac() {
        return md.loadTPVac(nombreVac);
    }

}

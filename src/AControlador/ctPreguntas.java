
package AControlador;

import AModelo.mdPreguntas;
import java.sql.ResultSet;

public class ctPreguntas {
    public int idPreg;
    public int idUs;
    public String enun;
    public String resp;

    public int getIdPreg() {
        return idPreg;
    }

    public void setIdPreg(int idPreg) {
        this.idPreg = idPreg;
    }

    public int getIdUs() {
        return idUs;
    }

    public void setIdUs(int idUs) {
        this.idUs = idUs;
    }

    public String getEnun() {
        return enun;
    }

    public void setEnun(String enun) {
        this.enun = enun;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }
    
    mdPreguntas md=new mdPreguntas();
    
    public ResultSet selectResp(){
        return md.selectResp(idUs, idPreg);
    }
}

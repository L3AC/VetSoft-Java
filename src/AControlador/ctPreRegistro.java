package AControlador;

import AModelo.mdPreRegistro;

public class ctPreRegistro {

    public int idPreR;
    public int idNivelUs;
    public int idDoc;
    public String dui;
    public String token;

    public int getIdPreR() {
        return idPreR;
    }

    public void setIdPreR(int idPreR) {
        this.idPreR = idPreR;
    }

    public int getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getIdNivelUs() {
        return idNivelUs;
    }

    public void setIdNivelUs(int idNivelUs) {
        this.idNivelUs = idNivelUs;
    }

    mdPreRegistro md = new mdPreRegistro();

    public boolean insertT() {
        return md.insertT(idNivelUs, token, dui, idDoc);
    }
}

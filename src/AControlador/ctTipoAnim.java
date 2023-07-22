/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AControlador;

import AModelo.mdTipoAnim;
import java.sql.ResultSet;

public class ctTipoAnim {

    public int idTipoAnim;
    public String nCient;
    public String nPopular;

    public int getIdTipoAnim() {
        return idTipoAnim;
    }

    public void setIdTipoAnim(int idTipoAnim) {
        this.idTipoAnim = idTipoAnim;
    }

    public String getnCient() {
        return nCient;
    }

    public void setnCient(String nCient) {
        this.nCient = nCient;
    }

    public String getnPopular() {
        return nPopular;
    }

    public void setnPopular(String nPopular) {
        this.nPopular = nPopular;
    }

    mdTipoAnim md = new mdTipoAnim();

    public ResultSet tableTPA() {
        return md.tableTPA(nPopular);
    }

    public boolean insertTPA() {
        return md.insertTPA(nPopular, nCient);
    }

    public boolean updtTPA() {
        return md.updtTPA(idTipoAnim, nPopular, nCient);
    }

    public boolean deleteTPA() {
        return md.deleteTPA(idTipoAnim);
    }
}

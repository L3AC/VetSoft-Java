package AControlador;

import AModelo.mdEjem;
import AModelo.mdExam;
import java.sql.ResultSet;

public class ctExam {

    public int idExam;
    public int idAnim;
    public int idTipoS;
    public byte[] image;
    public String nota;
    public String serv;

    public int getIdExam() {
        return idExam;
    }

    public void setIdExam(int idExam) {
        this.idExam = idExam;
    }

    public int getIdAnim() {
        return idAnim;
    }

    public void setIdAnim(int idAnim) {
        this.idAnim = idAnim;
    }

    public int getIdTipoS() {
        return idTipoS;
    }

    public void setIdTipoS(int idTipoS) {
        this.idTipoS = idTipoS;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getServ() {
        return serv;
    }

    public void setServ(String serv) {
        this.serv = serv;
    }

    mdExam md = new mdExam();

    public boolean insExam() {
        return md.insExam(idAnim, idTipoS,image,nota);
    }

    public boolean delExam() {
        return md.delExam(idExam);
    }

    public boolean upExam() {
        return md.upExam( idTipoS,image,nota,idExam);
    }

    public ResultSet loadExam() {
        return md.loadExam(idAnim, serv);
    }
        public ResultSet selectExam() {
        return md.selectExam(idExam);
    }

}

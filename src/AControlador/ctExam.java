
package AControlador;

import AModelo.mdEjem;
import AModelo.mdExam;

public class ctExam {
    public int idExam;
    public int idAnim;
    public int idTipoS;
    public byte[] image;
    public String nota;

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
    
    mdExam md=new mdExam();
    
    
}

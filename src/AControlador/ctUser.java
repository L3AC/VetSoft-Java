package AControlador;

import AModelo.mdUser;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ctUser {
    public int idTipoUs;
    public String nivel;
    public int idUs;
    public int idTipoC;
    public String usuario;
    public String contra;
    public String correo;
    public String telefono;
    public String codigoVerif;
    public String fechaRegistro;

    public int getIdTipoUs() {
        return idTipoUs;
    }
   public void setIdTipoUs(int idTipoUs) {
        this.idTipoUs = idTipoUs;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public int getIdUs() {
        return idUs;
    }
   public void setIdUs(int idUs) {
        this.idUs = idUs;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContra() {
        return contra;
    }
    public void setContra(String contra) {
        this.contra = contra;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCodigoVerif() {
        return codigoVerif;
    }
    public void setCodigoVerif(String codigoVerif) {
        this.codigoVerif = codigoVerif;
    }
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdTipoC() {
        return idTipoC;
    }

    public void setIdTipoC(int idTipoC) {
        this.idTipoC = idTipoC;
    }

          mdUser usu = new mdUser();
    public ResultSet ValidarLogin(){
        //System.err.println(usuario);
        System.err.println(contra);
      return usu.SelectTipoUs(usuario, contra);
      }
    public ResultSet SelectTipoC(){
        //System.err.println(usuario);
      return usu.SelectTipoID(idTipoUs, idUs);
      }
}

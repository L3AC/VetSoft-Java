package AControlador;

import AModelo.mdAnimales;
import AModelo.mdAsistentes;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ctAsistente {

    public int idAsistente;
    public int idUsuario;
    public int idDoctor;
    public String usuario;
    public String nombre;
    public String apellido;
    public String dui;
    public String nacimiento;
    public String sexo;

    public int getIdAsistente() {
        return idAsistente;
    }

    public void setIdAsistente(int idAsistente) {
        this.idAsistente = idAsistente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    mdAsistentes md = new mdAsistentes();

    public ResultSet verifPerfil() throws SQLException {
        return md.verifPerfil(idUsuario);
    }

    public ResultSet usAsis() throws SQLException {
        return md.usAsis(usuario);
    }

    public ResultSet selectAsis() throws SQLException {
        return md.selectAsis(idAsistente);
    }

    public ResultSet cargarAsis() {
        return md.cargarAsis(nombre);
    }

    public boolean insertAsis() {
        return md.insertAsis(idUsuario, idDoctor, nombre, apellido,
                dui, nacimiento, sexo);
    }

    public boolean updtAsis() {
        return md.updtAsis(idAsistente, idDoctor, nombre, apellido, dui, nacimiento, sexo);
    }

    public boolean upAsis2() {
        return md.upAsis2(idAsistente, nombre, apellido, dui, nacimiento, sexo);
    }

    public boolean deleteAsis() {
        return md.deleteAsis(idAsistente);
    }
}

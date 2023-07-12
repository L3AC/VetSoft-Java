package AControlador;

import AModelo.mdRecep;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ctRecep {

    public int idRecep;
    public int idUsuario;
    public String nombre;
    public String apellido;
    public String dui;
    public String nacimiento;
    public String sexo;

    public int getIdRecep() {
        return idRecep;
    }

    public void setIdRecep(int idRecep) {
        this.idRecep = idRecep;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    mdRecep md = new mdRecep();

    public boolean insertRe() {
        return md.insertRe(idUsuario, nombre, apellido, dui, nacimiento, sexo);
    }

    public boolean updtRecep() {
        return md.updateRecep(idRecep, nombre, apellido, dui, nacimiento, sexo);
    }

    public boolean deleteRecep() {
        return md.deleteRecep(idRecep);
    }

    public ResultSet cargarRecep() throws SQLException {
        return md.cargarRecep(nombre);
    }

    public ResultSet selectRecep() throws SQLException {
        return md.selectRecep(idRecep);
    }
}

package AControlador;

import AModelo.mdDoctores;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ctDoctores {
    public int idDoctor;
    public int idUsuario;
    public int idEsp;
    public String nombre ;
    public String apellido;
    public String dui;
    public String nacimiento;
    public String sexo;

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(int idEsp) {
        this.idEsp = idEsp;
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
    mdDoctores md =new mdDoctores();
    
    public ResultSet cargarDoc() throws SQLException {
        return md.cargarDoc(nombre);
    }
    public ResultSet loadData() throws SQLException {
        return md.loadData(idDoctor);
    }
    public boolean insertDoc(){
        return md.insertDoc(idUsuario, idEsp, nombre, apellido, dui,nacimiento, sexo);
    }
    public boolean updateDoc(){
        return md.updateDoc(idDoctor, idEsp, nombre, apellido, dui,nacimiento, sexo);
    }
    public boolean deleteDoc(){
        return md.deleteDoc(idDoctor);
    }
    
}


package AControlador;
import AModelo.mdClientes;
import java.sql.*;
public class ctCliente {
    public int idCliente;
    public int idUsuario;
    public String nombre ;
    public String apellido;
    public String dui;
    public String nacimiento;
    public String sexo;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
    
    mdClientes cl = new mdClientes();

    public ResultSet cargarCl() {
        return cl.cargarCl(nombre);
    }
        public ResultSet selectCl() {
        return cl.selectCl(idCliente);
    }

    public boolean insertCl() {
        return cl.insertCl(idCliente,nombre, apellido, dui, nacimiento, sexo);
    }

    public boolean updtCl() {
        return cl.updateCl(idCliente,nombre, apellido, dui, nacimiento, sexo);
    }

    public boolean deleteCl() {
        return cl.deleteCl(idCliente);
    }
}

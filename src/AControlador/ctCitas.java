package AControlador;
import AModelo.mdCitas;
import java.sql.*;
public class ctCitas {
    public int idCita;
    public int idAnimal ;
    public int idTipoServicio;
    public int idDoctor;
    public String estado;
    public String notaDelCliente ;
    public String notaDelDoctor ;
    public String fechahora;
    public String cliente;

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(int idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNotaDelCliente() {
        return notaDelCliente;
    }

    public void setNotaDelCliente(String notaDelCliente) {
        this.notaDelCliente = notaDelCliente;
    }

    public String getNotaDelDoctor() {
        return notaDelDoctor;
    }

    public void setNotaDelDoctor(String notaDelDoctor) {
        this.notaDelDoctor = notaDelDoctor;
    }

    public String getFechahora() {
        return fechahora;
    }

    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }
    
     mdCitas cl = new mdCitas();

    public ResultSet cargarCita() {
        return cl.cargarCita(cliente);
    }
        public ResultSet selectCita() {
        return cl.selectCita(idCita);
    }

    public boolean insertCita() {
        return cl.insertCita(idAnimal,idTipoServicio, idDoctor, notaDelCliente, 
                notaDelDoctor, fechahora);
    }

    public boolean updtCita() {
        return cl.updateCita(idCita,idAnimal,idTipoServicio, idDoctor, estado,notaDelCliente, 
                notaDelDoctor, fechahora);
    }

    public boolean deleteCita() {
       return cl.deleteCita(idCita);
    }
}

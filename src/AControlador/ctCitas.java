package AControlador;

import AModelo.mdCitas;
import java.sql.*;

public class ctCitas {

    public int idCita;
    public int idAnimal;
    public int idTipoServicio;
    public int idDoctor;
    public String estado;
    public String notaDelCliente;
    public String notaDelDoctor;
    public String fecha;
    public String hora;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    mdCitas cl = new mdCitas();

    public ResultSet citaOther() {
        return cl.citaOther(cliente);
    }

    public ResultSet citaDoc() {
        return cl.citaDoc(idDoctor, cliente);
    }

    public ResultSet verifDispo() {
        return cl.verifDisp(idDoctor, fecha,hora);
    }
        public ResultSet verifEstate() {
        return cl.verifEstate(idCita);
    }

    public ResultSet selectCita() {
        return cl.selectCita(idCita);
    }

    public boolean insertCita() {
        return cl.insertCita(idAnimal, idTipoServicio, idDoctor, notaDelCliente,
                notaDelDoctor, fecha,hora);
    }

    public boolean updtCita() {
        return cl.updateCita(idCita, idTipoServicio, idDoctor, notaDelCliente,
                notaDelDoctor, fecha,hora);
    }

    public boolean deleteCita() {
        return cl.deleteCita(idCita);
    }
}

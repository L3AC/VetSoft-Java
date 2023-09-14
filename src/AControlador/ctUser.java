package AControlador;

import AModelo.mdUser;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ctUser {

    public int idTipoUs;//NIVEL DE USUARIO QUE INGRESA A LA PANTALLA
    public String nivel;
    public String code;
    public int idUs;//USUARIO SELECCIONADO DE LA TABLA
    public int idTipoCuenta;//NIVEL DE USUARIO QUE SE LE VA AGREGAR AL REGISTRO
    public String usuario;
    public String contra;
    public String correo;
    public String telefono;
    public String codigoVerif;
    public String fechaRegistro;

    //DATOS DE PERFIL
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

    public int getIdTipoCuenta() {
        return idTipoCuenta;
    }

    public void setIdTipoCuenta(int idTipoCuenta) {
        this.idTipoCuenta = idTipoCuenta;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    ////////////////////////////////////////////////
    mdUser usu = new mdUser();

    public ResultSet ValidarLogin() throws SQLException {
        return usu.SelectTipoUs(usuario, contra);
    }

    public ResultSet loadData() {
        return usu.loadData(idUs);
    }

    public ResultSet verifPerfil() throws SQLException {
        return usu.verifPerfil(idUs, idTipoCuenta);
    }

    public ResultSet SelectTipoID() throws SQLException {
        return usu.SelectTipoID(idTipoUs, idUs);
    }

    public ResultSet verifUs() throws SQLException {
        return usu.verifUs(usuario);
    }

    public ResultSet cargarUs() {
        return usu.cargarUs(usuario, idTipoUs);
    }

    public boolean insertUs() {
        return usu.insertUs(idTipoCuenta, usuario, contra, correo, telefono);
    }

    public boolean updtUs() {
        return usu.updateUs(idTipoCuenta, usuario, correo, telefono, idUs);
    }

    public boolean updtContra() {
        return usu.updateContra(contra, usuario);
    }

    public boolean updtCode() {
        return usu.updateCode(code, usuario);
    }

    public boolean deleteUs() {
        return usu.deleteUs(idUs);
    }

    //PERFIL DATA 
    public ResultSet perfilD() throws SQLException {
        return usu.perfilData(idTipoUs, idUs);
    }

    public boolean upUs2() {
        return usu.upUs2(usuario, correo, telefono, idUs);
    }

}

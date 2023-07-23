package AModelo;

import AVista.Dashboard;
import Mensajes.CódigoErrorDRC4;
import Mensajes.CódigoErrorDSI1;
import Mensajes.CódigoErrorDSI2;
import Mensajes.CódigoErrorDSI3;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class mdUser {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;

    public ResultSet loadData(int idUs) {//EDITAR INFO
        String query = "select idUsuario,tu.nivel as 'Cargo',usuario,correo,telefono from tbUsuarios u,\n" +
        "tbTipoUsuario tu where u.idTipoUsuario=tu.idTipoUsuario and idUsuario=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }
    public ResultSet cargarUs(String nombre,int nUs) {//TABLA
        String query = "";
        try {
            if(nUs==1){//ADMIN
                query="select idUsuario,u.idTipoUsuario,tu.nivel as 'Cargo',usuario,correo,telefono from tbUsuarios u,tbTipoUsuario tu \n"
                + "where u.idTipoUsuario=tu.idTipoUsuario and usuario like ? and u.idTipoUsuario>1;";
            }
            if(nUs==2){//RECEPCIONISTA
                query="select idUsuario,u.idTipoUsuario,tu.nivel as 'Cargo',usuario,correo,telefono from tbUsuarios u,tbTipoUsuario tu \n"
                + "where u.idTipoUsuario=tu.idTipoUsuario and usuario like ? and u.idTipoUsuario=3;";
            }
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + nombre + "%");
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }
    public boolean insertUs(int idTipoC, String usuario, String contra, 
            String correo, String tel) {
        String query = "insert into tbUsuarios values(?,?,?,?,?,null,GETDATE());";
        try {
            
            ps = con.prepareStatement(query);
            
            ps.setInt(1, idTipoC);
            ps.setString(2, usuario);
            ps.setString(3, contra);
            ps.setString(4, correo);
            ps.setString(5, tel);
            ps.executeUpdate();
            CódigoErrorDSI2 obj = new CódigoErrorDSI2();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }
    public boolean updateUs(int idTipoUs, String usuario, String correo, 
            String tel,int idUs) {
        String query = "update tbUsuarios SET idTipoUsuario=?,usuario=?,correo=?,telefono=?"
                + " where idUsuario=?;";
        try {
                
            ps = con.prepareStatement(query);
            ps.setInt(1, idTipoUs);
            ps.setString(2, usuario);
            ps.setString(3, correo);
            ps.setString(4, tel);
            ps.setInt(5, idUs);
            ps.executeUpdate();
            CódigoErrorDSI1 obj = new CódigoErrorDSI1();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }
    public boolean deleteUs(int idD) {
        String query = "DELETE tbUsuarios where idUsuario=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idD);
            ps.executeUpdate();
            CódigoErrorDSI3 obj = new CódigoErrorDSI3();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false;
        }
    }
    public ResultSet verifUs(String usuario) throws SQLException {
        String url = "select * from tbUsuarios where usuario=? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        try {
            ps = con.prepareStatement(url);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            return null; //DIO ERROR
        }
    }

    public ResultSet SelectTipoUs(String usuario, String passw) throws SQLException {
        String url = "SELECT * FROM tbUsuarios WHERE usuario = ? COLLATE SQL_Latin1_General_CP1_CS_AS \n"
                + " AND contraseña = ? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        try {

            ps = con.prepareStatement(url);
            ps.setString(1, usuario);
            ps.setString(2, passw);//ENCRIPTAR
            rs = ps.executeQuery();

            return rs;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            return null; //DIO ERROR
        }
    }

    public ResultSet SelectTipoID(int idTipoU, int idUs) throws SQLException {
        String url = "SELECT * FROM tbAdministradores WHERE idUsuario = ?;";
        System.out.println(idUs + " " + idTipoU);
        try {

            if (idTipoU == 1) {
                url = "SELECT * FROM tbAdministradores WHERE idUsuario = ?;";
            }
            if (idTipoU == 2) {
                url = "SELECT * FROM tbRecepcionistas WHERE idUsuario = ?;";
            }
            if (idTipoU == 4) {
                url = "SELECT * FROM tbDoctores WHERE idUsuario = ?;";
            }
            if (idTipoU == 5) {
                url = "SELECT * FROM tbAsistentes WHERE idUsuario = ?;";
            }
            ps = con.prepareStatement(url);
            ps.setInt(1, idUs);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            return null; //DIO ERROR
        }
    }
    public ResultSet verifPerfil(int idUs, int idTipoC) throws SQLException {
        String url = "";
        System.out.println(idUs + " " + idTipoC);
        try {

            if (idTipoC == 2) {
                url = "select u.usuario from tbUsuarios u, tbRecepcionistas c "
                        + "where u.idUsuario=c.idUsuario and u.idUsuario=?;";
            }
            if (idTipoC == 3) {
                url = "select u.usuario from tbUsuarios u, tbClientes c "
                        + "where u.idUsuario=c.idUsuario and u.idUsuario=?";
            }
            if (idTipoC == 4) {
                url = "select u.usuario from tbUsuarios u, tbDoctores c "
                        + "where u.idUsuario=c.idUsuario and u.idUsuario=?";
            }
            ps = con.prepareStatement(url);
            ps.setInt(1, idUs);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            return null; //DIO ERROR
        }
    }

}

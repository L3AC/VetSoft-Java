/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AModelo;

import Mensajes.Campos;
import Mensajes.CódigoErrorDSI1;
import Mensajes.CódigoErrorDSI3;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LEAC2
 */
public class mdTipoServ {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;

    //Esto nos ayudara a cargar la info del usuario para luego poder editarla
    public ResultSet loadData(int idUs) {//EDITAR INFO
        String query = "select idUsuario,tu.nivel as 'Cargo',usuario,correo,telefono from tbUsuarios u,\n"
                + "tbTipoUsuario tu where u.idTipoUsuario=tu.idTipoUsuario and idUsuario=?;";
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

    //Esto nos ayudara a cargas los datos de la tabla tipo servicio
    public ResultSet tableServ(String nombre) {//TABLA
        String query = "select idTipoServicio,ts.idNivelServicio,ns.Prioridad,Nombre,costo from tbTipoServicio ts, tbNivelServicio ns\n"
                + "where ns.idNivelServicio=ts.idNivelServicio and Nombre like ?;";
        try {

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

    //Esto nos ayudara a cargar en un combobox el nivel de servicio que existe dentro de la base de datos
    public ResultSet comboServ(int id) {//EDITAR INFO
        String query = "select * from tbTipoServicio where idNivelServicio=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    //Esto nos ayudara a seleccionar dentro de la tabla tipo de servicio el id del nivel de servicio y tipo de servicio
    public ResultSet selectServ(int id) {//EDITAR INFO
        String query = "select * from tbTipoServicio where idNivelServicio=2 and idTipoServicio=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    //Esto nos ayudara a insertar un nuevo tipo de servicio dentro del sistema y base de datos
    public boolean insertServ(int idNs, String serv, float costo) {
        String query = "insert into tbTipoServicio values(?,?,?);";
        try {

            ps = con.prepareStatement(query);

            ps.setInt(1, idNs);
            ps.setString(2, serv);
            ps.setFloat(3, costo);
            ps.executeUpdate();
             Campos obj = new Campos();
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

    //Esto nos ayudara a actualizar algun campo dentro de la tabla tipo de servicio
    public boolean updtServ(int idTipoS, int idNs, String serv, float costo) {
        String query = "update tbTipoServicio set idNivelServicio=?, Nombre=?,costo=? where idTipoServicio=?;";
        try {

            ps = con.prepareStatement(query);
            ps.setInt(1, idNs);
            ps.setString(2, serv);
            ps.setFloat(3, costo);
            ps.setInt(4, idTipoS);
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

    //Esto nos ayudara a eliminar dentro del sistema algun tipo de servicio
    public boolean deleteServ(int idD) {
        String query = "delete tbTipoServicio where idTipoServicio=?";
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

    public ResultSet comboPrior() {//TABLA
        String query = "select * from tbNivelServicio";
        try {

            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    /////// TABLA NIVEL SERVICIO
    //BUSQUEDA PARA CRUD
    public ResultSet loadNServ(String n1) {//TABLA
        String query = "select * from tbNivelServicio where Prioridad like ?";
        try {

            ps = con.prepareStatement(query);
            ps.setString(1, "%" + n1 + "%");
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public boolean upNServ(int id1, String n1) {
        String query = "update tbNivelServicio set Prioridad=? where idNivelServicio=?;";
        try {

            ps = con.prepareStatement(query);
            ps.setString(1, n1);
            ps.setInt(2, id1);
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
}

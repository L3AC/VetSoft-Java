package AModelo;

import Mensajes.Campos;
import Mensajes.CódigoDeErrorDLI2;
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

public class mdPreguntas {

    Connection con = Conx.Conectar();
    Crypt cripto = new Crypt();
    PreparedStatement ps;
    ResultSet rs;

    //Esto nos ayudara a encontrar las respuestas por el usuario para la recup por preguntas de seguridad
    public ResultSet loadResp(int idUs, int idPreg) {
        String query = "select * from tbPreguntasUsuarios where idUsuario=? and idPregunta=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            ps.setInt(2, idPreg);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            CódigoDeErrorDLI2 obj = new CódigoDeErrorDLI2();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
            return null;
        }
    }

    //Esto nos ayudara a verificar la existencia de las preguntas contestadas por el usuario
    public ResultSet verifExist(int idUs, int idPreg) {
        String query = "select * from tbPreguntasUsuarios where idUsuario=? and idPregunta=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            ps.setInt(2, idPreg);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            CódigoDeErrorDLI2 obj = new CódigoDeErrorDLI2();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
            return null;
        }
    }

    //Esto nos ayudara a insertar en la base de datos las respuestas a las preguntas del usuario anteriormente contestadas
    public boolean insertResp(int idPreg, int idUs, String resp) {
        String query = "insert into tbPreguntasUsuarios values(?,?,?);";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idPreg);
            ps.setString(2, resp);
            ps.setInt(3, idUs);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            CódigoDeErrorDLI2 obj = new CódigoDeErrorDLI2();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
            return false; //DIO ERROR
        }
    }

    //Esto nos ayudara a actualizar las respuesta a las preguntas del usuario dentro del sistema
    public boolean updateResp(int idP, int idUs, String resp) {
        String query = "update tbPreguntasUsuarios set respuesta=? "
                + "where idUsuario=? and idPregunta=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, resp);
            ps.setInt(2, idUs);
            ps.setInt(3, idP);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            CódigoDeErrorDLI2 obj = new CódigoDeErrorDLI2();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
            return false; //DIO ERROR
        }
    }

    //TABLA PREGUNTAS
    public ResultSet loadNPreg(String n1) {
        String query = "select * from tbPreguntas where enunciado like ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + n1 + "%");
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }

    public boolean upNPreg(int idP, String n1) {
        String query = "update tbPreguntas set enunciado=? where idPregunta=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, n1);
            ps.setInt(2, idP);
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
            CódigoDeErrorDLI2 obj = new CódigoDeErrorDLI2();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
            return false; //DIO ERROR
        }
    }
}

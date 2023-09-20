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

public class mdExam {

    Connection con = Conx.Conectar();
    PreparedStatement ps;
    ResultSet rs;

    //Esto nos ayuda a cargar los datos de examen
    public ResultSet loadExam(int id1, String n1) {
        String query = "select idExamenClinico,ts.Nombre as Nombre,Nota from tbExamenesClinicos ec,tbTipoServicio ts \n"
                + "where ec.idTipoServicio=ts.idTipoServicio and ts.Nombre like ? and idAnimal=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + n1 + "%");
            ps.setInt(2, id1);
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

    //Esto nos ayuda a agarrar el id del examen
    public ResultSet selectExam(int id1) {
        String query = "select idExamenClinico,ec.idTipoServicio as idServ,imagen,ts.Nombre as Serv,Nota from tbExamenesClinicos ec,tbTipoServicio ts \n"
                + "  where ec.idTipoServicio=ts.idTipoServicio and idExamenClinico=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id1);
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

//Esto nos ayuda a insertar cosas en la tabla
    public boolean insExam(int id1, int id2, byte[] img, String n1) {
        String query = "insert tbExamenesClinicos values(?,?,?,?,GETDATE());";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id1);
            ps.setInt(2, id2);
            ps.setBytes(3, img);
            ps.setString(4, n1);
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

    //Esto nos ayuda a eliminar 
    public boolean delExam(int id1) {
        String query = "delete tbExamenesClinicos where idExamenClinico=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id1);
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
            CódigoDeErrorDLI2 obj = new CódigoDeErrorDLI2();
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
            return false;
        }
    }

    //Esto nos ayuda a actualizar
    public boolean upExam(int id1, byte[] img, String n1, int id2) {
        String query = "UPDATE tbExamenesClinicos set idTipoServicio=?, "
                + "imagen=?,Nota=? where idExamenClinico=?;";
        try {
            ps.setInt(1, id1);
            ps.setBytes(2, img);
            ps.setString(3, n1);
            ps.setInt(4, id2);
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

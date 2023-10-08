package AModelo;
import Mensajes.Campos;
import Mensajes.CódigoDeErrorDLI2;
import Mensajes.CódigoErrorDAM1;
import Mensajes.CódigoErrorDSI3;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
public class mdDoctores {
    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    //Esto nos ayudara a cargar la especialidad del doctor dentro del sistema
    public ResultSet loadData(int idC) {//EDITAR
        String query = "select * from tbDoctores d, tbEspecialidades e"
                + " where idDoctor=? AND d.idEspecialidad=e.idEspecialidad;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idC);
            rs = ps.executeQuery();
            return rs;
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
            return null; //DIO ERROR
        }
    }
    public ResultSet selectDoc(int idD) {//EDITAR
        String query = "select CONCAT(nombre,' ',Apellido) "
                + "as doc from tbDoctores where idDoctor=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idD);
            rs = ps.executeQuery();
            return rs;
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
            return null; //DIO ERROR
        }
    }
    //Esto nos ayudara a cargar toda la información del doctor dentro del sistema
    public ResultSet cargarDoc(String nombre) {//TABLA
        String query = "select idDoctor,especialidad,CONCAT(d.nombre,' ',d.apellido) as 'Nombre' from  " +
        " tbDoctores d, tbEspecialidades e where d.idEspecialidad=e.idEspecialidad "
                + "and CONCAT(d.nombre,' ',d.apellido) like ? ;";
        try {
            
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + nombre + "%");
            rs = ps.executeQuery();
            return rs;
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
            return null; //DIO ERROR
        }
    }
    
    public ResultSet comboDoc(int id) {//TABLA
        String query = "select idDoctor, CONCAT(nombre,' ',Apellido) "
                + "as nombre from tbDoctores where idEspecialidad=?;";
        try {
            
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            return rs;
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
            return null; //DIO ERROR
        }
    }
    
    //Esto nos ayudara a insertar a un nuevo doctor dentro del sistema
    public boolean insertDoc(int idUs,int idEsp, String nombre, String apellido,
            String dui, String naci, String sexo) {
        String query = "insert into tbDoctores values(?,?,?,?,?,?,?,GETDATE());";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            ps.setInt(2, idEsp);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setString(5, dui);
            ps.setString(6, naci);
            ps.setString(7, sexo);
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
    
    //Esto nos ayudara a poder actualizar algun campo dentro del sistema del doctor por ejemplo la especialidad del doctor
    public boolean updateDoc(int idC,int idEsp, String nombre, String apellido, String dui,
            String naci, String sexo) {
        String query = "update tbDoctores SET nombre=?,apellido=?,DUI=?,nacimiento=?,sexo=?, idEspecialidad=? \n" +
        "where idDoctor=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, dui);
            ps.setString(4, naci);
            ps.setString(5, sexo);
            ps.setInt(6, idEsp);
            ps.setInt(7, idC);
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
    
    //Esto nos ayudara a borrar el registro de algun doctor dentro del sistema
    public boolean deleteDoc(int idD) {
        String query = "DELETE tbDoctores where idDoctor=?;";
        try {
            System.out.print("IDOCTOR"+idD);
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
}

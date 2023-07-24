package AModelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class mdCitas {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    public ResultSet citaOther(String cliente) {
        String query = "SET LANGUAGE Spanish\n"
                + "select idCita, c.idAnimal,Estado,CONCAT(CONVERT(varchar, fecha, 100),' ',CONVERT(varchar, hora, 100)) as 'Fecha',a.Nombre as 'Mascota',CONCAT(cl.Nombre,' ',cl.Apellido) as 'Dueño',CONCAT(d.Nombre,' ',d.Apellido) as 'Doctor'\n"
                + "from tbCitas c, tbAnimales a,tbDoctores d,tbClientes cl where c.idAnimal=a.idAnimal and c.idDoctor=d.idDoctor and cl.idCliente=a.idCliente and Estado='Aceptada' and CONCAT(cl.Nombre,' ',cl.Apellido) like ?\n"
                + "or cl.idCliente=a.idCliente and c.idAnimal=a.idAnimal and c.idDoctor=d.idDoctor and Estado='Pendiente' and CONCAT(cl.Nombre,' ',cl.Apellido) like ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + cliente + "%");
            ps.setString(2, "%" + cliente + "%");
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public ResultSet citaDoc(int idDoc, String cliente) {
        String query = "SET LANGUAGE Spanish\n"
                + "select idCita, c.idAnimal,Estado,CONCAT(CONVERT(varchar, fecha, 100),' ',CONVERT(varchar, hora, 100)) as 'Fecha',a.Nombre as 'Mascota',CONCAT(cl.Nombre,' ',cl.Apellido) as 'Dueño',CONCAT(d.Nombre,' ',d.Apellido) as 'Doctor'\n"
                + "from tbCitas c, tbAnimales a,tbDoctores d,tbClientes cl where c.idAnimal=a.idAnimal and c.idDoctor=d.idDoctor and cl.idCliente=a.idCliente and \n"
                + "Estado='Aceptada' and CONCAT(cl.Nombre,' ',cl.Apellido) like ? and c.idDoctor=? or cl.idCliente=a.idCliente and c.idAnimal=a.idAnimal and c.idDoctor=d.idDoctor and \n"
                + "Estado='Pendiente' and CONCAT(cl.Nombre,' ',cl.Apellido) like ? and c.idDoctor=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + cliente + "%");
            ps.setInt(2, idDoc);
            ps.setString(3, "%" + cliente + "%");
            ps.setInt(4, idDoc);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public ResultSet selectCita(int idC) {
        String query = "SET LANGUAGE spanish\n"
                + "select a.Nombre as 'Animal',tp.Nombre as 'Serv',e.Especialidad,CONCAT(d.Nombre,' ',d.Apellido) as 'Doctor',\n"
                + "notaDelCliente,notaDelDoctor,c.fecha as 'Fecha',CONVERT(VARCHAR,hora, 108) as 'hora' from tbAnimales a,tbCitas c,tbTipoServicio tp,tbDoctores d,tbEspecialidades e\n"
                + "where c.idDoctor=d.idDoctor and c.idTipoServicio=tp.idTipoServicio and a.idAnimal=c.idAnimal and e.idEspecialidad=d.idEspecialidad\n"
                + "and idCita=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idC);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public boolean deleteCita(int idC) {
        String query = "DELETE tbCitas where idCita=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idC);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false;
        }
    }

    public boolean aceptCita(int idC) {
        String query = "update tbCitas set Estado='Aceptada' where idCita=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idC);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cita aceptada");
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false;
        }
    }

    public boolean insertCita(int idAni, int idTS, int idD, String notaCl,
            String notaDoc, String fecha, String hora) {
        String query = "insert into tbCitas values(?,?,?,'Pendiente',?,?,?,?,GETDATE())";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idAni);
            ps.setInt(2, idTS);
            ps.setInt(3, idD);
            ps.setString(4, notaCl);
            ps.setString(5, notaDoc);
            ps.setString(6, fecha);
            ps.setString(7, hora);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Campos ingresados");
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }

    public boolean updateCita(int idCita, int idTS, int idD, String nCl,
            String nDoc, String fecha, String hora) {
        String query = "update tbCitas set idTipoServicio=?,idDoctor=?,"
                + "notaDelCliente=?,notaDelDoctor=?,fecha=?,hora=? where idCita=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idTS);
            ps.setInt(2, idD);
            ps.setString(3, nCl);
            ps.setString(4, nDoc);
            ps.setString(5, fecha);
            ps.setString(6, hora);
            ps.setInt(7, idCita);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Campos actualizados");
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }

    public ResultSet verifDisp(int idD, String fecha, String hora) {
        String query = "select * from tbCitas c where idDoctor=? and fecha=? and hora=? and estado='Pendiente';";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idD);
            ps.setString(2, fecha);
            ps.setString(3, hora);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }

    public ResultSet verifEstate(int idD) {
        String query = "select * from tbCitas c where idCita=? and estado='Pendiente';";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idD);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; //DIO ERROR
        }
    }
}

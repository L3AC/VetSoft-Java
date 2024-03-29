package AModelo;

import Mensajes.Campos;
import Mensajes.CódigoDeErrorDLI2;
import Mensajes.CódigoErrorDSI1;
import Mensajes.CódigoErrorDSI3;
import Mensajes.GlassPanePopup;
import Mensajes.acep;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;

public class mdCitas {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    //Esto nos ayudara a ver la informacion necesario que necesita y que llegara al sistema por ejemplo la secreteraria que podra ver toda la inf de la cita
    public ResultSet citaOther(String cliente) {
        String query = "SET LANGUAGE Spanish\n"
                + "select ts.idNivelServicio as nivelS,idCita, c.idAnimal,Estado,CONCAT(CONVERT(varchar, fecha, 100),' ',CONVERT(varchar, hora, 100)) as 'Fecha',\n"
                + "a.Nombre as 'Mascota',CONCAT(cl.Nombre,' ',cl.Apellido) as 'Dueño',CONCAT(d.Nombre,' ',d.Apellido) as 'Doctor' \n"
                + "from tbCitas c, tbAnimales a,tbDoctores d,tbClientes cl,tbTipoServicio ts,tbNivelServicio ns \n"
                + "where c.idAnimal=a.idAnimal and c.idDoctor=d.idDoctor and cl.idCliente=a.idCliente and c.idTipoServicio=ts.idTipoServicio and ts.idNivelServicio=ns.idNivelServicio\n"
                + "and Estado='Aceptada' and CONCAT(cl.Nombre,' ',cl.Apellido) like ? \n"
                + "or cl.idCliente=a.idCliente and c.idAnimal=a.idAnimal and c.idDoctor=d.idDoctor and c.idTipoServicio=ts.idTipoServicio and ts.idNivelServicio=ns.idNivelServicio\n"
                + "and Estado='Pendiente' and CONCAT(cl.Nombre,' ',cl.Apellido) like ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + cliente + "%");
            ps.setString(2, "%" + cliente + "%");
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

    //Esto ayudara al doctor a ver mas a profundidad la informacion de la cita que esta pidiendo el cliente para su mascota
    public ResultSet citaDoc(int idDoc, String cliente) {
        String query = "SET LANGUAGE Spanish\n"
                + "select ts.idNivelServicio as nivelS,idCita, c.idAnimal,Estado,CONCAT(CONVERT(varchar, fecha, 100),' ',CONVERT(varchar, hora, 100)) as 'Fecha',a.Nombre as 'Mascota',CONCAT(cl.Nombre,' ',cl.Apellido) as 'Dueño',CONCAT(d.Nombre,' ',d.Apellido) as 'Doctor'\n" +
"from tbCitas c, tbAnimales a,tbDoctores d,tbClientes cl,tbTipoServicio ts,tbNivelServicio ns\n" +
"where c.idAnimal=a.idAnimal and c.idDoctor=d.idDoctor and cl.idCliente=a.idCliente and c.idTipoServicio=ts.idTipoServicio and ts.idNivelServicio=ns.idNivelServicio\n" +
"and Estado='Aceptada' and CONCAT(cl.Nombre,' ',cl.Apellido) like ? and c.idDoctor=? or \n" +
"cl.idCliente=a.idCliente and c.idAnimal=a.idAnimal and c.idDoctor=d.idDoctor and c.idTipoServicio=ts.idTipoServicio and ts.idNivelServicio=ns.idNivelServicio\n" +
"and Estado='Pendiente' and CONCAT(cl.Nombre,' ',cl.Apellido) like ? and c.idDoctor=?;";
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

    //Esto ayudara a seleccionar la cita y poder cargarlo en otros campos dentro del sistema
    public ResultSet selectCita(int idC) {
        String query = "SET LANGUAGE spanish\n"
                + "select c.idCita as idCita,a.Nombre as 'Animal',tp.Nombre as 'Serv',e.Especialidad,CONCAT(d.Nombre,' ',d.Apellido) as 'Doctor',\n"
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

    //Esto nos ayudara a borrar una cita dentro del sistema
    public boolean deleteCita(int idC) {
        String query = "DELETE tbCitas where idCita=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idC);
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

    //Esto nos ayudara a aceptar una cita dentro del sistema luego de ver si esta disponible el doctor
    public boolean aceptCita(int idC) {
        String query = "update tbCitas set Estado='Aceptada' where idCita=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idC);
            ps.executeUpdate();
            acep obj = new acep();
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

    //Esto nos ayudara a poder registrar una nueva cita para la mascota por ejemplo si es una cita de rayos x
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

    //Esto nos ayudara a actualizar alguna cita si necesita un cambio por ejemplo la hora de la cita
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
    public boolean stateCita(int idCita,String n1) {
        String query = "update tbCitas set estado=? where idCita=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, n1);
            ps.setInt(2, idCita);
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

    //Esto nos ayudara a verificar la disponibilidad de la cita por ejemplo la fecha o si el doctor esta disponible 
    public ResultSet verifDisp(int idD, String fecha, String hora) {
        String query = "select * from tbCitas c where idDoctor=? and fecha=? and hora=? and estado='Pendiente' or \n" +
"idDoctor=? and fecha=? and hora=? and estado='Aceptada';";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idD);
            ps.setString(2, fecha);
            ps.setString(3, hora);
            ps.setInt(4, idD);
            ps.setString(5, fecha);
            ps.setString(6, hora);
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

    //Esto nos ayudara para verificar si la cita sigue pendiente dentro del sistema
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
}

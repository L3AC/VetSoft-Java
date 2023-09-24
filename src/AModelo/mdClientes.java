package AModelo;

import Mensajes.CódigoDeErrorDLI2;
import Mensajes.CódigoErrorDAM1;
import Mensajes.CódigoErrorDSI1;
import Mensajes.CódigoErrorDSI3;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;

public class mdClientes {

    Connection con = Conx.Conectar();

    ResultSet rs;
    PreparedStatement ps;

    //Esto nos ayudara a cargar la informacion del cliente dentro del sistema
    public ResultSet cargarCl(String nombre) {
        String query = "select idCliente,CONCAT(nombre,' ',apellido) as 'Nombre',DATEDIFF(YEAR, nacimiento, GETDATE()) as 'Edad'\n"
                + ",sexo as Sexo from tbClientes where CONCAT(nombre,' ',apellido) like ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%"+nombre+"%");
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
    public ResultSet cargarD(String nombre, String apellido, int idCliente){
        String query = "SELECT Nombre, Apellido, DUI, Nacimiento, Sexo, Direccion FROM tbClientes WHERE Nombre LIKE ? OR Apellido LIKE ? OR idCliente LIKE ?;";
        try{
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + nombre + "%"); // Configurar el primer parámetro
ps.setString(2, "%" + apellido + "%"); // Configurar el segundo parámetro
   ps.setInt(3, idCliente); // Configurar el tercer parámetro
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e ){
            e.printStackTrace();
              System.out.println(e.toString());
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
    //Aqui se seleccionara el cliente por medio de su Id dentro de la base de datos
        public ResultSet selectCl(int idD) {
        String query = "select * from tbClientes where idCliente=?;";
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

        //Esto nos ayudara a poder borrar algun cliente dentro del sistema y base de datos
    public boolean deleteCl(int idD) {
        String query = "DELETE tbClientes where idCliente=?;";
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

    //Esto nos ayudara a insertar un nuevo cliente dentro del sistema y base de datos
    public boolean insertCl(int idUs, String nombre, String apellido,
            String dui, String naci, String sexo,String direccion) {
        String query = "insert into tbClientes"
                + " values(?,?,?,?,?,?,?,GETDATE());";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUs);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, dui);
            ps.setString(5, naci);
            ps.setString(6, sexo);
            ps.setString(7, direccion);
            ps.executeUpdate();
            CódigoErrorDAM1 obj = new CódigoErrorDAM1();
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

    //Esto nos ayudara a actualizar algun campo dentro de la información del cliente
    public boolean updateCl(int idCl, String nombre, String apellido, String dui, String naci, String sexo,String dir) {
        String query = "update tbClientes SET nombre=?,apellido=?,DUI=?,nacimiento=?,sexo=? \n" +
        ", direccion=? where idCliente=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, dui);
            ps.setString(4, naci);
            ps.setString(5, sexo);
            ps.setString(6, dir);
            ps.setInt(7, idCl);
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
    
    
 public ResultSet mostrarClientes() {
        String query = "SELECT * FROM tbClientes;";
        try {
            ps = con.prepareStatement(query);   
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


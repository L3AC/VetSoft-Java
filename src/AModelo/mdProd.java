/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AModelo;

import Mensajes.CodigodeerrorDLI1;
import Mensajes.GlassPanePopup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class mdProd extends JFrame {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    //Esto nos ayudara a cargar los datos de los productos en el sistema
    public ResultSet tbProd(String n1) {

        String query = "select idProducto,tp.tipo,Nombre,Proveedor,CONVERT(DECIMAL(18, 2),Precio) AS precio"
                + " from tbProductos p,tbTipoProductos tp where p.idTipoProducto=tp.idTipoProducto"
                + " and Nombre like ?";
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

    //Esto nos ayudara a seleccionar los productos dentro del sistema
    public ResultSet selectProd(int id) {

        String query = "select idProducto,tp.tipo,Nombre,Proveedor,ROUND(Precio, 2) AS Precio,img "
                + "from tbProductos p,tbTipoProductos tp "
                + "where p.idTipoProducto=tp.idTipoProducto and idProducto=?";
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

    //Esto nos ayudara a borrar los productos que ya no se encuentre disponibles en fisico dentro del sistema
    public boolean dlProd(int idC) {
        String query = "DELETE tbProductos where idProducto=?;";
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

    //Esto nos ayudara a insertar nuevos productos dentro del sistema
    public boolean insProd(int idTP,String n1,String n2,float price,byte[] img) {
        String query = "insert into tbProductos (idTipoProducto,Nombre,Proveedor,Precio,img,fechaRegistro)\n"
                + "values (?,?,?,?,?,GETDATE())";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idTP);
            ps.setString(2, n1);
            ps.setString(3, n2);
            ps.setFloat(4, price);
            ps.setBytes(5, img);
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

    //Esto nos ayudara a actualizar algun campo del producto
    public boolean upProd(int id,int idTP,String n1,String n2,float price,byte[] img) {
        String query = "update tbProductos set idTipoProducto=?,Nombre=?,Proveedor=?,Precio=?,img=? where idProducto=?";
        try {
            ps = con.prepareStatement(query);
            ps = con.prepareStatement(query);
            ps.setInt(1, idTP);
            ps.setString(2, n1);
            ps.setString(3, n2);
            ps.setFloat(4, price);
            ps.setBytes(5, img);
            ps.setInt(6, id);
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

    //////////////////////TABLA DE TIPO DE PRODUCTOS ///////////////////
    public ResultSet tableTProd(String n1) {

        String query = "select * from tbTipoProductos where tipo like ?";
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
        public ResultSet comboTProd() {
        String query = "select * from tbTipoProductos;";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null;
        }
    }

        //Estp nos ayudara a borrar el tipo de producto 
    public boolean deleteTProd(int idC) {
        String query = "DELETE tbTipoProductos where idTipoProducto=?;";
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

    //Esto nos ayudara a insertar los tipos de productos dentro del sistema
    public boolean insertTProd(String n1) {
        String query = "insert tbTipoProductos values(?,getdate());";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, n1);
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

    //Esto nos ayudara a actualizar el tipo de producto dentro del sistema
    public boolean updtTProd(int id, String n1) {
        String query = "update tbTipoProductos set tipo=? where idTipoProducto=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(2, id);
            ps.setString(1, n1);
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

}

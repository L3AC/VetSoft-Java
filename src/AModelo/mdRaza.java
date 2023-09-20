/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

public class mdRaza {

    Connection con = Conx.Conectar();
    ResultSet rs;
    PreparedStatement ps;

    //Esto nos ayudara a carga el tipo de animal dentro del sistema
    public ResultSet loadTPanimal() {
        String query = "select * from tbTipoAnimales;";
        try {
            ps = con.prepareStatement(query);
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

    //Esto nos ayudara a cargar la raza del animal dentro del sistema
    public ResultSet comboRaza(int idTP) {
        String query = "select idRaza,nombreRaza from tbRazas r, tbTipoAnimales ta where r.idTipoAnimal=ta.idTipoAnimal and r.idTipoAnimal=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idTP);
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
    //Esto nos ayuudara a seleccionar la raza con su nombre, nombre popular, tipo de animal y id

    public ResultSet selectRaza(String nombreRaza) {
        String query = "select r.idRaza,ta.nombrePopular,r.nombreRaza from tbRazas r,tbTipoAnimales ta "
                + "where r.idTipoAnimal=ta.idTipoAnimal and r.nombreRaza like ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + nombreRaza + "%");
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

    //Esto nos ayudara a cargar el nombre de la raza
    public ResultSet loadRaza(String nombreRaza) {
        String query = "select * from tbRazas where nombreRaza like ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + nombreRaza + "%");
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

    //Esto nos ayudara a borrar las especialidades dentro del sistema
    public boolean deleteTPA(int idE) {
        String query = "DELETE tbEspecialidades where idEspecialidades=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idE);
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

    //Esto nos ayudara a ingresar una nueva o nueva especialidades dentro del sistema
    public boolean insertTPA(int idEsp, String Especialidad) {
        String query = "insert into tbEspecialidades(idEspecialidad, Especialidad)"
                + " values(?,?);";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idEsp);
            ps.setString(2, Especialidad);
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

    //Esto nos ayudara a actualizar las especialidades dentro del sistema
    public boolean updateTPA(int idEsp, String Esp) {
        String query = "update tbEspecialidades SET Especialidad=? \n"
                + "where idEspecialidad=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, Esp);
            ps.setInt(2, idEsp);
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

    //Esto nos ayudara a eliminar alguna raza dentro del sistema
    public boolean deleteRaza(int idRaza) {
        String query = "DELETE tbRazas where idRaza=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idRaza);
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

    //Esto nos ayudara a actualizar una raza dentro del sistema
    public boolean updateRaza(int id1, String n1,int id2) {
        String query = "update tbRazas set idTipoAnimal=?,nombreRaza=? where idRaza=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id1);
            ps.setString(2, n1);
            ps.setInt(3, id2);
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

    //Esto nos ayudara a registrar los campos necesarios de razas 
    public boolean insertRaza(int id1, String n1) {
        String query = "insert into tbRazas values(?,?);";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id1);
            ps.setString(2, n1);
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

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AControlador;

import AModelo.mdProd;
import java.sql.ResultSet;

public class ctProd {
    public int idTipoProd;
    public String producto;

    public int getIdTipoProd() {
        return idTipoProd;
    }

    public void setIdTipoProd(int idTipoProd) {
        this.idTipoProd = idTipoProd;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    mdProd md=new mdProd();
    
    /*public ResultSet comboTipoProd() {
        return md.comboServ();
    }

    public ResultSet selectServ() {
        return md.selectServ(idTipoServ);
    }*/

    public ResultSet tableTProd() {
        return md.tableTProd(producto);
    }

    /*public ResultSet comboPrior() {
        return md.comboPrior();
    }*/

   /* public boolean insertServ() {
        return md.insertServ(idNivelServ, Nombre, Costo);
    }

    public boolean updtServ() {
        return md.updtServ(idTipoServ, idNivelServ, Nombre, Costo);
    }

    public boolean deleteServ() {
        return md.deleteServ(idTipoServ);
    } */
}

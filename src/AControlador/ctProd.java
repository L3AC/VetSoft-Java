/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AControlador;

import AModelo.mdProd;
import java.sql.ResultSet;

public class ctProd {

    public int idTipoProd;
    public int idProd;
    public String tipoProd;
    public String producto;
    public byte[] image;
    public float precio;
    public String proveedor;

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

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }
    

    mdProd md = new mdProd();

    public ResultSet tbProd() {
        return md.tbProd(producto);
    }

    public ResultSet selectProd() {
        return md.selectProd(idProd);
    }

    public boolean dlProd() {
        return md.dlProd(idProd);
    }

    public boolean upProd() {
        return md.upProd(idProd,idTipoProd,producto,proveedor,precio,image);
    }

    public boolean insProd() {
        return md.insProd(idTipoProd,producto,proveedor,precio,image);
    }
    
    //////////////////////TABLA DE TIPO DE PRODUCTOS ///////////////////

    public ResultSet tableTProd() {
        return md.tableTProd(tipoProd);
    }
    public ResultSet comboTProd() {
        return md.comboTProd();
    }

    public boolean insertTProd() {
        return md.insertTProd(tipoProd);
    }

    public boolean updtTProd() {
        return md.updtTProd(idTipoProd, tipoProd);
    }

    public boolean deleteTProd() {
        return md.deleteTProd(idTipoProd);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AControlador;

import AModelo.mdEsp;
import java.sql.ResultSet;

public class ctEsp {
    public int idEsp;
    public String esp;

    public int getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(int idEsp) {
        this.idEsp = idEsp;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }
    
    mdEsp md = new mdEsp();
    
    public ResultSet selectEsp(){
        return md.selectEsp();
    }
     public boolean insertEsp() {
        return md.insertEsp(idEsp, esp);
    }

    public boolean updtEsp() {
        return md.updateEsp(idEsp, esp);
    }

    public boolean deleteEsp() {
        return md.deleteEsp(idEsp);
    }
    public ResultSet loadEsp(){
        return md.loadEsp();
    }
}

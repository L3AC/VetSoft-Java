/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipografias;

import java.awt.Font;
import java.io.InputStream;
/**
 *
 * @author godna
 */
public class Fuentes {
    
    private Font font = null;
    public String COM = "Comfortaa-VariableFont_wght.ttf";
    
    // Font.PLAIN = 0 , Font.BOLD = 1, Font.ITALIC = 2, Tamaño = float
    
    public Font fuente (String fontName, int estilo, float tamanio)
    {
        try{
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font. TRUETYPE_FONT, is);
        }catch(Exception ex) {
            //Por si existe un error, se cargara la fuente ARIAL automaticamente
            System.err.println(fontName + "No se cargo la fuente");
            font = new Font ("Arial", font.PLAIN, 14);
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}

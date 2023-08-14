/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AVista.Clientes;

import Design.PanelRound;
import java.awt.Color;
import java.awt.Panel;
//import javafx.embed.swing.JFXPanel;
import javax.swing.JFrame;


public class Clientes {
     
    public static void  main(String[] args){
       
        PanelRound panel = new PanelRound();
        panel.setBackground(Color.RED);
        panel.setBounds(100,300,250,250);
        panel.setRoundBottomLeft(50);
        panel.setRoundBottomRight(50);
        panel.setRoundTopLeft(50);
        panel.setRoundTopRight(50);
        
        
      

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(1320, 810);
        frame.setVisible(true);
        frame.add(panel);
        
     
        
     
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Gerson
 */
public class zzz {
    
     private static boolean darkMode = false;
    private static JPanel[] panels; // Array de JPanels

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dark Mode Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        panels = createPanels(); // Método para crear tus JPanels personalizados
        for (JPanel panel : panels) {
            frame.add(panel);
        }

        JButton toggleButton = new JButton("Toggle Dark Mode");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                darkMode = !darkMode;
                setDarkMode(panels, darkMode);
            }
        });

        frame.add(toggleButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private static JPanel[] createPanels() {
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        // Configuración y componentes de tu primer JPanel personalizado
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        // Configuración y componentes de tu segundo JPanel personalizado
        
        // Agrega más JPanels personalizados si es necesario

        return new JPanel[] {panel1, panel2}; // Retorna el array de JPanels
    }

    private static void setDarkMode(JPanel[] panels, boolean darkMode) {
        if (darkMode) {
            // Configuración de colores para el modo oscuro
            for (JPanel panel : panels) {
                panel.setBackground(Color.DARK_GRAY);
                panel.setForeground(Color.WHITE); // Cambiar el color de fuente si es necesario
            }
        } else {
            // Configuración de colores para el modo claro
            for (JPanel panel : panels) {
                panel.setBackground(Color.WHITE);
                panel.setForeground(Color.BLACK); // Cambiar el color de fuente si es necesario
            }
        }
    }
}

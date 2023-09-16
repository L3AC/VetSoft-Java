/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModoOscuro;
import Design.TextFieldSV;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Gerson
 */
public class Modo {
    private static boolean darkMode = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dark Mode Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton toggleButton = new JButton("Toggle Dark Mode");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                darkMode = !darkMode;
                setDarkMode(frame, darkMode);
            }
        });

        panel.add(toggleButton);
        frame.add(panel);
        frame.setVisible(true);
    }

    private static void setDarkMode(JFrame frame, boolean darkMode) {
        if (darkMode) {
            // Configuración de colores para el modo oscuro
            frame.getContentPane().setBackground(Color.DARK_GRAY);
            UIManager.put("Panel.background", Color.DARK_GRAY);
            UIManager.put("Button.background", Color.GRAY);
            UIManager.put("Button.foreground", Color.WHITE);   
            UIManager.put("ButtonGradient.BackGround", Color.WHITE);
            
        } else {
            // Configuración de colores para el modo claro
            frame.getContentPane().setBackground(Color.WHITE);
            UIManager.put("Panel.background", Color.WHITE);
            UIManager.put("Button.background", Color.LIGHT_GRAY);
            UIManager.put("Button.foreground", Color.BLACK);
        }

        SwingUtilities.updateComponentTreeUI(frame);
    }
}

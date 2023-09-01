/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMenu;

import AVista.PorUsuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javaswingdev.GoogleMaterialDesignIcon;
import SwingScroll.ScrollBar;
import Tipografias.Fuentes;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
/**
 *
 * @author Gerson
 */
public class MenuAdmin extends JPanel{
    
    private int index = -1;
    private final List<MenuSelectEvent> events = new ArrayList<>();
    Fuentes tipoFuente;
    
    public MenuAdmin() {
        initAdmin();
    }

    private void initAdmin() {
        setBackground(Color.black);
        setLayout(new BorderLayout());
        JScrollPane scroll = createScroll();
        panelMenu = createPanelMenu();
        scroll.setViewportView(panelMenu);
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        add(scroll);
        addTitle("HOLA");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DASHBOARD, "Bienvenido"));
        addTitle("Gestión principal");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PERSON, 
                "Gestión administrativa","Usuarios","Clientes",
                "Mascotas","Citas"));
        addTitle("Gestion de personal");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PERSON, 
                "Personal de veterinaria","Recepcionista","Doctores",
                "Asistentes"));
        addTitle("Tienda");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.ADD_ALARM, "Gestión de productos"
                ,"Reservas","Productos"));
        addTitle("Mantenimiento");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.ADD_ALARM, 
                "Mantenimiento","Especialidades","Razas","Tipo Animales","Tipo Servicio"
                ,"Tipo Productos","Tipo Vacunas","Niveles Servicio","Preguntas"));
        addTitle("Cuenta");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PEOPLE,
                "Mi Cuenta","Perfil","Seguridad",
                "Preguntas","Cerrar Sesión"));
    }
    
    private JScrollPane createScroll() {
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new ScrollBar());
        return scroll;
    }

    private JPanel createPanelMenu() {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        menuLayout = new MigLayout("wrap,fillx,inset 0,gapy 0", "[fill]");
        panel.setLayout(menuLayout);

        return panel;
    }

    private JPanel createMenuItem(ModelMenuItem item) {
        MenuItem menuItem = new MenuItem(item, ++index, menuLayout);
        menuItem.addEvent(new MenuSelectEvent() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (!menuItem.isHasSubMenu() || indexSubMenu != 0) {
                    clearSelected();
                    setSelectedIndex(index, indexSubMenu);
                }
            }
        });
        return menuItem;
    }

    private void runEvent(int index, int indexSubMenu) {
        for (MenuSelectEvent event : events) {
            event.menuSelected(index, indexSubMenu);
        }
    }

    //  Public Method
    public void addMenuItem(ModelMenuItem menu) {
        
        tipoFuente = new Fuentes();
        panelMenu.add(createMenuItem(menu), "h 35!");
        setFont(tipoFuente.fuente(tipoFuente.COM, 0, 13));
    }

    public void addTitle(String title) {
        tipoFuente = new Fuentes();
        
        JLabel label = new JLabel(title);//label.getFont().deriveFont(Font.BOLD)
        label.setBorder(new EmptyBorder(15, 20, 5, 5));
        label.setFont(tipoFuente.fuente(tipoFuente.COM, 0, 13));
        label.setForeground(new Color(170, 170, 170));
        panelMenu.add(label);
    }

    public void addSpace(int size) {
        panelMenu.add(new JLabel(), "h " + size + "!");
    }

    public void setSelectedIndex(int index, int indexSubMenu) {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                if (item.getIndex() == index) {
                    item.setSelectedIndex(indexSubMenu);
                    runEvent(index, indexSubMenu);
                    break;
                }
            }
        }
    }

    public void clearSelected() {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                item.clearSelected();
            }
        }
    }

    public void addEvent(MenuSelectEvent event) {
        events.add(event);
    }

    private MigLayout menuLayout;
    private JPanel panelMenu;
    
}

package Design;

import java.awt.*;
import java.awt.Image;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.View;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Desg {
    //DefaultTableModel model;

    public void setImageBtn(JButton elm, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(elm.getWidth(), elm.getHeight(), Image.SCALE_DEFAULT));
        elm.setIcon(icon);
        elm.repaint();
    }

    public void setImageLb(JLabel elm, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(elm.getWidth(), elm.getHeight(), Image.SCALE_DEFAULT));
        elm.setIcon(icon);
        elm.repaint();
    }

    public void ColumnHide(DefaultTableModel md, JTable tb, int nc, int nCol) {
        tb.setModel(md);
        tb.getColumnModel().getColumn(nc).setMaxWidth(0);
        tb.getColumnModel().getColumn(nc).setMinWidth(0);
        tb.getTableHeader().getColumnModel().getColumn(nc).setMaxWidth(0);
        tb.getTableHeader().getColumnModel().getColumn(nc).setMinWidth(0);
        tb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //CENTRAR TEXTO DE LAS CELDAS
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
        for (int i = 0; i < nCol; i++) {
            tb.getColumnModel().getColumn(i).setCellRenderer(Alinear);
        }

    }

    public void ShowPanel(JPanel p, JPanel cont, int w, int h) {
        p.setSize(w, h);
        p.setLocation(0, 0);
        cont.removeAll();
        cont.add(p, BorderLayout.CENTER);
        cont.revalidate();
        cont.repaint();
    }

    public int getMap(Map<Integer, String> map, String value) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return -1; // Valor no encontrado
    }
    public final void visib(java.util.List<Component> components,boolean tf) {
        for (Component component : components) {
            component.setVisible(tf);
        }
    }

}

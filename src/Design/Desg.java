package Design;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

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
        public void ColumnHide(DefaultTableModel md,JTable tb, int nc) {
        tb.setModel(md);
        tb.getColumnModel().getColumn(nc).setMaxWidth(0);
        tb.getColumnModel().getColumn(nc).setMinWidth(0);
        tb.getTableHeader().getColumnModel().getColumn(nc).setMaxWidth(0);
        tb.getTableHeader().getColumnModel().getColumn(nc).setMinWidth(0);

        //CENTRAR TEXTO DE LAS CELDAS
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
        tb.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        tb.getColumnModel().getColumn(2).setCellRenderer(Alinear);
    }
        public void ShowPanel(JPanel p,JPanel cont, int w,int h) {
        p.setSize(w, h);
        p.setLocation(0, 0);
        cont.removeAll();
        cont.add(p, BorderLayout.CENTER);
        cont.revalidate();
        cont.repaint();
    }
}

package Design;

import AModelo.Conx;
import AVista.Productos.updateProd;
import java.awt.*;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.View;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Desg {
    //DefaultTableModel model;

    Connection con = Conx.Conectar();

    public void setImageBtn(JButton elm, String root, int w, int h) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
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

    public final void visib(java.util.List<Component> components, boolean tf) {
        for (Component component : components) {
            component.setVisible(tf);
        }
    }

    public final void enable(java.util.List<Component> components, boolean tf) {
        for (Component component : components) {
            component.setEnabled(tf);
        }
    }


    public boolean areFieldsNotEmpty(java.util.List<TextFieldSV> editTextList) {
        for (TextFieldSV editText : editTextList) {
            String text = editText.getText().toString().trim();
            if (text.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean NotEmpty(java.util.List<PasswordField> editTextList) {
        for (PasswordField editText : editTextList) {
            String text = editText.getText().toString().trim();
            if (text.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public byte[] selectImg(File archivoImagen) throws IOException {
        byte[] bytesImagen = new byte[(int) archivoImagen.length()];
        FileInputStream fis = new FileInputStream(archivoImagen);
        fis.read(bytesImagen);
        fis.close();
        return bytesImagen;
    }

    public void putImg(JLabel lbImg, byte[] bytesImagen) {

        //byte[] bytesImagen = selectImg(file);
        if (bytesImagen != null) {
            try {
                Image image = ImageIO.read(new ByteArrayInputStream(bytesImagen));
                Image scaledImage = image.getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_SMOOTH);
                lbImg.setIcon(new ImageIcon(scaledImage));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void Showfoto(JLabel img, JPanel cont, int w, int h) {
        img.setSize(w, h);
        img.setLocation(0, 0);
        cont.removeAll();
        cont.add(img, BorderLayout.CENTER);
        cont.revalidate();
        cont.repaint();
    }

    public void reportS(String ti, String path, HashMap param) {
        try {

            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(report, param, con);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setTitle(ti);
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException ex) {
            ex.getMessage();
        }
    }

}

package Design;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class setImg {

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
}

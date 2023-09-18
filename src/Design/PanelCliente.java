package Design;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author godna
 */
public class PanelCliente extends JPanel  {
    
    public PanelCliente(){
        
        Color b = new Color(190,233,232);
        setBackground(b);
        setLayout(new  WrapLayout(WrapLayout.LEFT,10,10));
    }
}

package Design;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author godna
 */
public class PanelCliente extends JPanel  {
    
    public PanelCliente(){
        setBackground(Color.WHITE);
        setLayout(new  WrapLayout(WrapLayout.LEFT,10,10));
    }
}

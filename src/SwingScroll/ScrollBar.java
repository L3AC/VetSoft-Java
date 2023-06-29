/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingScroll;
import java.awt.Dimension;
import javax.swing.JScrollBar;
/**
 *
 * @author Gerson
 */
public class ScrollBar extends JScrollBar{
    
        public ScrollBar() {
        setUI(new ScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setOpaque(false);
        setUnitIncrement(20);
    }
}

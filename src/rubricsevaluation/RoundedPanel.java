package rubricsevaluation;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author abdullah
 */
public class RoundedPanel extends JPanel {
    
    private int radius;
    
    RoundedPanel(int radius) {
        super();
        this.radius = radius;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
    }
}

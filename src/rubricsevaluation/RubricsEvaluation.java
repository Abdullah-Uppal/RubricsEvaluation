package rubricsevaluation;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.formdev.flatlaf.*;


/**
 *
 * @author abdullah
 */
public class RubricsEvaluation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());
        new Main().setVisible(true);
    }

}

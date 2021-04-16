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
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());
        Main main = new Main();
    }

}

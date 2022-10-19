package bearinmind;

import java.io.IOException;
import javax.swing.JFrame;

/**
 * Main window for the game.
 */
public class MainWindow extends JFrame {
    public MainWindow() throws IOException {
        setTitle("Bear in Mind");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAutoRequestFocus(true);
    }
}

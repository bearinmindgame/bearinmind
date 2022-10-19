package bearinmind;

import java.io.IOException;
import java.awt.Graphics;
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

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello World!", getWidth() / 2, getHeight() / 2);
    }
}

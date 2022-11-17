package bearinmind;

import java.io.IOException;
import java.awt.Graphics;
import javax.swing.JFrame;

import bearinmind.model.GameModel;

/**
 * Main window for the game.
 */
public class MainWindow extends JFrame {

    private GameModel model;

    public MainWindow() throws IOException {
        initializeComponents();
        model = new GameModel();
    }

    private void initializeComponents() {
        setTitle("Bear in Mind");
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAutoRequestFocus(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int w = getWidth() / model.getMap().width;
        int h = getHeight() / model.getMap().height;
        for (int i = 0; i < model.getMap().height; i++) {
            for (int j = 0; j < model.getMap().width; j++) {
                g.drawImage(model.getMap().terrainAt(j, i).image, j * w, i * h, w, h, this);
            }
        }
    }
}

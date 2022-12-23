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
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAutoRequestFocus(true);
        
        setResizable(false);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int w = model.getMap().width;
        int h = model.getMap().height;
        setSize(w * 40, h * 40);
        
        for (int i = 0; i < model.getMap().height; i++) {
            for (int j = 0; j < model.getMap().width; j++) {
                g.drawImage(model.getMap().terrainAt(j, i).image, j * w, i * h, w, h, this);
            }
        }
        
    }
}

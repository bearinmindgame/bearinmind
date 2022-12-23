package bearinmind;

import java.io.IOException;
import java.awt.Graphics;
import javax.swing.JFrame;

import bearinmind.model.GameModel;
import javax.swing.BoxLayout;

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
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        //setAutoRequestFocus(true);
        //setResizable(false);
    }

    @Override
    public void paint(Graphics g) {
        
        
        super.paint(g);
        int width = model.getMap().width;
        int height = model.getMap().height;
        int scaleWidth = this.getSize().width / model.getMap().width;
        int scaleHeight = this.getSize().height / model.getMap().height;
        
        setSize(width * 40, height * 40);
        
        for (int i = 0; i < model.getMap().height; i++) {
            for (int j = 0; j < model.getMap().width; j++) {
                g.drawImage(model.getMap().terrainAt(j, i).image, j * scaleWidth, i * scaleHeight, scaleWidth, scaleHeight, this);
            }
        }
        
    }
}

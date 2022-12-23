package bearinmind;

import bearinmind.model.Board;
import java.io.IOException;
import java.awt.Graphics;
import javax.swing.JFrame;

import bearinmind.model.GameModel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Main window for the game.
 */
public class MainWindow extends JFrame {

    private GameModel model;
    private Board board;
    private JLabel lifeLabel;

    public MainWindow() throws IOException {
        initializeComponents();
        model = new GameModel();
        
        drawBoard();
    }

    private void initializeComponents() {
        setTitle("Bear in Mind");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }
    
    void drawBoard() throws IOException {
        board = new Board(model);
        lifeLabel = new JLabel();
        
        add("Center", board);
        add("Center", lifeLabel);
        
        int width = model.getMap().width;
        int height = model.getMap().height;
        setSize(width * 40, height * 40);
    }
}

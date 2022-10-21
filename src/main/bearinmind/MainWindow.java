package main.bearinmind;

import java.awt.BorderLayout;
import java.io.IOException;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * Main window for the game.
 */
public class MainWindow extends JFrame {
    
    private Board board = new Board();
    
    public MainWindow() throws IOException {
        setTitle("Bear in Mind");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAutoRequestFocus(true);
        
        setLayout(new BorderLayout());
        add(board, BorderLayout.CENTER);
    }
}

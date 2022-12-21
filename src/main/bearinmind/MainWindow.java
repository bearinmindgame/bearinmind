package bearinmind;

import java.io.IOException;
import java.awt.Graphics;
import javax.swing.JFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import bearinmind.model.GameModel;
import bearinmind.model.Player;

/**
 * Main window for the game.
 */
public class MainWindow extends JFrame implements KeyListener {

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
        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g) {
        int ox = getInsets().left;
        int oy = getInsets().top;
        int w = (getWidth() - ox - getInsets().right) / model.getMap().width;
        int h = (getHeight() - oy - getInsets().bottom) / model.getMap().height;
        for (int i = 0; i < model.getMap().height; i++) {
            for (int j = 0; j < model.getMap().width; j++) {
                g.drawImage(model.getMap().terrainAt(j, i).image, ox + j * w, oy + i * h, w, h, this);
            }
        }
        g.drawImage(Player.image, ox + w * model.getPlayer().getX(), oy + h * model.getPlayer().getY(), w, h, this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            model.getPlayer().moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            model.getPlayer().moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            model.getPlayer().moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            model.getPlayer().moveRight();
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}

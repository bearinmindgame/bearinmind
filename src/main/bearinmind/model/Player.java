package bearinmind.model;

import java.awt.Image;

import javax.imageio.ImageIO;

public class Player extends Entity {

    public static final Image image = image();

    private static Image image() {
        try {
            return ImageIO.read(Player.class.getResourceAsStream("player.png"));
        } catch (Exception e) {
            System.err.println("Player image could not be found!");
            return null;
        }
    }

    private int health;

    public int getHealth() {
        return health;
    }

    public Player(GameModel model) {
        super(model);
        health = 3;
    }

    public void caught() {
        health--;
        if (health == 0) {
            model.gameOver();
        }
    }

    @Override
    public void moveUp() {
        super.moveUp();
        checkBasket();
    }

    @Override
    public void moveDown() {
        super.moveDown();
        checkBasket();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        checkBasket();
    }

    @Override
    public void moveRight() {
        super.moveRight();
        checkBasket();
    }

    public void checkBasket() {
        // TODO iterate through the basket list of GameModel (not yet implemented)
        // if player's position matches with one of the basket's, call
        // GameMOdel.basketFound
    }
}

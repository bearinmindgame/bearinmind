package bearinmind.model;

public class Player extends Entity {
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
        super.moveUp();
        checkBasket();
    }

    @Override
    public void moveLeft() {
        super.moveUp();
        checkBasket();
    }

    @Override
    public void moveRight() {
        super.moveUp();
        checkBasket();
    }

    public void checkBasket() {
        // TODO iterate through the basket list of GameModel (not yet implemented)
        // if player's position matches with one of the basket's, call GameMOdel.basketFound
    }
}

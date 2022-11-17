package bearinmind.model;

public class Enemy extends Entity {

    public Enemy(GameModel model) {
        super(model);
    }

    @Override
    public void moveUp() {
        super.moveUp();
        checkCatch();
    }

    @Override
    public void moveDown() {
        super.moveUp();
        checkCatch();
    }

    @Override
    public void moveLeft() {
        super.moveUp();
        checkCatch();
    }

    @Override
    public void moveRight() {
        super.moveUp();
        checkCatch();
    }

    public void checkCatch() {
        // TODO check catch
    }
}

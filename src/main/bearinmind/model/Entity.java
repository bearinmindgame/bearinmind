package bearinmind.model;

public class Entity {
    protected final GameModel model;
    protected int x;
    protected int y;

    protected Entity(GameModel model) {
        this(model, 0, 0);
    }

    protected Entity(GameModel model, int x, int y) {
        if (model == null) throw new NullPointerException("Model for the entity cannot be null.");
        this.model = model;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // TODO notify view of the movement
    public void moveUp() {
        if (y > 0 && model.getMap().terrainAt(x, y - 1).canStepOn) {
            y--;
        }
    }

    public void moveDown() {
        if (y < model.getMap().height - 1 && model.getMap().terrainAt(x, y + 1).canStepOn) {
            y++;
        }
    }

    public void moveLeft() {
        if (x > 0 && model.getMap().terrainAt(x - 1, y).canStepOn) {
            x--;
        }
    }

    public void moveRight() {
        if (x < model.getMap().width - 1 && model.getMap().terrainAt(x + 1, y).canStepOn) {
            x++;
        }
    }
}

package bearinmind.model;

public class Entity {
    protected final GameModel model;
    protected int x;
    protected int y;

    public Entity(GameModel model) {
        this.model = model;
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

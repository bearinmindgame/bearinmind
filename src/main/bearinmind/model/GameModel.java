package bearinmind.model;

public class GameModel {
    private Player player;
    private Enemy enemy1;
    private Enemy enemy2;
    private int basketNum;
    private Map map;
    // some list of baskets

    public GameModel() {
        map = new Map(10, 10);
        player = new Player(this);
        enemy1 = new Enemy(this);
        enemy2 = new Enemy(this);
    }

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy1() {
        return enemy1;
    }

    public Enemy getEnemy2() {
        return enemy2;
    }

    public Map getMap() {
        return map;
    }

    public void readMap() {
        // TODO connect this with the map reader and map txt files
        // generate baskets based on the map
    }

    public void playerCaught() {
        player.caught();
        // TODO reset level
    }

    public void basketFound(Basket b) {
        basketNum--;
        // TODO remove basket b from list
        if (basketNum == 0) {
            gameWon();
        }
    }

    public void gameOver() {
        // TODO decide what happens when the player runs out of health
    }

    public void gameWon() {
        // TODO decide what happens when the player finds all baskets
    }

    // TODO create movement for the enemys, as that should be automated
}

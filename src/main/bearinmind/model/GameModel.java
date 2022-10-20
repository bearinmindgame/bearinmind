package bearinmind.model;

public class GameModel {
    private static Player player;
    private static Enemy enemy1;
    private static Enemy enemy2;
    private static int basketNum;
    //some list of baskets
    //map representation
    
    public GameModel() {
        player = new Player();
        enemy1 = new Enemy();
        enemy2 = new Enemy();
    }

    public static Player getPlayer() {
        return player;
    }

    public static Enemy getEnemy1() {
        return enemy1;
    }

    public static Enemy getEnemy2() {
        return enemy2;
    }

    public static void readMap(){
        //TODO connect this with the map reader and map txt files
        //generate baskets based on the map
    }
    
    public static void playerCaught(){
        player.caught();
        //TODO reset level
    }

    public static void basketFound(Basket b){
        basketNum--;
        //TODO remove basket b from list
        if(basketNum == 0){
            gameWon();
        }
    }

    public static void gameOver(){
        //TODO decide what happens when the player runs out of health
    }
    
    public static void gameWon(){
        //TODO decide what happens when the player finds all baskets
    }

    //TODO create movement for the enemys, as that should be automated
}

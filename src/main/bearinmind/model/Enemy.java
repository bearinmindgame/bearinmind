package bearinmind.model;

public class Enemy extends Entity {
    @Override
    public void moveUp(){
        super.moveUp();
        checkCatch();
    }

    @Override
    public void moveDown(){
        super.moveUp();
        checkCatch();
    }

    @Override
    public void moveLeft(){
        super.moveUp();
        checkCatch();
    }

    @Override
    public void moveRight(){
        super.moveUp();
        checkCatch();
    }

    public void checkCatch(){
        if(x == GameModel.getPlayer().x && y == GameModel.getPlayer().y){
            GameModel.playerCaught();
        }
    }
}

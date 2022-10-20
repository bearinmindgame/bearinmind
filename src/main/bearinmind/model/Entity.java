package bearinmind.model;

public class Entity {
    protected int x;
    protected int y;

    public int getX() {return x;}
    public int getY() {return y;}

    //TODO check for border of map (depends on the implementation of the map)
    //TODO notify view of the movement
    public void moveUp(){
        y--;
    }

    public void moveDown(){
        y++;
    }

    public void moveLeft(){
        x--;
    }

    public void moveRight(){
        x++;
    }
}

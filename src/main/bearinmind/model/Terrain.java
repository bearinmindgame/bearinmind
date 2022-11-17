package bearinmind.model;

import java.awt.Image;

import javax.imageio.ImageIO;

public enum Terrain {
    GATE(true, "gate.png"),
    GRASS(true, "grass.png"),
    ROAD(true, "road.png"),
    TREE(false, "tree.png"),
    WALL(false, "wall.png"),
    WATER(false, "water.png");

    public final Image image;
    public final boolean canStepOn;

    private Terrain(boolean canStepOn, String imgFileName) {
        this.canStepOn = canStepOn;
        if (imgFileName == null) {
            image = null;
        } else {
            Image img;
            try {
                img = ImageIO.read(getClass().getResourceAsStream(imgFileName));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                img = null;
            }
            image = img;
        }
    }

}

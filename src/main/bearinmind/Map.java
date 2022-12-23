package bearinmind.model;

import java.util.ArrayList;

public class Map {

    public final int width;
    public final int height;

    private Terrain[][] fields;

    public Map(int width, int height, ArrayList<String> mapModel) {
        this.width = width;
        this.height = height;
        fields = new Terrain[width][height];
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                fields[i][j] = Terrain.GRASS;
                switch(mapModel.get(j).charAt(i)) {
                    case '-':
                        fields[i][j] = Terrain.GRASS;
                        break;
                    case '@':
                        fields[i][j] = Terrain.ROAD;
                        break;

                    case '%':
                        fields[i][j] = Terrain.WATER;
                        break;

                    case '#':
                        fields[i][j] = Terrain.WALL;
                        break;

                    case '|':
                        fields[i][j] = Terrain.TREE;
                        break;

                    case '^':
                        fields[i][j] = Terrain.GATE;
                        break;

                    case '=':
                        fields[i][j] = Terrain.GATE;
                        break;
                }
                
            }
        }
    }

    /*public static Map from(String filePath) {
        // TODO create factory method for maps
        return new Map(10, 10);
    }*/

    public Terrain terrainAt(int x, int y) {
        return fields[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
}

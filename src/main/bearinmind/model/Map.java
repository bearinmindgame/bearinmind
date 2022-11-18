package bearinmind.model;

public class Map {

    public final int width;
    public final int height;

    private Terrain[][] fields;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        fields = new Terrain[width][height];
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                fields[i][j] = Terrain.GRASS;
            }
        }
    }

    public static Map from(String filePath) {
        // TODO create factory method for maps
        return new Map(10, 10);
    }

    public Terrain terrainAt(int x, int y) {
        return fields[x][y];
    }
}

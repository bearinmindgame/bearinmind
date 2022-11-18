package bearinmind.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapTest {
    @Test
    @DisplayName("Map creates with grass by default")
    public void testMapCreation() {
        int w = 13, h = 7;
        Map map = new Map(w, h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                assertEquals(Terrain.GRASS, map.terrainAt(i, j));
            }
        }
    }
}

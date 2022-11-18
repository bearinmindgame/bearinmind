package bearinmind.model;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TerrainTest {
    @Test
    @DisplayName("Terrain default values")
    public void testEntityMovement() {
        assertTrue(Terrain.GATE.canStepOn);

        assertTrue(Terrain.GRASS.canStepOn);

        assertTrue(Terrain.ROAD.canStepOn);

        assertFalse(Terrain.TREE.canStepOn);

        assertFalse(Terrain.WALL.canStepOn);

        assertFalse(Terrain.WATER.canStepOn);
    }
}

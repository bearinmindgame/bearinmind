package bearinmind.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EntityTest {

    private GameModel model;

    @BeforeEach
    void init() {
        model = new GameModel();
    }

    @Test
    @DisplayName("Entity moves in the correct direction")
    public void testEntityMovement() {
        Entity entity = new Entity(model);
        assertEquals(0, entity.getX());
        assertEquals(0, entity.getY());
        entity.moveRight();
        assertEquals(1, entity.getX());
        assertEquals(0, entity.getY());
        entity.moveDown();
        assertEquals(1, entity.getX());
        assertEquals(1, entity.getY());
        entity.moveLeft();
        assertEquals(0, entity.getX());
        assertEquals(1, entity.getY());
        entity.moveUp();
        assertEquals(0, entity.getX());
        assertEquals(0, entity.getY());
    }

    @Test
    @DisplayName("Entity does not go out of the map")
    public void testEntityMovementAtEdge() {
        Entity entity = new Entity(model);
        entity.moveUp();
        assertEquals(0, entity.getX());
        assertEquals(0, entity.getY());
        entity.moveLeft();
        assertEquals(0, entity.getX());
        assertEquals(0, entity.getY());

        int x = model.getMap().width - 1;
        int y = model.getMap().height - 1;
        entity = new Entity(model, x, y);

        entity.moveDown();
        assertEquals(x, entity.getX());
        assertEquals(y, entity.getY());
        entity.moveRight();
        assertEquals(x, entity.getX());
        assertEquals(y, entity.getY());
    }
}

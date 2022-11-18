package bearinmind.model;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    private GameModel model;

    @BeforeEach
    void init() {
        model = new GameModel();
        // TODO set map to specific items and test accordingly
    }

    @Test
    @DisplayName("Player creates")
    public void testConstructor() {
        Player player = new Player(model);
        assertNotNull(player);
    }

    @Test
    @DisplayName("Player doesn't create when model is null")
    public void testNullInConstructor() {
        assertThrows(NullPointerException.class, () -> new Player(null));
    }

    @Test
    @DisplayName("Player health reduction")
    public void testHealthReduction(){
        Player player = new Player(model);
        player.caught();
        assertEquals(2, player.getHealth());
        player.caught();
        assertEquals(1, player.getHealth());
        player.caught();
        assertEquals(0, player.getHealth());        
    }
}

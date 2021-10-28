import nl.marisabel.game.setup.LevelSetter;
import nl.marisabel.game.setup.level;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameSetUpTest {
    @Test
    @DisplayName("tries per attempt set by level")
    public void testLevelChoice(){

        LevelSetter gameSetUp = new LevelSetter(level.EASY);
        assertEquals(20, gameSetUp.getLevel());

    }
}

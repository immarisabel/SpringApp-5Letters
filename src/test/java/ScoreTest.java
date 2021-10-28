import nl.marisabel.game.setup.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreTest {

    //GameSetUpDTO game = new GameSetUpDTO(level.EASY);

    @Test
    @DisplayName("multiplier set according to level")
    public void testMultiplier() {
        Multiplier multiplier = new Multiplier(level.EASY);
        assertEquals(10, multiplier.getMultiplier());
    }

    @Test
    @DisplayName("access setup from GameSetUp?")
    public void testTransferFromGameSetUp() {
        GameSetUpDTO game = new GameSetUpDTO(level.EASY);
        LevelSetter level = new LevelSetter(game.getLevel());
        assertEquals(20, level.getLevel());
        Multiplier multiplier = new Multiplier(game.getLevel());
        assertEquals(10, multiplier.getMultiplier());

    }

}

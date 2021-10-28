import nl.marisabel.game.api.PlayerGuess;
import nl.marisabel.game.api.WordsDTO;
import nl.marisabel.game.service.WordCheckImpl;
import nl.marisabel.game.service.WordGenerator;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCheckerTest {

    @Test
    public void checkWord() throws IOException {
        String aGuess = "appss";

        WordGenerator word = new WordGenerator();
        PlayerGuess guess = new PlayerGuess();
        WordCheckImpl wordChecker = new WordCheckImpl();
        WordsDTO gameDTO = new WordsDTO();

        gameDTO.setWord("apple");
        guess.setGuess(aGuess);

        assertEquals("app??", wordChecker.resultWord(gameDTO.getWord(), guess.getGuess()));
    }
}

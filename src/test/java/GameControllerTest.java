import nl.marisabel.api.WordsDTO;
import nl.marisabel.service.WordCheckImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("testing game inputs and outputs")
public class GameControllerTest {

    WordsDTO wordsDTO = new WordsDTO();
    WordCheckImpl wordCheck = new WordCheckImpl();

    @Test
    @DisplayName("word is correctly evaluated from array")
    public void testArrayComparison() {
        assertEquals("app??", wordCheck.resultWord("apple", "appss"));
    }

    @Test
    @DisplayName("Checking for null exception in guessed word")
    public void testGuessNullException() throws ClassNotFoundException {
    wordsDTO.setGuess("appls");
        System.out.println(wordsDTO.getGuess());
        assertNotNull(wordsDTO.getGuess());
    }

    @Test
    @DisplayName("Checking for null exception in result array")
    public void testResultsNullException() throws ClassNotFoundException {
        wordsDTO.setGuess("appls");
        wordsDTO.setWord("apple");
        System.out.println(wordCheck.checkWord(wordsDTO.getWord(), wordsDTO.getGuess()));
        System.out.println(wordCheck.resultWord(wordsDTO.getWord(), wordsDTO.getGuess()));
        wordsDTO.setResult(wordCheck.resultWord(wordsDTO.getWord(), wordsDTO.getGuess()));
        assertNotNull(wordsDTO.getResult());
    }





}

import nl.marisabel.game.api.GameDTO;
import nl.marisabel.game.api.WordsDTO;
import nl.marisabel.game.service.WordGenerator;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WordGeneratorTest {

    @Test
    public void testGeneratorRandomWord() throws IOException {
        WordGenerator word = new WordGenerator();
        GameDTO gameDTO = new GameDTO();
        WordsDTO obj = (WordsDTO) word.selectRandomWord();
        gameDTO.setWordsDTO(obj);
        assertNotNull(gameDTO.getWordsDTO());
        System.out.println(gameDTO.getWordsDTO());
    }



}

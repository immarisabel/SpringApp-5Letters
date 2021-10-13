package nl.marisabel.service;

import nl.marisabel.api.GameDTO;
import nl.marisabel.api.ScoreDTO;
import nl.marisabel.api.WordsDTO;
import nl.marisabel.util.WordGenerator;
import org.springframework.stereotype.Service;
//TODO make a test for tries and attempts
@Service
public class WordCheckImpl implements WordCheckService {
    static ScoreDTO game = new ScoreDTO();
    static WordsDTO wordsDTO = new WordsDTO();
    static WordGenerator newWord = new WordGenerator();
    static int attempt = 0 ;
    static int mode = game.getTries();
    static int life = game.getCredits();
    @Override
    public String checkWord(String word, String guess) {
        while (game.getCredits() >= 1) {

            // as long as attempts are not equal to mode (tries), keep guessing
            for (attempt = 1; attempt <= mode ; attempt++) {

                //word is guessed

                if (guess.equals(word)) {

                } else {
                    game.setTries(mode--);
                    wordsDTO.setResult(resultWord(word, guess));
                    return ("Try again: "+ resultWord(word, guess));
                }
            }
            // display result

            if (guess.equals(word)) {
                return "Correct! it was " + word;

            } else {
                game.setCredits(life--);
                return "Sorry, the word was " + word;
            }
        }
        // game over
        return "Game over";
    }

    @Override
    public String resultWord(String word, String guess) {
        char[] cArray = new char[5];
        for (int i = 0; i < 5; i++) {
            if (guess.toCharArray()[i] == word.toCharArray()[i]) {
                cArray[i] = word.toCharArray()[i];
            } else {
                cArray[i] = '?';
            }
        }
        return String.valueOf(cArray);
    }
}

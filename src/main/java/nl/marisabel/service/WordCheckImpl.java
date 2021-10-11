package nl.marisabel.service;

import nl.marisabel.api.WordsDTO;
import nl.marisabel.util.WordGenerator;
import org.springframework.stereotype.Service;

@Service
public class WordCheckImpl implements WordCheckService {

    static WordGenerator newWord = new WordGenerator();
    static WordsDTO wordsDTO = new WordsDTO();
    static int attempt = 0 ;
    static int mode = 2;
    static int life=3;

    @Override
    public String checkWord(String word, String guess) {
        while (life >= 1) {

            // as long as attempts are not equal to mode (tries), keep guessing
            for (attempt = 1; attempt <= mode ; attempt++) {

                //word is guessed

                if (guess.equals(word)) {

                } else {
                    mode--;
                    wordsDTO.setResult(resultWord(word, guess));
                    return ("Try again: "+ resultWord(word, guess));
                }
            }
            // display result

            if (guess.equals(word)) {
                return "Correct! it was " + word;

            } else {
                life--;
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

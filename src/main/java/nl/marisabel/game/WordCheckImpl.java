package nl.marisabel.game.service;

import org.springframework.stereotype.Service;
//TODO make a test for tries and attempts
@Service
public class WordCheckImpl implements nl.marisabel.game.service.WordCheckService {


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

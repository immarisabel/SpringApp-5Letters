package nl.marisabel.game.api;

import java.util.logging.Logger;

public class WordsDTO {

    Logger LOGGER = Logger.getLogger(WordsDTO.class.getName());

    private String word;
    private String guess;
    private String result;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
        LOGGER.info("New word is set to be guessed.");
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "WordsDTO{" +
                "word='" + word + '\'' +
                ", guess='" + guess + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}

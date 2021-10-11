package nl.marisabel.api;


import nl.marisabel.util.WordGenerator;

public class WordsDTO {


    private String word = WordGenerator.getWord();
    private String guess;
    private String result;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
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

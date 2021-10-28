package nl.marisabel.game.setup;


public class Score {

    // correct letters = 5pt
    // correct word = score*multiplier

    final private int letterScore = 5;
    private Score multiplier;
    private int currentWordScore;
    private int totalScore;

    public Score(level level) {
    }


    // access the letter score
    public int getLetterScore() {
        return letterScore;
    }

    // multiplier

    public void setMultiplier(Score multiplier) {
        this.multiplier = multiplier;
    }

    public Score getMultiplier() {
        return multiplier;
    }

    // retrieves word score to multiply and then store
    public int getCurrentWordScore() {
        return currentWordScore;
    }

    public void setCurrentWordScore(int currentWordScore) {
        this.currentWordScore = currentWordScore;
    }

    // tracks the total score to be send to database after the end
    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}

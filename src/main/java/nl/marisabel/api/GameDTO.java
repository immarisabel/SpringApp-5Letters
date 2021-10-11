package nl.marisabel.api;

public class GameDTO {

    private int attempts = 0;
    private int tries;
    private int score;
    private int gameRound;
    private int credits;

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGameRound() {
        return gameRound;
    }

    public void setGameRound(int gameRound) {
        this.gameRound = gameRound;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "GameDTO{" +
                "attempts=" + attempts +
                ", tries=" + tries +
                ", score=" + score +
                ", gameRound=" + gameRound +
                ", credits=" + credits +
                '}';
    }
}

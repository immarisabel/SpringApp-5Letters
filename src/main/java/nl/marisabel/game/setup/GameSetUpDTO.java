package nl.marisabel.game.setup;


public class GameSetUpDTO {

    private level level;

    public GameSetUpDTO(level level) {
        this.level = level;
    }

    public level getLevel() {
        return level;
    }

    public void setTries(level level) {
        LevelSetter tries = new LevelSetter(level);
    }

    public void setMultiplier(level level) {
        Multiplier multiplier = new Multiplier(level);
    }
}

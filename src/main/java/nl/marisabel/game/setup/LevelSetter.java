package nl.marisabel.game.setup;


import java.util.logging.Logger;

public class LevelSetter {
    Logger logger = Logger.getLogger(Multiplier.class.getName());

    // determines the amount of attempts per word

    private int level;


    private void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public LevelSetter(level level){
        switch (level){
            case EASY -> setLevel(20);
            case MEDIUM -> setLevel(15);
            case HARD -> setLevel(10);
            case CRAZY -> setLevel(5);
        }
        logger.info(":::::::::: amount of tries are set up ::::::::::");

    }

}

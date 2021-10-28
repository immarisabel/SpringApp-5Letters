package nl.marisabel.game.setup;

import java.util.logging.Logger;

public class Multiplier {

    Logger logger = Logger.getLogger(Multiplier.class.getName());

    // determines how much score you get per word.
    // the default score per letter is always 5

    private int multiplier;


    private void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public Multiplier(level level) {
        switch (level) {
            case EASY -> setMultiplier(10);
            case MEDIUM -> setMultiplier(20);
            case HARD -> setMultiplier(50);
            case CRAZY -> setMultiplier(100);
        }
        logger.info(":::::::::: multiplier is set up ::::::::::");

    }
}

package nl.marisabel.api;

import javax.validation.Valid;

public class GameDTO {

    private WordsDTO wordsDTO;
    private ScoreDTO scoreDTO;


    public WordsDTO getWordsDTO() {
        return wordsDTO;
    }

    public void setWordsDTO(WordsDTO wordsDTO) {
        this.wordsDTO = wordsDTO;
    }

    public ScoreDTO getScoreDTO() {
        return scoreDTO;
    }

    public void setScoreDTO(ScoreDTO scoreDTO) {
        this.scoreDTO = scoreDTO;
    }
}

package nl.marisabel.game.api;


public class GameDTO {

    private nl.marisabel.game.api.WordsDTO wordsDTO;
    private nl.marisabel.game.api.ScoreDTO scoreDTO;


    public WordsDTO getWordsDTO() {
        return wordsDTO;
    }

    public void setWordsDTO(nl.marisabel.game.api.WordsDTO wordsDTO) {
        this.wordsDTO = wordsDTO;
    }

    public nl.marisabel.game.api.ScoreDTO getScoreDTO() {
        return scoreDTO;
    }

    public void setScoreDTO(ScoreDTO scoreDTO) {
        this.scoreDTO = scoreDTO;
    }


}

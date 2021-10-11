package nl.marisabel.controller;

import nl.marisabel.api.GameDTO;
import nl.marisabel.api.WordsDTO;
import nl.marisabel.service.WordCheckService;
import nl.marisabel.validator.WordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LingoAppController {

    @Autowired
    private WordCheckService wordCheck;
//TODO find hwo to use multiple DTO's as in the course
    @RequestMapping("/guess")
    public String showHomepage(Model model, WordsDTO wordsDTO, GameDTO game) {
        model.addAttribute("words", wordsDTO);
        model.addAttribute("game", game);
        System.out.println("result from guess mapping: " + wordsDTO.getResult());
        // null : expected because it is not processed yet
        return "guesspage";
    }

    @RequestMapping("/process-guess")
    public String showResultPage(Model model, @Valid WordsDTO wordsDTO, GameDTO game, BindingResult result) {


        model.addAttribute("game", game);
        model.addAttribute("words", wordsDTO);
        model.addAttribute(BindingResult.MODEL_KEY_PREFIX + "words", result);

        if (result.hasErrors()) {

            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError temp : allErrors) {
                System.out.println(temp);
            }
            return "guesspage";

        }
        String wordResult = wordCheck.resultWord(wordsDTO.getWord(), wordsDTO.getGuess());
        String finalResult = wordCheck.checkWord(wordsDTO.getWord(), wordsDTO.getGuess());

        wordsDTO.setResult(finalResult);
        System.out.println("result from result mapping : " + wordsDTO.getResult() + "\n Final: " + finalResult);

        return "wordresult";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(new WordValidator());

        //TODO this does not work! Duh! Find a different way.
//        GameDTO game = new GameDTO();
//        game.setCredits(3);
//        game.setTries(3);
    }

}
package nl.marisabel.game.controller;


import nl.marisabel.game.WordValidator;
import nl.marisabel.game.api.GameDTO;
import nl.marisabel.game.api.WordsDTO;
import nl.marisabel.game.service.WordCheckService;
import nl.marisabel.game.service.WordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.io.IOException;

@Controller
@ControllerAdvice
@SessionAttributes("game")
public class LingoAppController {

    @Autowired
    private WordCheckService wordCheck;
    @Autowired
    private WordValidator wordValidator;
    @Autowired
    private WordGenerator wordGenerator;

    @ModelAttribute("game")
    public GameDTO getGameDTO() {
        return new GameDTO();
    }

    @RequestMapping("/guess")
    public String showHomepage(@ModelAttribute("game") GameDTO gameDTO) throws IOException {
        gameDTO.setWordsDTO((WordsDTO) wordGenerator.selectRandomWord());
        System.out.println(gameDTO.getWordsDTO());
        return "guesspage";
    }

    @RequestMapping("/process-guess")
    public String showResultPage(@ModelAttribute("game") GameDTO gameDTO) {

        String wordResult = wordCheck.resultWord(gameDTO.getWordsDTO().getWord(), gameDTO.getWordsDTO().getGuess());

        gameDTO.getWordsDTO().setResult(wordResult);
        System.out.println("result from result mapping : " + gameDTO.getWordsDTO().getResult() + "\n Final: " + wordResult);

        return "wordresult";
    }


    //model.addAttribute(BindingResult.MODEL_KEY_PREFIX + "words", result);

//        if (result.hasErrors()) {
//
//            List<ObjectError> allErrors = result.getAllErrors();
//            for (ObjectError temp : allErrors) {
//                System.out.println(temp);
//            }
//            return "guesspage";
//
//        }


//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.addValidators(new WordValidator());
//
//
//    }

}
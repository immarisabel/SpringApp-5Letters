package nl.marisabel.controller;

import nl.marisabel.api.GameDTO;
import nl.marisabel.api.ScoreDTO;
import nl.marisabel.api.WordsDTO;
import nl.marisabel.service.WordCheckService;
import nl.marisabel.validator.WordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@ControllerAdvice
@SessionAttributes("game")
public class LingoAppController {

    @Autowired
    private WordCheckService wordCheck;
    @Autowired
    private WordValidator wordValidator;

    @ModelAttribute("game")
    public GameDTO getGameDTO() {
        return new GameDTO();
    }

    @RequestMapping("/guess")
    public String showHomepage(@ModelAttribute("game") GameDTO gameDTO) {

        return "guesspage";
    }

    @RequestMapping("/process-guess")
    public String showResultPage(@ModelAttribute("game") GameDTO gameDTO) {


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
        String wordResult = wordCheck.resultWord(gameDTO.getWordsDTO().getWord(), gameDTO.getWordsDTO().getGuess());
        String finalResult = wordCheck.checkWord(gameDTO.getWordsDTO().getWord(), gameDTO.getWordsDTO().getGuess());

        gameDTO.getWordsDTO().setResult(finalResult);
        System.out.println("result from result mapping : " + gameDTO.getWordsDTO().getResult() + "\n Final: " + finalResult);

        return "wordresult";
    }

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.addValidators(new WordValidator());
//
//
//    }



}
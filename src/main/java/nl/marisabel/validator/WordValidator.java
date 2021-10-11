package nl.marisabel.validator;

import nl.marisabel.api.WordsDTO;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class WordValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return WordsDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
// TODO find a way to make the lenght error only show when there is something typed. And empty only when empty.
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "guess", "guess.empty", "Please type a word.");

        String guess = ((WordsDTO)object).getGuess();
        if(guess.length() != 5){
            errors.rejectValue("guess", "guess.invalidLength", "The word must have 5 characters.");
        }


    }
}

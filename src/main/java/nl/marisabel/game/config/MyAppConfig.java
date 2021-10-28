package nl.marisabel.game.config;


import nl.marisabel.game.WordValidator;
import nl.marisabel.game.service.WordCheckImpl;
import nl.marisabel.game.service.WordGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "nl.marisabel.game.controller")
public class MyAppConfig {

    // set up view resolver
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    @ModelAttribute("words")
    public WordCheckImpl wordCheck(){
        WordCheckImpl wordCheck = new WordCheckImpl();
        return wordCheck;
    }

    @Bean
    public WordValidator wordValidator(){
        WordValidator wordValidator = new WordValidator();
        return wordValidator;
    }

    @Bean
    public WordGenerator wordGenerator(){
        WordGenerator wordGenerator = new WordGenerator();
        return wordGenerator;
    }



}

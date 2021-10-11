package nl.marisabel.config;

import nl.marisabel.api.GameDTO;
import nl.marisabel.service.WordCheckImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "nl.marisabel.controller")
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


}

package nl.marisabel.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@RestController
@SessionAttributes("name")
public class TestController {

    @RequestMapping("/first")
    public String test1(Model model, SessionStatus status) {
        // status is able to control when I keep data

        model.addAttribute("name", "mari");

        // remove the session attributes from session scope

        status.setComplete();
        // second page is then NULL

        return "test";
    }

    @RequestMapping("/second")
    public String test2(Model model2) {
        System.out.println(model2.getAttribute("name"));
        return "test";
    }

}

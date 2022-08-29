package hellow.hellowspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") //dom의 첫번째
    public String home(){
        return "home";

    }
}

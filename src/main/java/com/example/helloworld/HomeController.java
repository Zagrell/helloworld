package com.example.helloworld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        System.out.println("changes 2 electric boogaloo");
        return "index";
    }

}

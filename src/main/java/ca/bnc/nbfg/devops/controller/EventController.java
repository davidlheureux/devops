package ca.bnc.nbfg.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World";
    }
}

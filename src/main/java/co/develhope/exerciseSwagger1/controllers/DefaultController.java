package co.develhope.exerciseSwagger1.controllers;

/**
 * @uthor Tania Ielpo
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class DefaultController {

    @GetMapping("")
    public String sayHelloWithPath(){
        return "Welcome Here";
    }
}

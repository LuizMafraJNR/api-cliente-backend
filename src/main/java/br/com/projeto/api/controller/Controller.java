package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*Para Controller de rest */
@RestController
public class Controller {
    @GetMapping("/")
    public String teste(){
        return "Hello World!";
    }
}

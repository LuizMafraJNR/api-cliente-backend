package br.com.projeto.api.controller;

import br.com.projeto.api.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*Para Controller de rest */
@RestController
public class Controller {

    /*Serve para instanciar o nosso repositorio para reaalizar alguma ação dentro do BDA.
    * Porem ele é gerenciado pelo Spring e então ele só instancia quando necessario. */
    @Autowired
    private Repositorio acao;
    @GetMapping("/")
    public String teste(){
        return "Hello World!";
    }
}

package br.com.projeto.api.controller;

import br.com.projeto.api.model.Cliente;
import br.com.projeto.api.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*Para Controller de rest */
@RestController
public class Controller {

    /*Serve para instanciar o nosso repositorio para reaalizar alguma ação dentro do BDA.
    * Porem ele é gerenciado pelo Spring e então ele só instancia quando necessario. */
    @Autowired
    private Repositorio acao;

    @PostMapping("/cadastrar")
    /*RequestBody significa que eu preciso de um body do tipo cliente.*/
    public Cliente cadastrar(@RequestBody Cliente c){
        return acao.save(c);
    }

    /*Listar lista de cliente*/
    @GetMapping("/")
    public Iterable<Cliente> selecionar(){
        return acao.findAll();
    }


}

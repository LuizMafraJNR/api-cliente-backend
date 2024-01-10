package br.com.projeto.api.controller;

import br.com.projeto.api.model.Cliente;
import br.com.projeto.api.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*Para Controller de rest */
@RestController
/*Quando o front tentar acessar da erro cross origin. CORS
* em origins deixar apenas a porta que pode acessar a solicitação.*/
@CrossOrigin(origins = "*")
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

    /*Editar cliente recebendo o cliente completo.*/
    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente c){
        return acao.save(c);

    }

    /*Remover cliente*/
    @DeleteMapping("/deletar/{id}")
    public void remover(@PathVariable long id){
        acao.deleteById(id);
    }

}

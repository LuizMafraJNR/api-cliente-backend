package br.com.projeto.api.repository;

import br.com.projeto.api.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends CrudRepository<Cliente, Long> {
}

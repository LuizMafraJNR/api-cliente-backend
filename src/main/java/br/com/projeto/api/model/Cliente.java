package br.com.projeto.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int idade;
    private String cidade;
}

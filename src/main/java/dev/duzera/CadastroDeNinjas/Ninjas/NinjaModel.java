package dev.duzera.CadastroDeNinjas.Ninjas;


import dev.duzera.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity transforma uma class em uma entidade do DB
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor // Para construtores sem argumentos
@AllArgsConstructor // Para construtores com argumentos
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Aqui é a fusao das duas tabelas e com isso cria uma coluna com as duas tabelas, conectamos isso com a chave extrangeira
    private MissoesModel missoes;

}


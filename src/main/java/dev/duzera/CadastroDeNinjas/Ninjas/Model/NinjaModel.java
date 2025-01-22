package dev.duzera.CadastroDeNinjas.Ninjas.Model;


import dev.duzera.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

// Entity transforma uma class em uma entidade do DB
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor // Para construtores sem argumentos
@AllArgsConstructor // Para construtores com argumentos
@Data // Cria get e setrs
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "img_url")
    private String imgUrl;

    // @ManyToOne um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Aqui é a fusao das duas tabelas e com isso cria uma coluna com as duas tabelas, conectamos isso com a chave extrangeira
    private MissoesModel missoes;

}


package dev.duzera.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.duzera.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    // @OneToMany uma missão pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    @JsonIgnore // Para evitrar o loop de serializacao
    private List<NinjaModel> ninja;

    // aula de arquitetura
}

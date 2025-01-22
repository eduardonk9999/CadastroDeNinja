package dev.duzera.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;


//AQUI É O EXEMPLO DO ORM SENDO USADO COM O JPA
// METODOS NO BANCO DE ADOS NOS CHAMAMOS DE QUERYS
// ORM TRADUZ O QUE TÁ NA NOSSA CLASS PARA O BANCO DE DADOS
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}

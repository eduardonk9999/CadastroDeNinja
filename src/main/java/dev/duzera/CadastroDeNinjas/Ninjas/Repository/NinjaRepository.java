package dev.duzera.CadastroDeNinjas.Ninjas.Repository;

import dev.duzera.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}

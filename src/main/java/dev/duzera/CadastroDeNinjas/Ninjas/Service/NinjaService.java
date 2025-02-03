package dev.duzera.CadastroDeNinjas.Ninjas.Service;

import dev.duzera.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import dev.duzera.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {


    //@Autowired // Nesse contexto, seria o mesmo que escrever um construtor.
    private NinjaRepository ninjaRepository;

    // Porem uma boa pratica é escrever o construtor.
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas() {
        // Isso são querys, para podermos usar em nossos logicas
        return ninjaRepository.findAll();
    }

}

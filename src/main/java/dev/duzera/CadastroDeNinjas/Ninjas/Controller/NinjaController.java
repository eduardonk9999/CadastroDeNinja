package dev.duzera.CadastroDeNinjas.Ninjas.Controller;

// Controller

import dev.duzera.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import dev.duzera.CadastroDeNinjas.Ninjas.Service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    private NinjaService ninjaService;

    // Injetando dependencia do service, para poder acessar os metodos
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adc Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mosrar todos os ninjas (READ)
    @GetMapping("/todos")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID (CREATE)
    @GetMapping("/todos/{id}")
    // O @PathVariable pega esse id que estamos passando no @GetMapping
    public NinjaModel mostrarTodosOsNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar Ninja pro ID";
    }

    // teste
    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarId")
    public String deletarNinjaPorId() {
        return "Ninja deletado por ID";
    }
}
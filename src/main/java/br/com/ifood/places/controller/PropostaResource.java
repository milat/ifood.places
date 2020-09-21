package br.com.ifood.places.controller;

import br.com.ifood.places.model.Proposta;
import br.com.ifood.places.repository.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("proposta")
public class PropostaResource {

    @Autowired
    private PropostaRepository propostaRepository;

    @GetMapping("/restaurante/{restaurante}")
    public List<Proposta> listar(@PathVariable Long restaurante) {
        return propostaRepository.findAllByRestaurante(restaurante);
    }

    @GetMapping("/usuario/{usuario}")
    public List<Proposta> listarUsuario(@PathVariable Long usuario) {
        return propostaRepository.findAllByUsuario(usuario);
    }

    @GetMapping("{id}")
    public Proposta buscar(@PathVariable Long id) {
        return propostaRepository.findById(id).get();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Long id) { propostaRepository.deleteById(id); }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Proposta cadastrar(@RequestBody Proposta proposta) {
        return propostaRepository.save(proposta);
    }

    @PutMapping
    public Proposta atualizar(@RequestParam("id") Long id, @RequestParam("status") String status) {
        var proposta = propostaRepository.findById(id).get();
        proposta.setStatus(status);
        return propostaRepository.save(proposta);
    }
}

package br.com.ifood.places.controller;

import br.com.ifood.places.domain.Proposta;
import br.com.ifood.places.service.PropostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("proposta")
public class PropostaController {

    @Autowired
    private PropostaService propostaService;

    @GetMapping("/restaurante/{restaurante}")
    public List<Proposta> listar(@PathVariable Long restaurante) {
        return propostaService.findAllByRestaurante(restaurante);
    }

    @GetMapping("/usuario/{usuario}")
    public List<Proposta> listarUsuario(@PathVariable Long usuario) {
        return propostaService.findAllByUsuario(usuario);
    }

    @GetMapping("{id}")
    public Proposta buscar(@PathVariable Long id) {
        return propostaService.findById(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Long id) { propostaService.deleteById(id); }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Proposta cadastrar(@RequestBody Proposta proposta) {
        return propostaService.save(proposta);
    }

    @PutMapping
    public Proposta atualizar(@RequestParam("id") Long id, @RequestParam("status") String status) {
        return propostaService.update(id, status);
    }
}

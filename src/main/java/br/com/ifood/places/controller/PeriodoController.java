package br.com.ifood.places.controller;

import br.com.ifood.places.model.Periodo;
import br.com.ifood.places.repository.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("periodo")
public class PeriodoController {

    @Autowired
    private PeriodoRepository periodoRepository;

    @GetMapping("/restaurante/{restaurante}")
    public List<Periodo> listar(@PathVariable Long restaurante) {
        return periodoRepository.findAllByRestaurante(restaurante);
    }

    @GetMapping("{id}")
    public Periodo buscar(@PathVariable Long id) {
        return periodoRepository.findById(id).get();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Long id) { periodoRepository.deleteById(id); }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Periodo cadastrar(@RequestBody Periodo periodo) {
        return periodoRepository.save(periodo);
    }
}

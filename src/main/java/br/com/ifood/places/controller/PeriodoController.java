package br.com.ifood.places.controller;

import br.com.ifood.places.domain.Periodo;
import br.com.ifood.places.service.PeriodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("periodo")
public class PeriodoController {

    @Autowired
    private PeriodoService periodoService;

    @GetMapping("/restaurante/{restaurante}")
    public List<Periodo> listar(@PathVariable Long restaurante) {
        return periodoService.findAllByRestaurante(restaurante);
    }

    @GetMapping("{id}")
    public Periodo buscar(@PathVariable Long id) {
        return periodoService.findById(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Long id) { periodoService.deleteById(id); }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Periodo cadastrar(@RequestBody Periodo periodo) {
        return periodoService.save(periodo);
    }
}

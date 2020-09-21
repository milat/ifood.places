package br.com.ifood.places.controller;

import br.com.ifood.places.domain.Restaurante;
import br.com.ifood.places.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @GetMapping("/usuario/{usuario}")
    public List<Restaurante> listar(@PathVariable Long usuario) {
        return restauranteService.findAllByUsuario(usuario);
    }

    @GetMapping("{id}")
    public Restaurante buscar(@PathVariable Long id) {
        return restauranteService.findById(id);
    }
}

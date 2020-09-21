package br.com.ifood.places.controller;

import br.com.ifood.places.model.Restaurante;
import br.com.ifood.places.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("restaurante")
public class RestauranteResource {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @GetMapping("/usuario/{usuario}")
    public List<Restaurante> listar(@PathVariable Long usuario) {
        return restauranteRepository.findAllByUsuario(usuario);
    }

    @GetMapping("{id}")
    public Restaurante buscar(@PathVariable Long id) {
        return restauranteRepository.findById(id).get();
    }
}

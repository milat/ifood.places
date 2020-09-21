package br.com.ifood.places.service;

import br.com.ifood.places.domain.Restaurante;
import br.com.ifood.places.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public List<Restaurante> findAllByUsuario(Long usuario) {
        return restauranteRepository.findAllByUsuario(usuario);
    }

    public Restaurante findById(Long id) {
        return restauranteRepository.findById(id).get();
    }
}

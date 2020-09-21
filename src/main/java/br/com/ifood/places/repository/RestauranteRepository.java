package br.com.ifood.places.repository;

import br.com.ifood.places.domain.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
    List<Restaurante> findAllByUsuario(Long usuario);
}

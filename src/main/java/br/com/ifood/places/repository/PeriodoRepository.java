package br.com.ifood.places.repository;

import br.com.ifood.places.model.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeriodoRepository extends JpaRepository<Periodo, Long> {
    List<Periodo> findAllByRestaurante(Long restaurante);
}

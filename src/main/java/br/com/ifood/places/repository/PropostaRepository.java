package br.com.ifood.places.repository;

import br.com.ifood.places.model.Proposta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropostaRepository extends JpaRepository<Proposta, Long> {
    List<Proposta> findAllByUsuario(Long usuario);
    List<Proposta> findAllByRestaurante(Long restaurante);
}

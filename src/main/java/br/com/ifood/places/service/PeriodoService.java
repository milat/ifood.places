package br.com.ifood.places.service;

import br.com.ifood.places.domain.Periodo;
import br.com.ifood.places.repository.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeriodoService {

    @Autowired
    private PeriodoRepository periodoRepository;

    public List<Periodo> findAllByRestaurante(Long restaurante) {
        return periodoRepository.findAllByRestaurante(restaurante);
    }

    public Periodo findById(Long id) {
        return periodoRepository.findById(id).get();
    }

    public void deleteById(Long id) { periodoRepository.deleteById(id); }

    public Periodo save(Periodo periodo) {
        return periodoRepository.save(periodo);
    }
}

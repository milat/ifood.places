package br.com.ifood.places.service;

import br.com.ifood.places.domain.Proposta;
import br.com.ifood.places.repository.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropostaService {

    @Autowired
    private PropostaRepository propostaRepository;

    public List<Proposta> findAllByRestaurante(Long restaurante) {
        return propostaRepository.findAllByRestaurante(restaurante);
    }

    public List<Proposta> findAllByUsuario(Long usuario) {
        return propostaRepository.findAllByUsuario(usuario);
    }

    public Proposta findById(Long id) {
        return propostaRepository.findById(id).get();
    }

    public void deleteById(Long id) { propostaRepository.deleteById(id); }

    public Proposta save(Proposta proposta) {
        return propostaRepository.save(proposta);
    }

    public Proposta update(Long id, String status) {
        var proposta = propostaRepository.findById(id).get();
        proposta.setStatus(status);
        return propostaRepository.save(proposta);
    }
}

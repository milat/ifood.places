package br.com.ifood.places.service;

import br.com.ifood.places.domain.Usuario;
import br.com.ifood.places.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).get();
    }

    public Usuario findUsuarioByEmail(String email) { return usuarioRepository.findUsuarioByEmail(email); }
}

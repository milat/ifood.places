package br.com.ifood.places.controller;

import br.com.ifood.places.domain.Usuario;
import br.com.ifood.places.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.findAll();
    }

    @GetMapping("{id}")
    public Usuario buscar(@PathVariable Long id) {
        return usuarioService.findById(id);
    }
}

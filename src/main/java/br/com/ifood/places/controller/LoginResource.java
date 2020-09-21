package br.com.ifood.places.controller;

import br.com.ifood.places.model.Usuario;
import br.com.ifood.places.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario logar(@RequestParam("email") String email, @RequestParam("pass") String pass){
        return this.usuarioRepository.findUsuarioByEmail(email);
    }

}

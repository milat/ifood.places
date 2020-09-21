package br.com.ifood.places.controller;

import br.com.ifood.places.domain.Usuario;
import br.com.ifood.places.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario logar(@RequestParam("email") String email, @RequestParam("pass") String pass){
        return this.usuarioService.findUsuarioByEmail(email);
    }

}

package br.com.ifood.places.repository;

import br.com.ifood.places.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findUsuarioByEmail(String email);
}

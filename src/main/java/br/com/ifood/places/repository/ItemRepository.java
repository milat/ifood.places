package br.com.ifood.places.repository;

import br.com.ifood.places.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findAllByRestaurante(Long restaurante);
}

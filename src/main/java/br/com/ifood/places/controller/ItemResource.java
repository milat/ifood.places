package br.com.ifood.places.controller;

import br.com.ifood.places.model.Item;
import br.com.ifood.places.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemResource {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/restaurante/{restaurante}")
    public List<Item> listar(@PathVariable Long restaurante) {
        return itemRepository.findAllByRestaurante(restaurante);
    }

    @GetMapping("{id}")
    public Item buscar(@PathVariable Long id) {
        return itemRepository.findById(id).get();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Long id) { itemRepository.deleteById(id); }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Item cadastrar(@RequestBody Item item) {
        return itemRepository.save(item);
    }
}

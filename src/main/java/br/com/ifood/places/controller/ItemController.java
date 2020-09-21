package br.com.ifood.places.controller;

import br.com.ifood.places.domain.Item;
import br.com.ifood.places.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/restaurante/{restaurante}")
    public List<Item> listar(@PathVariable Long restaurante) {
        return itemService.findAllByRestaurante(restaurante);
    }

    @GetMapping("{id}")
    public Item buscar(@PathVariable Long id) {
        return itemService.findById(id);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Long id) { itemService.deleteById(id); }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Item cadastrar(@RequestBody Item item) {
        return itemService.save(item);
    }
}

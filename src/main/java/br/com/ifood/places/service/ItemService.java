package br.com.ifood.places.service;

import br.com.ifood.places.domain.Item;
import br.com.ifood.places.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> findAllByRestaurante(Long restaurante) {
        return itemRepository.findAllByRestaurante(restaurante);
    }

    public Item findById(Long id) {
        return itemRepository.findById(id).get();
    }

    public void deleteById(Long id) { itemRepository.deleteById(id); }

    public Item save(Item item) {
        return itemRepository.save(item);
    }
}

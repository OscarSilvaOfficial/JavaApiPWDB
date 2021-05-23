package br.com.perfectworlddb.controller;

import br.com.perfectworlddb.DTO.ItemsDTO;
import br.com.perfectworlddb.DTO.AtualizacaoItemsDTO;
import br.com.perfectworlddb.model.Items;
import br.com.perfectworlddb.model.Types;
import br.com.perfectworlddb.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PWDBController {

    @Autowired
    private ItemsRepository itemsRepository;

    @GetMapping("/items")
    public List<Items> getItems() {
        return itemsRepository.findAll();
    }

    @Transactional
    @PostMapping("/items")
    public void createItems(@RequestBody ItemsDTO request) {
        List<String> newItemsDTO = request.getTypes();
        List<Types> types = new ArrayList<Types>();

        for(String itemDTO : newItemsDTO) {
            types.add(new Types(itemDTO));
        }

        Items items = request.toModel(types);
        itemsRepository.save(items);
    }

    @PutMapping("/items/{id}")
    @Transactional
    public ResponseEntity<ItemsDTO> atualizar(@PathVariable Long id,
                                              @RequestBody AtualizacaoItemsDTO form){

        Optional<Items> optional = itemsRepository.findById(id);
        if(optional.isPresent()) {
            Items items = form.atualizar(id, itemsRepository);
            return ResponseEntity.ok(new ItemsDTO(items));
        }
        return ResponseEntity.notFound().build();
    }

    @Transactional
    @DeleteMapping("/items/{id}")
    public String deleteItem(@PathVariable Long id) {
        Optional<Items> optional = itemsRepository.findById(id);
        if(optional.isPresent()) {
            itemsRepository.deleteById(id);
            return "Objeto deletado";
        } else {
            return "Objeto não existe";
        }
    }

}

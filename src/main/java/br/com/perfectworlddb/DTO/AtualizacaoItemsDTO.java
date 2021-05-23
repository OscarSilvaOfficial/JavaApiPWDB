package br.com.perfectworlddb.DTO;

import br.com.perfectworlddb.model.Items;
import br.com.perfectworlddb.model.Types;
import br.com.perfectworlddb.repository.ItemsRepository;

import java.util.ArrayList;
import java.util.List;

public class AtualizacaoItemsDTO {

    private String name;
    private Integer level;
    private List<String> types;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Items atualizar(Long id, ItemsRepository itemsRepository) {
        Items items = itemsRepository.getOne(id);
        List<Types> types = new ArrayList<Types>();

        for(String itemDTO : this.types) {
            types.add(new Types(itemDTO));
        }

        items.setName(this.name);
        items.setLevel(this.level);
        items.setTypes(types);

        return items;
    }
}

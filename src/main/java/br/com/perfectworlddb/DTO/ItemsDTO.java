package br.com.perfectworlddb.DTO;

import br.com.perfectworlddb.model.Items;
import br.com.perfectworlddb.model.Types;

import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

public class ItemsDTO {
    private String name;

    @ManyToMany
    private List<String> types = new ArrayList<>();
    private Integer level;

    public ItemsDTO(Items items) {
        this.name = items.getName();
        this.level = items.getLevel();
    }

    public String getName() {
        return name;
    }

    public List<String> getTypes() {
        return types;
    }

    public Integer getLevel() {
        return level;
    }

    public Items toModel(List<Types> newItemsDTO) {
        return new Items(name, newItemsDTO, level);
    }
}

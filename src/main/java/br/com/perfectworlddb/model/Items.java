package br.com.perfectworlddb.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(cascade=CascadeType.PERSIST)
    private List<Types> types = new ArrayList<>();
    private Integer level;

    public Items() {}

    public Items(String name, List<Types> types, Integer level) {
        this.name = name;
        this.types = types;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Types> getTypes() {
        return types;
    }

    public void setTypes(List<Types> types) {
        this.types = types;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}

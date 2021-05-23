package br.com.perfectworlddb.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Types {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Types() {
    }

    public Types(String name) {
        this.name = name;
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

}

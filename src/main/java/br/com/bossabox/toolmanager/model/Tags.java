package br.com.bossabox.toolmanager.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Tags {

    public Tags(String name, List<Tools> tools) {
        this.name = name;
        this.tools = tools;
    }

    public Tags() {}

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy="tags")
    private List<Tools> tools;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Tools> getTools() {
        return tools;
    }
}

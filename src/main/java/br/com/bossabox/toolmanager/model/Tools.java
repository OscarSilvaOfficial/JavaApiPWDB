package br.com.bossabox.toolmanager.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tools {

    public Tools(String title, String url, String description, List<Tags> tags) {
        this.title = title;
        this.url = url;
        this.description = description;
        this.tags = tags;
    }

    public Tools() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;
    private String description;

    @ManyToMany
    private List<Tags> tags;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public List<Tags> getTags() {
        return tags;
    }
}

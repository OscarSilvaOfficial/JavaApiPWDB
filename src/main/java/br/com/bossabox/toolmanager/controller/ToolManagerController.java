package br.com.bossabox.toolmanager.controller;

import br.com.bossabox.toolmanager.model.Tools;
import br.com.bossabox.toolmanager.repository.ToolsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToolManagerController {

    @Autowired
    private ToolsRepository toolsRepository;

    @RequestMapping("/tools")
    public List<Tools> getTools() {
        return toolsRepository.findAll();
    }

}

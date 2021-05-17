package br.com.bossabox.toolmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ToolManagerController {

    @RequestMapping("/")
    @ResponseBody
    public String select() {
        return "ok";
    }

}

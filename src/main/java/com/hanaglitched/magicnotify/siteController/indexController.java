package com.hanaglitched.magicnotify.siteController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    public indexController() {
    }
    @GetMapping({"/index.html"})
    public String index(Model model) {
        return "index.html";
    }
}

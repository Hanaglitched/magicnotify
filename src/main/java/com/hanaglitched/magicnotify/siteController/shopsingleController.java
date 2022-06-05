package com.hanaglitched.magicnotify.siteController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class shopsingleController {
    public shopsingleController() {
    }
    @GetMapping({"/shop-single.html"})
    public String shoplist(Model model) {
        return "shop-single.html";
    }
}


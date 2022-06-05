package com.hanaglitched.magicnotify.siteController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class shoplistController {
    public shoplistController() {
    }
    @GetMapping({"/shop-list.html"})
    public String shoplist(Model model) {
        return "shop-list.html";
    }
}

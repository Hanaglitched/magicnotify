package com.hanaglitched.magicnotify.siteController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class shopgridController {
    public shopgridController() {
    }
    @GetMapping({"/shop-grid.html"})
    public String shopgrid(Model model) {
        return "shop-grid.html";
    }
}

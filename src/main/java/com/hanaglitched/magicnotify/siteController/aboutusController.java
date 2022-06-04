package com.hanaglitched.magicnotify.siteController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class aboutusController {
    public aboutusController() {
    }
    @GetMapping({"/about-us.html"})
    public String aboutus(Model model) {
        return "about-us.html";
    }
}

package com.hanaglitched.magicnotify.siteController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class contactController {
    public contactController() {
    }
    @GetMapping({"/contact.html"})
    public String contact(Model model) {
        return "contact.html";
    }
}
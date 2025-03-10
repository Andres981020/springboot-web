package org.lilhawkster.dev.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hola mundo Spring Boot Web");
        model.addAttribute("name", "Andres");
        model.addAttribute("lastname", "Mosquera");
        return "details";
    }
}

package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/")
    public String greeting() {
        return "index";
    }

        @GetMapping("/sum")
    public String Sum(@RequestParam int a,@RequestParam int b, Model model) {
        model.addAttribute("sum",a+b);
        return "sum";
    }
    @GetMapping("/edit")
    public String showEditForm(Model model) {
        model.addAttribute("name", "uy le 1234");
        return "edit";
    }

    @GetMapping("/money")
    public String Money(Model model,@RequestParam double usd ) {
        model.addAttribute("money",usd*23000);
        return "money";
    }
}

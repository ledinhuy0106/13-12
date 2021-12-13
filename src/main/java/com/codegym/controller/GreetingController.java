package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

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
    public String Money(Model model,@RequestParam Long usd ) {
        model.addAttribute("usd",usd);
        model.addAttribute("money",usd*23000);
        return "money";
    }
    @GetMapping("/dictionary")
    public String Dictionary(Model model,@RequestParam String keyword ) {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("hello","xinchao");
        stringMap.put("hi","chào");
        for (int i = 0 ; i<stringMap.size();i++) {
            if (i == 0) {
                model.addAttribute("translation", "Không tìm thấy bản dịch");
            }else {
                model.addAttribute("translation",stringMap.get(keyword));
            }
        }
        return "dictionary";
    }
}

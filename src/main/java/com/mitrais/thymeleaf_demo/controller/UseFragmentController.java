package com.mitrais.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/use_fragments")
public class UseFragmentController {

    @GetMapping
    public String useFragmets(Model model){

        model.addAttribute("username", "aji");
        model.addAttribute("value1", "value1");
        model.addAttribute("value2", "value2");
        model.addAttribute("onevar", "onevar");
        model.addAttribute("twovar", 42);
        model.addAttribute("title", "filled");

        return "use_fragments.html";
    }
}

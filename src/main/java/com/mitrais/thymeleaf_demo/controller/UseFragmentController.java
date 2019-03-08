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

        return "use_fragments.html";
    }
}

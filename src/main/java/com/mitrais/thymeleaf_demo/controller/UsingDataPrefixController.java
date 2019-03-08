package com.mitrais.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/not_use_thymeleaf_ns")
public class UsingDataPrefixController {

    @GetMapping
    public String getHeader(Model model) {
        model.addAttribute("title", "<b>Baeldung</b>");
        model.addAttribute("description", "<strong>Thymeleaf</strong> tutorial");
        model.addAttribute("username", "aji");
        model.addAttribute("lastname", "mulyadi");
        return "/data_prefix_example.html";
//        return "inliningExample";
    }
}

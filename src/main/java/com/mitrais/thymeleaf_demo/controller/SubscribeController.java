package com.mitrais.thymeleaf_demo.controller;

import com.mitrais.thymeleaf_demo.utils.StudentUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/subscribe")
public class SubscribeController {

    @GetMapping
    public String Page(Model model, @RequestParam(name = "email", required = false) String email){

        model.addAttribute("username", "aji");
        model.addAttribute("lastname", "mulyadi");
        model.addAttribute("students", StudentUtils.buildStudents());

        return "subscribe.html";
    }

}

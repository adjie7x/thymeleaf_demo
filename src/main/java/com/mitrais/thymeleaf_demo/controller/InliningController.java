package com.mitrais.thymeleaf_demo.controller;

import com.mitrais.thymeleaf_demo.utils.StudentUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InliningController {

    @GetMapping("/html")
    public String getExampleHTML(Model model) {
        model.addAttribute("title", "<b>Baeldung</b>");
        model.addAttribute("description", "<strong>Thymeleaf</strong> tutorial");
        model.addAttribute("username", "aji");
        model.addAttribute("lastname", "mulyadi");
        return "inliningExample.html";
//        return "inliningExample";
    }

    @GetMapping("/js")
    public String getExampleJS(Model model) {
        model.addAttribute("students", StudentUtils.buildStudents());
        return "studentCheck.js";
    }

    @GetMapping("/plain")
    public String getExamplePlain(Model model) {
//        model.addAttribute("username", SecurityContextHolder.getContext()
//                .getAuthentication().getName());
        model.addAttribute("username", "aji");
        model.addAttribute("students", StudentUtils.buildStudents());
        model.addAttribute("lastname", "mulyadi");
        return "studentsList.txt";
    }

}

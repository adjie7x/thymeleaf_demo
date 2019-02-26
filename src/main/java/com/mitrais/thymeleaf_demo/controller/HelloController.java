package com.mitrais.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @PostMapping
    public String hello(HttpServletRequest request, Model model){

        String name = request.getParameter("name");
        if(name == null || "".equals(name)){
            name = "world";
        }

        model.addAttribute("name",name);

        return "hello";

    }

    @GetMapping
    public String helloForm(){
        return  "helloform";
    }


}

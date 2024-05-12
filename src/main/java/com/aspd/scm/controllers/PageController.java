package com.aspd.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public  String home(Model model){
        System.out.println("Rendering Home Page");
        model.addAttribute("name", "Sujeet Mourya");
        model.addAttribute("githubRepo", "https://www.github.com/sujeetdpa/");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }
    @RequestMapping("/services")
    public String servicesPage(){
        return "services";
    }
}

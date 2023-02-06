package com.redhat.demo.webfront.controllers;

import com.redhat.demo.webfront.model.MotionPicture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomePageController {
    @Autowired
    private RequestsController requestCon = new RequestsController();
    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("mps", requestCon.listOfMP());
        return "index";
    }
    @GetMapping("/add")
    public String addNew(Model model){
        model.addAttribute("picture", new MotionPicture());
        return "addNew";
    }

    @PostMapping("/addNew")
    public String addingNew(@ModelAttribute MotionPicture picture){
        System.out.println(picture.toString());
        requestCon.addNewMp(picture);
        return "redirect:/";
    }
    @GetMapping("/get/{id}")
    public String getByID(Model model, @PathVariable int id){
        MotionPicture mp = requestCon.getMPbyID(id);
        model.addAttribute("mp", mp);
        return "get";
    }

    @GetMapping("/delete/{id}")
    public String deleteByID(@PathVariable int id){
        requestCon.deleteByID(id);
        return "redirect:/";
    }
}

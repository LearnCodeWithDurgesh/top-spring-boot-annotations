package com.boot.work.bootwork.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class PageController {

    @RequestMapping("/page1")
    public List<String> home() {
        System.out.println("home page");
        return List.of("Durgesh","Vandna","Roshni","Harsh");

    }

}

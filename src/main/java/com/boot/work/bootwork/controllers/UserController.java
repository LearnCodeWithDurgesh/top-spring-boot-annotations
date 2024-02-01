package com.boot.work.bootwork.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//localhost:8080/users
@RestController
@RequestMapping("/users")
public class UserController {

//    @RequestMapping(value = "/get",method = RequestMethod.POST)
//    MethodMapping
    @PostMapping("/post")
    public String postUsers(){
        System.out.println("getting user");
        return "all users";
    }

    @GetMapping("/get")
    public String getUsers(){
        System.out.println("getting user");
        return "all users";
    }

    @PutMapping("/put")
    public String putUsers(){
        System.out.println("getting user");
        return "all users";
    }
}

package com.example.skilltree.controllers;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Controller
@RestController
public class UserController {
    @RequestMapping("/hello")
    public String hello(){
        HashMap<String, String> response = new HashMap<>();
        response.put("message", "test rest api");
        return new Gson().toJson(response);
    }
}

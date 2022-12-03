package com.example.skilltree.users;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Controller
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/hello")
    public String hello(){
      return userService.userService();
    }
}

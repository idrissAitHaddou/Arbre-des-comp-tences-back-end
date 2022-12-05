package com.example.skilltree.users;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public String loginController(@ModelAttribute User user){
        System.out.println(user.getEmail());
        return userService.loginService(user.getEmail(), user.getPassword());
    }
}

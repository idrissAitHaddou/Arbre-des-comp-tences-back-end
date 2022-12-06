package com.example.skilltree.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public String loginController(@RequestBody User user){
        System.out.println(user.getEmail());
        return userService.loginService(user.getEmail(), user.getPassword());
    }

    @GetMapping("/detaills")
    public String detaillsController(@RequestParam(value = "email") String email){
        return userService.detaillsService(email);
    }

    @GetMapping("/all")
    public String allUsersController(){
        return userService.allUsersService();
    }
}

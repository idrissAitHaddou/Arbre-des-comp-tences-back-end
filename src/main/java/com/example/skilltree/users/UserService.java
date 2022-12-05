package com.example.skilltree.users;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public String loginService(String email, String password) {
        String status = "500";
        String message = "login invalid";
        List<User> users = userRepository.loginRepository(email, password);
        if(users.size() > 0) {
            status = "200";
            message = "login successfully";
        }
        HashMap<String, String> response = new HashMap<>();
        response.put("status", status);
        response.put("message", message);
        return new Gson().toJson(response);
    }
}

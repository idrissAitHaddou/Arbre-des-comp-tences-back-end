package com.example.skilltree.users;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public String userService() {
       return userRepository.usertestRepo();
    }
}

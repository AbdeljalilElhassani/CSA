package com.CSA.CSA.Controller;

import com.google.gson.Gson;
import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class QuestionEvaluationController {

    @Autowired
    private userRepository userRepository; // Assuming you have a UserRepository
    @Autowired
    private Gson gson;
    @GetMapping("/login")
    public String showUserLoginForm() {
        return "login";
    }
    @PostMapping(value = "/login", produces = "application/json")
    public ResponseEntity<String> userLogin(@RequestParam String username, @RequestParam String password) {
        System.out.println("Received login request - Username: " + username + ", Password: " + password);

        User user = userRepository.findByLogin(username);

        if (user != null && user.getPassword().equals(password)) {
            // Authentication successful
            LoginResponse response = new LoginResponse(true, "Login successful");
            String jsonResponse = gson.toJson(response);
            System.out.println("Authentication successful");
            return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
        } else {
            // Authentication failed
            LoginResponse response = new LoginResponse(false, "Invalid username or password");
            String jsonResponse = gson.toJson(response);
            System.out.println("Authentication failed");
            return new ResponseEntity<>(jsonResponse, HttpStatus.UNAUTHORIZED);
        }
    }



    /*@GetMapping("/hello")
    public String userHello() {
        return "hello";
    }*/
    }
package com.CSA.CSA.Controller;

import com.google.gson.Gson;
import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

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

        if (user != null && verifyPassword(password, user.getSalt(), user.getPasswordHash())) {
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

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody String jsonUser) {
        User newUser = gson.fromJson(jsonUser, User.class);

        if (newUser != null) {
            // Generate salt
            byte[] salt = generateSalt();
            newUser.setSalt(salt);

            newUser.setPasswordHash(hashPassword(newUser.getPassword(), salt));

            userRepository.save(newUser);
            String jsonResponse = gson.toJson("User registered successfully");
            return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
        } else {
            String jsonResponse = gson.toJson("Failed to register user");
            return new ResponseEntity<>(jsonResponse, HttpStatus.BAD_REQUEST);
        }
    }

    private byte[] generateSalt() {
        byte[] salt = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(salt);
        return salt;
    }

    private String hashPassword(String password, byte[] salt) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(salt);
            byte[] hashedBytes = digest.digest(password.getBytes());
            return bytesToHex(hashedBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean verifyPassword(String password, byte[] salt, String storedHash) {
        String calculatedHash = hashPassword(password, salt);
        return calculatedHash != null && calculatedHash.equals(storedHash);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}

package com.CSA.CSA.Controller;

public class LoginResponse {
    private boolean success;
    private String message;

    public LoginResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    // Getters and setters (or lombok annotations) go here...

    // Optional: Additional methods or fields for more detailed responses
}

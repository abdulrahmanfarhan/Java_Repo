package com.example;

public class HelloWorld {
    private String message;

    // Setter method for dependency injection
    public void setMessage(String message) {
        this.message = message;
    }

    // Method to print the message
    public void printMessage() {
        System.out.println("Message: " + message);
    }
}
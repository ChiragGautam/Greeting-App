package com.example.GreetingApp.service;
<<<<<<< HEAD
=======
import com.example.GreetingApp.model.Greeting;
import com.example.GreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> fc837e0 ( UC4 Added)
import org.springframework.stereotype.Service;

@Service
public class GreetingServices {
<<<<<<< HEAD
    public String getSimpleGreeting() {
        return "Hello World";
    }

    public String getGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello, " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            return "Hello, " + firstName + "!";
        } else if (lastName != null) {
            return "Hello, " + lastName + "!";
        } else {
            return "Hello World!";
        }
=======
    @Autowired
    private GreetingRepository greetingRepository;
    public String getSimpleGreeting() {
        return "Hello World";
    }
    public Greeting saveGreeting(String firstName, String lastName) {
        String message;
        if (firstName != null && lastName != null) {
            message = "Hello, " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            message = "Hello, " + firstName + "!";
        } else if (lastName != null) {
            message = "Hello, " + lastName + "!";
        } else {
            message = "Hello World!";
        }
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
>>>>>>> fc837e0 ( UC4 Added)
    }
}

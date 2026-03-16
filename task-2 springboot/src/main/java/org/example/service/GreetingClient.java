package org.example.service;

import org.example.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

public class GreetingClient {
    public GreetingService greetingService;
    @Autowired
    public GreetingClient(GreetingService greetingService){
        this.greetingService=greetingService;
        greetingService.greet();
        System.out.println("Executed");
    }
}
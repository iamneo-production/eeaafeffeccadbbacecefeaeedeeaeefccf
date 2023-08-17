package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/")
    public String Welcome() {
        return "Welcome Spring Boot!";
    }
    
    public static void main(String args[])
    {
        ApiController a=new ApiController();
        System.out.println(a.Welcome);
    }
}
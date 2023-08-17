package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/")
    public String Welcome() {
        return "welcome";
    }
    public static void main(String args[])
    {
        ApiController api=new ApiController();
        System.out.print(api.Welcome());
    }
}
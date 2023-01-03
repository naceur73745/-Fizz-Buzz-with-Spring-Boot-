package com.example.fizzbuzz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControllerBuzz {
    private  ServiceBuzz buzzObject ;

    @Autowired
    public ControllerBuzz(ServiceBuzz buzzObject) {
        this.buzzObject = buzzObject;

    }

    @GetMapping("/FizzBuzz")
    public ArrayList<String> getBuzzResult(@RequestParam Integer number) {
        ArrayList<String> buzzResultList = buzzObject.fizzBuzz(number);
        return buzzResultList;

    }
}

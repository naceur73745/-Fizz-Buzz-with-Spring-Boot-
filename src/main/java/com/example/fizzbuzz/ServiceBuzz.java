package com.example.fizzbuzz;


import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceBuzz {

    public ArrayList<String> fizzBuzz(int number) {

        ArrayList<Integer> fizzBuzzValues = new ArrayList<Integer>();

        ArrayList<String> result = new ArrayList<String>();
        if (number < 0) {
            for (int i = 0; i >= number; i--) {
                fizzBuzzValues.add(i);
            }
        } else {

            for (int i = 0; i <= number; i++) {
                fizzBuzzValues.add(i);
            }
        }


        for (int i : fizzBuzzValues) {
            if ((i % 3 == 0) && (i% 5 == 0)) {
                result.add(i + " : FizzBuzz");

            } else if (i % 3 == 0) {
                result.add(i + " : Fizz");

            } else if (i % 5 == 0) {
                result.add( i + " : Buzz");

            } else {

                result.add(String.valueOf(i));

            }
        }
        return result;


    }
}

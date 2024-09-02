package com.practice.arrays.probaj;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        fizzBuzz();


    }

    public static void fizzBuzz() {

        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(fizzBuzz);
            } else if (i % 3 == 0) {
                System.out.println(fizz);
            } else if (i % 5 == 0) {
                System.out.println(buzz);
            } else {
                System.out.println(i);
            }
        }
    }
}



package com.practice.recursion;

public class RekurzivnoSabiranje {

    public static void main(String[] args) {

        int n = 10;
        int result = sum(n);
        System.out.println("Suma brojeva od 1 do " + n + " je: " + result);
    }


    public static int sum(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }

}

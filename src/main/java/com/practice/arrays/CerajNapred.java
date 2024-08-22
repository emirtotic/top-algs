package com.practice.arrays;

public class CerajNapred {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 7;
        int difference = 0;

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        difference = max - min;
        System.out.println(difference);

    }

}

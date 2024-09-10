package com.practice.arrays.leetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem13 {

    public static void main(String[] args) {

        //String word = "LVIII";
        String word = "MCMXCIV";

        System.out.println(romanToInt(word));

    }


    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        int total = 0;
        int previous = 0;

        for (char c : s.toCharArray()) {
            int current = map.get(c);

            if (current > previous) {
                total += current - (2 * previous);
            } else {
                total += current;
            }

            previous = current;

        }
        return total;
    }

}

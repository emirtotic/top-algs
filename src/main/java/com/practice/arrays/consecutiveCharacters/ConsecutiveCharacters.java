package com.practice.arrays.consecutiveCharacters;

public class ConsecutiveCharacters {

    public static void main(String[] args) {

        String s = "Leet cooode";

        System.out.println(solution(s));



    }

    public static int solution(String s) {

        int count = 1;
        int max = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }

        return max;
    }

}

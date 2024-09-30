package com.practice.arrays.leetCode;

// Leetcode 557
public class Problem557 {

    public static void main(String[] args) {

        String s = "the sky is blue";
        System.out.println(reverseLetters(s));

    }

    public static String reverseLetters(String s) {
        if (s == null || s.trim().isEmpty()) {
            return "Invalid String!";
        }

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            
            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }


}

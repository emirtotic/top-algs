package com.practice.arrays.leetCode;

public class Problem151 {

    public static void main(String[] args) {

        String s = "the sky is blue";
        System.out.println(reverseWords(s));

    }


    public static String reverseWords(String s) {

        if (s == null || s.trim().isEmpty()) {
            return "Invalid String!";
        }

        String corrected = s.replaceAll("\\s{2,}", " ").trim();
        String[] words = corrected.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }

        return sb.toString().trim();
    }

}

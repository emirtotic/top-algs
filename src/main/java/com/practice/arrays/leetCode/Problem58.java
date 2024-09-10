package com.practice.arrays.leetCode;

public class Problem58 {

    public static void main(String[] args) {

        String word = " Hello, there... How are you?";

        System.out.println(lengthOfLastWord(word));



    }


    public static int lengthOfLastWord(String s) {

        String[] words = s.trim().split("\\s+");

        return words[words.length-1].length();


    }

}

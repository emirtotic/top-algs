package com.practice.arrays;

import java.util.*;

public class Repetition {

    public static void main(String[] args) {

        String sentence = "Cao, ja sam Emir";
        System.out.println(solution(sentence));


    }


    public static String solution(String sentence) {

        String result = "";

        if (sentence == null || sentence.trim().isEmpty()) {
            return sentence;
        }

        String[] words = sentence.split("\\s+");

        for (String word : words) {
            String w = word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            result += w;
        }
        return result.trim();
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(" ]\n");
    }

}

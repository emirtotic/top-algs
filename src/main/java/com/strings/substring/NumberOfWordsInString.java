package com.strings.substring;

public class NumberOfWordsInString {

    public static void main(String[] args) {

        String word = "Emir    Totic Car";
        System.out.println(wordCount(word));

    }

    public static int wordCount(String word) {

        if (word == null || word.trim().isEmpty()) {
            return 0;
        }

        String[] words = word.split("\\s+");
        return words.length;

    }

}

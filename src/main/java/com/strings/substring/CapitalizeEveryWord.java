package com.strings.substring;

public class CapitalizeEveryWord {

    public static void main(String[] args) {

        String sentence = "Cao, ja sam Emir";
        System.out.println(solution(sentence));

    }

    public static String solution(String sentence) {

        if (sentence == null || sentence.trim().isEmpty()) {
            return sentence;
        }

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            String w = word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            result.append(w);
        }
        return result.toString().trim();
    }

}

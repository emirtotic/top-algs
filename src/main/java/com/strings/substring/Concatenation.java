package com.strings.substring;

import java.util.ArrayList;
import java.util.List;

public class Concatenation {

    /*
    Napiši metodu koja prima listu stringova i vraća jedan string koji je rezultat konkatenacije svih stringova
    iz liste. Na primer, ako je ulazna lista ["Java", " is", " awesome"], rezultat bi trebao biti "Java is awesome".
     */

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("is");
        words.add("Awesome");
        System.out.println(solution2(words));

    }

    public static String solution(List<String> words) {

        if (words.isEmpty()) {
            throw new IllegalArgumentException("List is empty.");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.size(); i++) {

            if (i == words.size() - 1) {
                result.append(words.get(i));
            } else {
                result.append(words.get(i)).append(" ");
            }

        }

        return result.toString();

    }

    public static String solution2(List<String> words) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty.");
        }

        return String.join(" ", words);
    }

}

package com.strings.substring;

public class Main {

    /*
    Napiši metodu koja prima string i dva indeksa, start i end. Metoda treba da vrati podstring od
    indeksa start do end (ne uključujući end). Ako su indeksi nevažeći, metoda treba da baci odgovarajući izuzetak.
     */

    public static void main(String[] args) {

        String word = "fitness";
        System.out.println(solution(word, 2, 5));

    }

    public static String solution(String word, int start, int end) {

        if (word == null || start < 0 || end > word.length() || start > end) {
            throw new IllegalArgumentException("Invalid start or end index");
        }

        StringBuilder result = new StringBuilder();

        for (int i = start; i < end; i++) {
            result.append(word.charAt(i));
        }

        return result.toString();
    }

}

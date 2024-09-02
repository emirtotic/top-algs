package com.practice.maps;

import java.util.HashMap;
import java.util.Map;

/*
Opis: Dat je niz karaktera chars. Nađi koliko se svaki karakter pojavljuje u nizu.
Primer:
Ulaz: chars = ['a', 'b', 'a', 'c', 'b', 'a']
Izlaz: {'a': 3, 'b': 2, 'c': 1}
 */

public class Task1 {

    public static void main(String[] args) {

        char[] array = {'a' , 'b' , 'a' , 'c' , 'b' , 'a'};
        countCharacterFrequency(array);

    }

    public static Map<Character, Integer> countCharacterFrequency(char[] chars) {

        Map<Character, Integer> result = new HashMap<>();
        int count = 0;

        for (char c : chars) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }

        return result;
    }

}

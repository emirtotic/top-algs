package com.leetcode.anagram;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));

    }

    // Moze se resiti i sortiranjem nizova a moze i ovako
    public static boolean isAnagram(String s, String t) {

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Map<Character, Integer> letterCount = new HashMap<>();

        for (Character c : sChar) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }

        for (Character c : tChar) {
            if (!letterCount.containsKey(c)) {
                return false;
            }
            letterCount.put(c, letterCount.getOrDefault(c, 0) - 1);
        }

        for (int count : letterCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

}

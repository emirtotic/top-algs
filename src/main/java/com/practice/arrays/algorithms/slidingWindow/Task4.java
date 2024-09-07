package com.practice.arrays.algorithms.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Leetcode 3
public class Task4 {

    public static void main(String[] args) {

        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length();
        int fp = 0;
        int sp = 0;

        Map<Character, Integer> mp = new HashMap<>();

        while (sp < n) {
            addToMap(mp, s.charAt(sp));
            while (fp < sp && !isValid(mp)) {
                deletFromMap(mp, s.charAt(sp));
                fp++;
            }

            int length = sp - fp + 1;
            ans = Math.max(ans, length);
            sp++;
        }
        return ans;
    }

    public static void addToMap(Map<Character, Integer> mp, char c) {
        mp.put(c, mp.getOrDefault(c, 0) + 1);

    }

    public static void deletFromMap(Map<Character, Integer> mp, char c) {
        mp.put(c, mp.get(c) - 1);

    }

    public static boolean isValid(Map<Character, Integer> mp) {
        for (char c : mp.keySet()) {
            if (mp.get(c) > 1) {
                return false;
            }
        }
        return true;
    }
}

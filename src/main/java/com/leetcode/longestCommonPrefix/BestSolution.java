package com.leetcode.longestCommonPrefix;

public class BestSolution {


    public static void main(String[] args) {

        String[] strs = new String[]{"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Uzmi prvi string kao osnovu za upoređivanje
        String prefix = strs[0];

        // Prođi kroz sve stringove u nizu
        for (int i = 1; i < strs.length; i++) {
            // Smanjuj prefiks dok se ne uklopi u trenutni string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

}

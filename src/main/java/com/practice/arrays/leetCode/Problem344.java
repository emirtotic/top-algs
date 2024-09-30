package com.practice.arrays.leetCode;

public class Problem344 {

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverse(s);
    }

    public static char[] reverse(char[] s) {

        if (s.length == 0) {
            throw new IllegalArgumentException("Invalid array provided.");
        }

        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        return s;
    }

}

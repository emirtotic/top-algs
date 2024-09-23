package com.leetcode.palindrome;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(10));

    }


    public static boolean isPalindrome(int x) {

        String broj = String.valueOf(x);

        char[] left = new char[broj.length()];
        char[] right = new char[broj.length()];


        for (int i = 0; i < broj.length(); i++) {
            left[i] = broj.charAt(i);
        }

        for (int i = left.length - 1; i >= 0; i--) {
            right[i] = broj.charAt(i);
        }

        for (int i = 0; i < left.length; i++) {
                if (left[i] != right[i]) {
                    return false;
                }
            }

        return true;



    }

}

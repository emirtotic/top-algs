package com.practice.arrays.leetCode;

public class Problem125 {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindromeComplex(s));


    }

    public static boolean isPalindromeComplex(String s) {

        String filteredString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = filteredString.length() - 1;

        while (left < right) {
            if (filteredString.charAt(left) != filteredString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public static boolean isPalindrome(String s) {

        char[] array = s.toCharArray();

        int start = 0;
        int end = array.length - 1;
        boolean result = true;

        while(start < end) {
            if (array[start] == array[end]) {
                start++;
                end--;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}



package com.practice.arrays.leetCode;

public class Problem744 {

    public static void main(String[] args) {

        char[] letters = {'c','f','j'};
        char target = 'c';

        System.out.println(nextGreatestLetter(letters, target));

    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else if (letters[mid] > target) {
                end = mid - 1;
            }

        }

        return letters[start % letters.length];

    }
}

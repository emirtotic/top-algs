package com.practice.arrays.maxProductSubarray;

// LeetCode 152
public class Main {

    public static void main(String[] args) {

        int[] array = {2,3,-2,4};
        //int[] array = {-3,-1,-1};

        System.out.println(solution(array));

    }

    public static int solution(int[] array) {

        if (array == null || array.length == 0) {
            return 0;
        }

        int maxProduct = array[0];
        int minProduct = array[0];
        int result = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] >= 0) {
                maxProduct = Math.max(array[i], maxProduct * array[i]);
                minProduct = Math.min(array[i], minProduct * array[i]);
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(array[i], minProduct * array[i]);
                minProduct = Math.min(array[i], temp * array[i]);
            }

            result = Math.max(result, maxProduct);
        }

       return result;
    }



}

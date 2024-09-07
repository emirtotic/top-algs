package com.practice.arrays.algorithms.slidingWindow;

public class Task1 {

    public static void main(String[] args) {

        int[] array = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(minSumOfSubarray(array, k));

    }

    public static int minSumOfSubarray(int[] array, int k) {

        if (array.length < k) {
            throw new IllegalArgumentException("Array length must be greater than or equal to k.");
        }

        int sum = 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            sum += array[i];
        }

        result = sum;


        for (int i = 1; i <= array.length - k; i++) {
            sum = sum - array[i - 1] + array[i + k - 1];
            result = Math.min(result, sum);
        }

        return result;


    }

}

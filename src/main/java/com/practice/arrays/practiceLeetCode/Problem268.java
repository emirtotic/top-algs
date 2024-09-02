package com.practice.arrays.practiceLeetCode;

public class Problem268 {

    public static void main(String[] args) {

        int[] array = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(bestSolution(array));

    }

    public static int missingNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0] + 1;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] - nums[i + 1] != -1) {
                return nums[i] + 1;
            }
        }

        return nums[nums.length - 1] + 1;
    }

    public static int bestSolution(int[] nums) {

        int totalSum = nums.length * (nums.length + 1) / 2;
        int sumOfElements = 0;

        for (int i = 0; i < nums.length; i++) {
            sumOfElements += nums[i];
        }

        return totalSum - sumOfElements;

    }

}

package com.practice.arrays.leetCode;

// obnovi
public class Problem2016 {

    public static void main(String[] args) {

        //int[] nums = {7, 1, 5, 4};
        //int[] nums = {9, 4, 3, 2};
        int[] nums = {1, 5, 2, 10};

        System.out.println(maximumDifference(nums));

    }

    public static int maximumDifference(int[] nums) {

        int maxDifference = -1;
        int minValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minValue) {
                maxDifference = Math.max(maxDifference, nums[i] - minValue);
            } else {
                minValue = nums[i];
            }
        }

        return maxDifference;
    }

}

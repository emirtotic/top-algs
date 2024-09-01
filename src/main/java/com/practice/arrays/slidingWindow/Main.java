package com.practice.arrays.slidingWindow;

public class Main {

    public static void main(String[] args) {

        int[] nums = {10, 2, 7, 8, 11, 13};
        printSubArraySum(nums, 3);
    }

    public static void printSubArraySum(int[] nums, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        System.out.println(sum);

        for (int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            System.out.println(sum);
        }


    }
}



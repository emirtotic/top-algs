package com.leetcode.runningSumof1dArray;

// 1480
public class RunningSumof1dArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        printArray(nums);

        printArray(runningSum(nums));

    }

    public static int[] runningSum(int[] nums) {

        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        return prefixSum;

    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(" ]\n");
    }

}

package com.leetcode.Problem53;

public class FindTheGreatestSumOfSubarray {

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        printArray(nums);

        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {

        int trenutnaSuma = nums[0];
        int rezultat = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (trenutnaSuma + nums[i] > nums[i]) {
                trenutnaSuma += nums[i];
            } else {
                trenutnaSuma = nums[i];
            }

            if (trenutnaSuma > rezultat) {
                rezultat = trenutnaSuma;
            }

        }

        return rezultat;

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

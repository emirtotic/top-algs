package com.practice.arrays.leetCode;

public class Problem189 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        printArray(nums);
        rotate(nums, 0, nums.length - 1);
        printArray(nums);
        rotate(nums, 0, k - 1);
        printArray(nums);
        rotate(nums, k, nums.length - 1);
        printArray(nums);

    }

    public static void rotate(int[] nums, int start, int end) {

        while(start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }

    }

    public static void printArray(int[] nums) {

        System.out.print("[ ");

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i] + " ]\n");
            } else {
                System.out.print(nums[i] + ", ");
            }
        }

    }

}

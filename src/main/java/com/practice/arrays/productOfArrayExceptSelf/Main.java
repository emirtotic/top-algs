package com.practice.arrays.productOfArrayExceptSelf;

// LeetCode 238
public class Main {

    public static void main(String[] args) {

        int[] nums = {5, 2, 3, 4};
        printArray(nums);
        printArray(productExceptSelf(nums));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] answer = new int[nums.length];

        // deal with left
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // deal with right
        right[right.length - 1] = 1;
        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // deal with answer
        for (int i = 0; i < answer.length; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }

    public static void printArray(int[] nums) {

        System.out.print("[ ");

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i] + " ]");
            } else {
                System.out.print(nums[i] + ", ");
            }
        }

    }
}

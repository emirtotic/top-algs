package com.practice.arrays.algorithms.binarySearch;

public class Learn {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6, 7, 9, 18, 22, 23};
        printArray(nums);
        int k = 1;
        binarySearch(nums, k);

    }


    public static void binarySearch(int[] nums, int k) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] < k) {
                start = mid + 1;
            } else if (nums[mid] > k) {
                end = mid - 1;
            } else {
                System.out.println("Target number was found on index " + mid);
                return;
            }
        }
        System.out.println("Target is not found in array.");
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

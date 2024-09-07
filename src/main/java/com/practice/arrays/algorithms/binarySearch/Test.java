package com.practice.arrays.algorithms.binarySearch;

public class Test {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 9};
        int target = -1;

        findIt(nums, target);


    }


    public static void findIt(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                System.out.println("Target found on position " + mid);
                return;
            }

        }

        System.out.println("Not found!");

    }

}

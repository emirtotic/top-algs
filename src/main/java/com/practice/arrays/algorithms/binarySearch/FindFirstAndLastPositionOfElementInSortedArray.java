package com.practice.arrays.algorithms.binarySearch;

// Leetcode 34
public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = new int[2];

        result[0] = findLeft(nums, target);
        result[1] = findRight(nums, target);

        printArray(result);



    }


    public static int findLeft(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int answer = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                answer = mid;
                end = mid - 1;
            }
        }
        return answer;
    }

    public static int findRight(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int answer = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                answer = mid;
                start = mid + 1;
            }
        }
        return answer;

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

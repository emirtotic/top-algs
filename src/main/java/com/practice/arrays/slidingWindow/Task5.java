package com.practice.arrays.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Leetcode 239
public class Task5 {

    public static void main(String[] args) {

        //int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] nums = {1, -1};
        int k = 1;

       printArray( solution(nums, k));


    }

    public static int[] solution(int[] nums, int k) {

        if (k > nums.length) {
            throw new IllegalArgumentException("Subarray can not be larger than array.");
        }

        List<Integer> list = new ArrayList<>();

        int currentMax = -500;

        for (int i = 0; i < k; i++) {
            currentMax = Math.max(nums[i], currentMax);
        }

        list.add(currentMax);

        for (int i = 1; i <= nums.length - k; i++) {
            currentMax = Math.max(currentMax, nums[i + k - 1]);
            list.add(currentMax);
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
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

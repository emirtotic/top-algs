package com.practice.arrays.slidingWindow;

import java.util.ArrayList;
import java.util.List;

// Leetcode 209
public class Task4 {

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println(maxSlidingWindow(nums, k));

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int maxNumberInSubarray = nums[0];
        List<Integer> list = new ArrayList<>();
        int currentMax = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length - 1; i++ ) {

        }


        return new int[0];
    }

}

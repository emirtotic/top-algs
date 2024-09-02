package com.practice.arrays.probaj;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        System.out.println(solution(nums, k));
    }

    public static int solution(int[] nums, int k) {

        int sum = 0;
        int maxSum = 0;
        int result = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxSum = sum;

        for (int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            result = Math.max(sum, maxSum);
        }


        return result;

    }
}



package com.practice.arrays.practiceLeetCode;

// NISAM URADIO
public class Problem209 {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(solution(nums, target));

    }

    public static int solution(int[] nums, int target) {

        int validSum = 0;
        int result = Integer.MAX_VALUE;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            validSum += nums[i];
            while (validSum >= target) {
                result = Math.min(result, i + 1 - left);
                validSum = validSum - nums[left];
                left++;
            }

        }

        return (result != Integer.MAX_VALUE) ? result : 0;


    }
}



package com.practice.arrays.maxConsecutiveOnes;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(nums));



    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxCons = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            if (maxCons <= count) {
                maxCons = count;
            }
        }
        return maxCons;
    }


    public static int findMaxConsecutiveOnes2(int[] nums) {

        int ans = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                count = 0;
            } else {
                count ++;
            }

            if (count > ans) {
                ans = count;
            }
        }
        return ans;
    }

}

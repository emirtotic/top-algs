package com.leetcode.twoSum;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int[] array = {11,15, 2, 7};
        int[] result = calculate(array, 9);

        System.out.println(result[0]);
        System.out.println(result[1]);

    }


    public static int[] calculate(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);


        }
        throw new IllegalArgumentException("No two sum solution");

    }


//    public static int[] calculate(int[] nums, int target) {
//
//        int[] result = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j && nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    break;
//                }
//            }
//        }
//        return result;
//    }

}

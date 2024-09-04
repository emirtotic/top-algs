package com.practice.arrays.leetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem169 {

    public static void main(String[] args) {

        int[] nums = {3, 2, 3};
        printArray(nums);
        System.out.println(majorityElement(nums));


    }

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            if (item.getValue() > nums.length / 2) {
                return item.getKey();
            }
        }

        return 0;
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

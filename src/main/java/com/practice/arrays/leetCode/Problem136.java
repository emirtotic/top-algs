package com.practice.arrays.leetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem136 {

    public static void main(String[] args) {

        int[] array = {4, 1, 2, 1, 2};

        System.out.println(singleNumber(array));

    }

    public static int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

}

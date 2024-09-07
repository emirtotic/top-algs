package com.practice.arrays.probaj;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        int[] nums = {2, 7, 11, 15};
//        int target = 9;

        int[] nums = {2, 3, 4};
        int target = 6;

        twoSum(nums, target);


    }

    public static int[] twoSum(int[] numbers, int target) {

        int index = 0;
        int[] result = new int[2];

        for (int i = 1; i < numbers.length; i++) {
            if (target == numbers[index] + numbers[i]) {
                result[0] = index + 1;
                result[1] = i + 1;
            } else {
                index++;
            }
        }
        return result;

    }
}



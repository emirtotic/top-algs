package com.practice.arrays.practiceLeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// obnovi
public class Problem287 {

    public static void main(String[] args) {

        int[] array = {3,4,-1,1};
        //int[] array = {0, 1, 2};
        //int[] array = {0};
        //int[] array = {-5};

        System.out.println(firstMissingPositive(array));

    }

    public static int firstMissingPositive(int[] nums) {

        int n = nums.length;

        // Postavljanje svakog broja na odgovarajuću poziciju
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Pronalaženje prvog indeksa gde broj nije na odgovarajućoj poziciji
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;

    }

}

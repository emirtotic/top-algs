package com.practice.arrays.leetCode;

public class Problem283 {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        solution(nums);

    }

    public static int[] solution(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {

                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
        }
        return nums;
    }

    public static void betterSolution(int[] nums) {

        int index = 0;

        // Ako je razlicit od nule pomeri ga na index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Popuni ostale delove od indexa sa nulom
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}



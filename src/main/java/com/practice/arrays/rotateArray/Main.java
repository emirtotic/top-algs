package com.practice.arrays.rotateArray;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        printArray(nums);

        rotate(nums, 3);

        printArray(nums);

    }


    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // U slučaju da je k veće od dužine niza

        // Obrni ceo niz
        reverse(nums, 0, n - 1);
        // Obrni prvih k elemenata
        reverse(nums, 0, k - 1);
        // Obrni preostalih n-k elemenata
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
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

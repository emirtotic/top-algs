package com.practice.arrays.leetCode;

// obnovi
public class Problem88 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;


        merge(nums1, m, nums2, n);



    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        System.out.print("Nums1: ");
        printArray(nums1);
        System.out.print("Nums2: ");
        printArray(nums2);

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }

        System.out.print("Result: ");
        printArray(nums1);
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

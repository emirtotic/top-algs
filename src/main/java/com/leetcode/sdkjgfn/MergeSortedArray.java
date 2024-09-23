package com.leetcode.sdkjgfn;

//88
public class MergeSortedArray {

    public static void main(String[] args) {

//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int[] nums2 = {2, 5, 6};

        int[] nums1 = {1};
        int[] nums2 = {};

        printArray(nums1);
        printArray(nums2);

        printArray(merge(nums1, 1, nums2, 0));


    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m + n];

        if (m != 0) {
            for (int i = 0; i < m; i++) {
                result[i] = nums1[i];
            }
        }

        if (n != 0) {
            for (int i = 0; i < n; i++) {
                result[i + m] = nums2[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] != 0) {
                    if (result[j] > result[j + 1]) {
                        int temp = result[j + 1];
                        result[j + 1] = result[j];
                        result[j] = temp;
                    }
                }

            }
        }

        printArray(result);


        return result;

    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(" ]\n");
    }

}

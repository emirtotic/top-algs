package com.practice.arrays.leetCode;

public class Problem2956 {

    public static void main(String[] args) {

        int[] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};

        printArray(solution(nums1, nums2));

    }

    public static int[] solution(int[] nums1, int[] nums2) {

        int[] result = new int[2];
        int ans1 = 0;
        int ans2 = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans1++;
                    break;
                }
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    ans2++;
                    break;
                }
            }
        }

        result[0] = ans1;
        result[1] = ans2;

        return result;

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

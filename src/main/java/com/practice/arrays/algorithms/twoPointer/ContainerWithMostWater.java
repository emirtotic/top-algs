package com.practice.arrays.algorithms.twoPointer;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(heights));


    }


    public static int maxArea(int[] height) {

        int maxArea = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while (leftPointer < rightPointer) {

            if (height[leftPointer] < height[rightPointer]) {
                maxArea = Math.max(maxArea, height[leftPointer] * (rightPointer - leftPointer));
                leftPointer++;
            } else {
                maxArea = Math.max(maxArea, height[rightPointer] * (rightPointer - leftPointer));
                rightPointer--;
            }
        }
        return maxArea;
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

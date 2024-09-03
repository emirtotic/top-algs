package com.practice.arrays.leetCode;

public class Problem360 {

    public static void main(String[] args) {

        int[] array = {-4, -2, 2, 4};
        int a = 1;
        int b = 3;
        int c = 5;

        printArray(solution(array, a, b, c));

    }

    public static int[] solution(int[] nums, int a, int b, int c) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = function(a, b, c, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;

    }

    public static int function(int a, int b, int c, int number) {
        //f(x) = 1*x^2 + 3*x + 5

        int result = a * number * number + b * number + c;

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

    /*

        *****  BEST SOLUTION *****

        public static int[] solution(int[] nums, int a, int b, int c) {
    int n = nums.length;
    int[] result = new int[n];
    int left = 0;
    int right = n - 1;
    int index = (a >= 0) ? n - 1 : 0; // Ako je a >= 0, počinjemo sa kraja, inače sa početka

    while (left <= right) {
        int leftVal = function(a, b, c, nums[left]);
        int rightVal = function(a, b, c, nums[right]);

        if (a >= 0) {
            if (leftVal > rightVal) {
                result[index--] = leftVal;
                left++;
            } else {
                result[index--] = rightVal;
                right--;
            }
        } else {
            if (leftVal < rightVal) {
                result[index++] = leftVal;
                left++;
            } else {
                result[index++] = rightVal;
                right--;
            }
        }
    }

    return result;
}

public static int function(int a, int b, int c, int number) {
    return a * number * number + b * number + c;
}

     */

}

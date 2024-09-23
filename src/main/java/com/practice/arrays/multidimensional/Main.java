package com.practice.arrays.multidimensional;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 4};

        System.out.println(solution(array, 2));

    }


    public static int solution(int[] nums, int val) {

        int k = 0; // Brojač za broj elemenata koji nisu jednaki val

        int[] result = new int[nums.length];

        // Prolazak kroz sve elemente niza
        for (int i = 0; i < nums.length; i++) {
            // Ako trenutni element nije jednak val, premesti ga na mesto k
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
                result[i] = nums[i];
            }
        }

        printArray(result);

        // Vrati broj elemenata koji nisu jednaki val
        return k;

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

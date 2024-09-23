package com.topAlgoritmi.prefixSum.sumOfAll;

public class Practice {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] prefix = calculatePrefixSum(arr);

        // Ispis niza prefix da proverimo rezultat
        for (int num : prefix) {
            System.out.print(num + " ");
        }
    }

    public static int[] calculatePrefixSum(int[] arr) {

        int[] result = new int[arr.length];

        result[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result[i] = result[i - 1] + arr[i];
        }

        return result;
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");

        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + " ]\n");
            }
        }
    }

}

package com.topAlgoritmi.prefixSum.prefixSumBetween;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefix = calculatePrefixSum(arr);

        int sum = sumRange(prefix, 1, 3);
        System.out.println("Suma podniza od 1 do 3 je: " + sum);  // Očekivani rezultat: 18

    }

    public static int[] calculatePrefixSum(int[] arr) {

        int[] result = new int[arr.length];

        result[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result[i] = result[i - 1] + arr[i];
        }

        return result;
    }

    public static int sumRange(int[] prefix, int start, int end) {
        if (start == 0) {
            return prefix[end];
        } else {
            return prefix[end] - prefix[start - 1];
        }
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

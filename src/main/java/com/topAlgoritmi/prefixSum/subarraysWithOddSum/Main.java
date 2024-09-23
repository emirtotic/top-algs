package com.topAlgoritmi.prefixSum.subarraysWithOddSum;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int count = countEvenSumSubarrays(arr);
        System.out.println("Broj podnizova sa parnom sumom je: " + count);  // Očekivani rezultat: 6

    }

    public static int countEvenSumSubarrays(int[] arr) {

        int count = 0;
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        printArray(prefixSum);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int sum = 0;

                if (i == 0) {
                    sum = prefixSum[j];
                } else {
                    sum = prefixSum[j] - prefixSum[i - 1];
                }
                if (sum % 2 == 0) {
                    count++;
                }
            }


        }

        return count;



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

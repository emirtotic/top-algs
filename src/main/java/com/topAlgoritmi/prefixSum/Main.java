package com.topAlgoritmi.prefixSum;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};
        int[] prefix = PrefixSumExample.calculatePrefixSum(arr);

        // Suma podniza od indeksa 1 do 4
        int sum = PrefixSumExample.sumRange(prefix, 1, 4);
        System.out.println("Suma podniza od 1 do 4 je: " + sum);  // Očekivani rezultat: 26
    }

    public static class PrefixSumExample {

        public static int[] calculatePrefixSum(int[] arr) {
            int n = arr.length;
            int[] prefix = new int[n];

            prefix[0] = arr[0];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }

            return prefix;
        }

        public static int sumRange(int[] prefix, int i, int j) {
            if (i == 0) {
                return prefix[j];
            } else {
                return prefix[j] - prefix[i - 1];
            }
        }

    }


}

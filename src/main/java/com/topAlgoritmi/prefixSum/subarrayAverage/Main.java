package com.topAlgoritmi.prefixSum.subarrayAverage;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int avg = subarrayAverage(arr, 1, 3);
        System.out.println("result: " + avg);

// Očekivani izlaz: avg = 6 (jer srednja vrednost podniza {4, 6, 8} je 6)

    }

    public static int subarrayAverage(int[] array, int start, int end) {

        int[] result = new int[array.length];
        result[0] = array[0];
        int sum = 0;

        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] + array[i];
        }

        if (start == 0) {
            sum = result[end];
        } else {
            sum = result[end] - result[start - 1];
        }

        return sum / (end-start + 1);
    }
}

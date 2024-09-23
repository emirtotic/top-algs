package com.practice.arrays.sorting.bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class PositivesOnly {

    public static void main(String[] args) {

        int[] array = {-3, 5, 0, -1, 4, 2, -2};
        printArray(array);
        printArray(bubbleSort(array));

    }

    public static int[] bubbleSort(int[] array) {

        int[] sorted = array.clone();

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j + 1];
                    sorted[j + 1] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        return retrievePositiveNumbersOnly(sorted);

    }


    public static int[] retrievePositiveNumbersOnly(int[] array) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
                list.add(array[i]);
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            if (list.get(i) > 0) {
                result[i] = list.get(i);
            }
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

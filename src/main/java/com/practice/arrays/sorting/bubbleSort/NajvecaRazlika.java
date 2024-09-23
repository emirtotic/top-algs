package com.practice.arrays.sorting.bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class NajvecaRazlika {

    public static void main(String[] args) {

        int[] array = {10, 3, 6, 7, 20, 15};
        printArray(array);
        System.out.println(bubbleSort(array));

    }

    public static int bubbleSort(int[] array) {

        int[] sorted = array.clone();
        int maxDifference = 0;

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j+1];
                    sorted[j+1] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        printArray(sorted);

        for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i + 1] - sorted[i] > maxDifference) {
                maxDifference = sorted[i + 1] - sorted[i];
            }
        }

        return maxDifference;

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

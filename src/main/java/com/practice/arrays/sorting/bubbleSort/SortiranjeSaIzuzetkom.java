package com.practice.arrays.sorting.bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class SortiranjeSaIzuzetkom {

    public static void main(String[] args) {

        int[] array = {5, 8, 3, 2, 6, 7, 2, 4};
        int izuzetak = 6;


        printArray(array);
        printArray(bubbleSort(array, izuzetak));

    }

    public static int[] bubbleSort(int[] array, int izuzetak) {

        int[] sorted = array.clone();

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j] > sorted[j + 1] && sorted[j] != izuzetak && sorted[j+1] != izuzetak) {
                    int temp = sorted[j + 1];
                    sorted[j + 1] = sorted[j];
                    sorted[j] = temp;
                }

            }
        }

        return sorted;

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

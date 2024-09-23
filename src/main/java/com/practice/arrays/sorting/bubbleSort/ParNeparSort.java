package com.practice.arrays.sorting.bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class ParNeparSort {

    public static void main(String[] args) {

        int[] array = {5, 8, 3, 6, 7, 2, 4};

        printArray(array);
        bubbleSort(array);

    }

    public static void bubbleSort(int[] array) {

        int[] sorted = array.clone();
        List<Integer> parni = new ArrayList<>();
        List<Integer> neparni = new ArrayList<>();


        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length -1 -i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j + 1];
                    sorted[j + 1] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] % 2 == 0) {
                parni.add(sorted[i]);
            } else {
                neparni.add(sorted[i]);
            }
        }

        List<Integer> svi = new ArrayList<>();
        svi.addAll(parni);
        svi.addAll(neparni);

        int[] result = new int[svi.size()];

        for (int i = 0; i < svi.size(); i++) {
            result[i] = svi.get(i);
        }

        printArray(result);

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

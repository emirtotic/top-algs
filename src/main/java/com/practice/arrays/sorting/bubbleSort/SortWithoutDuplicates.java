package com.practice.arrays.sorting.bubbleSort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortWithoutDuplicates {

    public static void main(String[] args) {

        int[] array = {5, 3, 8, 3, 2, 5, 4, 8};
        printArray(array);
        printArray(bubbleSort(array));

    }

    public static int[] bubbleSort(int[] array) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j + 1];
                    result[j + 1] = result[j];
                    result[j] = temp;
                }
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

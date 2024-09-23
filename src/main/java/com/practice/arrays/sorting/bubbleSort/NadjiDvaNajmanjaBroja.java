package com.practice.arrays.sorting.bubbleSort;

public class NadjiDvaNajmanjaBroja {

    public static void main(String[] args) {

        int[] array = {5, 8, 2, 6, 7, 2, 4};
        printArray(array);
        printArray(bubbleSort(array));
    }

    public static int[] bubbleSort(int[] array) {

        int[] sorted = array.clone();
        int[] result = new int[2];

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j + 1];
                    sorted[j + 1] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        result[0] = sorted[0];

        for (int i = 0; i < sorted.length - 1; i++) {
            if (i == 1 && sorted[i] < sorted[i + 1]) {
                result[i] = sorted[i];
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

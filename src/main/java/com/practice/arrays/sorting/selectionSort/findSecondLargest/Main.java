package com.practice.arrays.sorting.selectionSort.findSecondLargest;

public class Main {

    public static void main(String[] args) {

        int[] array = {5, 8, 3, 6, 7, 2, 4, 8, 8};

        printArray(array);

        System.out.println(findSecondLargest(array));

    }

    public static int findSecondLargest(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int nextMin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[nextMin]) {
                    nextMin = j;
                }
            }

            int temp = array[nextMin];
            array[nextMin] = array[i];
            array[i] = temp;

        }

        printArray(array);

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > array[i - 1] ) {
                return array[i - 1];
            }
        }

        return -1;

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

package com.practice.arrays.sorting.selectionSort.start;

public class Main {

    public static void main(String[] args) {

        int[] array = {5, 3, 8, 4, 2};

        printArray(selectionSort(array));

    }




    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i; // Pretpostavimo da je trenutni element najmanji

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Pronašli smo novi najmanji element
                }
            }

            // Zamena najmanjeg elementa sa prvim elementom u nesortiranom delu niza
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        return array;

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

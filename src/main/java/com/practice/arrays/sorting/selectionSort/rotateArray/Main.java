package com.practice.arrays.sorting.selectionSort.rotateArray;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2;
        printArray(array);
        rotateArray(array, k);
        System.out.println();
    }


    public static void rotateArray(int[] array, int rotationIndex) {
        // Sortiranje niza koristeći Selection Sort
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        // Rotiranje niza za k pozicija udesno
        rotationIndex = rotationIndex % array.length; // U slučaju da je k veće od dužine niza
        reverseArray(array, 0, array.length - 1); // Obrni ceo niz
        reverseArray(array, 0, rotationIndex - 1); // Obrni prvih k elemenata
        reverseArray(array, rotationIndex, array.length - 1); // Obrni preostale elemente

        // Ispis rezultata
        System.out.println("Rotirani niz:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
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

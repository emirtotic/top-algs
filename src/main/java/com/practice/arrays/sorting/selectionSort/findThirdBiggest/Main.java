package com.practice.arrays.sorting.selectionSort.findThirdBiggest;

public class Main {

    public static void main(String[] args) {

        //int[] array = {5, 8, 3, 6, 7, 2, 4};
        int[] array = {1, 1, 2, 2};

        printArray(array);

        System.out.println(solution(array));




    }


    public static int solution(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int smallestIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }

            }

            int temp = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = temp;

        }

        printArray(array);

        int pretposlednjiIndex = 0;
        int result = -1;


        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > array[i - 1]) {
                pretposlednjiIndex = i - 1;
                break;
            }
        }

        System.out.println("pretposlednji " + array[pretposlednjiIndex]);

        for (int i = pretposlednjiIndex; i > 0; i--) {
            if (array[i] > array[i - 1]) {
                result = i - 1;
                break;
            }
        }

        if (result == -1) {
            return array[0];
        } else {
            return array[result];
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

    public static int bestSolution(int[] array) {
        // Sortiraj niz koristeći Selection Sort
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = temp;
        }

        // Pronađi treći najveći broj
        int distinctCount = 0;
        int thirdLargest = array[0]; // Početna vrednost je najmanji broj

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == array.length - 1 || array[i] != array[i + 1]) {
                distinctCount++;
            }
            if (distinctCount == 3) {
                thirdLargest = array[i];
                break;
            }
        }

        return thirdLargest;
    }

}


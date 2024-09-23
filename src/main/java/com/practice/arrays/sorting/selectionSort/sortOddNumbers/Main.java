package com.practice.arrays.sorting.selectionSort.sortOddNumbers;

public class Main {

    public static void main(String[] args) {

        int[] array = {5, 8, 3, 6, 7, 2, 4};


        printArray(solution(array));

    }

    public static int[] solution(int[] array) {

        for (int i = 0; i < array.length -1; i++) {

            if (array[i] % 2 == 0) {

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

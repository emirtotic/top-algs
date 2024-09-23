package com.practice.arrays.sorting.bubbleSort;

public class Main {

    public static void main(String[] args) {

        int[] array = {0, 5, 3, 0, 8, 4, 0, 2};


        printArray(array);
        printArray(bubbleSort(array));

    }


    public static int[] bubbleSort(int[] array) {

        int[] result = array.clone();

       for (int i = 0; i < result.length - 1; i++) {
           for (int j = 0; j < result.length -1 - i; j++) {
               if (result[j] < result[j+1]) {
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
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(" ]\n");
    }

}

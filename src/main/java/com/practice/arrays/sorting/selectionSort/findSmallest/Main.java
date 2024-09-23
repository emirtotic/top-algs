package com.practice.arrays.sorting.selectionSort.findSmallest;

public class Main {

    public static void main(String[] args) {

        int[] array = {5, 8, 3, 6, 7, 2, 4};

        System.out.println(smallest(array));




    }


    public static int smallest(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

        }

        printArray(array);

        return array[0];
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

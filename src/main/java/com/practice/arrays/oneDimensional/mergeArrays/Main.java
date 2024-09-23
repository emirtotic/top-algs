package com.practice.arrays.oneDimensional.mergeArrays;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7};

        printArray(mergeArrays(array1, array2));

    }


    public static int[] mergeArrays(int[] array1, int[] array2) {

        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }

        int index = array1.length;

        for (int i = 0; i < array2.length; i++) {
            result[index++] = array2[i];

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

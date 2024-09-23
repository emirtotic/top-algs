package com.practice.arrays.oneDimensional.removeElement;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        printArray(array);

        // remove number on index

        printArray( removeElement(array, 2) );

    }

    public static int[] removeElement(int[] array, int targetIndex) {

        int[] newArray = new int[array.length - 1];

        // Kopiramo elemente, preskačući onaj na željenom indeksu
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != targetIndex) {
                newArray[j++] = array[i];
            }
        }

        return newArray;

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

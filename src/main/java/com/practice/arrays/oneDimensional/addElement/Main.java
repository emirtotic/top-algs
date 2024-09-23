package com.practice.arrays.oneDimensional.addElement;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        printArray(array);

        // add number 100 between 3 and 4

        printArray( addElement(array) );



    }

    public static int[] addElement(int[] array) {

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < 3; i++) {
            newArray[i] = array[i];
        }

        newArray[3] = 100;

        for (int i = 3; i < array.length; i++) {
            newArray[i + 1] = array[i];
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

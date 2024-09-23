package com.practice.arrays.oneDimensional.reverse;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
        reverse(array);
        printArray(array);


    }


    public static void reverse(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
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

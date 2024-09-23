package com.practice.arrays.oneDimensional.findMin;

public class Main {

    public static void main(String[] args) {

        int[] array = {23, 55, 21, 9, 20, 300};

        System.out.println(findMin(array));

    }

    public static int findMin(int[] array) {

        if (array.length == 0) {
            throw new IllegalArgumentException("Niz ne sme biti prazan.");
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;

    }

}

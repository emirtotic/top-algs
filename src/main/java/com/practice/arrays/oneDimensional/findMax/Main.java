package com.practice.arrays.oneDimensional.findMax;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 29, 22, 90, 3};

        System.out.println(findMax(array));

    }

    public static int findMax(int[] array) {

        if (array.length == 0) {
            throw new IllegalArgumentException("Niz ne sme biti prazan.");
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
           if (array[i] > max) {
               max = array[i];
           }
        }

        return max;

    }

}

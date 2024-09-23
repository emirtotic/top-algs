package com.practice.arrays.oneDimensional.sum;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(sum(array));

    }


    public static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }

}

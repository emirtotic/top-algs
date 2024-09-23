package com.practice.arrays.oneDimensional.average;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(average(numbers));

    }


    public static double average(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }

        return (double) sum / array.length;
    }

}

package com.practice.arrays.oneDimensional.vratiVeceOd;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 5, 8, 12, 4, 7};

        printArray(numbers);

        printArray(solution(numbers, 6));


    }

    public static int[] solution(int[] array, int target) {

        int countLength = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > target) {
                countLength++;
            }

        }

        int[] result = new int[countLength];
        int index = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > target) {
                result[index++] = array[i];
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

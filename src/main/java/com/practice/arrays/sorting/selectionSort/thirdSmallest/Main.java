package com.practice.arrays.sorting.selectionSort.thirdSmallest;

public class Main {

    public static void main(String[] args) {

        int[] array = {5, 8, 3, 6, 7, 2, 4};

        printArray(array);

        solution(array);

        System.out.println(solution(array));




    }


    public static int solution(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int smallestIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }

            }

            int temp = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = temp;

        }

        printArray(array);

        int smallest2 = array[0];
        int smallest3 = Integer.MAX_VALUE;



        for (int i = smallest2; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                smallest3 = i;
                break;
            }
        }

        if (smallest3 == Integer.MAX_VALUE) {
            return array[0];
        } else {
            return array[smallest3];
        }

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

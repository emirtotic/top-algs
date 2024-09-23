package com.practice.arrays.oneDimensional.kolikoSePutaPonavljaElement;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 4, 2, 5};

        System.out.println(solution(numbers, 2));

    }

    public static int solution(int[] array, int number) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == number) {
                count++;
            }

        }

        return count;

    }

}

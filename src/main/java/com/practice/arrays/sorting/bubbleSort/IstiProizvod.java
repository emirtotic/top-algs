package com.practice.arrays.sorting.bubbleSort;

import java.util.HashMap;
import java.util.Map;

public class IstiProizvod {

    public static void main(String[] args) {

        int[] array = {2, 4, 1, 6, 8, 3, 12};
        printArray(array);
        solution(array);


    }

    public static void solution(int[] array) {

        int[] sorted = array.clone();

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j + 1];
                    sorted[j + 1] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        printArray(sorted);

        // Mapiranje proizvoda parova i brojanje
        Map<Integer, Integer> productMap = new HashMap<>();

        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                int proizvod = sorted[i] * sorted[j];
                productMap.put(proizvod, productMap.getOrDefault(proizvod, 0) + 1);
            }
        }

        // Brojanje parova sa istim proizvodom
        int pairCount = 0;
        for (int count : productMap.values()) {
            if (count > 1) {
                pairCount++;
            }
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

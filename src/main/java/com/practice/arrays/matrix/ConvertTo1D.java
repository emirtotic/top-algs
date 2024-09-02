package com.practice.arrays.matrix;

import java.util.ArrayList;
import java.util.List;

public class ConvertTo1D {

    public static void main(String[] args) {

        int[][] matrica = {
                {1, 2},
                {3, 4}
        };

        print(matrica);
        System.out.println(matrica.length);
        convert(matrica);

    }


    public static int[] convert(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static int[] oprimalnoResenje(int[][] matrix) {
        // Izračunavanje ukupnog broja elemenata u matrici
        int totalElements = 0;
        for (int[] row : matrix) {
            totalElements += row.length;
        }

        // Kreiranje rezultatnog niza sa odgovarajućom veličinom
        int[] result = new int[totalElements];
        int index = 0;

        // Popunjavanje rezultatnog niza sa elementima iz matrice
        for (int[] row : matrix) {
            for (int value : row) {
                result[index++] = value;
            }
        }

        return result;
    }


    public static void print(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

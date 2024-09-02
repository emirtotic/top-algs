package com.practice.arrays.matrix;

import java.util.ArrayList;
import java.util.List;

public class ConvertTo2D {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int m = 3;
        int n = 3;

        print(convert(array, m, n));


    }


    public static int[][] convert(int[] original, int m, int n) {

        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];
        int indexOfInitialArray = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[indexOfInitialArray++];
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

package com.practice.arrays.matrix;

public class MatrixPrint {

    public static void main(String[] args) {

        int[][] matrica = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        printReverse(matrica);

    }

    public static void printReverse(int[][] matrix) {

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix.length; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
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

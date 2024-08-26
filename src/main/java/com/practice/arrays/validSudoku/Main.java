package com.practice.arrays.validSudoku;

import java.util.HashSet;
import java.util.Set;

// LeetCode 36
public class Main {

    public static void main(String[] args) {

        char[][] board = {{'5' , '3' , '.' , '.' , '7' , '.' , '.' , '.' , '.'}, {'6' , '.' , '.' , '1' , '9' , '5' , '.' , '.' , '.'}, {'.' , '9' , '8' , '.' , '.' , '.' , '.' , '6' , '.'}, {'8' , '.' , '.' , '.' , '6' , '.' , '.' , '.' , '3'}, {'4' , '.' , '.' , '8' , '.' , '3' , '.' , '.' , '1'}, {'7' , '.' , '.' , '.' , '2' , '.' , '.' , '.' , '6'}, {'.' , '6' , '.' , '.' , '.' , '.' , '2' , '8' , '.'}, {'.' , '.' , '.' , '4' , '1' , '9' , '.' , '.' , '5'}, {'.' , '.' , '.' , '.' , '8' , '.' , '.' , '7' , '9'}};

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {

        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];

        for (int i = 0; i < 9; i++) {

            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            gridSet[i] = new HashSet<>();

        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int gridNo = (i / 3) * 3 + (j / 3);

                if (board[i][j] != '.') {
                    boolean isPresentInRow = rowSet[i].contains(board[i][j]);
                    boolean isPresentInCol = colSet[i].contains(board[i][j]);
                    boolean isPresentInGrid = gridSet[gridNo].contains(board[i][j]);

                    if (isPresentInRow || isPresentInCol || isPresentInGrid) {
                        return false;
                    }

                    rowSet[i].add(board[i][j]);
                    colSet[i].add(board[i][j]);
                    gridSet[gridNo].add(board[i][j]);

                }
            }
        }

        return true;
    }

}

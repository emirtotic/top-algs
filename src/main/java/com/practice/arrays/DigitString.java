package com.practice.arrays;

public class DigitString {

    public static void main(String[] args) {

        char[] array = {'1', 'a', 'Z', '9', 'k', 't', '1'};

        System.out.println(solution(array));


    }

    public static String solution(char[] array) {

        String result = "";

        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i])) {
                result += array[i];
            }
        }

        return result;
    }
}

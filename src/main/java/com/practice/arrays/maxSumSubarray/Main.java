package com.practice.arrays.maxSumSubarray;

// LeetCode 53
public class Main {

    public static void main(String[] args) {

        int[] array = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(solution(array));

    }

    public static int solution(int[] array) {

        int answer = array[0];
        int currentSum = array[0];

        for (int i = 1; i < array.length; i++) {

            if (currentSum < 0) {
                currentSum = 0;
            }

            currentSum = currentSum + array[i];
            if (currentSum > answer) {
                answer = currentSum;
            }
        }

        return answer;
    }

}

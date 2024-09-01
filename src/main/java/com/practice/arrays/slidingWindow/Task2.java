package com.practice.arrays.slidingWindow;

/*
Naravno! Evo još jednog zadatka koji koristi tehniku sliding window:

Zadatak: Napiši funkciju u Javi koja pronalazi broj podnizova dužine tačno
𝑘
k u datom nizu brojeva koji imaju zbir koji je manji od datog broja 𝑥

Na primer, ako je niz [2, 1, 3, 4, 1], dužina 𝑘=3 i x = 7
x=7, broj podnizova čiji zbir je manji od 7
Ti podnizovi su [2, 1, 3], [1, 3, 4], i [3, 4, 1].

Napiši funkciju countSubarraysWithSumLessThan koja prima niz nums, celo broj k, i celo broj x, i vraća broj podnizova dužine
k čiji zbir je manji od x
 */

public class Task2 {

    public static void main(String[] args) {

        int[] array = {2, 1, 3, 4, 1};
        int k = 3;

        System.out.println(countSubarraysWithSumLessThan(array, k, 7));

    }

    public static int countSubarraysWithSumLessThan(int[] array, int k, int lessThan) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            sum += array[i];
        }

        if (sum < lessThan) {
            count++;
        }

        for (int i = 1; i <= array.length - k; i++) {
            sum = sum - array[i - 1] + array[i + k - 1];

            if (sum < lessThan) {
                count++;
            }

        }

        return count;

    }

}

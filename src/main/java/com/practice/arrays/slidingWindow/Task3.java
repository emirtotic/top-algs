package com.practice.arrays.slidingWindow;

/*
Napiši funkciju u Javi koja pronalazi maksimalnu sumu podniza fiksne dužine
k u datom nizu brojeva koji je deljiv sa datim brojem 𝑑

Na primer, ako je niz [2, 3, 5, 7, 11], dužina
𝑘=3 i d=5, maksimalna suma podniza dužine
3 koja je deljiva sa 5
5 je 15, što je suma podniza [3, 5, 7].

Napiši funkciju maxSumDivisibleBy koja prima niz nums, celo broj k, i celo broj d, i vraća maksimalnu sumu podniza dužine
k koja je deljiva sad. Ako nijedan podniz ne zadovoljava uslove, vrati -1.
 */

public class Task3 {

    public static void main(String[] args) {

        int[] array = {2, 3, 5, 7, 11};
        int k = 3;
        int d = 5;

        System.out.println(maxSumDivisibleBy(array, k, d));

    }

    public static int maxSumDivisibleBy(int[] array, int k, int d) {

        int result = -1;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += array[i];
        }

        if (sum % d == 0) {
            result = Math.max(result, sum);
        }

        for (int i = 1; i <= array.length - k; i++) {
            sum = sum - array[i - 1] + array[i + k - 1];
            if (sum % d == 0) {
                result = Math.max(result, sum);
            }
        }

        return result;

    }

}

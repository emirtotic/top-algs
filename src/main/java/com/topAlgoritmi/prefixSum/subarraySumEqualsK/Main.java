package com.topAlgoritmi.prefixSum.subarraySumEqualsK;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // NISAM URADIO!

        int[] arr = {1, 1, 1};
        int k = 2;
        int count = subarraySumEqualsK(arr, k);
        System.out.println(count);

// Očekivani izlaz: count = 2 (podnizovi su [1, 1] i [1, 1])

    }

    public static int subarraySumEqualsK(int[] arr, int k) {
        int result = 0;
        int sum = 0;

        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);  // Dodajemo 0 sa vrednošću 1 da obradimo slučajeve kada je podniz na početku niza.

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Ako postoji prefix suma koja odgovara sum - k, to znači da postoji podniz sa sumom k.
            if (prefixSumMap.containsKey(sum - k)) {
                result += prefixSumMap.get(sum - k);
            }

            // Ažuriramo mapu sa trenutnom sumom.
            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }

        return result;
    }


}

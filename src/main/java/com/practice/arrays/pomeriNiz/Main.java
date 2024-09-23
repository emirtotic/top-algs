package com.practice.arrays.pomeriNiz;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        printArray(solution(array, 2));



    }

    public static int[] solution(int[] array, int target) {

        int length = array.length;
        int[] result = new int[length];

        // Izračunaj efektivno pomeranje

        /**
         * Ako n (broj mesta za pomeranje) bude veći od dužine niza, operator % koristi se za pronalaženje
         * ekvivalentnog broja pomeranja unutar granica niza. Na primer, ako je dužina niza 5, pomeranje od 7 mesta
         * je isto kao pomeranje od 7 % 5 = 2 mesta. Ovo je zato što se niz nakon 5 mesta vrati na početak.
         */

        target = target % length;

        // Popuni novi niz
        for (int i = 0; i < length; i++) {
            result[i] = array[(i + target) % length];
        }

        return result;


    }





    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(" ]\n");
    }
}

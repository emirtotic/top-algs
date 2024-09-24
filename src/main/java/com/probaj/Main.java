package com.probaj;

public class Main {

    /*
    Zadata je metoda koja dobija kao parametre broj predmeta, broj velikih kutija i broj malih kutija,
velike kutije mogu da sadrze 5 predmeta, a male po jedan predmet( kutije se uvek pune do kraja ).
Potrebno je naci najmanji moguci broj kutija u koje se mogu smestiti proizvodi. Ako je ukupan kapacitet
kutija manji od zadatog broja predmeta kao rezultat se vraca -1 u suprotnom se vraca broj kutija
     */

    public static void main(String[] args) {

        int objects = 10;
        int bigBoxes = 3;
        int smallBoxes = 3;

        System.out.println(solution(objects, bigBoxes, smallBoxes));
    }


    public static int solution(int objects, int bigBox, int smallBox) {

        int maxBigBoxes = objects / 5; // Maksimalan broj velikih kutija koje možemo iskoristiti
        int usedBigBoxes = Math.min(maxBigBoxes, bigBox); // Koliko velikih kutija možemo iskoristiti
        int remainingObjects = objects - (usedBigBoxes * 5); // Preostali predmeti koje treba smestiti

        if (remainingObjects <= smallBox) { // Ako male kutije mogu pokriti preostale predmete
            return usedBigBoxes + remainingObjects; // Ukupan broj kutija
        }

        return -1;
    }

}



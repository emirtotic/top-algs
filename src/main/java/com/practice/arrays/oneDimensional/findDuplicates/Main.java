package com.practice.arrays.oneDimensional.findDuplicates;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //int[] array = {1, 2, 3, 2, 4, 5, 1, 6};
        int[] array = {1, 2, 3, 1, 2};

        solution(array);

    }

    public static int[] solution(int[] array) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (!set.contains(array[i])) {
                set.add(array[i]);
            } else {
                duplicates.add(array[i]);
            }
        }

        int[] result = new int[duplicates.size()];
        Integer[] toArray = duplicates.toArray(new Integer[duplicates.size()]);

        for (int i = 0; i < toArray.length; i++) {
            result[i] = toArray[i];
        }

        return result;

    }

}

package com.practice.arrays.leetCode;

public class Problem1894 {

    public static void main(String[] args) {
        int[] chalk = {3, 4, 1, 2};
        int k = 25;

        System.out.println(chalkReplacer2(chalk, k));

    }

    public static int chalkReplacer(int[] chalk, int k) {
        int last = 0;

        while (k >= 0) {

            for (int i = 0; i < chalk.length; i++) {
                k = k - chalk[i];
                System.out.println("student " + i + " will use " + chalk[i] + " chalks");
                System.out.println("Remaining chalks " + k);
                last = i;

                if (k < 0) {
                    break;
                }

            }
        }

        System.out.println("Result = " + last);

        return last;
    }

    public static int chalkReplacer2(int[] chalk, int k) {
        long totalChalk = 0;
        for (int num : chalk) {
            totalChalk += num;
        }

        k %= totalChalk;  // Reduce k to within the total chalk usage

        for (int i = 0; i < chalk.length; i++) {
            if (chalk[i] > k) {
                return i;
            }
            k -= chalk[i];
        }

        return -1; // This should never happen if input constraints are followed
    }

}

package com.practice.arrays.bestTimeToBuyAndSellStocks;

// LeetCode 121
public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {

        int[] array = {7, 1, 5, 3, 6, 4};
        //int[] array = {7,6,4,3,1};
        System.out.println(maxProfit(array));

    }

    public static int maxProfit(int[] prices) {

        int minSoFar = prices[0];
        int ans = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minSoFar;
            if (profit > ans) {
                ans = profit;
            }

            minSoFar = Math.min(prices[i], minSoFar);
        }
        return ans;
    }

    public static int mojeResenje(int[] prices) {

        int min = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }

            if (result <= prices[i] - min) {
                result = prices[i] - min;
            }

        }

        return result;

    }

}

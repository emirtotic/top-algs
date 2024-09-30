package com.practice.arrays.leetCode;

public class Problem14 {

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println("Longest Common Prefix (Example 1): " + longestCommonPrefix(strs1));
        System.out.println("Longest Common Prefix (Example 2): " + longestCommonPrefix(strs2));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Find the minimum length among all strings
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        // Perform binary search on prefix length
        int low = 0, high = minLength;
        String prefix = "";
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isCommonPrefix(strs, mid)) {
                prefix = strs[0].substring(0, mid);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return prefix;
    }

    private static boolean isCommonPrefix(String[] strs, int len) {
        String prefix = strs[0].substring(0, len);
        for (String str : strs) {
            if (!str.startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }

}

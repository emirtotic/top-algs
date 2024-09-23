package com.leetcode.longestCommonPrefix;

public class Main {


    public static void main(String[] args) {

        //String[] strs = new String[]{"flower", "flow", "flight"};
        String[] strs = new String[]{"ab", "a"};

        System.out.println(longestCommonPrefix(strs));
    }


    public static String longestCommonPrefix(String[] strs) {

        int size = smallestWord(strs);
        String result = "";

        if (strs.length > 1) {
            for (int i = 0; i < size; i++) {

                while (i < strs.length) {
                    if (Character.valueOf(strs[i].charAt(i)) == Character.valueOf(strs[i+1].charAt(i))) {
                        result = result + strs[0].charAt(i);
                    }
                }


            }
        } else {
            result = strs[0];
        }

        return result;
    }


    public static int smallestWord(String[] strs) {

        int smallest = 200;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < smallest) {
                smallest = strs[i].length();
            }
        }
        return smallest;
    }

}

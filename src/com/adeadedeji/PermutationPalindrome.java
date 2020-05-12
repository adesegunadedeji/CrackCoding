package com.adeadedeji;


import java.util.Calendar;

public class PermutationPalindrome {

    public static boolean isPermutationOfPalindrome(String s) {

        int[] char_counts = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char_counts[s.charAt(i)]++;
        }
        System.out.println(char_counts + "CHAR COUNTS AT 10");

        int count = 0;
        for (int i = 0; i < 128; i++) {
            count += char_counts[i] % 2;
        }
        return count <= 1;
    }
}
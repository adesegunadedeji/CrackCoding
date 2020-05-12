package com.adeadedeji;

import java.util.BitSet;

public class PermutationPalindrome {

    public static boolean isPermutationOfPalindrome(String s) {

        int[] char_counts = new int[128];
            s = s.replaceAll("\\s+","");
        for (int i = 0; i < s.length(); i++) {
            char_counts[s.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 128; i++) {
            count += char_counts[i] % 2;
        }
        return count <= 1;
    }

    public static boolean canPermutePalindrome (String s){

        if(s == null)
            return false; //Can be a Palindrome with null:
        s = s.replaceAll("\\s+","");
        BitSet bs = new BitSet(256); // Extended ASCII
        for (char c: s.toCharArray())
            bs.flip(c);
        return bs.cardinality() <=1;
    }
}
package com.adeadedeji;

import java.util.Arrays;

public class CheckPermutation {
    public static boolean checkPermutation(String str, String str2){
    if (str.length() != str2.length()) {
        return false;
    }
    return sort(str).equals(sort(str2));
    }

    //Split the string into a Character Array
    // Sort and check if they equal
    static String sort(String s){
    char [] contentArray = s.toCharArray();
    Arrays.sort(contentArray);
    return new String(contentArray);
}

    static boolean permutation(String str, String str2){
        if (str.length() != str2.length()) {
            return false;
        }

        int [] letters = new int[128]; //ASCII Assumption
        for (int i = 0; i < str.length() ; i++) {
            letters[str.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            letters[str2.charAt(i)]--;
            if(letters[str2.charAt(i)] < 0)
                return false;
        }
        return true;
    }
}

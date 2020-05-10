package com.adeadedeji;

public class IsUnique {
    //isUnique Algorithm to determine if a string has all unique Xters.
        public static boolean isUnique(String str){
        if (str.length() > 128)
            return false;
        boolean[] char_set = new boolean[128];
//            System.out.println("this is CharSET" + char_set);
        for (int i = 0; i <str.length() ; i++) {
            int value = str.charAt(i);
            if(char_set[value]) {
                return false;
            }
            char_set[value] = true;
        }
        return true;
    }
}

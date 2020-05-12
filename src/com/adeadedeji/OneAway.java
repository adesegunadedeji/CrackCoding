package com.adeadedeji;

public class OneAway {
    public static boolean oneEditAway(String stringOne, String stringTwo){
        if(Math.abs(stringOne.length() - stringTwo.length()) > 1){
            return false;
        }

        //Determine which String is longer or shorter

        String  s1 = stringOne.length() < stringTwo.length()? stringOne : stringTwo;
        String s2 = stringOne.length() < stringTwo.length()? stringTwo : stringOne ;

        int index1 = 0;
        int index2 = 0;
        boolean foundDiff = false;

        System.out.println(s1.charAt(2));

        while(index2 < s2.length() && index1 < s1.length()){
            if(s2.charAt(index2) != s1.charAt(index1)){
                if(foundDiff) return false;
                foundDiff = true;

                if (s1.length() == s2.length()){
                    index1++;
                }
            }
            else{
                index1++;
            }
            index2++;
        }
        return true;
    }
}

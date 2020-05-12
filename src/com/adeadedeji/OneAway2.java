package com.adeadedeji;

public class OneAway2 {


    public static boolean oneEditAway(String first, String second) {
        if(first.length() == second.length()){
            return oneEditReplace(first, second);
        }
        else if(first.length() + 1 == second.length()){
            return oneEditInsert(first, second);
        }
        else if(first.length() -1 == second.length()){
            return oneEditInsert(second,first);
        }
        return false;
    }

       static boolean oneEditReplace(String s1, String s2){
            boolean foundDiff = false;

            for (int i = 0; i <s1.length() ; i++) {
                boolean b = s1.charAt(i) != s2.charAt(i);
                System.out.println(b + " CHECKER  " + i);
                if(b){
                    if(foundDiff){
                        return false;
                    }
                   foundDiff = true;
                }
            }
            return true;
    }


   static  boolean oneEditInsert(String s1, String s2){

        int index1 = 0;
        int index2 = 0;
        while(index2 < s2.length() && index1 < s1.length()) {
            boolean bb = s2.charAt(index2) != s1.charAt(index1);
            if (bb) {
                System.out.println(bb + " THIS OCCURS " + index1 + "  and " + index2);
                if(index1 != index2)
                    return false;
                index2++;
            }
            else{
                index1++;
                index2++;
            }
        }

        return true;
    }
}

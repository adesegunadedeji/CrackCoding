package com.adeadedeji;

public class URLify {

    public static char[] replaceSpaces(char [] str, int trueLength) {
        int numberOfSpaces = countOfChar(str, 0, trueLength, ' ');
        System.out.println(str.length+ " String dot length");
        int newIndex = trueLength - 1 + numberOfSpaces * 2;
        System.out.println(newIndex);
        //If there is excess space add a null character. This should indicate that the spaces after that point have not been
        //replaces with %20;
        if(newIndex + 1 < str.length)
            str[newIndex+1] = '\0';

        for (int oldIndex = trueLength - 1; oldIndex >=0 ; oldIndex--) {
            if (str[oldIndex] == ' '){
                str[newIndex] = '0';
                str[newIndex-1] = '2';
                str[newIndex -2] = '%';
                newIndex = newIndex -3;
            }
            else{
                str[newIndex] = str[oldIndex];
                newIndex = newIndex -1;
            }
        }
        return str;
    }
    static int countOfChar(char [] str, int start, int end, int target){
        int counter =0;
        for (int i = start; i <end ; i++) {
            if(str[i] == target)
                counter++;
        }
        return counter;
    }

    //Assuming Space is not Considered at the End:
    public static String replaceSpace(String input, int lengthOfString){
        if(input == null)
            throw new IllegalArgumentException("Input String is Null");

        char [] chars = input.toCharArray();
        String newString = "";

        for (int i = 0; i <chars.length ; i++) {
            if(chars[i] == ' ') {
                newString += "%20";
            }
            else{
                newString += chars[i];
//                counter = 0;
            }
        }
        return newString;
    }

}

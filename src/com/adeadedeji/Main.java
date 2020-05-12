package com.adeadedeji;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] inputString = "Mr John Smith     ".toCharArray();
        char[] inputString2 = new char[0];
//        System.out.println(IsUnique.isUnique("Ade"));
//        System.out.println(CheckPermutation.checkPermutation("abcd","dbac"));
//        System.out.println(CheckPermutation.permutation("abcd","dbac"));
//        System.out.println(URLify.replaceSpaces(inputString, 13));
//          System.out.println(URLify.replaceSpace("Mr John Smith", 13));
//        System.out.println(PermutationPalindrome.isPermutationOfPalindrome("Tact Coa"));
            System.out.println(OneAway.oneEditAway("pale", "bake"));
            System.out.println(OneAway2.oneEditAway("pale", "ple"));

    }

}

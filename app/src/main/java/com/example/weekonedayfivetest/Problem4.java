package com.example.weekonedayfivetest;

public class Problem4 {
    public static boolean checkAnagrams(String word1, String word2){
        boolean check = false;
        if (word1.length() == word2.length() ) {
            for (int i = 0; i < word1.length(); i++ ) {
                for (int j = 0; j <word2.length(); j++) {
                    if(word1.charAt(i) != word2.charAt(j)) check = true;

                }
            }
        }
        return check;
    }
}

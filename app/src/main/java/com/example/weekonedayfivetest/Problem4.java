package com.example.weekonedayfivetest;

public class Problem4 {
    public boolean checkAnagrams(String word1, String word2){
        boolean check = true;
        for (int i = 0,j = word2.length(); i < word1.length()/2; i++,j--){
            if(word1.charAt(i) != word2.charAt(j)) check = false;
        }
        return check;
    }
}

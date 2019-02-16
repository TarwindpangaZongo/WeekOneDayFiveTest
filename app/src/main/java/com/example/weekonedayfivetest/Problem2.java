package com.example.weekonedayfivetest;

public class Problem2 {

    public boolean checkPalindrome(String word){
        boolean check = true;
        for (int i = 0,j = word.length()-1; i < word.length()/2; i++,j--){
            if(word.charAt(i) != word.charAt(j)) check = false;
        }
        return check;
    }
}

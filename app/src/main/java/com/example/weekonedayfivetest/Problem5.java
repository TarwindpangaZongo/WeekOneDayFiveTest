package com.example.weekonedayfivetest;

public class Problem5 {
    public static void main(String[] args) {
        int multiplier = 2;
        int[ ][ ] myArray = new int[2][10];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++ ) {
                if (i == 0) myArray[i][j] = j+1;
                else if (i == 1) myArray[i][j] = (j+1)* multiplier;
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

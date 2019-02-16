package com.example.weekonedayfivetest;

public class Problem6 {

    public void duplicatPosition ( int row, int columns, char[][] myArray){
        String output = "{";

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++ ) {
                for (int k = 0; k < row; k++) {
                    for (int l = 0; l < columns; l++) {
                        char temp = myArray[i][j];
                        char temp0 = myArray[k][l];
                        if (i != k && j != l) {
                            if (temp == temp0) {
                                output = output + i + "," + j + "|";
                            }
                        }
                    }
                }
            }
        }
        output = output + "}";
        System.out.println(output);
    }
}

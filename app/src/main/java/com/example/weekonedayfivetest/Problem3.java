package com.example.weekonedayfivetest;

public class Problem3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            fizzBuzz(i);
        }

    }
    public static void fizzBuzz(int count){
        if(count % 3 == 0 && count % 5 == 0)System.out.println("fizzbuzz  " + count);
        else if (count % 3 == 0) System.out.println("fizz" + count);
        else if (count % 5 == 0) System.out.println("buzz  " + count);
    }
}

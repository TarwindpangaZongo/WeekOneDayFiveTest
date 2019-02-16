package com.example.weekonedayfivetest;

public class ThejungleProblem {
    public static void main(String[] args) {

        Tigers tiger = new Tigers("Tigers", "Woaaa", 2, 50);
        tiger.currentEnergy();
        tiger.randomSelection();
        System.out.println("");

        Monkey monkey = new Monkey("Monkey", "Oooo", 5, 35);
        monkey.currentEnergy();
        monkey.randomSelection();
        System.out.println("");

        Snakes snakes = new Snakes("Snakes", "Ssss", 2, 15);
        snakes.currentEnergy();
        snakes.randomSelection();
        System.out.println("");

    }

}

package com.example.weekonedayfivetest;

import java.util.Random;

public class Monkey extends Animal {
    Monkey(String type, String sound, int numKind, int energy) {
        super(type, sound, numKind, energy);
    }
    public void eatFood() {
        setEnergy(getEnergy() + 3);
        System.out.println("After eating ");
        currentEnergy();
    }

    public void makeSound() {
        System.out.println(getSound());
        setEnergy(getEnergy() - 4);
        System.out.println("After making a sound ");
        currentEnergy();
    }

    public void play() {
        if(super.getEnergy() > 8) {
            setEnergy(getEnergy() - 8);
            System.out.println("Oooo Oooo Oooo");
            System.out.println("After playing ");
            currentEnergy();
        }
        else System.out.println("Monkey is too tired");
    }


    public void randomSelection() {
        Random rand = new Random();
        numberOfMethods = 4;
        switch (rand.nextInt(numberOfMethods)) {
            case 0:
                makeSound();
                break;

            case 1:
                sleep();
                break;

            case 2:
                eatFood();
                break;

            case 3:
                play();
                break;
        }
    }
}

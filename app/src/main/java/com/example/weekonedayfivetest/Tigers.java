package com.example.weekonedayfivetest;

import java.util.Random;

public class Tigers extends Animal {

    public Tigers(String type, String sound, int numKind, int energy) {
        super(type, sound, numKind, energy);
    }

    public void sleep() {
        setEnergy(getEnergy() + 5);
        System.out.println("After sleeping ");
        currentEnergy();
    }
    public void eatFood() {
        setEnergy(getEnergy() + 5);
        System.out.println("The "+getType() + " eat "+ foodSelection());
        System.out.println("After eating food");
        currentEnergy();

    }
    public String foodSelection() {
        Random rand = new Random();
        int food = 2;
        String foodType = "";
        switch (rand.nextInt(food)) {
            case 0:
                foodType = "meat";
                break;

            case 1:
                foodType = "fish";
                break;

            case 2:
                foodType = "bugs";
                break;
        }

        return foodType;
    }
}

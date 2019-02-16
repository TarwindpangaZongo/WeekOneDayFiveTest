package com.example.weekonedayfivetest;

import java.util.Random;

public class Animal {
    protected String type;
    protected String sound;
    protected int    numKind;
    protected int    energy;
    protected int numberOfMethods = 3;

    Animal(String type, String sound, int numKind, int energy){
        setType(type);
        setSound(sound);
        setNumKind(numKind);
        setEnergy(energy);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumKind() {
        return numKind;
    }

    public void setNumKind(int numKind) {
        this.numKind = numKind;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public void makeSound() {
        System.out.println(getSound());
        setEnergy(getEnergy() - 3);
        System.out.println("After making sound");
        currentEnergy();
    }
    public void eatFood() {
        setEnergy(getEnergy() + 5);
        System.out.println("The"+getType() + " eat "+ foodSelection());
        System.out.println("After eating food");
        currentEnergy();
    }
    public void sleep() {
        setEnergy(getEnergy() + 10);
        System.out.println("After sleeping ");
        currentEnergy();
    }
    public void NumberOfKind() {
        System.out.println("The number of "+ getType() + " is: " + getNumKind());
    }
    public void currentEnergy() {
        System.out.println("The "+ type + " current energy is: " + energy);
    }

    public void randomSelection() {
        Random rand = new Random();
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
        }
    }

    public String foodSelection() {
        Random rand = new Random();
        int food = 3;
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
            case 3:
                foodType = "grain";
                break;
        }

        return foodType;
    }
}

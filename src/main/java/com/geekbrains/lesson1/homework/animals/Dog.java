package com.geekbrains.lesson1.homework.animals;

public class Dog extends Animal {
    public static int countDogs = 0;
    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        countDogs ++;
    }
}

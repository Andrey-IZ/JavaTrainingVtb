package com.geekbrains.lesson1.homework.animals;

public class Cat extends Animal {

    public static int countCats = 0;
    public Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        countCats++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("не умеет плавать");
    }
}

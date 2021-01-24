package com.geekbrains.lesson1.homework.animals;

public class Animal {
    protected int runDistance;
    protected int swimDistance;
    protected String name;

    public static int countAnimals = 0;

    public Animal(String name, int runDistance, int swimDistance) {
        countAnimals++;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.name = name;
    }

    public void run(int distance) {
        if (distance <= this.runDistance)
            System.out.println(name + " смог пробежать " + distance + "м");
        else {
            System.out.println(name + "не смог пробежать");
        }
    }

    public void swim(int distance) {
        if (distance <= this.swimDistance)
            System.out.println(name + " смог проплыть " + distance + "м");
        else {
            System.out.println(name + " не смог проплыть");
        }
    }
}

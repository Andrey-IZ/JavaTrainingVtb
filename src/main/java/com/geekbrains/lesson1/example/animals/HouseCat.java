package com.geekbrains.lesson1.example.animals;

public class HouseCat extends Cat{
    public static int count;
    public HouseCat(String name, int maxRunDistance) {
        super("house cat", name, maxRunDistance, 0);
        count++;
    }
}

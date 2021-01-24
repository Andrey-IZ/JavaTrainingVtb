package com.geekbrains.lesson1.example.animals;


public class Tiger extends Cat{
    public static int count;
    public Tiger(String name, int maxRunDistance, int maxSwimDistance) {
        super("tiger", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}

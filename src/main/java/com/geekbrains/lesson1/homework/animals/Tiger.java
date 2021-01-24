package com.geekbrains.lesson1.homework.animals;

public class Tiger extends Animal {
    public static int countTiger = 0;
    public Tiger(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        countTiger ++;
    }
}

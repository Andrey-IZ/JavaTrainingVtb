package com.geekbrains.lesson1.example.animals;

public abstract class Animal {
    public static int count;

    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + "успешно справился с бегом: " + distance + "м.");
        } else {
            System.out.println(type + " " + name + "не смог справился с бегом:" + distance + "м.");
        }
    }

    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println(type + " " + name + "не умеет плавать");
        }
        if (distance <= maxSwimDistance) {
            System.out.println(type + " " + name + "успешно справился с заплывом:  " + distance + "м.");
        } else {
            System.out.println(type + " " + name + "не смог справился с заплывом: " + distance + "м.");
        }
    }
}

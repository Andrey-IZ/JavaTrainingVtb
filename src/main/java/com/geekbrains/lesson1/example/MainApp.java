package com.geekbrains.lesson1.example;

import com.geekbrains.lesson1.example.animals.*;

public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new HouseCat("Барсик", 200),
                new Dog("Бобик", 1000, 50),
                new Tiger("Тигра", 10000, 500),
        };

        for (Animal animal: animals) {
            animal.run(800);
            animal.swim(40);
        }
        System.out.println("Animals count: " + Animal.count);
        System.out.println("Cats count: " + Cat.count);
    }
}

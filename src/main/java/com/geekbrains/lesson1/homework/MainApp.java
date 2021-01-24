package com.geekbrains.lesson1.homework;

import com.geekbrains.lesson1.homework.animals.Animal;
import com.geekbrains.lesson1.homework.animals.Cat;
import com.geekbrains.lesson1.homework.animals.Dog;
import com.geekbrains.lesson1.homework.animals.Tiger;

public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("cat", 200, 0),
                new Dog("dog", 500, 10),
                new Tiger( "tiger", 1000, 1),
        };

        int distance = 160;
        for (Animal animal: animals) {
            animal.run(distance);
            animal.swim(distance);
        }
        System.out.println("Summary animals: " + Animal.countAnimals);
        System.out.println("amount cats: " + Cat.countCats);
        System.out.println("amount tigers: " + Tiger.countTiger);
        System.out.println("amount dogs: " + Dog.countDogs);
    }
}

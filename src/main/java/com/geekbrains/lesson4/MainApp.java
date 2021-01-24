package com.geekbrains.lesson4;

import com.geekbrains.lesson4.fruits.Apple;
import com.geekbrains.lesson4.fruits.Fruit;
import com.geekbrains.lesson4.fruits.FruitBox;
import com.geekbrains.lesson4.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        var res= toList(new Integer[]{1,2,3});
        System.out.println(res);

        FruitBox<Apple> ab1 = new FruitBox<>(new Apple());
        FruitBox<Orange> ab2 = new FruitBox<>(new Orange());
        FruitBox<Apple> ab3 = new FruitBox<>(new Apple());
        FruitBox<Fruit> ab4 = new FruitBox<>();

        ab1.transfer(ab4);
        ab1.transfer(ab3);
        ab1.transfer(ab4);
    }

    public static <T> void swap(T[] array, int index1, int index2) {
        T tmp = array[index1];
        array[index2] = tmp;
    }

    public static <T> ArrayList<T> toList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}

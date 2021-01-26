package com.geekbrains.homework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestApp {

    public static void main(String[] args) {
//        var c = String.class;
        var c = Cat.class;
        var cat = new Cat("red", 2);
        Arrays.stream(c.getInterfaces()).forEach(System.out::println);
        System.out.println("------------------");
        Arrays.stream(c.getFields()).forEach(System.out::println);
        System.out.println("------------------");
        Arrays.stream(c.getDeclaredClasses()).forEach(System.out::println);
        System.out.println("------------------");
        Arrays.stream(c.getDeclaredFields()).forEach(System.out::println);
        System.out.println("------------------");
        Arrays.stream(c.getDeclaredMethods())
                .map(method -> method.getReturnType() + Arrays.stream(method.getParameters())
                    .map(Parameter::toString)
                    .collect(Collectors.joining(",")))
                .forEach(System.out::println);
        try {
            System.out.println("age = " + cat.getClass().getField("age").get(cat));
            var f = cat.getClass().getDeclaredField("aaa");
//            f.setAccessible(true);
            f.set(cat, 22.0f);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        Arrays.stream(c.getConstructors()).forEach(System.out::println);
        try {
            System.out.println(c.getConstructor(String.class, int.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            var m = Cat.class.getDeclaredMethod("method1", int.class);
            m.invoke(cat, 2);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        try {
            var cat2 = Cat.class.getConstructor(String.class, int.class).newInstance("white", 2);
            System.out.println(cat2);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(int.class);
    }
    public static class Cat {
        public String name;
        public String color;
        public int age;
        private float aaa;
        protected char sss;

        public Cat(String color, int age) {
            this.color = color;
            this.age = age;
        }

        private int method1(int w) {
            System.out.println("method1: " + w + " " + aaa);
            return 0;
        }

        public float method() {
            return 2;
        }
    }
}

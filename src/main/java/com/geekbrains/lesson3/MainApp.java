package com.geekbrains.lesson3;

import com.geekbrains.lesson3.exceptions.MyArrayDataException;
import com.geekbrains.lesson3.exceptions.MyArraySizeException;

public class MainApp {
    public static void main(String[] args) {
        String[][] array = {
                {"2","5","1","66"},
                {"2","5","1","66"},
                {"2","5","1","66"},
                {"2","5","1","66"},
        };

        try {
            System.out.println("результат: " + new Tester(4,4).getResult(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }
}

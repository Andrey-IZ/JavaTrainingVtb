package com.geekbrains.example;

public class MyArraySizeException extends MyException {
    public MyArraySizeException() {
        super("Размер входного массива не 4x4");
    }
}

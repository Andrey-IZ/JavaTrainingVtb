package com.geekbrains.lesson3.exceptions;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(String message) {
        super(String.format("в ячейке массива лежит что-то не то\n %s",message));
    }
}

package com.geekbrains.lesson3.exceptions;

public class MyArraySizeException extends Exception{
    private final int _invalid_size;
    public MyArraySizeException(int invalidSize) {
        super("неправильный размер массива");
        _invalid_size = invalidSize;
    }

    public int getInvalidSize() {
        return _invalid_size;
    }
}

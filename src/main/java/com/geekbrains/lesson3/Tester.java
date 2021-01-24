package com.geekbrains.lesson3;

import com.geekbrains.lesson3.exceptions.MyArrayDataException;
import com.geekbrains.lesson3.exceptions.MyArraySizeException;

public class Tester {
    private final int max1Dec;
    private final int max2Dec;

    public Tester(int max1Dec, int max2Dec) {
        this.max1Dec = max1Dec;
        this.max2Dec = max2Dec;
    }

    public int getResult(String[][] array) throws MyArraySizeException, MyArrayDataException {
        checkArraySize(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("в ячейке [%d,%d] лежат неверные данные", i, j));
                }
            }
        }
        return sum;
    }

    private void checkArraySize(String[][] array) throws MyArraySizeException {
        boolean res = false;
        if (array.length != max1Dec)
            throw new MyArraySizeException(array.length);
        for (String[] strings : array) {
            if (strings.length != max2Dec) {
                throw new MyArraySizeException(strings.length);
            }
        }
    }
}

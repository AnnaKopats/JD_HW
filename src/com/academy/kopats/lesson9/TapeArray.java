package com.academy.kopats.lesson9;

public class TapeArray<T> {
    private T[] array;

    public TapeArray(T[] array) {
        this.array = array;
    }

    public T getArrayIndex(int i) {
            if (i<0 || i >= array.length) {
                String a = "Нет такого элемента";
                return (T) a;
            }
        return array[i];
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int getLength() {
        return array.length;
    }
}

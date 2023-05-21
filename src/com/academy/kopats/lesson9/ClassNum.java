package com.academy.kopats.lesson9;

public class ClassNum <T> {
    private T value;

    public <U extends Number> ClassNum(T value) {
        this.value = value;
    }

    public <U extends Number> boolean strEquals(T val) {
        int s1 = value.toString().length();
        int s2 = val.toString().length();
        return s1 == s2;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}



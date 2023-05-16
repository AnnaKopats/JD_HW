package com.academy.kopats.lesson9;

public class ClassNum {
    private Integer value;

    <T extends Number> ClassNum(T val) {
        value = val.intValue();
    }

    public <T extends Number> boolean strEquals(T val) {
        int s1 = Integer.toString(value).length();
        int s2 = val.toString().length();
        return s1 == s2;
    }


    public double getValue() {
        return value;
    }

    public void setValue(int val) {
        this.value = val;
    }
}

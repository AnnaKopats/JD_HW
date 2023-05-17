package com.academy.kopats.lesson9;

public class ClassNum {//параметризовать надо весь класс
    private Integer value;  //тут хранить не Integer а переменную того типа, которая будет передана в конструктор

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

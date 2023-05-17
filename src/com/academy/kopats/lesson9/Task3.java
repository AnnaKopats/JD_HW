package com.academy.kopats.lesson9;

public class Task3 {
    public static void main(String[] args) {
        ClassNum num1 = new ClassNum(58); //и тут соответвенно появится параметризация ClassNum<Integer> num1 = ...
        Integer num2 = 58;
        System.out.println(num1.strEquals(num2));

        ClassNum num3 = new ClassNum(580);
        Long num4 = 58L;
        System.out.println(num3.strEquals(num4));
    }
}

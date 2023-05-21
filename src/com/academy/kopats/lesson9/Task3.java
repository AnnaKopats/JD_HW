package com.academy.kopats.lesson9;

public class Task3 {
    public static void main(String[] args) {
        ClassNum<Integer> num1 = new ClassNum<>(58);
        ClassNum<Integer> num2 = new ClassNum<>(58);
        System.out.println(num1.strEquals(num2.getValue()));

        ClassNum<Long> num3 = new ClassNum<>(58L);
        ClassNum<Long> num4 = new ClassNum<>(1023L);
        System.out.println(num3.strEquals(num4.getValue()));

    }
}

package com.academy.kopats.lesson5;

public class Task2 {

    public static void main(String[] args) {
        Fraction fr1 = new Fraction(28, 93);
        Fraction fr2 = new Fraction(12, 55);

        String f1Str = fr1.printFraction();
        System.out.println("Первая дробь " + f1Str);
        String f2Str = fr2.printFraction();
        System.out.println("Вторая дробь " + f2Str);

        System.out.println(f1Str + " + " + f2Str + " = " + fr1.add(fr2).printFraction());

        int number = 2;

        System.out.println(f1Str + " * " + number + " = " + fr1.multiply(number).printFraction());

        System.out.println(f1Str + " / " + number + " = " + fr1.divide(number).printFraction());
    }

}

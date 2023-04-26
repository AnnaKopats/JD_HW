package com.academy.kopats.lesson5;

public class Task2 {

    public static void main(String[] args) {
        Fraction fr1 = new Fraction(28, 93);
        Fraction fr2 = new Fraction(12, 55);

        String f1Str = fr1.printFraction();
        System.out.println("Первая дробь " + f1Str);
        String f2Str = fr2.printFraction();
        System.out.println("Вторая дробь " + f2Str);
        Fraction temp = new Fraction(fr1);

        temp.add(fr2);
        System.out.println(f1Str + " + " + f2Str + " = " + temp.printFraction());
        temp.setValue(fr1);

        int number = 2;

        temp.multiply(number);
        System.out.println(f1Str + " * " + number + " = " + temp.printFraction());
        temp.setValue(fr1);

        temp.divide(number);
        System.out.println(f1Str + " / " + number + " = " + temp.printFraction());
    }

}

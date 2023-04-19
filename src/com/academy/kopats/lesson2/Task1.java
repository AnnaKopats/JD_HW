package com.academy.kopats.lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.println("Сумма двух чисел в десятичном формате равна: " + num1 + num2);
        System.out.println("Сумма двух чисел в двоичном формате равна: " + Integer.toBinaryString(num1 + num2));
        System.out.println("Сумма двух чисел в восьмеричном формате равна: " + Integer.toOctalString(num1 + num2));
        System.out.println("Сумма двух чисел в шестнадцатеричном формате равна: " + Integer.toHexString(num1 + num2));
    }
}

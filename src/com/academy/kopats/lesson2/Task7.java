package com.academy.kopats.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Случайное число:");
        Random rand = new Random();
        int a = rand.nextInt(101);
        System.out.println(a);
        System.out.println("Введите число с порядком более чем 10^20");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.println("Результат умножения случайного и введенного числа равен: " + (a * number));
    }
}

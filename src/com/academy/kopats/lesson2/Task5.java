package com.academy.kopats.lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько вам лет:");
        int age = scanner.nextInt();
        int lastDigit = age % 10;
        int previousLastDigit = age / 10 % 10;
        if (previousLastDigit == 1) {
            System.out.print("лет");
        } else {
            switch (lastDigit) {
                case 1 -> System.out.print("Вам " + age + " год");
                case 2, 3, 4 -> System.out.print("Вам " + age + " года");
                default -> System.out.print("Вам " + age + " лет");
            }
        }
    }
}
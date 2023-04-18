package com.academy.kopats.lesson2;

import java.util.Scanner;

import static java.lang.Math.round;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите вещественное число с количеством порядков после запятой не менее 5:");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.format("%.3f",number);
    }
}

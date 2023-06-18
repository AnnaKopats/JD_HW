package com.academy.kopats.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Наибольший общий делитель этих чисел равен: " + maxDivisor(a, b));
    }

    public static int maxDivisor(int n, int m) {
        if (n == m) return n;
        else if (n > m) return maxDivisor(n - m, m);
        else
            return maxDivisor(n, m - n);
    }
}


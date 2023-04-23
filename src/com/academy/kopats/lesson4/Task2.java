package com.academy.kopats.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Наибольший общий делитель этих чисел равен: " + MaxDivisor(a, b));
    }

    public static int MaxDivisor(int n, int m) { //конвеншн именования методов. кэмел-кейс с маленькой(!) буквы
        if (n == m) return n;
        else if (n > m) return MaxDivisor(n - m, m);
        else
            return MaxDivisor(n, m - n);
    }
}


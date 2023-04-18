package com.academy.kopats.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        gcdNum(5,6);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите два числа: ");
        int num1 = scanner.nextInt(50);
        int num2 = scanner.nextInt(20);
    }

    public static int gcdNum(int n, int m) {
        int gcd = 1;
        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
                System.out.println(gcd);

            }

        }

        return gcd;
    }
}
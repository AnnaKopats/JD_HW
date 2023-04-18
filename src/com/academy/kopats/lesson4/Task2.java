package com.academy.kopats.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите два числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = 1;
        int maxGcd = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                if (gcd > maxGcd) {
                    maxGcd = gcd;
                }
            }
        }
        System.out.println("НОД " + num1 + " и " + num2 + " " + "равен: " + maxGcd);
    }
}
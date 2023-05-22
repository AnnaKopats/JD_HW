package com.academy.kopats.lesson10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stop = "end";
        boolean equals = false;
        double i;
        double sum = 0;
        double sqrt = 0;
        do {
            System.out.println("Введите строку: ");
            String s = sc.nextLine();
            equals = s.equals(stop);
            try {
                if (!equals) {
                    i = Double.parseDouble(s);
                    System.out.println(i);
                    sum += i;
                    sqrt = Math.sqrt(sum);
                    if (sum < 0) throw new ArithmeticException();
                    System.out.println("Корень из суммы введенных чисел = " + sqrt);
                }
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Перехвачено исключение: " + e.getClass());
            }
        } while (!equals);
    }
}


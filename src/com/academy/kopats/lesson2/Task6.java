package com.academy.kopats.lesson2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый коэффициент квадратного уравнения отличный от нуля:");
        double a = scanner.nextInt();
        if (a == 0) {
            System.out.println("Вы ввели некорректные данные");
            return;
        }
        System.out.println("Введите второй коэффициент квадратного уравнения:");
        double b = scanner.nextInt();
        System.out.println("Введите третий коэффициент квадратного уравнения:");
        double c = scanner.nextInt();
        System.out.println("Решаем квадратное уравнение: " + a + "х^2" + "+" + b + "x" + "+" + c + "=" + "0");
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}

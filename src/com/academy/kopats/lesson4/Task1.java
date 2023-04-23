package com.academy.kopats.lesson4;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(arithmetic(0.3, 756.13));
        System.out.println(arithmeticPart(0.3, 756.13));
        System.out.println(function(1.21, 0.371));
        functionTab();
    }

    //Контрольное задание 1/1
    public static double arithmetic(double x, double a) {
        double z = Math.pow((Math.pow(x, 2) + Math.PI / 6), 5) - x * Math.sqrt(Math.pow(a, 3)) - Math.log(Math.abs((a - 1.12 * x) / 4)); //там косинус еще был
        return z;
    }

    //Контрольное задание 1/2
    public static double arithmeticPart(double x, double a) {
        double cos = Math.pow((Math.pow(x, 2) + Math.PI / 6), 5);
        double sqrt = x * Math.sqrt(Math.pow(a, 3));
        double log = Math.log(Math.abs((a - 1.12 * x) / 4));
        double z = cos - sqrt - log;
        return z;
    }

    //Контрольное задание 2
    public static double function(double a, double b) {
        double y = Math.tan(Math.sqrt(a + b)) - Math.cbrt(a + 1.5) + a * Math.pow(b, 5) - b / Math.log(Math.pow(a, 2));
        return y;
    }

    //Контрольное задание 3
    public static void functionTab() {
        double a = 3.75;
        double x = 12.1;
        double y = 0;

        System.out.println(" ------------------------------");
        System.out.println("|     a    |     x    |         y        |");
        for (a = -5; a <= 12; a = a + 3.75) {
            y = Math.exp(a * x) - 3.45 * a;
            System.out.println(" ------------------------------");

            System.out.print("|  " + a + "   |" + "|  " + x + "   |" + y + "|\n");
        }
        System.out.println(" ------------------------------");
        System.out.println();
    }
}

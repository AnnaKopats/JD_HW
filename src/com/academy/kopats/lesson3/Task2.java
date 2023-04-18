package com.academy.kopats.lesson3;

public class Task2 {
    public static void main(String[] args) {
        for (int n = 0; n <= 9; n++) {
            System.out.print(n);
        }
        System.out.print("0");
        for (int i = 0; i <= 99; ) {
            System.out.print(i);
            i = i + 11;
        }
        System.out.print("00");
        for (int i = 0; i <= 999; ) {
            System.out.print(i);
            i = i + 111;
        }
        System.out.print("000");
        for (int i = 0; i <= 9999; ) {
            System.out.print(i);
            i = i + 1111;
        }
    }
}

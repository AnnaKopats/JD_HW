package com.academy.kopats.lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int password = 160423;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        int enterPassword = scanner.nextInt();
        while (password != enterPassword) {
            System.out.print("Неверный пароль, попробуйте еще раз: ");
            enterPassword = scanner.nextInt();
        }
        System.out.println("Добро пожаловать!");
    }
}





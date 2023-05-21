package com.academy.kopats.lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        System.out.println(str);
    }
}

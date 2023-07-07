package com.academy.kopats.lesson21;

import com.academy.kopats.lesson7.Document;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой напиток желаете приготовить? \n Введите: кофе или чай");
        String s = sc.nextLine();
        Drinks drinks = null;

        if (s.equals("кофе")) {
            drinks = new Coffee();
        } else if (s.equals("чай")) {
            drinks = new Tea();
        }
        System.out.println("Что желаете добавить в напиток? ");
        boolean equals = false;
        do {
            System.out.println("Сахар, молоко, сироп? По завершении выбора введите стоп.");
            s = sc.nextLine();
            if (s.equals("сахар")) {
                drinks = new SugarDecorator(drinks);
            } else if (s.equals("молоко")) {
                drinks = new MilkDecorator(drinks);
            } else if (s.equals("сироп")) {
                drinks = new SyrupDecorator(drinks);
            }
            equals = s.equals("стоп");
        } while (!equals);
        System.out.println("Ваш напиток готов");
    }
}

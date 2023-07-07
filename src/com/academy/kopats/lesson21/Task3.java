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

        Drinks coffee;
        Drinks tea;

        if (s.equals("кофе")) {
            coffee = new Coffee();
        } else if (s.equals("чай")) {
            tea = new Tea();
        }
        System.out.println("Что желаете добавить в напиток? ");
        boolean equals = false;
        do {
            System.out.println("Сахар, молоко, сироп? По завершении выбора введите стоп.");
            s = sc.nextLine();
            if (s.equals("сахар")) {
                coffee = new SugarDecorator(new Coffee());
                tea = new SugarDecorator(new Tea());
            } else if (s.equals("молоко")) {
                coffee = new MilkDecorator(new Coffee());
                tea = new MilkDecorator(new Tea());
            } else if (s.equals("сироп")) {
                coffee = new SyrupDecorator(new Coffee());
                tea = new SugarDecorator(new Tea());
            }
            equals = s.equals("стоп");
        } while (!equals);
        System.out.println("Ваш напиток готов");
    }
}

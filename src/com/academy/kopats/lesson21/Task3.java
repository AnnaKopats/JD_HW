package com.academy.kopats.lesson21;

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
        if (s.equals("кофе")) {
            new Coffee().prepare();
        } else if (s.equals("чай")) {
            new Tea().prepare();
        }
        System.out.println("Что желаете добавить в напиток? ");
        boolean equals = false;
        do {
            System.out.println("Сахар, молоко, сироп? По завершении выбора введите стоп.");
            s = sc.nextLine();
            if (s.equals("сахар")) {
                new SugarDecorator().addIngredients(); //декоратор должен не метод вызывать, а в конструктор принимать объект. разберись как работает паттерн
            } else if (s.equals("молоко")) {
                new MilkDecorator().addIngredients();
            } else if (s.equals("сироп")) {
                new SyrupDecorator().addIngredients();
            }
            equals = s.equals("стоп");
        } while (!equals);
        System.out.println("Ваш напиток готов");
    }
}

package com.academy.kopats.lesson20;

//import sun.util.locale.BaseLocale;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean equals = false;
        do {
            System.out.println("Введите ru, или be, или en, или end:");
            String locale = String.valueOf(Locale.of(sc.nextLine()));
            if (locale.equals("ru") || locale.equals("be")) {
                System.out.println("Текущая дата: " + DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDate.now()));
            } else if (locale.equals("en")) {
                System.out.println("Текущая дата: " + DateTimeFormatter.ISO_DATE.withLocale(Locale.US).format(LocalDate.now()));
            }

            equals = locale.equals("end");
            if (!equals) {
                String baseName = "com.academy.kopats.lesson20.messages";
                ResourceBundle bundle = ResourceBundle.getBundle(baseName, Locale.of(locale));
                String greeting = bundle.getString("greeting");
                System.out.println(greeting);
            }
        } while (!equals);
    }

}

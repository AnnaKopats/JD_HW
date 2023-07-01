package com.academy.kopats.lesson20;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(isDateOdd("2023-02-16"));
        System.out.println(isDateOdd("2020-01-10"));
        System.out.println(isDateOdd("2021-04-05"));
        System.out.println(isDateOdd("2022-10-07"));
        System.out.println(isDateOdd("2023-01-13"));

    }

    public static boolean isDateOdd(String date) {
        LocalDate date11 = LocalDate.parse(date);
        int dayOfYear = date11.getDayOfYear();
        if (dayOfYear % 2 == 0) {
            return true;
        }
        return false;
    }
}



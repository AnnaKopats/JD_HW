package com.academy.kopats.lesson8;

import java.util.Scanner;

public class Task1 {
    private static final String BEGIN_STR = "abc";
    private static final String REPLACE_STR = "www";
    private static final String CONCAT_STR = "zzz";

    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.startsWith(BEGIN_STR)) {
            str = str.replace(BEGIN_STR, REPLACE_STR);
        } else {
            str = str.concat(CONCAT_STR);
        }
        System.out.println(str);
    }

}

package com.academy.kopats.lesson3;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        String s = "0123456789";
        for (int i = 0; i <=4; i++) {
            System.out.print(s.replaceAll("(.)", "$1".repeat(i)));
        }
    }
}

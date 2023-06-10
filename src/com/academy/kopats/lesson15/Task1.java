package com.academy.kopats.lesson15;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        Thread thread1 = new Printer("1", "Первый поток");
        thread1.start();
        Thread thread2 = new Printer("2", "Второй поток");
        thread2.start();
        Thread thread3 = new Printer("3", "Третий поток");
        thread3.start();

    }
}
